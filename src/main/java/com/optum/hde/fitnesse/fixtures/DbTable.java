package com.optum.hde.fitnesse.fixtures;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Types;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

import javax.sql.rowset.CachedRowSet;

import com.sun.rowset.CachedRowSetImpl;
//import com.optum.hde.fitnesse.fixtures.DatabaseSupport;

public class DbTable
{

    public String getSql()
    {
        return sql;
    }

    public void setSql(String sql)
    {
        this.sql = sql;
    }

    public DbTable(String sql, String jdbcurl, String user, String pass)
    {
        driverName = "oracle.jdbc.driver.OracleDriver";
        setJdbcurl(jdbcurl);
        setUser(user);
        setPass(pass);
        setSql(sql);
    }

    public DbTable(String sql, String env) throws Exception
    {
       
        DatabaseSupport db = DatabaseSupport.getInstance();
        driverName = "oracle.jdbc.driver.OracleDriver";
        setJdbcurl(db.getJdbcurl());
        setUser(db.getUser());
        setPass(db.getPass());
        setSql(sql);
    }

    public String getJdbcurl()
    {
        return jdbcurl;
    }

    public void setJdbcurl(String jdbcurl)
    {
        this.jdbcurl = jdbcurl;
    }

    public String getUser()
    {
        return user;
    }

    public void setUser(String user)
    {
        this.user = user;
    }

    public String getPass()
    {
        return pass;
    }

    public void setPass(String pass)
    {
        this.pass = pass;
    }

    public DbTable()
    {
        driverName = "oracle.jdbc.driver.OracleDriver";
    }

    public List query()
    {
        ArrayList queryResult = new ArrayList();
        try
        {
            Logger.getAnonymousLogger().info(sql);
            Class.forName(driverName).newInstance();
            conn = DriverManager.getConnection(jdbcurl, user, pass);
            PreparedStatement st = conn.prepareStatement(sql);
            st.execute();
            java.sql.ResultSet rs = st.getResultSet();
            CachedRowSet cachedRowSet = new CachedRowSetImpl();
            if(sql.toLowerCase().trim().startsWith("select")){
            cachedRowSet.populate(rs);
            ResultSetMetaData columndetails = cachedRowSet.getMetaData();
            if(cachedRowSet != null)
                for(; cachedRowSet.next(); queryResult.add(convertResultSetToQueryRow(cachedRowSet, columndetails)));
            }
        }
        catch(InstantiationException e)
        {
            e.printStackTrace();
        }
        catch(IllegalAccessException e)
        {
            e.printStackTrace();
        }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return queryResult;
    }

    private List convertResultSetToQueryRow(CachedRowSet cachedRowSet2, ResultSetMetaData columndetails)
        throws SQLException
    {
        ArrayList queryRow = new ArrayList();
        int numColumns = columndetails.getColumnCount();
        for(int i = 1; i < numColumns + 1; i++)
        {
            String columnName = columndetails.getColumnName(i);
            addToQueryRow(queryRow, columnName, cachedRowSet2.getString(columnName));
        }

        return queryRow;
    }

    private void addToQueryRow(ArrayList queryRow, String key, Object value)
    {
        ArrayList keyValuePair = new ArrayList();
        keyValuePair.add(key);
        if(value == null)
            keyValuePair.add("");
        else
            keyValuePair.add(value.toString().trim());
        queryRow.add(keyValuePair);
    }

    public void table(List list)
    {
    }

    public List doTable(List table)
        throws Exception
    {
        log((new StringBuilder()).append("Will be running ").append(getSql()).toString());
        try
        {
            String split[];
            if(getSql().toLowerCase().contains("into"))
                split = getSql().toLowerCase().split("into");
            else
                split = getSql().toLowerCase().split("from");
            String action = split[0].trim();
            String dbtable = split[1].trim();
            if(table.size() == 0 && action.startsWith("delete"))
                executeUpdate(this.sql.toString());
            for(int i = 0; i < table.size(); i++)
            {
                StringBuilder sql = new StringBuilder();
                List array_element = (List)table.get(i);
                if(i != 0)
                {
                    log((new StringBuilder()).append("Row ").append(i).append(" ").append(array_element.toString()).toString());
                    if(action.equalsIgnoreCase("insert"))
                        sql.append(buildinsertcolumnssql(dbtable, (List)table.get(0), array_element));
                    else
                    if(action.equalsIgnoreCase("delete"))
                        sql.append(builddeletecolumnssql(dbtable, (List)table.get(0), array_element));
                    try
                    {
                        executeUpdate(sql.toString());
                    }
                    catch(Exception e)
                    {
                        e.printStackTrace();
                        throw new Exception(e.getMessage());
                    }
                }
            }

        }
        catch(Exception e)
        {
            e.printStackTrace();
            throw new Exception(e.getMessage());
        }
        return null;
    }

    private void executeUpdate(String string)
        throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException
    {
        Class.forName(driverName).newInstance();
        conn = DriverManager.getConnection(jdbcurl, user, pass);
        PreparedStatement st = conn.prepareStatement(string);
        st.executeUpdate();
    }

    private String buildinsertcolumnssql(String dbtable, List columns, List row)
    {
        StringBuilder buildSql = new StringBuilder();
        buildSql.append((new StringBuilder()).append("insert into ").append(dbtable).append(" (").toString());
        String colname;
        for(Iterator i$ = columns.iterator(); i$.hasNext(); buildSql.append((new StringBuilder()).append(colname).append(",").toString()))
            colname = (String)i$.next();

        buildSql.replace(buildSql.toString().lastIndexOf(","), buildSql.toString().lastIndexOf(",") + 1, ")");
        buildSql.append(" values (");
        String colrowval;
        for(Iterator i$ = row.iterator(); i$.hasNext(); buildSql.append((new StringBuilder()).append("'").append(colrowval).append("',").toString()))
            colrowval = (String)i$.next();

        buildSql.replace(buildSql.toString().lastIndexOf(","), buildSql.toString().lastIndexOf(",") + 1, ")");
        log(buildSql.toString());
        return buildSql.toString();
    }
    public void runProcedure(String procedure,int filekey)
			throws Exception {
    	
		try {
		CallableStatement callSt = null;
		int fileKey=filekey;
		String procedureName = procedure;
		String driverName = "oracle.jdbc.driver.OracleDriver";
		Class.forName(driverName).newInstance();
		conn = DriverManager.getConnection(jdbcurl, user, pass);
		
		callSt = conn.prepareCall("{"+procedureName+"(?,?)}");
		callSt.setInt(1, fileKey);
		
		
		//PreparedStatement st = conn.prepareStatement(sql);
		//boolean exit = true;
		//int times = 0;
		
		callSt.execute();
		 
					}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
}
    
    
    private String builddeletecolumnssql(String dbtable, List columns, List rowvalues)
    {
        StringBuilder buildSql = new StringBuilder();
        String where = rowvalues.size() <= 0 ? "" : " where ";
        buildSql.append((new StringBuilder()).append("delete from  ").append(dbtable).append(where).toString());
        for(int i = 0; i < rowvalues.size(); i++)
            buildSql.append((new StringBuilder()).append((String)columns.get(i)).append("='").append((String)rowvalues.get(i)).append("' and ").toString());

        buildSql.replace(buildSql.toString().lastIndexOf("and"), buildSql.toString().lastIndexOf("and") + 3, "");
        log(buildSql.toString());
        return buildSql.toString();
    }

    public void log(String message)
    {
        System.out.println(message);
    }

    public long datediff(String date1, String date2, String dateformat)
        throws Exception
    {
        SimpleDateFormat currentDateformat = new SimpleDateFormat(dateformat);
        Date dateA = currentDateformat.parse(date1);
        Date dateB = currentDateformat.parse(date2);
        long diff = dateA.getTime() - dateB.getTime();
        return diff / 1000L;
    }

    public long divide(long a, long b)
    {
        return a / b;
    }

    String driverName;
    Connection conn;
    public String sql;
    public String jdbcurl;
    public String user;
    public String pass;
}
