package JNP_2VJvgvh7;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;

public class WSClient {

    private static float process(ProductY productY) {
        return productY.getPrice() * (1 + productY.getTaxRate() / 100) * (1 - productY.getDiscount() / 100);
    }

    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://203.162.10.109:8080/JNPWS/ObjectService?wsdl");
        QName qName = new QName("http://medianews.vn/", "ObjectService");

        String studentCode = "<MSV>";
        String qCode = "2VJvgvh7";

        ObjectService service = new ObjectService_Service(url, qName).getObjectServicePort();

        ProductY productY = service.requestProductY(studentCode, qCode);

        productY.setFinalPrice(process(productY));
        service.submitProductY(studentCode, qCode, productY);
    }
}
