package DUuggz0C;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class WSClient {

    public static void rotateRight(List<Integer> list, int count) {
        int size = list.size();
        count = count % size;

        for (int i = 0; i < count; i++) {
            Integer temp = list.get(size - 1);
            list.remove(size - 1);
            list.add(0, temp);
        }
    }
    public static void main(String[] args) throws MalformedURLException {
        String serviceUrl = "http://203.162.10.109:8080/JNPWS/CharacterService?wsdl";
        URL url = new URL(serviceUrl);

        QName qname = new QName("http://medianews.vn/", "CharacterService");

        CharacterService service = new CharacterService_Service(url, qname).getCharacterServicePort();

        String studentCode = "B21DCCN194";
        String qCode = "DUuggz0C";

        List<Integer> characterList = service.requestCharacter(studentCode, qCode);

        if (characterList != null && !characterList.isEmpty()) {
            int rotationCount = characterList.get(0);
            rotateRight(characterList, rotationCount);
        }

        service.submitCharacterCharArray(studentCode, qCode, characterList);
    }
}
