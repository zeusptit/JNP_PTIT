package UDP.A0hO9sJAY_UDP_String;

import java.io.IOException;
import java.net.*;
import java.util.HashMap;
import java.util.Map;

public class solve {
    public static void main(String[] args) throws IOException {
        InetAddress address = InetAddress.getByName("203.162.10.109");
        DatagramSocket socket = new DatagramSocket();
        String msg = ";B21DCCN194;0hO9sJAY";
        byte[] sendData = msg.getBytes();
        DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, address, 2208);
        socket.send(sendPacket);
        byte[] receiveData = new byte[1024];
        DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
        socket.receive(receivePacket);
        String input = new String(receivePacket.getData(), 0, receivePacket.getLength());
        int idx = input.indexOf(";");
        String header = input.substring(0, idx);
        String body = input.substring(idx + 1);
        Map<Character, Integer> map = new HashMap<>();
        for (Character c : body.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        StringBuilder sb = new StringBuilder();
        for (Character c : body.toCharArray()) {
            if (map.get(c) != 0) {
                sb.append(map.get(c)).append(c);
                map.put(c, 0);
            }
        }
        String ans = header + ";" + sb.toString();
        DatagramPacket packet = new DatagramPacket(ans.getBytes(), ans.getBytes().length, address, 2208);
        socket.send(packet);
        socket.close();
    }
}
