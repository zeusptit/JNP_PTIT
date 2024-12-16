package UDP.DataType.y2pgJjvK;

import java.io.IOException;
import java.net.*;
import java.util.HashSet;
import java.util.Set;

public class solve {
    public static void main(String[] args) throws IOException {
        InetAddress inetAddress = InetAddress.getByName("203.162.10.109");
        DatagramSocket datagramSocket = new DatagramSocket();
        byte[] sendInfo;
        String msg = ";<MSV>;y2pgJjvK";
        sendInfo = msg.getBytes();
        DatagramPacket datagramPacket = new DatagramPacket(sendInfo, sendInfo.length, inetAddress, 2207);
        datagramSocket.send(datagramPacket);

        byte[] receiveInfo = new byte[1024];
        DatagramPacket receivePacket = new DatagramPacket(receiveInfo, receiveInfo.length);
        datagramSocket.receive(receivePacket);

        String receiveData = new String(receivePacket.getData(), 0, receivePacket.getLength());

        int idx = receiveData.indexOf(";");
        String header = receiveData.substring(0, idx);
        String body = receiveData.substring(idx + 1);

        idx = body.indexOf(";");
        int n = Integer.parseInt(body.substring(0, idx));
        body = body.substring(idx + 1);

        String[] numStr = body.split(",");
        Set<Integer> nums = new HashSet<>();

        for (String s : numStr) {
            nums.add(Integer.parseInt(s));
        }
        StringBuilder response = new StringBuilder();
        response.append(header).append(";");
        for(int i = 1; i <= n; i++){
            if(!nums.contains(i)){
                response.append(i).append(",");
            }
        }
        response.deleteCharAt(response.length() - 1);
        byte[] sendResponse = response.toString().getBytes();
        DatagramPacket packet = new DatagramPacket(sendResponse, sendResponse.length, inetAddress, 2207);
        datagramSocket.send(packet);
    }
}
