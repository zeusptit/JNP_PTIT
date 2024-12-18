package RMI.Data.dRNE6gAK;

import RMI.DataService;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIClient {
    public static void main(String[] args) throws RemoteException, NotBoundException {
        String address = "203.162.10.109";
        int registryPort = 1099;
        String serviceName = "RMIDataService";
        String studentCode = "<MSV>";
        String qCode = "dRNE6gAK";

        Registry registry = LocateRegistry.getRegistry(address, registryPort);
        DataService dataService = (DataService) registry.lookup(serviceName);
        int amount = (int) dataService.requestData(studentCode, qCode);

        int[] price = {10, 5, 2, 1};
        int ans = 0, idx = 0;
        StringBuilder sb = new StringBuilder();
        while(amount > 0) {
            int temp = amount / price[idx];
            for(int i = 1; i <= temp; i++) {
                sb.append(price[idx]);
                sb.append(",");
            }
            ans += temp;
            amount %= price[idx];
            idx++;
        }
        String res = ans != 0 ? String.format("%d; ", ans) + sb.deleteCharAt(sb.length() - 1) : "-1";

        dataService.submitData(studentCode, qCode, res);
    }
}
