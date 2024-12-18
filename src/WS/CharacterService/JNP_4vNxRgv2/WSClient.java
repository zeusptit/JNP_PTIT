package JNP_4vNxRgv2;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

public class WSClient {
    static Set<Character> vowels = new HashSet<>(Arrays.asList('u', 'e', 'o', 'a', 'i'));


    private static int countVowels(String s) {
        return (int) s.chars()
                .filter(c -> vowels.contains((char) c))
                .count();
    }

    private static List<String> process(List<String> list) {

        TreeMap<String, Integer> map = new TreeMap<>();
        for(String s: list){
            int cnt = countVowels(s);
            map.put(s, cnt);
        }

        List<String> ans = new ArrayList<>();
        for(int i = 0; i <= 5; i++) {
            StringBuilder sb = new StringBuilder();
            for(String s: map.keySet()) {
                if(map.get(s) == i) {
                    sb.append(s).append(", ");
                }
            }
            if(sb.length() > 0) {
                sb.delete(sb.length() - 2, sb.length());
                ans.add(sb.toString());
            }
        }
        return ans;
    }
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://203.162.10.109:8080/JNPWS/CharacterService?wsdl");
        QName qName = new QName("http://medianews.vn/", "CharacterService");

        String studentCode = "<MSV>";
        String qCode = "4vNxRgv2";

        CharacterService characterService = new CharacterService_Service(url, qName).getCharacterServicePort();

        List<String> list = characterService.requestStringArray(studentCode, qCode);

        characterService.submitCharacterStringArray(studentCode, qCode, process(list));
    }
}
