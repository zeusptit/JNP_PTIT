
package JNP_2VJvgvh7;

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
@WebService(name = "ObjectService", targetNamespace = "http://medianews.vn/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ObjectService {


    /**
     * 
     * @param studentCode
     * @param qCode
     * @param object
     */
    @WebMethod
    @RequestWrapper(localName = "submitListStudentY", targetNamespace = "http://medianews.vn/", className = "JNP_2VJvgvh7.SubmitListStudentY")
    @ResponseWrapper(localName = "submitListStudentYResponse", targetNamespace = "http://medianews.vn/", className = "JNP_2VJvgvh7.SubmitListStudentYResponse")
    @Action(input = "http://medianews.vn/ObjectService/submitListStudentYRequest", output = "http://medianews.vn/ObjectService/submitListStudentYResponse")
    public void submitListStudentY(
        @WebParam(name = "studentCode", targetNamespace = "")
        String studentCode,
        @WebParam(name = "qCode", targetNamespace = "")
        String qCode,
        @WebParam(name = "object", targetNamespace = "")
        List<StudentY> object);

    /**
     * 
     * @param studentCode
     * @param qCode
     * @return
     *     returns java.util.List<JNP_2VJvgvh7.EmployeeY>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "requestListEmployeeY", targetNamespace = "http://medianews.vn/", className = "JNP_2VJvgvh7.RequestListEmployeeY")
    @ResponseWrapper(localName = "requestListEmployeeYResponse", targetNamespace = "http://medianews.vn/", className = "JNP_2VJvgvh7.RequestListEmployeeYResponse")
    @Action(input = "http://medianews.vn/ObjectService/requestListEmployeeYRequest", output = "http://medianews.vn/ObjectService/requestListEmployeeYResponse")
    public List<EmployeeY> requestListEmployeeY(
        @WebParam(name = "studentCode", targetNamespace = "")
        String studentCode,
        @WebParam(name = "qCode", targetNamespace = "")
        String qCode);

    /**
     * 
     * @param studentCode
     * @param qCode
     * @return
     *     returns java.util.List<JNP_2VJvgvh7.OrderY>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "requestListOrderY", targetNamespace = "http://medianews.vn/", className = "JNP_2VJvgvh7.RequestListOrderY")
    @ResponseWrapper(localName = "requestListOrderYResponse", targetNamespace = "http://medianews.vn/", className = "JNP_2VJvgvh7.RequestListOrderYResponse")
    @Action(input = "http://medianews.vn/ObjectService/requestListOrderYRequest", output = "http://medianews.vn/ObjectService/requestListOrderYResponse")
    public List<OrderY> requestListOrderY(
        @WebParam(name = "studentCode", targetNamespace = "")
        String studentCode,
        @WebParam(name = "qCode", targetNamespace = "")
        String qCode);

    /**
     * 
     * @param studentCode
     * @param qCode
     * @return
     *     returns java.util.List<JNP_2VJvgvh7.Student>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "requestListStudent", targetNamespace = "http://medianews.vn/", className = "JNP_2VJvgvh7.RequestListStudent")
    @ResponseWrapper(localName = "requestListStudentResponse", targetNamespace = "http://medianews.vn/", className = "JNP_2VJvgvh7.RequestListStudentResponse")
    @Action(input = "http://medianews.vn/ObjectService/requestListStudentRequest", output = "http://medianews.vn/ObjectService/requestListStudentResponse")
    public List<Student> requestListStudent(
        @WebParam(name = "studentCode", targetNamespace = "")
        String studentCode,
        @WebParam(name = "qCode", targetNamespace = "")
        String qCode);

    /**
     * 
     * @param studentCode
     * @param qCode
     * @param object
     */
    @WebMethod
    @RequestWrapper(localName = "submitListCustomer", targetNamespace = "http://medianews.vn/", className = "JNP_2VJvgvh7.SubmitListCustomer")
    @ResponseWrapper(localName = "submitListCustomerResponse", targetNamespace = "http://medianews.vn/", className = "JNP_2VJvgvh7.SubmitListCustomerResponse")
    @Action(input = "http://medianews.vn/ObjectService/submitListCustomerRequest", output = "http://medianews.vn/ObjectService/submitListCustomerResponse")
    public void submitListCustomer(
        @WebParam(name = "studentCode", targetNamespace = "")
        String studentCode,
        @WebParam(name = "qCode", targetNamespace = "")
        String qCode,
        @WebParam(name = "object", targetNamespace = "")
        List<Customer> object);

    /**
     * 
     * @param studentCode
     * @param qCode
     * @return
     *     returns java.util.List<JNP_2VJvgvh7.StudentY>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "requestListStudentY", targetNamespace = "http://medianews.vn/", className = "JNP_2VJvgvh7.RequestListStudentY")
    @ResponseWrapper(localName = "requestListStudentYResponse", targetNamespace = "http://medianews.vn/", className = "JNP_2VJvgvh7.RequestListStudentYResponse")
    @Action(input = "http://medianews.vn/ObjectService/requestListStudentYRequest", output = "http://medianews.vn/ObjectService/requestListStudentYResponse")
    public List<StudentY> requestListStudentY(
        @WebParam(name = "studentCode", targetNamespace = "")
        String studentCode,
        @WebParam(name = "qCode", targetNamespace = "")
        String qCode);

    /**
     * 
     * @param studentCode
     * @param qCode
     * @return
     *     returns java.util.List<JNP_2VJvgvh7.CustomerY>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "requestListCustomerY", targetNamespace = "http://medianews.vn/", className = "JNP_2VJvgvh7.RequestListCustomerY")
    @ResponseWrapper(localName = "requestListCustomerYResponse", targetNamespace = "http://medianews.vn/", className = "JNP_2VJvgvh7.RequestListCustomerYResponse")
    @Action(input = "http://medianews.vn/ObjectService/requestListCustomerYRequest", output = "http://medianews.vn/ObjectService/requestListCustomerYResponse")
    public List<CustomerY> requestListCustomerY(
        @WebParam(name = "studentCode", targetNamespace = "")
        String studentCode,
        @WebParam(name = "qCode", targetNamespace = "")
        String qCode);

    /**
     * 
     * @param studentCode
     * @param qCode
     * @return
     *     returns java.util.List<JNP_2VJvgvh7.Project>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "requestListProject", targetNamespace = "http://medianews.vn/", className = "JNP_2VJvgvh7.RequestListProject")
    @ResponseWrapper(localName = "requestListProjectResponse", targetNamespace = "http://medianews.vn/", className = "JNP_2VJvgvh7.RequestListProjectResponse")
    @Action(input = "http://medianews.vn/ObjectService/requestListProjectRequest", output = "http://medianews.vn/ObjectService/requestListProjectResponse")
    public List<Project> requestListProject(
        @WebParam(name = "studentCode", targetNamespace = "")
        String studentCode,
        @WebParam(name = "qCode", targetNamespace = "")
        String qCode);

    /**
     * 
     * @param studentCode
     * @param qCode
     * @param object
     */
    @WebMethod
    @RequestWrapper(localName = "submitListProject", targetNamespace = "http://medianews.vn/", className = "JNP_2VJvgvh7.SubmitListProject")
    @ResponseWrapper(localName = "submitListProjectResponse", targetNamespace = "http://medianews.vn/", className = "JNP_2VJvgvh7.SubmitListProjectResponse")
    @Action(input = "http://medianews.vn/ObjectService/submitListProjectRequest", output = "http://medianews.vn/ObjectService/submitListProjectResponse")
    public void submitListProject(
        @WebParam(name = "studentCode", targetNamespace = "")
        String studentCode,
        @WebParam(name = "qCode", targetNamespace = "")
        String qCode,
        @WebParam(name = "object", targetNamespace = "")
        List<Project> object);

    /**
     * 
     * @param studentCode
     * @param qCode
     * @return
     *     returns java.util.List<JNP_2VJvgvh7.Customer>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "requestListCustomer", targetNamespace = "http://medianews.vn/", className = "JNP_2VJvgvh7.RequestListCustomer")
    @ResponseWrapper(localName = "requestListCustomerResponse", targetNamespace = "http://medianews.vn/", className = "JNP_2VJvgvh7.RequestListCustomerResponse")
    @Action(input = "http://medianews.vn/ObjectService/requestListCustomerRequest", output = "http://medianews.vn/ObjectService/requestListCustomerResponse")
    public List<Customer> requestListCustomer(
        @WebParam(name = "studentCode", targetNamespace = "")
        String studentCode,
        @WebParam(name = "qCode", targetNamespace = "")
        String qCode);

    /**
     * 
     * @param studentCode
     * @param qCode
     * @param object
     */
    @WebMethod
    @RequestWrapper(localName = "submitListEmployeeY", targetNamespace = "http://medianews.vn/", className = "JNP_2VJvgvh7.SubmitListEmployeeY")
    @ResponseWrapper(localName = "submitListEmployeeYResponse", targetNamespace = "http://medianews.vn/", className = "JNP_2VJvgvh7.SubmitListEmployeeYResponse")
    @Action(input = "http://medianews.vn/ObjectService/submitListEmployeeYRequest", output = "http://medianews.vn/ObjectService/submitListEmployeeYResponse")
    public void submitListEmployeeY(
        @WebParam(name = "studentCode", targetNamespace = "")
        String studentCode,
        @WebParam(name = "qCode", targetNamespace = "")
        String qCode,
        @WebParam(name = "object", targetNamespace = "")
        List<EmployeeY> object);

    /**
     * 
     * @param studentCode
     * @param qCode
     * @param object
     */
    @WebMethod
    @RequestWrapper(localName = "submitListStudent", targetNamespace = "http://medianews.vn/", className = "JNP_2VJvgvh7.SubmitListStudent")
    @ResponseWrapper(localName = "submitListStudentResponse", targetNamespace = "http://medianews.vn/", className = "JNP_2VJvgvh7.SubmitListStudentResponse")
    @Action(input = "http://medianews.vn/ObjectService/submitListStudentRequest", output = "http://medianews.vn/ObjectService/submitListStudentResponse")
    public void submitListStudent(
        @WebParam(name = "studentCode", targetNamespace = "")
        String studentCode,
        @WebParam(name = "qCode", targetNamespace = "")
        String qCode,
        @WebParam(name = "object", targetNamespace = "")
        List<Student> object);

    /**
     * 
     * @param studentCode
     * @param qCode
     * @param object
     */
    @WebMethod
    @RequestWrapper(localName = "submitListCustomerY", targetNamespace = "http://medianews.vn/", className = "JNP_2VJvgvh7.SubmitListCustomerY")
    @ResponseWrapper(localName = "submitListCustomerYResponse", targetNamespace = "http://medianews.vn/", className = "JNP_2VJvgvh7.SubmitListCustomerYResponse")
    @Action(input = "http://medianews.vn/ObjectService/submitListCustomerYRequest", output = "http://medianews.vn/ObjectService/submitListCustomerYResponse")
    public void submitListCustomerY(
        @WebParam(name = "studentCode", targetNamespace = "")
        String studentCode,
        @WebParam(name = "qCode", targetNamespace = "")
        String qCode,
        @WebParam(name = "object", targetNamespace = "")
        List<CustomerY> object);

    /**
     * 
     * @param studentCode
     * @param qCode
     * @return
     *     returns java.util.List<JNP_2VJvgvh7.Order>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "requestListOrder", targetNamespace = "http://medianews.vn/", className = "JNP_2VJvgvh7.RequestListOrder")
    @ResponseWrapper(localName = "requestListOrderResponse", targetNamespace = "http://medianews.vn/", className = "JNP_2VJvgvh7.RequestListOrderResponse")
    @Action(input = "http://medianews.vn/ObjectService/requestListOrderRequest", output = "http://medianews.vn/ObjectService/requestListOrderResponse")
    public List<Order> requestListOrder(
        @WebParam(name = "studentCode", targetNamespace = "")
        String studentCode,
        @WebParam(name = "qCode", targetNamespace = "")
        String qCode);

    /**
     * 
     * @param studentCode
     * @param qCode
     * @return
     *     returns JNP_2VJvgvh7.Employee
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "requestEmployee", targetNamespace = "http://medianews.vn/", className = "JNP_2VJvgvh7.RequestEmployee")
    @ResponseWrapper(localName = "requestEmployeeResponse", targetNamespace = "http://medianews.vn/", className = "JNP_2VJvgvh7.RequestEmployeeResponse")
    @Action(input = "http://medianews.vn/ObjectService/requestEmployeeRequest", output = "http://medianews.vn/ObjectService/requestEmployeeResponse")
    public Employee requestEmployee(
        @WebParam(name = "studentCode", targetNamespace = "")
        String studentCode,
        @WebParam(name = "qCode", targetNamespace = "")
        String qCode);

    /**
     * 
     * @param studentCode
     * @param qCode
     * @param object
     */
    @WebMethod
    @RequestWrapper(localName = "submitEmployee", targetNamespace = "http://medianews.vn/", className = "JNP_2VJvgvh7.SubmitEmployee")
    @ResponseWrapper(localName = "submitEmployeeResponse", targetNamespace = "http://medianews.vn/", className = "JNP_2VJvgvh7.SubmitEmployeeResponse")
    @Action(input = "http://medianews.vn/ObjectService/submitEmployeeRequest", output = "http://medianews.vn/ObjectService/submitEmployeeResponse")
    public void submitEmployee(
        @WebParam(name = "studentCode", targetNamespace = "")
        String studentCode,
        @WebParam(name = "qCode", targetNamespace = "")
        String qCode,
        @WebParam(name = "object", targetNamespace = "")
        Employee object);

    /**
     * 
     * @param studentCode
     * @param qCode
     * @param object
     */
    @WebMethod
    @RequestWrapper(localName = "submitProductY", targetNamespace = "http://medianews.vn/", className = "JNP_2VJvgvh7.SubmitProductY")
    @ResponseWrapper(localName = "submitProductYResponse", targetNamespace = "http://medianews.vn/", className = "JNP_2VJvgvh7.SubmitProductYResponse")
    @Action(input = "http://medianews.vn/ObjectService/submitProductYRequest", output = "http://medianews.vn/ObjectService/submitProductYResponse")
    public void submitProductY(
        @WebParam(name = "studentCode", targetNamespace = "")
        String studentCode,
        @WebParam(name = "qCode", targetNamespace = "")
        String qCode,
        @WebParam(name = "object", targetNamespace = "")
        ProductY object);

    /**
     * 
     * @param studentCode
     * @param qCode
     * @return
     *     returns JNP_2VJvgvh7.ProductY
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "requestProductY", targetNamespace = "http://medianews.vn/", className = "JNP_2VJvgvh7.RequestProductY")
    @ResponseWrapper(localName = "requestProductYResponse", targetNamespace = "http://medianews.vn/", className = "JNP_2VJvgvh7.RequestProductYResponse")
    @Action(input = "http://medianews.vn/ObjectService/requestProductYRequest", output = "http://medianews.vn/ObjectService/requestProductYResponse")
    public ProductY requestProductY(
        @WebParam(name = "studentCode", targetNamespace = "")
        String studentCode,
        @WebParam(name = "qCode", targetNamespace = "")
        String qCode);

    /**
     * 
     * @param studentCode
     * @param qCode
     * @param object
     */
    @WebMethod
    @RequestWrapper(localName = "submitListOrder", targetNamespace = "http://medianews.vn/", className = "JNP_2VJvgvh7.SubmitListOrder")
    @ResponseWrapper(localName = "submitListOrderResponse", targetNamespace = "http://medianews.vn/", className = "JNP_2VJvgvh7.SubmitListOrderResponse")
    @Action(input = "http://medianews.vn/ObjectService/submitListOrderRequest", output = "http://medianews.vn/ObjectService/submitListOrderResponse")
    public void submitListOrder(
        @WebParam(name = "studentCode", targetNamespace = "")
        String studentCode,
        @WebParam(name = "qCode", targetNamespace = "")
        String qCode,
        @WebParam(name = "object", targetNamespace = "")
        List<Order> object);

    /**
     * 
     * @param studentCode
     * @param qCode
     * @param object
     */
    @WebMethod
    @RequestWrapper(localName = "submitListOrderY", targetNamespace = "http://medianews.vn/", className = "JNP_2VJvgvh7.SubmitListOrderY")
    @ResponseWrapper(localName = "submitListOrderYResponse", targetNamespace = "http://medianews.vn/", className = "JNP_2VJvgvh7.SubmitListOrderYResponse")
    @Action(input = "http://medianews.vn/ObjectService/submitListOrderYRequest", output = "http://medianews.vn/ObjectService/submitListOrderYResponse")
    public void submitListOrderY(
        @WebParam(name = "studentCode", targetNamespace = "")
        String studentCode,
        @WebParam(name = "qCode", targetNamespace = "")
        String qCode,
        @WebParam(name = "object", targetNamespace = "")
        List<OrderY> object);

}