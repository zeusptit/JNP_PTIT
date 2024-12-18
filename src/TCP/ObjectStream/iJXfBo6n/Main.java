package TCP.iJXfBo6n;

import TCP.Laptop;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Main {

    private static String processName(String name) {
        String[] words = name.split("\\s+");
        StringBuilder res = new StringBuilder();
        res.append(words[words.length - 1]).append(" ");
        for(int i = 1; i < words.length - 1; i++) {
            res.append(words[i]);
            res.append(" ");
        }
        res.append(words[0]);
        return res.toString();
    }

    private static int processPrice(int price) {
       return Integer.parseInt(new StringBuilder(String.valueOf(price)).reverse().toString());
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Socket socket = new Socket("203.162.10.109", 2209);
        ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
        ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());

        String msg = "B21DCCN134;iJXfBo6n";
        oos.writeObject(msg);

        Laptop laptop = (Laptop) ois.readObject();
        laptop.setName(processName(laptop.getName()));
        laptop.setQuantity(processPrice(laptop.getQuantity()));

        oos.writeObject(laptop);
    }

}
