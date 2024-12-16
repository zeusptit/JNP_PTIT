package TCP.DataStream.Qos9IWx6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class solve {
    private static String process(String data, int k) {
        StringBuilder result = new StringBuilder();
        for(Character c : data.toCharArray()) {
            if(Character.isLowerCase(c)){
                result.append((char)(((c - 'a' + k) % 26 + 26) % 26 + 'a'));
            } else if(Character.isUpperCase(c)){
                result.append((char)(((c - 'A' + k) % 26 + 26) % 26 + 'A'));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("203.162.10.109", 2207);
        DataInputStream in = new DataInputStream(socket.getInputStream());
        DataOutputStream out = new DataOutputStream(socket.getOutputStream());

        String msg = "<MSV>;Qos9IWx6";
        out.writeUTF(msg);

        String data = in.readUTF();
        int k = in.readInt();
        String response = process(data, k);

        out.writeUTF(response);
        out.close();
    }
}
