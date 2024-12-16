package TCP.ObjectStream.J8l1F1Ij;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import TCP.Product;

public class solve {

    static int calDiscount(Double price) {
        int temp = price.intValue(), ans = 0;
        String tmp = String.valueOf(temp);
        for(int i = 0; i < tmp.length(); i++) {
            ans += tmp.charAt(i) - '0';
        }
        return ans;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Socket socket = new Socket("203.162.10.109", 2209);
        ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
        ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
        String msg = "<MSV>;J8l1F1Ij";
        oos.writeObject(msg);

        Product product = (Product) ois.readObject();
        product.setDiscount(calDiscount(product.getPrice()));

        oos.writeObject(product);
    }
}
