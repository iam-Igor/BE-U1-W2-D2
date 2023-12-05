package es2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main2 {
    private static Logger log = LoggerFactory.getLogger(Main2.class);


    public static void main(String[] args) {
        List<Integer> numbersList = listDispatcher(5);
        log.info("Interi ordinati:");
        for (int num : numbersList) {
            log.info(String.valueOf(num));
        }


        List<Integer> unSortedList = listUnsorter(numbersList);
        log.info("Interi in ordine inverso:");
        for (int num : unSortedList) {
            log.info(String.valueOf(num));
        }

        List<Integer> oddOrEven = oddOrEvenPrinter(numbersList, false);
        log.info("Lista in ordine pari o dispari");
        for (int num : oddOrEven) {
            log.info(String.valueOf(num));
        }

    }

    public static List<Integer> listDispatcher(int num) {
        List<Integer> numbersList = new ArrayList<>();
        Random rndm = new Random();
        for (int i = 0; i < num; i++) {
            numbersList.add(rndm.nextInt(100));
        }
        Collections.sort(numbersList);
        return numbersList;
    }

    public static List<Integer> listUnsorter(List<Integer> numbersList) {
        List<Integer> unSortedList = new ArrayList<>();
        unSortedList.addAll(numbersList);
        Collections.reverse(unSortedList);
        return unSortedList;
    }

    public static List<Integer> oddOrEvenPrinter(List<Integer> list, Boolean bool) {
        List<Integer> oddOrEven = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0 && bool) {
                oddOrEven.add(list.get(i));
            } else if (i % 2 != 0 && !bool) {
                oddOrEven.add(list.get(i));
            }
        }
        return oddOrEven;
    }


}
