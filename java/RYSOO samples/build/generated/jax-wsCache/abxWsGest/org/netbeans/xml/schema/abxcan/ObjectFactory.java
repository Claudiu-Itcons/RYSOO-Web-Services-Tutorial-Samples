
package org.netbeans.xml.schema.abxcan;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.netbeans.xml.schema.abxcan package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AbxCan_QNAME = new QName("http://xml.netbeans.org/schema/abxCan", "AbxCan");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.netbeans.xml.schema.abxcan
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AbxCan }
     * 
     */
    public AbxCan createAbxCan() {
        return new AbxCan();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbxCan }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.netbeans.org/schema/abxCan", name = "AbxCan")
    public JAXBElement<AbxCan> createAbxCan(AbxCan value) {
        return new JAXBElement<AbxCan>(_AbxCan_QNAME, AbxCan.class, null, value);
    }

}
