
package Zj7wANXZ;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for submitDataIntArray complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="submitDataIntArray">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="studentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="qCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "submitDataIntArray", propOrder = {
    "studentCode",
    "qCode",
    "data"
})
public class SubmitDataIntArray {

    protected String studentCode;
    protected String qCode;
    @XmlElement(type = Integer.class)
    protected List<Integer> data;

    /**
     * Gets the value of the studentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudentCode() {
        return studentCode;
    }

    /**
     * Sets the value of the studentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudentCode(String value) {
        this.studentCode = value;
    }

    /**
     * Gets the value of the qCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQCode() {
        return qCode;
    }

    /**
     * Sets the value of the qCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQCode(String value) {
        this.qCode = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the data property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getData() {
        if (data == null) {
            data = new ArrayList<Integer>();
        }
        return this.data;
    }

}
