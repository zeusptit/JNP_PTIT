package TCP.CharacterStream.JNP_4V2Y2OPL;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class solve {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("203.162.10.109", 2208);
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

        String msg = "<MSV>;4V2Y2OPL";
        writer.write(msg);
        writer.newLine();
        writer.flush();

        String input = reader.readLine();
        if (input != null) {
            String[] arr = input.trim().split("\\s+");
            List<String> list = new ArrayList<>(Arrays.asList(arr));
            Collections.sort(list);
            StringBuilder ans = new StringBuilder();
            for (String s : list) {
                ans.append(s).append(" ");
            }
            writer.write(ans.toString());
            writer.newLine();
            writer.flush();
        } else {
            System.out.println("Không nhận được dữ liệu từ server.");
        }
    }
}
