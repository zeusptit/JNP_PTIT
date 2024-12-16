package TCP.IF3ftRBm_TCP_ByteStream;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class solve {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("203.162.10.109", 2206);
        InputStream is = socket.getInputStream();
        OutputStream os = socket.getOutputStream();
        String msg = "B21DCCN194;IF3ftRBm";
        os.write(msg.getBytes());
        byte[] buf = new byte[1024];
        is.read(buf);
        String[] s = new String(buf).split("\\|");
        List<Integer> nums = new ArrayList<>();
        for(String str : s) {
            nums.add(Integer.parseInt(str.trim()));
        }
        long sum = 0;
        for(long i : nums) {
            sum += i;
        }

        os.write(String.valueOf(sum).getBytes());
    }
}
