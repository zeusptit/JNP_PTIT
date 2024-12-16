package TCP.Jl0dFhaS_TCP_DataStream;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class solve {
    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("203.162.10.109", 2207);
        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
        String msg = "B21DCCN194;Jl0dFhaS";
        dataOutputStream.writeUTF(msg);

        int a = dataInputStream.readInt();
        int b = dataInputStream.readInt();
        dataOutputStream.writeInt(gcd(a, b));
        dataOutputStream.writeInt(lcm(a, b));
        dataOutputStream.writeInt(a + b);
        dataOutputStream.writeInt(a * b);
    }
}