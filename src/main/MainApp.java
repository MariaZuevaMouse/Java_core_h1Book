package main;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class MainApp {
    public static void main(String[] args) {
        String a ="abc";
        String b = "bsd";
        int c = a.compareTo(b);
        System.out.println(c);

        int[] intArr = a.codePoints().toArray();
        System.out.println(Arrays.toString(intArr));
        a.trim();

        Object o;
        Throwable t;

//        Collections.shuffle();


    }
}
