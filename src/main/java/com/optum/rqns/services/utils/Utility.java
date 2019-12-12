package com.optum.rqns.services.utils;

import java.util.Date;

public class Utility {
	public static void verifyEqual(String sExpected,String sActual)
	{
		if (sActual==null && sExpected.equals(""))
		{System.out.println("Matchs");
			
		}
		else if(sExpected.equals(sActual))
		System.out.println("Matchs");
		else
			System.out.println("No Match:- Expected: " + sExpected + "Actual: " + sActual);
	}
	
	public static void verifyEqual(int sExpected,int sActual)
	{
		
	}
	
	public static void verifyEqual(boolean sExpected,boolean sActual)
	{
		
	}
	
	public static void verifyEqual(double sExpected,double sActual)
	{
		
	}
	
	public static void verifyEqual(Date sExpected,Date sActual)
	{
		
	}
	
public static String formatDateForService(String sInput)
{
	String convertedDate=sInput;
	if(sInput.contains("-") && sInput.contains(" "))
	{

	String[] a = sInput.split(" ");
	a[0]=a[0].replace("-", "/");
	String[] b= a[0].split("/");
	 convertedDate=b[2]+"/"+b[1]+"/"+b[0];
}
	
	return convertedDate;
	
}
	
}
