package RMI.MCtylxXJ_RMI_Data;

import RMI.DataService;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.List;

public class RMIClient {
    public static void main(String[] args) throws RemoteException, NotBoundException {
        String serverAddress = "203.162.10.109";
        int registryPort = 1099;
        String serviceName = "RMIDataService";
        String studentCode = "B21DCCN194";
        String qCode = "MCtylxXJ";

        Registry registry = LocateRegistry.getRegistry(serverAddress, registryPort);
        DataService dataService = (DataService) registry.lookup(serviceName);

        int responseData = (int) dataService.requestData(studentCode, qCode);
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= Math.sqrt(responseData); i++) {
            list.add(i * i);
        }
        dataService.submitData(studentCode, qCode, list);
    }
}
