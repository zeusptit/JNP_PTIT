package RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ByteService extends Remote {
    byte[] requestData(String studentCode, String qCode) throws RemoteException;
    void submitData(String studentCode, String qCode, byte[] data) throws RemoteException;
}
