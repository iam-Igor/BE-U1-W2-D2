package es1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    private static Logger log = LoggerFactory.getLogger(Main.class);


    public static void main(String[] args) {

        Set<String> wordsSet = new HashSet<>();
        Set<String> duplicatesWords = new HashSet<>();

        printWords(wordsSet, duplicatesWords);
        log.info("Elenco delle parole distinte:");
        for (String word : wordsSet) {
            log.info(word);
        }
        log.info("Numero di parole distinte: " + wordsSet.size());

        log.info("Elenco delle parole duplicate:");
        for (String word : duplicatesWords) {
            log.info(word);
        }
    }


    public static void printWords(Set<String> words, Set<String> duplicates) {
        Scanner userInput = new Scanner(System.in);
        log.info("Inserisci un numero di elementi da inserire:");
        int num = Integer.parseInt(userInput.nextLine());

        log.info("Inserisci " + num + " parole:");
        for (int i = 0; i < num; i++) {
            String singleWord = userInput.nextLine();

            if (!words.add(singleWord)) {
                log.info("Parola duplicata rilevata: " + singleWord);
                duplicates.add(singleWord);
            }
        }
    }
}