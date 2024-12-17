package JNP_1A5b2wor;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;

public class WSClient {
    public static int calculateWorkingDays(Date startDate, Date endDate) {
        Calendar startCalendar = Calendar.getInstance();
        startCalendar.setTime(startDate);
        Calendar endCalendar = Calendar.getInstance();
        endCalendar.setTime(endDate);

        int workingDays = 0;

        while (!startCalendar.after(endCalendar)) {
            int dayOfWeek = startCalendar.get(Calendar.DAY_OF_WEEK);
            if (dayOfWeek != Calendar.SATURDAY && dayOfWeek != Calendar.SUNDAY) {
                workingDays++;
            }
            startCalendar.add(Calendar.DAY_OF_MONTH, 1);
        }
        return workingDays;
    }

    public static void main(String[] args) throws MalformedURLException {
        String serviceUrl = "http://203.162.10.109:8080/JNPWS/ObjectService?wsdl";
        URL url = new URL(serviceUrl);

        QName qname = new QName("http://medianews.vn/", "ObjectService");
        ObjectService service = new ObjectService_Service(url, qname).getObjectServicePort();

        String studentCode = "B21DCCN194";
        String qCode = "1A5b2wor";

        Employee employee = service.requestEmployee(studentCode, qCode);

        int workingDays = calculateWorkingDays(employee.getStartDate().toGregorianCalendar().getTime(), employee.getEndDate().toGregorianCalendar().getTime());

        employee.setWorkingDays(workingDays);

        service.submitEmployee(studentCode, qCode, employee);

    }
}
