
package javaapplication3;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ServicioSoap", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServicioSoap {


    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "HelloWorld", action = "http://tempuri.org/HelloWorld")
    @WebResult(name = "HelloWorldResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "HelloWorld", targetNamespace = "http://tempuri.org/", className = "javaapplication3.HelloWorld")
    @ResponseWrapper(localName = "HelloWorldResponse", targetNamespace = "http://tempuri.org/", className = "javaapplication3.HelloWorldResponse")
    public String helloWorld();

    /**
     * 
     * @param ci
     * @return
     *     returns javaapplication3.ConsultaResponse.ConsultaResult
     */
    @WebMethod(operationName = "Consulta", action = "http://tempuri.org/Consulta")
    @WebResult(name = "ConsultaResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Consulta", targetNamespace = "http://tempuri.org/", className = "javaapplication3.Consulta")
    @ResponseWrapper(localName = "ConsultaResponse", targetNamespace = "http://tempuri.org/", className = "javaapplication3.ConsultaResponse")
    public javaapplication3.ConsultaResponse.ConsultaResult consulta(
        @WebParam(name = "ci", targetNamespace = "http://tempuri.org/")
        int ci);

    /**
     * 
     * @param ci
     * @return
     *     returns javaapplication3.ArrayOfString
     */
    @WebMethod(action = "http://tempuri.org/consulta1")
    @WebResult(name = "consulta1Result", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "consulta1", targetNamespace = "http://tempuri.org/", className = "javaapplication3.Consulta1")
    @ResponseWrapper(localName = "consulta1Response", targetNamespace = "http://tempuri.org/", className = "javaapplication3.Consulta1Response")
    public ArrayOfString consulta1(
        @WebParam(name = "ci", targetNamespace = "http://tempuri.org/")
        int ci);

}
