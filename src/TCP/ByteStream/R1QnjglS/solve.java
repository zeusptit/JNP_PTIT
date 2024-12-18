package TCP.R1QnjglS;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class solve {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("203.162.10.109", 2206);
        InputStream is = socket.getInputStream();
        OutputStream os = socket.getOutputStream();

        String msg = "<MSV>;R1QnjglS";
        os.write(msg.getBytes());

        byte[] buffer = new byte[1024];
        is.read(buffer);

        String data = new String(buffer).trim();
        String[] parts = data.split(",");
        List<Integer> list = new ArrayList<>();
        for(String p: parts) {
            list.add(Integer.parseInt(p));
        }
        List<Integer> res = new ArrayList<>(list);
        Collections.sort(res);
        int secondMax = res.get(res.size() - 2);
        int pos = list.indexOf(secondMax);

        String ans = String.format("%d,%d", secondMax, pos);
        os.write(ans.getBytes());
    }
}
