//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.22 at 05:25:24 AM EDT 
//


package zswi.schemas.dav.discovery;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{DAV}current-user-principal"/>
 *           &lt;element ref="{DAV}resourcetype"/>
 *         &lt;/sequence>
 *         &lt;element ref="{DAV}principal-URL"/>
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
    "currentUserPrincipal",
    "resourcetype",
    "principalURL"
})
@XmlRootElement(name = "prop")
public class Prop {

    @XmlElement(name = "current-user-principal")
    protected CurrentUserPrincipal currentUserPrincipal;
    protected Resourcetype resourcetype;
    @XmlElement(name = "principal-URL", required = true)
    protected PrincipalURL principalURL;

    /**
     * Gets the value of the currentUserPrincipal property.
     * 
     * @return
     *     possible object is
     *     {@link CurrentUserPrincipal }
     *     
     */
    public CurrentUserPrincipal getCurrentUserPrincipal() {
        return currentUserPrincipal;
    }

    /**
     * Sets the value of the currentUserPrincipal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrentUserPrincipal }
     *     
     */
    public void setCurrentUserPrincipal(CurrentUserPrincipal value) {
        this.currentUserPrincipal = value;
    }

    /**
     * Gets the value of the resourcetype property.
     * 
     * @return
     *     possible object is
     *     {@link Resourcetype }
     *     
     */
    public Resourcetype getResourcetype() {
        return resourcetype;
    }

    /**
     * Sets the value of the resourcetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link Resourcetype }
     *     
     */
    public void setResourcetype(Resourcetype value) {
        this.resourcetype = value;
    }

    /**
     * Gets the value of the principalURL property.
     * 
     * @return
     *     possible object is
     *     {@link PrincipalURL }
     *     
     */
    public PrincipalURL getPrincipalURL() {
        return principalURL;
    }

    /**
     * Sets the value of the principalURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrincipalURL }
     *     
     */
    public void setPrincipalURL(PrincipalURL value) {
        this.principalURL = value;
    }

}
