<?xml version="1.0"?>
<!--

	Purpose			:	This XSL file is used to convert XML to HTML along with SAXON jar. This format is specifically used for FitNesse result generation
	Author			:	Vijaya Baskar Ramalingam
	Created Date	:	3rd April 2013
	Modifications	:	Vijay - 1st May 2013 - Clean Up activity
	
-->
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

	<xsl:output method="html"/>
	
	<xsl:variable name="FitNesseUrl">http://localhost:8888/</xsl:variable>
	
	<xsl:template match="/testResults">
		<xsl:variable name="suite" select="rootPath"/>
		<xsl:variable name="right" select="finalCounts/right"/>
		<xsl:variable name="wrong" select="finalCounts/wrong"/>
		<xsl:variable name="ignores" select="finalCounts/ignores"/>
		<xsl:variable name="exceptions" select="finalCounts/exceptions"/>
		<xsl:variable name="totaltime" select="totalRunTimeInMillis"/>
		<xsl:variable name="total" select="$right + $wrong + $ignores + $exceptions"/>
		<xsl:variable name="successRate" select="($ignores + $right) div $total"/>
		<html>
		<head>
			<title>Direct Connect (DC) - FitNesse Results</title>
			<style type="text/css">
			/* JUnit-like report style */
			body {font:normal 90% verdana,arial,helvetica;color:#000000}
			table tr td, table tr th {font-size:90%}
			table.details tr th {font-weight:bold;text-align:left;background:#a6caf0}
			table.details tr td {background:#eeeee0}
			p {line-height:1.5em;margin-top:0.5em;margin-bottom:1.0em}
			h1, h2, h3, h4, h5, h6 {font:bold verdana,arial,helvetica}
			h2, h3, h4, h5, h6 {margin-bottom:0.5em}
			h1 {margin:0px 0px 5px;font:165%}
			h2 {margin-top:1em;font:125%}
			h3 {font:115%}
			h4, h5, h6 {font:100%}
			.Error {font-weight:bold;color:red}
			.Failure {font-weight:bold;color:purple}
			<!--
			/* FitNesse reports */
			.pass {background-color:#AAFFAA}
			.fail {background-color:#FFAAAA}
			.error {background-color:#FFFFAA}
			.ignore {background-color:#CCCCCC}
			.fit_stacktrace {font-size:0.7em}
			.fit_label {font-style:italic;color:#C08080}
			.fit_grey {color:#808080}
			.fitnesse {width:95%}
			.setup, .teardown {background:#FFFFF0;margin-bottom:1em;margin-top:-1em;padding:0.5em;border:dotted 1px black}
			.setup .collapsable, .teardown .collapsable {margin-top:-1em}
			.setup .meta, .setup > a, .teardown .meta, .teardown > a, .collapse_rim .meta, .collapse_rim > a {display:none}
			.fitnesse td {padding:2px}
			.fitnesse table {border-collapse:collapse}
			.fitnesse h3 {background-color:#A6CAF0;font-size:100%;padding:5px}
			-->
			</style>
		</head>
		<body>
			<!--<h1 align="center"><img src="http://fraq7dceweb01/images/logo/logo.png" align="center"></img></h1>-->
			<table width="100%" align="center" bgcolor="lightblue"><tr><th><h1><xsl:value-of select="$suite"/></h1></th></tr></table>
			<hr size="1"/>
			<table class="details" border="0" cellpadding="5" cellspacing="2" width="100%">
				<tr valign="top">
					<th>Total Tests</th><th>Passed</th><th>Failed</th><th>Exceptions</th><th>Ignored</th><th>Success Rate</th><th>Total Time Taken</th>
				</tr>
				<tr>
					<xsl:attribute name="class">
					<xsl:choose>
						<xsl:when test="$exceptions != 0">Error</xsl:when>
						<xsl:when test="$wrong != 0">Failure</xsl:when>
						<xsl:otherwise>Pass</xsl:otherwise>
					</xsl:choose>
					</xsl:attribute>
					<td><xsl:value-of select="$total"/></td>
					<td><xsl:value-of select="$right"/></td>
					<td><xsl:value-of select="$wrong"/></td>
					<td><xsl:value-of select="$exceptions"/></td>
					<td><xsl:value-of select="$ignores"/></td>
					<td><xsl:value-of select="format-number($successRate, '0.00%')"/></td>
					<xsl:variable name="mins" select="round($totaltime div 60000)"/>
					<td>
						<xsl:if test="($mins*60000) &gt; $totaltime">
							<xsl:value-of select="$mins - 1"/> mins <xsl:value-of select="format-number(($totaltime - (($mins - 1) * 60000)) div 1000, '##')"/> secs
						</xsl:if>
						<xsl:if test="($mins*60000) &lt; $totaltime">
							<xsl:value-of select="$mins"/> mins <xsl:value-of select="format-number(($totaltime - ($mins * 60000)) div 1000, '##')"/> secs
						</xsl:if>
					</td>
				</tr>
			</table>
			<hr size="1"/>
			<table class="details" border="0" cellpadding="5" cellspacing="2" width="100%">
				<tr valign="top">
					<th>User Story</th><th>Test Case Name</th><th>Passed</th><th>Failed</th><th>Exceptions</th><th>Ignored</th><th>Success Rate</th><th>Time Taken</th>
				</tr>
				<xsl:apply-templates mode="results" select="result"/>
			</table>
		</body>
		</html>
    
	</xsl:template>
	
    <xsl:template mode="results" match="result">
		<xsl:variable name="right" select="counts/right"/>
		<xsl:variable name="module" select="substring(substring-after(substring-before(pageHistoryLink,relativePageName),/testResults/rootPath),2,string-length(substring-after(substring-before(pageHistoryLink,relativePageName),/testResults/rootPath))-2)"/>
		<!--<xsl:variable name="module" select="/testResults/rootPath"/>-->
		<xsl:variable name="wrong" select="counts/wrong"/>
		<xsl:variable name="exceptions" select="counts/exceptions"/>
		<xsl:variable name="ignores" select="counts/ignores"/>
		<xsl:variable name="successRate" select="$right div ($right + $wrong)"/>
        <xsl:variable name="time" select="runTimeInMillis"/>
		<tr>
			<xsl:attribute name="class">
				<xsl:choose>
					<xsl:when test="$exceptions != 0">Error</xsl:when>
					<xsl:when test="$wrong != 0">Failure</xsl:when>
					<xsl:otherwise>Pass</xsl:otherwise>
				</xsl:choose>
			</xsl:attribute>
			<!--<td><xsl:value-of select="substring($module,2,string-length($module)-2)"/></td>-->
			<td><xsl:value-of select="$module"/></td>
			<td><a>
				<xsl:attribute name="href"><xsl:value-of select="$FitNesseUrl"/><xsl:value-of select="substring(pageHistoryLink,1,string-length(pageHistoryLink)-3)"/>html</xsl:attribute>
				<xsl:value-of select="relativePageName"/>
			</a></td>
			<td><xsl:value-of select="$right"/></td>
			<td><xsl:value-of select="$wrong"/></td>
			<td><xsl:value-of select="$exceptions"/></td>
			<td><xsl:value-of select="$ignores"/></td>
			<td>
				<xsl:choose>
					<xsl:when test="$exceptions != 0">N/A</xsl:when>
					<xsl:otherwise><xsl:value-of select="format-number($successRate, '0.00%')"/></xsl:otherwise>
				</xsl:choose>
			</td>
			<xsl:variable name="tmins" select="round($time div 60000)"/>
			<td>
				<xsl:if test="($tmins*60000) &gt; $time">
					<xsl:value-of select="$tmins - 1"/> mins <xsl:value-of select="format-number(($time - (($tmins - 1) * 60000)) div 1000, '##')"/> secs
				</xsl:if>
				<xsl:if test="($tmins*60000) &lt; $time">
					<xsl:value-of select="$tmins"/> mins <xsl:value-of select="format-number(($time - ($tmins * 60000)) div 1000, '##')"/> secs
				</xsl:if>
			</td>
		</tr>
    </xsl:template>
    
	<xsl:template mode="details" match="result">
		<a><xsl:attribute name="name"><xsl:value-of select="relativePageName"/></xsl:attribute></a>
		<h3><xsl:value-of select="relativePageName"/></h3>
		<xsl:value-of select="content" disable-output-escaping="yes"/>
	</xsl:template>
  
</xsl:stylesheet>



































