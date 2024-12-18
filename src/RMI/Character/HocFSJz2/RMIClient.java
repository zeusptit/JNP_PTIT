package RMI.Character.HocFSJz2;

import RMI.CharacterService;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIClient {
    private static String rotateString(String data, int k) {
        StringBuilder sb = new StringBuilder();
        for(Character c : data.toCharArray()) {
            if(Character.isLowerCase(c)) {
                sb.append((char)((((c - 'a' - k) % 26) + 26) % 26 + 'a'));
            } else if(Character.isUpperCase(c)) {
                sb.append((char)((((c - 'A' - k) % 26) + 26) % 26 + 'A'));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) throws RemoteException, NotBoundException {
        String address = "203.162.10.109";
        int registryPort = 1099;
        String serviceName = "RMICharacterService";
        String studentCode = "<MSV>";
        String qCode = "HocFSJz2";

        Registry registry = LocateRegistry.getRegistry(address, registryPort);
        CharacterService characterService = (CharacterService) registry.lookup(serviceName);

        String data = characterService.requestCharacter(studentCode, qCode);
        int k = data.length() % 7;

        characterService.submitCharacter(studentCode, qCode, rotateString(data, k));
    }
}
