package vpcsjnzK;

import jdk.jfr.internal.tool.Main;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class WSClient {
    private static List<Integer> process(List<Integer> list) {
        List<Integer> evens = list.stream().filter(n -> (~n & 1) == 1).collect(Collectors.toList());
        List<Integer> odds = list.stream().filter(n -> (n & 1) == 1).collect(Collectors.toList());

        List<Integer> res = new ArrayList<>();
        int minSize = Math.min(evens.size(), odds.size());

        for(int i = 0; i < minSize; i++){
            res.add(evens.get(i));
            res.add(odds.get(i));
        }

        res.addAll((evens.subList(minSize, evens.size())));
        res.addAll((odds.subList(minSize, odds.size())));
        return res;
    }
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://203.162.10.109:8080/JNPWS/DataService?wsdl");
        QName qname = new QName("http://medianews.vn/", "DataService");

        String studentCode = "B21DCCN246";
        String qCode = "vpcsjnzK";

        DataService dataService = new DataService_Service(url, qname).getDataServicePort();

        List<Integer> list = dataService.getData(studentCode, qCode);

        dataService.submitDataIntArray(studentCode, qCode, process(list));
    }
}
