
package com.optum.rqns.services.medicareEigiblityTest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getEligibleMembersResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getEligibleMembersResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://services.rqns.optum.com/}memberEligibilityInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getEligibleMembersResponse", propOrder = {
    "memberEligibilityInfo"
})
public class GetEligibleMembersResponse {

    @XmlElement(namespace = "http://services.rqns.optum.com/")
    protected MemberEligibilityInfo memberEligibilityInfo;

    /**
     * Gets the value of the memberEligibilityInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MemberEligibilityInfo }
     *     
     */
    public MemberEligibilityInfo getMemberEligibilityInfo() {
        return memberEligibilityInfo;
    }

    /**
     * Sets the value of the memberEligibilityInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberEligibilityInfo }
     *     
     */
    public void setMemberEligibilityInfo(MemberEligibilityInfo value) {
        this.memberEligibilityInfo = value;
    }

}
