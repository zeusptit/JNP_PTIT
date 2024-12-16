import java.util.HashMap;
import java.util.Map;

public class test {
    public static void main(String[] args) {
        String input = "requestId;aaazbbbccdaaz";
        int idx = input.indexOf(";");
        String header = input.substring(0, idx);
        String body = input.substring(idx + 1);
        Map<Character, Integer> map = new HashMap<>();
        for(Character c : body.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        StringBuilder sb = new StringBuilder();
        for(Character c : body.toCharArray()){
            if(map.get(c) != 0) {
                sb.append(map.get(c)).append(c);
                map.put(c, 0);
            }
        }
        String ans = header + ";" + sb.toString();
        System.out.println(ans);
    }
}
