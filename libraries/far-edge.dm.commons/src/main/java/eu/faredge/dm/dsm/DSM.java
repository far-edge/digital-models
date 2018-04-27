//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.27 at 04:45:46 �� EEST 
//


package eu.faredge.dm.dsm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="DataSourceDefinitionReferenceID" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element ref="{eu:faredge:drpp:dsm}DataSourceDefinitionInterfaceParameters"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="macAddress" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dataSourceDefinitionReferenceID",
    "dataSourceDefinitionInterfaceParameters"
})
@XmlRootElement(name = "DSM")
public class DSM {

    @XmlElement(name = "DataSourceDefinitionReferenceID", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String dataSourceDefinitionReferenceID;
    @XmlElement(name = "DataSourceDefinitionInterfaceParameters", required = true)
    protected DataSourceDefinitionInterfaceParameters dataSourceDefinitionInterfaceParameters;
    @XmlAttribute(name = "id")
    @XmlSchemaType(name = "anyURI")
    protected String id;
    @XmlAttribute(name = "macAddress")
    protected String macAddress;

    /**
     * Gets the value of the dataSourceDefinitionReferenceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSourceDefinitionReferenceID() {
        return dataSourceDefinitionReferenceID;
    }

    /**
     * Sets the value of the dataSourceDefinitionReferenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataSourceDefinitionReferenceID(String value) {
        this.dataSourceDefinitionReferenceID = value;
    }

    /**
     * Gets the value of the dataSourceDefinitionInterfaceParameters property.
     * 
     * @return
     *     possible object is
     *     {@link DataSourceDefinitionInterfaceParameters }
     *     
     */
    public DataSourceDefinitionInterfaceParameters getDataSourceDefinitionInterfaceParameters() {
        return dataSourceDefinitionInterfaceParameters;
    }

    /**
     * Sets the value of the dataSourceDefinitionInterfaceParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSourceDefinitionInterfaceParameters }
     *     
     */
    public void setDataSourceDefinitionInterfaceParameters(DataSourceDefinitionInterfaceParameters value) {
        this.dataSourceDefinitionInterfaceParameters = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the macAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMacAddress() {
        return macAddress;
    }

    /**
     * Sets the value of the macAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMacAddress(String value) {
        this.macAddress = value;
    }

}
