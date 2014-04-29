
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per abxSDKTaskPDFImage complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="abxSDKTaskPDFImage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bitArray" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abxSDKTaskPDFImage", propOrder = {
    "bitArray"
})
public class AbxSDKTaskPDFImage {

    @XmlElement(required = true)
    protected byte[] bitArray;

    /**
     * Recupera il valore della proprietà bitArray.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getBitArray() {
        return bitArray;
    }

    /**
     * Imposta il valore della proprietà bitArray.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setBitArray(byte[] value) {
        this.bitArray = value;
    }

}
