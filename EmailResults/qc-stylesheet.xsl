<?xml version="1.0"?>
<!--

	Purpose			:	This XSL file is used to convert XML to TXT along with SAXON jar. This format is specifically used for executing test cases on QC
	Author			:	Vijaya Baskar Ramalingam
	Created Date	:	8th June 2013
	Modifications	:	Vijay - 11th June 2013 - Clean Up activity
	
-->
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

	<xsl:output method="html"/>
	
	<xsl:variable name="FitNesseUrl">http://localhost:8888/</xsl:variable>
	
	<xsl:template match="/testResults"><xsl:apply-templates mode="results" select="result"/></xsl:template>
	
    <xsl:template mode="results" match="result">
		<xsl:variable name="right" select="counts/right"/>
		<xsl:variable name="module" select="substring(substring-after(substring-before(pageHistoryLink,relativePageName),/testResults/rootPath),2,string-length(substring-after(substring-before(pageHistoryLink,relativePageName),/testResults/rootPath))-2)"/>
		<xsl:variable name="wrong" select="counts/wrong"/>
		<xsl:variable name="exceptions" select="counts/exceptions"/>
		<xsl:variable name="ignores" select="counts/ignores"/>
		<xsl:variable name="path" select="substring-before(pageHistoryLink,relativePageName)"/>
		<xsl:variable name="successRate" select="$right div ($right + $wrong)"/>
          <xsl:variable name="time" select="runTimeInMillis"/><xsl:value-of select="relativePageName"/>|<xsl:choose>
            <xsl:when test="$exceptions != 0">Failed</xsl:when>
            <xsl:when test="$wrong != 0">Failed</xsl:when>
            <xsl:otherwise>Passed</xsl:otherwise>
</xsl:choose>|<xsl:value-of select="format-number(($time div 1000), '0')"/>|<xsl:value-of select="substring($path,1,string-length($path)-1)"/>|<xsl:value-of select="$FitNesseUrl"/><xsl:value-of select="substring(pageHistoryLink,1,string-length(pageHistoryLink)-3)"/>html|Right: <xsl:value-of select="$right"/> Wrong: <xsl:value-of select="$wrong"/> Ignores: <xsl:value-of select="$ignores"/> Exceptions: <xsl:value-of select="$exceptions"/> Success Rate: <xsl:choose>
            <xsl:when test="$exceptions != 0">N/A</xsl:when>
            <xsl:otherwise><xsl:value-of select="format-number($successRate, '0.00%')"/></xsl:otherwise>
          </xsl:choose> Time Taken: <xsl:value-of select="format-number(($time div 1000), '0.00')"/> sec(s)
     </xsl:template>

</xsl:stylesheet>
