
package tr.gov.udhb.unetws.uetds;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for yolcuBagajIptal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="yolcuBagajIptal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="wsuser" type="{http://uetds.unetws.udhb.gov.tr/}uetdsYtsUser" minOccurs="0"/>
 *         &lt;element name="uetdsSeferReferansNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="bagajBilgileri" type="{http://uetds.unetws.udhb.gov.tr/}uetdsSeferBagajBilgileriInput" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "yolcuBagajIptal", propOrder = {
    "wsuser",
    "uetdsSeferReferansNo",
    "bagajBilgileri"
})
public class YolcuBagajIptal {

    protected UetdsYtsUser wsuser;
    protected Long uetdsSeferReferansNo;
    protected UetdsSeferBagajBilgileriInput bagajBilgileri;

    /**
     * Gets the value of the wsuser property.
     * 
     * @return
     *     possible object is
     *     {@link UetdsYtsUser }
     *     
     */
    public UetdsYtsUser getWsuser() {
        return wsuser;
    }

    /**
     * Sets the value of the wsuser property.
     * 
     * @param value
     *     allowed object is
     *     {@link UetdsYtsUser }
     *     
     */
    public void setWsuser(UetdsYtsUser value) {
        this.wsuser = value;
    }

    /**
     * Gets the value of the uetdsSeferReferansNo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUetdsSeferReferansNo() {
        return uetdsSeferReferansNo;
    }

    /**
     * Sets the value of the uetdsSeferReferansNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUetdsSeferReferansNo(Long value) {
        this.uetdsSeferReferansNo = value;
    }

    /**
     * Gets the value of the bagajBilgileri property.
     * 
     * @return
     *     possible object is
     *     {@link UetdsSeferBagajBilgileriInput }
     *     
     */
    public UetdsSeferBagajBilgileriInput getBagajBilgileri() {
        return bagajBilgileri;
    }

    /**
     * Sets the value of the bagajBilgileri property.
     * 
     * @param value
     *     allowed object is
     *     {@link UetdsSeferBagajBilgileriInput }
     *     
     */
    public void setBagajBilgileri(UetdsSeferBagajBilgileriInput value) {
        this.bagajBilgileri = value;
    }

}
