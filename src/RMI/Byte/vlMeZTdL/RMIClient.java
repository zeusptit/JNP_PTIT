package RMI.Byte.vlMeZTdL;

import RMI.ByteService;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.HashMap;
import java.util.Map;

public class RMIClient {
    public static void main(String[] args) throws Exception {
        String serverAddress = "203.162.10.109";
        int registryPort = 1099;
        String serviceName = "RMIByteService";
        String studentCode = "<MSV>";
        String qCode = "vlMeZTdL";

        Registry registry = LocateRegistry.getRegistry(serverAddress, registryPort);
        ByteService byteService = (ByteService) registry.lookup(serviceName);

        byte[] responseData = byteService.requestData(studentCode, qCode);
        int[] input = new int[responseData.length];

        for (int i = 0; i < responseData.length; i++) {
            input[i] = Byte.toUnsignedInt(responseData[i]);
        }

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : input) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int maxFrequency = frequencyMap.values().stream().max(Integer::compareTo).orElse(0);
        int mostFrequentElement = frequencyMap.entrySet().stream()
                .filter(entry -> entry.getValue() == maxFrequency)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(0);

        byte[] byteArray = new byte[2];
        byteArray[0] = (byte) mostFrequentElement;
        byteArray[1] = (byte) maxFrequency;

        byteService.submitData(studentCode, qCode, byteArray);
    }
}
