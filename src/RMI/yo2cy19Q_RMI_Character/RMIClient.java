package RMI.yo2cy19Q_RMI_Character;

import RMI.CharacterService;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.HashMap;
import java.util.Map;

public class RMIClient {
    static int toDecimal(String str) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int total = 0, prev = 0;
        for(int i = str.length() - 1; i >= 0; i--) {
            char curChar = str.charAt(i);
            int curVal = map.get(curChar);
            if(curVal < prev) {
                total -= curVal;
            } else {
                total += curVal;
            }
            prev = curVal;
        }
        return total;
    }

    public static void main(String[] args) throws RemoteException, NotBoundException {
        String serverAddress = "203.162.10.109";
        int registryPort = 1099;
        String serviceName = "RMICharacterService";
        String studentCode = "B21DCCN194";
        String qCode = "yo2cy19Q";

        Registry registry = LocateRegistry.getRegistry(serverAddress, registryPort);
        CharacterService characterService = (CharacterService) registry.lookup(serviceName);

        String responseData = characterService.requestCharacter(studentCode, qCode);
        String sendData = String.valueOf(toDecimal(responseData));
        characterService.submitCharacter(studentCode, qCode, sendData);
    }
}
