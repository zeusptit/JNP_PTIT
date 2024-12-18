package TCP.lFdo26c3;

import java.io.*;
import java.net.Socket;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("203.162.10.109", 2208);
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

        String msg = "<MSV>;lFdo26c3";
        bw.write(msg);
        bw.newLine();
        bw.flush();

        String response = br.readLine();
        StringBuilder sb = new StringBuilder();
        Set<Character> set = new HashSet<>();
        for(Character c: response.toCharArray()) {
            if(Character.isLetter(c) && !set.contains(c)) {
                sb.append(c);
                set.add(c);
            }
        }

        bw.write(sb.toString());
        bw.newLine();
        bw.flush();
        socket.close();
    }
}
