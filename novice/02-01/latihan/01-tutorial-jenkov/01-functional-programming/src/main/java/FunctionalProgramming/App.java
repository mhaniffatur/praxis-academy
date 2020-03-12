/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package FunctionalProgramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    //Pure function
    public int sum(int a, int b) {
        return a + b;
    }

    //non-pure function
    private int value = 0;

    public int add(int nextValue) {
        this.value += nextValue;
        return this.value;
    }


    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Abc");
        list.add("BCD");
        
        System.out.println(list);        

        Collections.sort(list, (String a, String b) -> {
            System.out.println(a); 
            return a.compareTo(b);
        });

        System.out.println(list);

        // Comparator<String> comparator = (String a, String b) -> {
        //     return a.compareTo(b);
        // };
        
        // Comparator<String> comparatorReversed = comparator.reversed();
        
        // Collections.sort(list, comparatorReversed);
        
      

    }
}