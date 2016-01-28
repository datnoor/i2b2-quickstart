//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.28 at 06:43:37 PM UTC 
//


package edu.harvard.i2b2.ontology.datavo.crcloader.query;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for output_option_listType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="output_option_listType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="observation_set" type="{http://www.i2b2.org/xsd/cell/crc/loader/1.1/}output_optionType" minOccurs="0"/>
 *         &lt;element name="patient_set" type="{http://www.i2b2.org/xsd/cell/crc/loader/1.1/}output_optionType" minOccurs="0"/>
 *         &lt;element name="event_set" type="{http://www.i2b2.org/xsd/cell/crc/loader/1.1/}output_optionType" minOccurs="0"/>
 *         &lt;element name="observer_set" type="{http://www.i2b2.org/xsd/cell/crc/loader/1.1/}output_optionType" minOccurs="0"/>
 *         &lt;element name="concept_set" type="{http://www.i2b2.org/xsd/cell/crc/loader/1.1/}output_optionType" minOccurs="0"/>
 *         &lt;element name="modifier_set" type="{http://www.i2b2.org/xsd/cell/crc/loader/1.1/}output_optionType" minOccurs="0"/>
 *         &lt;element name="pid_set" type="{http://www.i2b2.org/xsd/cell/crc/loader/1.1/}output_optionType" minOccurs="0"/>
 *         &lt;element name="eid_set" type="{http://www.i2b2.org/xsd/cell/crc/loader/1.1/}output_optionType" minOccurs="0"/>
 *       &lt;/all>
 *       &lt;attribute name="detail" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "output_option_listType", propOrder = {

})
public class OutputOptionListType {

    @XmlElement(name = "observation_set")
    protected OutputOptionType observationSet;
    @XmlElement(name = "patient_set")
    protected OutputOptionType patientSet;
    @XmlElement(name = "event_set")
    protected OutputOptionType eventSet;
    @XmlElement(name = "observer_set")
    protected OutputOptionType observerSet;
    @XmlElement(name = "concept_set")
    protected OutputOptionType conceptSet;
    @XmlElement(name = "modifier_set")
    protected OutputOptionType modifierSet;
    @XmlElement(name = "pid_set")
    protected OutputOptionType pidSet;
    @XmlElement(name = "eid_set")
    protected OutputOptionType eidSet;
    @XmlAttribute
    protected Boolean detail;

    /**
     * Gets the value of the observationSet property.
     * 
     * @return
     *     possible object is
     *     {@link OutputOptionType }
     *     
     */
    public OutputOptionType getObservationSet() {
        return observationSet;
    }

    /**
     * Sets the value of the observationSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputOptionType }
     *     
     */
    public void setObservationSet(OutputOptionType value) {
        this.observationSet = value;
    }

    /**
     * Gets the value of the patientSet property.
     * 
     * @return
     *     possible object is
     *     {@link OutputOptionType }
     *     
     */
    public OutputOptionType getPatientSet() {
        return patientSet;
    }

    /**
     * Sets the value of the patientSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputOptionType }
     *     
     */
    public void setPatientSet(OutputOptionType value) {
        this.patientSet = value;
    }

    /**
     * Gets the value of the eventSet property.
     * 
     * @return
     *     possible object is
     *     {@link OutputOptionType }
     *     
     */
    public OutputOptionType getEventSet() {
        return eventSet;
    }

    /**
     * Sets the value of the eventSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputOptionType }
     *     
     */
    public void setEventSet(OutputOptionType value) {
        this.eventSet = value;
    }

    /**
     * Gets the value of the observerSet property.
     * 
     * @return
     *     possible object is
     *     {@link OutputOptionType }
     *     
     */
    public OutputOptionType getObserverSet() {
        return observerSet;
    }

    /**
     * Sets the value of the observerSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputOptionType }
     *     
     */
    public void setObserverSet(OutputOptionType value) {
        this.observerSet = value;
    }

    /**
     * Gets the value of the conceptSet property.
     * 
     * @return
     *     possible object is
     *     {@link OutputOptionType }
     *     
     */
    public OutputOptionType getConceptSet() {
        return conceptSet;
    }

    /**
     * Sets the value of the conceptSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputOptionType }
     *     
     */
    public void setConceptSet(OutputOptionType value) {
        this.conceptSet = value;
    }

    /**
     * Gets the value of the modifierSet property.
     * 
     * @return
     *     possible object is
     *     {@link OutputOptionType }
     *     
     */
    public OutputOptionType getModifierSet() {
        return modifierSet;
    }

    /**
     * Sets the value of the modifierSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputOptionType }
     *     
     */
    public void setModifierSet(OutputOptionType value) {
        this.modifierSet = value;
    }

    /**
     * Gets the value of the pidSet property.
     * 
     * @return
     *     possible object is
     *     {@link OutputOptionType }
     *     
     */
    public OutputOptionType getPidSet() {
        return pidSet;
    }

    /**
     * Sets the value of the pidSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputOptionType }
     *     
     */
    public void setPidSet(OutputOptionType value) {
        this.pidSet = value;
    }

    /**
     * Gets the value of the eidSet property.
     * 
     * @return
     *     possible object is
     *     {@link OutputOptionType }
     *     
     */
    public OutputOptionType getEidSet() {
        return eidSet;
    }

    /**
     * Sets the value of the eidSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputOptionType }
     *     
     */
    public void setEidSet(OutputOptionType value) {
        this.eidSet = value;
    }

    /**
     * Gets the value of the detail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDetail() {
        if (detail == null) {
            return true;
        } else {
            return detail;
        }
    }

    /**
     * Sets the value of the detail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDetail(Boolean value) {
        this.detail = value;
    }

}
