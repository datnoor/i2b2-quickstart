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
 * <p>Java class for get_missing_term_request_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="get_missing_term_request_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="concept_set" type="{http://www.i2b2.org/xsd/cell/crc/loader/1.1/}missingreport_optionType"/>
 *         &lt;element name="observer_set" type="{http://www.i2b2.org/xsd/cell/crc/loader/1.1/}missingreport_optionType"/>
 *         &lt;element name="modifier_set" type="{http://www.i2b2.org/xsd/cell/crc/loader/1.1/}missingreport_optionType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="upload_id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="detail" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "get_missing_term_request_type", propOrder = {
    "conceptSet",
    "observerSet",
    "modifierSet"
})
public class GetMissingTermRequestType {

    @XmlElement(name = "concept_set", required = true)
    protected MissingreportOptionType conceptSet;
    @XmlElement(name = "observer_set", required = true)
    protected MissingreportOptionType observerSet;
    @XmlElement(name = "modifier_set", required = true)
    protected MissingreportOptionType modifierSet;
    @XmlAttribute(name = "upload_id")
    protected String uploadId;
    @XmlAttribute
    protected Boolean detail;

    /**
     * Gets the value of the conceptSet property.
     * 
     * @return
     *     possible object is
     *     {@link MissingreportOptionType }
     *     
     */
    public MissingreportOptionType getConceptSet() {
        return conceptSet;
    }

    /**
     * Sets the value of the conceptSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link MissingreportOptionType }
     *     
     */
    public void setConceptSet(MissingreportOptionType value) {
        this.conceptSet = value;
    }

    /**
     * Gets the value of the observerSet property.
     * 
     * @return
     *     possible object is
     *     {@link MissingreportOptionType }
     *     
     */
    public MissingreportOptionType getObserverSet() {
        return observerSet;
    }

    /**
     * Sets the value of the observerSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link MissingreportOptionType }
     *     
     */
    public void setObserverSet(MissingreportOptionType value) {
        this.observerSet = value;
    }

    /**
     * Gets the value of the modifierSet property.
     * 
     * @return
     *     possible object is
     *     {@link MissingreportOptionType }
     *     
     */
    public MissingreportOptionType getModifierSet() {
        return modifierSet;
    }

    /**
     * Sets the value of the modifierSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link MissingreportOptionType }
     *     
     */
    public void setModifierSet(MissingreportOptionType value) {
        this.modifierSet = value;
    }

    /**
     * Gets the value of the uploadId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUploadId() {
        return uploadId;
    }

    /**
     * Sets the value of the uploadId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUploadId(String value) {
        this.uploadId = value;
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
            return false;
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
