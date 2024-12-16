package TCP.CharacterStream.TwnC2yCj;

import java.io.*;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class solve {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("203.162.10.109", 2208);
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

        String msg = "<MSV>;TwnC2yCj";
        bw.write(msg);
        bw.newLine();
        bw.flush();

        String data = br.readLine();
        Map<Character, Integer> map = new HashMap<>();
        for(Character c : data.toCharArray()) {
            if(Character.isLetterOrDigit(c)){
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }

        StringBuilder response = new StringBuilder();
        for(Character c: data.toCharArray()) {
            if(Character.isLetterOrDigit(c) && map.get(c) > 1) {
                response.append(c).append(":").append(map.get(c)).append(",");
                map.put(c, 0);
            }
        }

        bw.write(response.toString());
        bw.newLine();
        bw.flush();
        socket.close();
    }
}
