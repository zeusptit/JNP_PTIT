package TCP.ByteStream.JNP_1SyAVk8R;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.HashSet;
import java.util.Set;

public class solve {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("203.162.10.109", 2206);
        InputStream is = socket.getInputStream();
        OutputStream os = socket.getOutputStream();
        String msg = "<MSV>;1SyAVk8R";
        os.write(msg.getBytes());

        byte[] buffer = new byte[1024];
        is.read(buffer);

        String data = new String(buffer).trim();
        System.out.println(data);
        int max = 0;
        String ans = "";
        for(int i = 0; i < data.length(); i++) {
            Set<Character> set = new HashSet<>();
            int j = i;

            while(j < data.length()) {
                if(set.contains(data.charAt(j))) {
                    break;
                }
                set.add(data.charAt(j++));
            }
            if(set.size() > max) {
                max = set.size();
                ans = data.substring(i, j);
            }
        }
        ans += ";" + max;
        System.out.println(ans);
        os.write(ans.getBytes());
    }
}
