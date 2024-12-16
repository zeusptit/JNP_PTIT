package UDP.Object.tuDE0Aoy;

import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import UDP.Product;

public class solve {

    private static String processName(String name) {
        String[] str = name.split("\\s+");
        StringBuilder sb = new StringBuilder();
        sb.append(str[str.length - 1]).append(" ");
        for(int i = 0; i < str.length - 1; i++) {
            sb.append(str[i]).append(" ");
        }
        return sb.toString().trim();
    }

    private static int processQuantity(int quantity) {
        return Integer.parseInt(rev(String.valueOf(quantity)));
    }

    private static String rev(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    private static void process(Product product) {
        product.setName(processName(product.getName()));
        product.setQuantity(processQuantity(product.getQuantity()));
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        InetAddress inetAddress = InetAddress.getByName("203.162.10.109");
        DatagramSocket socket = new DatagramSocket();

        String msg = ";<MSV>;tuDE0Aoy";
        byte[] sendData = msg.getBytes();
        DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, inetAddress, 2209);
        socket.send(sendPacket);

        byte[] receiveData = new byte[1024];
        DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
        socket.receive(receivePacket);

        String requestId = new String(receivePacket.getData(), 0, 8);
        ByteArrayInputStream bais = new ByteArrayInputStream(receivePacket.getData(), 8, receivePacket.getLength() - 8);
        ObjectInputStream ois = new ObjectInputStream(bais);

        Product product = (Product) ois.readObject();
        process(product);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(product);
        byte[] data = baos.toByteArray();
        byte[] sendResponseData = new byte[8 + data.length];

        System.arraycopy(requestId.getBytes(), 0, sendResponseData, 0, 8);
        System.arraycopy(data, 0, sendResponseData, 8, data.length);

        DatagramPacket packet = new DatagramPacket(sendResponseData, sendResponseData.length, inetAddress, 2209);
        socket.send(packet);
        socket.close();

    }
}
