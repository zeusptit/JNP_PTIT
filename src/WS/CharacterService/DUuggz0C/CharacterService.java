
package DUuggz0C;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CharacterService", targetNamespace = "http://medianews.vn/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CharacterService {


    /**
     * 
     * @param data
     * @param studentCode
     * @param qCode
     */
    @WebMethod
    @RequestWrapper(localName = "submitCharacterString", targetNamespace = "http://medianews.vn/", className = "DUuggz0C.SubmitCharacterString")
    @ResponseWrapper(localName = "submitCharacterStringResponse", targetNamespace = "http://medianews.vn/", className = "DUuggz0C.SubmitCharacterStringResponse")
    @Action(input = "http://medianews.vn/CharacterService/submitCharacterStringRequest", output = "http://medianews.vn/CharacterService/submitCharacterStringResponse")
    public void submitCharacterString(
        @WebParam(name = "studentCode", targetNamespace = "")
        String studentCode,
        @WebParam(name = "qCode", targetNamespace = "")
        String qCode,
        @WebParam(name = "data", targetNamespace = "")
        String data);

    /**
     * 
     * @param data
     * @param studentCode
     * @param qCode
     */
    @WebMethod
    @RequestWrapper(localName = "submitCharacterStringArray", targetNamespace = "http://medianews.vn/", className = "DUuggz0C.SubmitCharacterStringArray")
    @ResponseWrapper(localName = "submitCharacterStringArrayResponse", targetNamespace = "http://medianews.vn/", className = "DUuggz0C.SubmitCharacterStringArrayResponse")
    @Action(input = "http://medianews.vn/CharacterService/submitCharacterStringArrayRequest", output = "http://medianews.vn/CharacterService/submitCharacterStringArrayResponse")
    public void submitCharacterStringArray(
        @WebParam(name = "studentCode", targetNamespace = "")
        String studentCode,
        @WebParam(name = "qCode", targetNamespace = "")
        String qCode,
        @WebParam(name = "data", targetNamespace = "")
        List<String> data);

    /**
     * 
     * @param data
     * @param studentCode
     * @param qCode
     */
    @WebMethod
    @RequestWrapper(localName = "submitCharacterCharArray", targetNamespace = "http://medianews.vn/", className = "DUuggz0C.SubmitCharacterCharArray")
    @ResponseWrapper(localName = "submitCharacterCharArrayResponse", targetNamespace = "http://medianews.vn/", className = "DUuggz0C.SubmitCharacterCharArrayResponse")
    @Action(input = "http://medianews.vn/CharacterService/submitCharacterCharArrayRequest", output = "http://medianews.vn/CharacterService/submitCharacterCharArrayResponse")
    public void submitCharacterCharArray(
        @WebParam(name = "studentCode", targetNamespace = "")
        String studentCode,
        @WebParam(name = "qCode", targetNamespace = "")
        String qCode,
        @WebParam(name = "data", targetNamespace = "")
        List<Integer> data);

    /**
     * 
     * @param studentCode
     * @param qCode
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "requestStringArray", targetNamespace = "http://medianews.vn/", className = "DUuggz0C.RequestStringArray")
    @ResponseWrapper(localName = "requestStringArrayResponse", targetNamespace = "http://medianews.vn/", className = "DUuggz0C.RequestStringArrayResponse")
    @Action(input = "http://medianews.vn/CharacterService/requestStringArrayRequest", output = "http://medianews.vn/CharacterService/requestStringArrayResponse")
    public List<String> requestStringArray(
        @WebParam(name = "studentCode", targetNamespace = "")
        String studentCode,
        @WebParam(name = "qCode", targetNamespace = "")
        String qCode);

    /**
     * 
     * @param studentCode
     * @param qCode
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "requestString", targetNamespace = "http://medianews.vn/", className = "DUuggz0C.RequestString")
    @ResponseWrapper(localName = "requestStringResponse", targetNamespace = "http://medianews.vn/", className = "DUuggz0C.RequestStringResponse")
    @Action(input = "http://medianews.vn/CharacterService/requestStringRequest", output = "http://medianews.vn/CharacterService/requestStringResponse")
    public String requestString(
        @WebParam(name = "studentCode", targetNamespace = "")
        String studentCode,
        @WebParam(name = "qCode", targetNamespace = "")
        String qCode);

    /**
     * 
     * @param studentCode
     * @param qCode
     * @return
     *     returns java.util.List<java.lang.Integer>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "requestCharacter", targetNamespace = "http://medianews.vn/", className = "DUuggz0C.RequestCharacter")
    @ResponseWrapper(localName = "requestCharacterResponse", targetNamespace = "http://medianews.vn/", className = "DUuggz0C.RequestCharacterResponse")
    @Action(input = "http://medianews.vn/CharacterService/requestCharacterRequest", output = "http://medianews.vn/CharacterService/requestCharacterResponse")
    public List<Integer> requestCharacter(
        @WebParam(name = "studentCode", targetNamespace = "")
        String studentCode,
        @WebParam(name = "qCode", targetNamespace = "")
        String qCode);

}
