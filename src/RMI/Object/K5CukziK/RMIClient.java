package RMI.Object.K5CukziK;

import RMI.Event;
import RMI.ObjectService;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RMIClient {
    private static String generateEventCode(Event event) throws ParseException {
        StringBuilder sb = new StringBuilder();
        if(event.getExpectedAttendance() >= 1000)sb.append("L");
        else if(event.getExpectedAttendance() >= 500)sb.append("M");
        else sb.append("S");
        sb.append(event.getEventName().toUpperCase().charAt(0)).append(event.getEventName().toUpperCase().charAt(event.getEventName().length() - 1));

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = format.parse(event.getEventDate());

        SimpleDateFormat newFormat = new SimpleDateFormat("ddMM");
        sb.append(newFormat.format(date));
        return sb.toString();
    }

    public static void main(String[] args) throws RemoteException, NotBoundException, ParseException {
        String address = "203.162.10.109";
        int registryPort = 1099;
        String serviceName = "RMIObjectService";
        String studentCode = "<MSV>";
        String qCode = "K5CukziK";

        Registry registry = LocateRegistry.getRegistry(address, registryPort);
        ObjectService objectService = (ObjectService) registry.lookup(serviceName);

        Event event = (Event) objectService.requestObject(studentCode, qCode);

        event.setEventCode(generateEventCode(event));

        objectService.submitObject(studentCode, qCode, event);
    }
}
