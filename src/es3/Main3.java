package es3;

import entities.Contacts;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main3 {
    private static Logger log = LoggerFactory.getLogger(Main3.class);

    public static void main(String[] args) {

        Contacts user1 = new Contacts("Mario", 333221150);
        Contacts user2 = new Contacts("Luigi", 333231520);
        Contacts user3 = new Contacts("Kratos", 333211662);

        Map<String, Integer> rubrica = new HashMap<>();

        rubrica.put(user1.getNome(), user1.getNumero());
        rubrica.put(user2.getNome(), user2.getNumero());
        rubrica.put(user3.getNome(), user3.getNumero());

        rubrica.remove("Luigi");

        log.info(rubrica.toString());

        searchUserByNumber(333221150, rubrica);


    }

    private static void searchUserByNumber(int numero, Map<String, Integer> contacts) {

        Set<String> elencoChiavi = contacts.keySet();
        
        for (Integer num : elencoChiavi) {
            System.out.println("Chiave " + num);
            System.out.println("Valore " + contacts.get(num));
        }

    }

}
