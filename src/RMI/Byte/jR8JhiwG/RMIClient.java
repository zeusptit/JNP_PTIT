package RMI.Byte.jR8JhiwG;

import RMI.ByteService;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Arrays;

public class RMIClient {
    public static void main(String[] args) throws RemoteException, NotBoundException {
        String address = "203.162.10.109";
        int registryPort = 1099;
        String serviceName = "RMIByteService";
        String studentCode = "<MSV>";
        String qCode = "jR8JhiwG";

        Registry registry = LocateRegistry.getRegistry(address, registryPort);
        ByteService byteService = (ByteService) registry.lookup(serviceName);

        byte[] data = byteService.requestData(studentCode, qCode);
        int k = data[data.length - 1];

        int[] arr = new int[data.length - 1];
        for(int i = 0; i < data.length - 1; i++) {
            arr[i] = Byte.toUnsignedInt(data[i]);
        }

        Arrays.sort(arr);
        int ans = arr[arr.length - k], pos = -1;
        for(int i = 0; i < data.length - 1; i++) {
            if(ans == Byte.toUnsignedInt(data[i])) {
                pos = i + 1;
                break;
            }
        }

        byte[] res = new byte[]{(byte)ans, (byte)pos};
        byteService.submitData(studentCode, qCode, res);
    }
}
