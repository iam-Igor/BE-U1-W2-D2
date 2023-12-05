package es3;

import entities.Contacts;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

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

        searchByname("Mario", rubrica);
        searchByNumber(333211662, rubrica);

    }

    public static void searchByname(String name, Map<String, Integer> contacts) {
        if (contacts.containsKey(name)) {
            int numero = contacts.get(name);
            log.info(name + numero);
        } else {
            log.info(name + " non è presente nella rubrica.");
        }
    }

    public static void searchByNumber(int number, Map<String, Integer> contacts) {
        if (contacts.containsValue(number)) {
            for (Map.Entry<String, Integer> entry : contacts.entrySet()) {
                if (entry.getValue() == number) {
                    log.info("Il numero " + number + " appartiene a: " + entry.getKey());
                    return; // Termina la funzione una volta trovato il numero
                }
            }
        } else {
            log.info("Il numero " + number + " non è associato a nessun contatto nella rubrica.");
        }
    }
}
