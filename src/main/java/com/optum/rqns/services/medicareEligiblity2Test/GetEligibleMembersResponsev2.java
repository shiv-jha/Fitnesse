
package com.optum.rqns.services.medicareEligiblity2Test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getEligibleMembersResponsev2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getEligibleMembersResponsev2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://services.rqns.optum.com/}memberEligibilityInfov2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getEligibleMembersResponsev2", propOrder = {
    "memberEligibilityInfov2"
})
public class GetEligibleMembersResponsev2 {

    @XmlElement(namespace = "http://services.rqns.optum.com/")
    protected MemberEligibilityInfov2 memberEligibilityInfov2;

    /**
     * Gets the value of the memberEligibilityInfov2 property.
     * 
     * @return
     *     possible object is
     *     {@link MemberEligibilityInfov2 }
     *     
     */
    public MemberEligibilityInfov2 getMemberEligibilityInfov2() {
        return memberEligibilityInfov2;
    }

    /**
     * Sets the value of the memberEligibilityInfov2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberEligibilityInfov2 }
     *     
     */
    public void setMemberEligibilityInfov2(MemberEligibilityInfov2 value) {
        this.memberEligibilityInfov2 = value;
    }

}
