package UDP.DataType.Ik2wHDDt;

import java.io.IOException;
import java.net.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class solve {
    public static void main(String[] args) throws IOException {
        InetAddress address = InetAddress.getByName("203.162.10.109");
        DatagramSocket socket = new DatagramSocket();
        String msg = ";<MSV>;Ik2wHDDt";
        DatagramPacket packet = new DatagramPacket(msg.getBytes(), msg.length(), address, 2207);
        socket.send(packet);

        byte[] receiveData = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(receiveData, receiveData.length);
        socket.receive(datagramPacket);
        String input = new String(datagramPacket.getData(), 0, datagramPacket.getLength());
        int idx = input.indexOf(";");
        String header = input.substring(0, idx);
        String body = input.substring(idx + 1);
        List<Integer> list = new ArrayList<>();
        String[] s = body.split(",");
        for(String str : s) {
            list.add(Integer.parseInt(str));
        }
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        sb.append(header).append(";").append(list.get(list.size() - 2)).append(",").append(list.get(1));
        DatagramPacket sendPacket = new DatagramPacket(sb.toString().getBytes(), sb.toString().length(), address, 2207);
        socket.send(sendPacket);
    }
}
