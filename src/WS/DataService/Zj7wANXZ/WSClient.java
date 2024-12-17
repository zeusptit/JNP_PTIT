package Zj7wANXZ;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.stream.Collectors;

public class WSClient {
    public static void main(String[] args) throws MalformedURLException {
        String serviceUrl = "http://203.162.10.109:8080/JNPWS/DataService?wsdl";
        URL url = new URL(serviceUrl);

        QName qname = new QName("http://medianews.vn/", "DataService");

        DataService service = new DataService_Service(url, qname).getDataServicePort();

        String studentCode = "B21DCCN194";
        String qCode = "Zj7wANXZ";

        List<Integer> data = service.getData(studentCode, qCode);

        List<String> binaryStrings = data.stream()
                .map(Integer::toBinaryString)
                .collect(Collectors.toList());

        service.submitDataStringArray(studentCode, qCode, binaryStrings);
    }
}
