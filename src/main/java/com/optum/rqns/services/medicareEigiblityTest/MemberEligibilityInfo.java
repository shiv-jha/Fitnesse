
package com.optum.rqns.services.medicareEigiblityTest;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for memberEligibilityInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="memberEligibilityInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="memberInfo" type="{http://services.rqns.optum.com/}memberInfo" minOccurs="0"/>
 *         &lt;element name="memberHicHistoryList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="memberHicHistory" type="{http://services.rqns.optum.com/}memberHicHistory" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "memberEligibilityInfo", propOrder = {
    "memberInfo",
    "memberHicHistoryList"
})
public class MemberEligibilityInfo {

    protected MemberInfo memberInfo;
    protected MemberEligibilityInfo.MemberHicHistoryList memberHicHistoryList;

    /**
     * Gets the value of the memberInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MemberInfo }
     *     
     */
    public MemberInfo getMemberInfo() {
        return memberInfo;
    }

    /**
     * Sets the value of the memberInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberInfo }
     *     
     */
    public void setMemberInfo(MemberInfo value) {
        this.memberInfo = value;
    }

    /**
     * Gets the value of the memberHicHistoryList property.
     * 
     * @return
     *     possible object is
     *     {@link MemberEligibilityInfo.MemberHicHistoryList }
     *     
     */
    public MemberEligibilityInfo.MemberHicHistoryList getMemberHicHistoryList() {
        return memberHicHistoryList;
    }

    /**
     * Sets the value of the memberHicHistoryList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberEligibilityInfo.MemberHicHistoryList }
     *     
     */
    public void setMemberHicHistoryList(MemberEligibilityInfo.MemberHicHistoryList value) {
        this.memberHicHistoryList = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="memberHicHistory" type="{http://services.rqns.optum.com/}memberHicHistory" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "memberHicHistory"
    })
    public static class MemberHicHistoryList {

        protected List<MemberHicHistory> memberHicHistory;

        /**
         * Gets the value of the memberHicHistory property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the memberHicHistory property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMemberHicHistory().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MemberHicHistory }
         * 
         * 
         */
        public List<MemberHicHistory> getMemberHicHistory() {
            if (memberHicHistory == null) {
                memberHicHistory = new ArrayList<MemberHicHistory>();
            }
            return this.memberHicHistory;
        }

    }

}
