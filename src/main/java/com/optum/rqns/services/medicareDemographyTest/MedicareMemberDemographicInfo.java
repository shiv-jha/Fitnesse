
package com.optum.rqns.services.medicareDemographyTest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for medicareMemberDemographicInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="medicareMemberDemographicInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clientId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mbrCardId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="baseMbrId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mbrHicNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mbrId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mbrModId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mbrFstNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mbrLstNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mbrMidlNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mbrGdrCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mbrDob" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mbrDod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mbrLang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maritalSts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addrLn1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addrLn2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="county" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zipCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extZipCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phoneNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="altPhoneNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mbrContrNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mbrSubPlnId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mbrGlbId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clntSrcSysNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clntSubSrcSysNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clntDvsnNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mbrOrigStrtDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mbrLtEndDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mbrPoaFstNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mbrPoaLstNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mbrPoaRelCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mbrPoaTelNumTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partAEligEffDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partBEligEffDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "medicareMemberDemographicInfo", propOrder = {
    "clientId",
    "mbrCardId",
    "baseMbrId",
    "mbrHicNbr",
    "mbrId",
    "mbrModId",
    "mbrFstNm",
    "mbrLstNm",
    "mbrMidlNm",
    "mbrGdrCd",
    "mbrDob",
    "mbrDod",
    "mbrLang",
    "maritalSts",
    "addrLn1",
    "addrLn2",
    "city",
    "county",
    "state",
    "zipCd",
    "extZipCd",
    "phoneNbr",
    "altPhoneNbr",
    "mbrContrNbr",
    "mbrSubPlnId",
    "mbrGlbId",
    "clntSrcSysNm",
    "clntSubSrcSysNm",
    "clntDvsnNm",
    "mbrOrigStrtDt",
    "mbrLtEndDt",
    "mbrPoaFstNm",
    "mbrPoaLstNm",
    "mbrPoaRelCd",
    "mbrPoaTelNumTxt",
    "partAEligEffDt",
    "partBEligEffDt"
})
public class MedicareMemberDemographicInfo {

    protected String clientId;
    protected String mbrCardId;
    protected String baseMbrId;
    protected String mbrHicNbr;
    protected String mbrId;
    protected String mbrModId;
    protected String mbrFstNm;
    protected String mbrLstNm;
    protected String mbrMidlNm;
    protected String mbrGdrCd;
    protected String mbrDob;
    protected String mbrDod;
    protected String mbrLang;
    protected String maritalSts;
    protected String addrLn1;
    protected String addrLn2;
    protected String city;
    protected String county;
    protected String state;
    protected String zipCd;
    protected String extZipCd;
    protected String phoneNbr;
    protected String altPhoneNbr;
    protected String mbrContrNbr;
    protected String mbrSubPlnId;
    protected String mbrGlbId;
    protected String clntSrcSysNm;
    protected String clntSubSrcSysNm;
    protected String clntDvsnNm;
    protected String mbrOrigStrtDt;
    protected String mbrLtEndDt;
    protected String mbrPoaFstNm;
    protected String mbrPoaLstNm;
    protected String mbrPoaRelCd;
    protected String mbrPoaTelNumTxt;
    protected String partAEligEffDt;
    protected String partBEligEffDt;

    /**
     * Gets the value of the clientId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * Sets the value of the clientId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientId(String value) {
        this.clientId = value;
    }

    /**
     * Gets the value of the mbrCardId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMbrCardId() {
        return mbrCardId;
    }

    /**
     * Sets the value of the mbrCardId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMbrCardId(String value) {
        this.mbrCardId = value;
    }

    /**
     * Gets the value of the baseMbrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseMbrId() {
        return baseMbrId;
    }

    /**
     * Sets the value of the baseMbrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseMbrId(String value) {
        this.baseMbrId = value;
    }

    /**
     * Gets the value of the mbrHicNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMbrHicNbr() {
        return mbrHicNbr;
    }

    /**
     * Sets the value of the mbrHicNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMbrHicNbr(String value) {
        this.mbrHicNbr = value;
    }

    /**
     * Gets the value of the mbrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMbrId() {
        return mbrId;
    }

    /**
     * Sets the value of the mbrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMbrId(String value) {
        this.mbrId = value;
    }

    /**
     * Gets the value of the mbrModId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMbrModId() {
        return mbrModId;
    }

    /**
     * Sets the value of the mbrModId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMbrModId(String value) {
        this.mbrModId = value;
    }

    /**
     * Gets the value of the mbrFstNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMbrFstNm() {
        return mbrFstNm;
    }

    /**
     * Sets the value of the mbrFstNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMbrFstNm(String value) {
        this.mbrFstNm = value;
    }

    /**
     * Gets the value of the mbrLstNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMbrLstNm() {
        return mbrLstNm;
    }

    /**
     * Sets the value of the mbrLstNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMbrLstNm(String value) {
        this.mbrLstNm = value;
    }

    /**
     * Gets the value of the mbrMidlNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMbrMidlNm() {
        return mbrMidlNm;
    }

    /**
     * Sets the value of the mbrMidlNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMbrMidlNm(String value) {
        this.mbrMidlNm = value;
    }

    /**
     * Gets the value of the mbrGdrCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMbrGdrCd() {
        return mbrGdrCd;
    }

    /**
     * Sets the value of the mbrGdrCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMbrGdrCd(String value) {
        this.mbrGdrCd = value;
    }

    /**
     * Gets the value of the mbrDob property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMbrDob() {
        return mbrDob;
    }

    /**
     * Sets the value of the mbrDob property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMbrDob(String value) {
        this.mbrDob = value;
    }

    /**
     * Gets the value of the mbrDod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMbrDod() {
        return mbrDod;
    }

    /**
     * Sets the value of the mbrDod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMbrDod(String value) {
        this.mbrDod = value;
    }

    /**
     * Gets the value of the mbrLang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMbrLang() {
        return mbrLang;
    }

    /**
     * Sets the value of the mbrLang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMbrLang(String value) {
        this.mbrLang = value;
    }

    /**
     * Gets the value of the maritalSts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaritalSts() {
        return maritalSts;
    }

    /**
     * Sets the value of the maritalSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaritalSts(String value) {
        this.maritalSts = value;
    }

    /**
     * Gets the value of the addrLn1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddrLn1() {
        return addrLn1;
    }

    /**
     * Sets the value of the addrLn1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddrLn1(String value) {
        this.addrLn1 = value;
    }

    /**
     * Gets the value of the addrLn2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddrLn2() {
        return addrLn2;
    }

    /**
     * Sets the value of the addrLn2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddrLn2(String value) {
        this.addrLn2 = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the county property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounty() {
        return county;
    }

    /**
     * Sets the value of the county property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounty(String value) {
        this.county = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the zipCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipCd() {
        return zipCd;
    }

    /**
     * Sets the value of the zipCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipCd(String value) {
        this.zipCd = value;
    }

    /**
     * Gets the value of the extZipCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtZipCd() {
        return extZipCd;
    }

    /**
     * Sets the value of the extZipCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtZipCd(String value) {
        this.extZipCd = value;
    }

    /**
     * Gets the value of the phoneNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNbr() {
        return phoneNbr;
    }

    /**
     * Sets the value of the phoneNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNbr(String value) {
        this.phoneNbr = value;
    }

    /**
     * Gets the value of the altPhoneNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltPhoneNbr() {
        return altPhoneNbr;
    }

    /**
     * Sets the value of the altPhoneNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltPhoneNbr(String value) {
        this.altPhoneNbr = value;
    }

    /**
     * Gets the value of the mbrContrNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMbrContrNbr() {
        return mbrContrNbr;
    }

    /**
     * Sets the value of the mbrContrNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMbrContrNbr(String value) {
        this.mbrContrNbr = value;
    }

    /**
     * Gets the value of the mbrSubPlnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMbrSubPlnId() {
        return mbrSubPlnId;
    }

    /**
     * Sets the value of the mbrSubPlnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMbrSubPlnId(String value) {
        this.mbrSubPlnId = value;
    }

    /**
     * Gets the value of the mbrGlbId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMbrGlbId() {
        return mbrGlbId;
    }

    /**
     * Sets the value of the mbrGlbId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMbrGlbId(String value) {
        this.mbrGlbId = value;
    }

    /**
     * Gets the value of the clntSrcSysNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntSrcSysNm() {
        return clntSrcSysNm;
    }

    /**
     * Sets the value of the clntSrcSysNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClntSrcSysNm(String value) {
        this.clntSrcSysNm = value;
    }

    /**
     * Gets the value of the clntSubSrcSysNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntSubSrcSysNm() {
        return clntSubSrcSysNm;
    }

    /**
     * Sets the value of the clntSubSrcSysNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClntSubSrcSysNm(String value) {
        this.clntSubSrcSysNm = value;
    }

    /**
     * Gets the value of the clntDvsnNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntDvsnNm() {
        return clntDvsnNm;
    }

    /**
     * Sets the value of the clntDvsnNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClntDvsnNm(String value) {
        this.clntDvsnNm = value;
    }

    /**
     * Gets the value of the mbrOrigStrtDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMbrOrigStrtDt() {
        return mbrOrigStrtDt;
    }

    /**
     * Sets the value of the mbrOrigStrtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMbrOrigStrtDt(String value) {
        this.mbrOrigStrtDt = value;
    }

    /**
     * Gets the value of the mbrLtEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMbrLtEndDt() {
        return mbrLtEndDt;
    }

    /**
     * Sets the value of the mbrLtEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMbrLtEndDt(String value) {
        this.mbrLtEndDt = value;
    }

    /**
     * Gets the value of the mbrPoaFstNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMbrPoaFstNm() {
        return mbrPoaFstNm;
    }

    /**
     * Sets the value of the mbrPoaFstNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMbrPoaFstNm(String value) {
        this.mbrPoaFstNm = value;
    }

    /**
     * Gets the value of the mbrPoaLstNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMbrPoaLstNm() {
        return mbrPoaLstNm;
    }

    /**
     * Sets the value of the mbrPoaLstNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMbrPoaLstNm(String value) {
        this.mbrPoaLstNm = value;
    }

    /**
     * Gets the value of the mbrPoaRelCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMbrPoaRelCd() {
        return mbrPoaRelCd;
    }

    /**
     * Sets the value of the mbrPoaRelCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMbrPoaRelCd(String value) {
        this.mbrPoaRelCd = value;
    }

    /**
     * Gets the value of the mbrPoaTelNumTxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMbrPoaTelNumTxt() {
        return mbrPoaTelNumTxt;
    }

    /**
     * Sets the value of the mbrPoaTelNumTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMbrPoaTelNumTxt(String value) {
        this.mbrPoaTelNumTxt = value;
    }

    /**
     * Gets the value of the partAEligEffDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartAEligEffDt() {
        return partAEligEffDt;
    }

    /**
     * Sets the value of the partAEligEffDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartAEligEffDt(String value) {
        this.partAEligEffDt = value;
    }

    /**
     * Gets the value of the partBEligEffDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartBEligEffDt() {
        return partBEligEffDt;
    }

    /**
     * Sets the value of the partBEligEffDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartBEligEffDt(String value) {
        this.partBEligEffDt = value;
    }

}
