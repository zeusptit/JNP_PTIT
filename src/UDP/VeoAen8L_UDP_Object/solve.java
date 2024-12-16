package UDP.VeoAen8L_UDP_Object;

import java.io.*;
import java.net.*;
import UDP.Student;

public class solve {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        InetAddress address = InetAddress.getByName("203.162.10.109");
        DatagramSocket socket = new DatagramSocket();
        String msg = ";B21DCCN194;VeoAen8L";
        byte[] sendData = msg.getBytes();
        DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, address, 2209);
        socket.send(sendPacket);

        byte[] receiveData = new byte[1024];
        DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
        socket.receive(receivePacket);

        String requestId = new String(receivePacket.getData(), 0, 8);

        ByteArrayInputStream bais = new ByteArrayInputStream(receivePacket.getData(), 8, receivePacket.getLength() - 8);
        ObjectInputStream ois = new ObjectInputStream(bais);
        Student student = (Student) ois.readObject();

        String name = student.getName();
        StringBuilder sb = new StringBuilder();
        String[] s = name.split("\\s+");
        for (String str : s) {
            sb.append(str.substring(0, 1).toUpperCase())
                    .append(str.substring(1).toLowerCase())
                    .append(" ");
        }
        student.setName(sb.toString().trim());

        StringBuilder email = new StringBuilder();
        email.append(s[s.length - 1].toLowerCase());
        for (int i = 0; i < s.length - 1; i++) {
            email.append(s[i].substring(0, 1).toLowerCase());
        }
        String emailAns = email.toString() + "@ptit.edu.vn";

        student.setEmail(emailAns);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(student);
        byte[] data = baos.toByteArray();

        byte[] sendFinalData = new byte[8 + data.length];
        System.arraycopy(requestId.getBytes(), 0, sendFinalData, 0, 8);
        System.arraycopy(data, 0, sendFinalData, 8, data.length);

        DatagramPacket packet = new DatagramPacket(sendFinalData, sendFinalData.length, address, 2209);
        socket.send(packet);
        socket.close();
    }
}
