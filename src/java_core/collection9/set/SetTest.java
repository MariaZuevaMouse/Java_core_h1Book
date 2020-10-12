package java_core.collection9.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set<String> words = new HashSet<>();
        long totalTime =0;

        int j = 0;
        try(Scanner in = new Scanner(System.in)){
            while(in.hasNext() && j <10){
                String word = in.next();
                long callTime = System.currentTimeMillis();
                words.add(word);
                callTime  = System.currentTimeMillis() - callTime;
                System.out.println(callTime);
                totalTime += callTime;
                j++;
            }
        }
        Iterator<String> iter = words.iterator();
        for(int i = 1; i <= 20 && iter.hasNext(); i++){
            System.out.println(iter.next());
        }
        System.out.println(". . . . ");
        System.out.println(words);
        System.out.println(words.size() +" distinct words. " + totalTime + " milliseconds.");

    }
}
