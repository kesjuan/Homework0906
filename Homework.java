import com.sun.jdi.Value;

import javax.management.monitor.StringMonitor;
import javax.swing.text.StringContent;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.invoke.StringConcatFactory;
import java.util.ArrayList;
import java.util.Arrays;

public class Homework {
    //Q1
    public static int getLastIndex(String[] names) {
        return names.length - 1;}
    // Q2
    public static int getSecondToLastIndex(String[] names){
        return names.length - 2;}
    //Q3
    public static String getFirstelement(String[] names){
        return names[0];}
    //Q4
    public static String getLastElement(String[] names){

        int x = names.length - 1;
        return names[x];}
    //Q5
    public static String getSecondToLastElement(String[] names){

        int x = names.length - 2;
        return names[x];}
    //Q6
    public static int getSum(int[] ints){
        int sum = 0 ;
        for (int x = 0; x < ints.length; x++){
            sum = ints[x] + sum;
        }
        return sum;}
    //Q7
    public static int getAverage(int[] ints){
        int sum = 0;
        int mean = 0;
        for (int x = 0; x < ints.length; x++){
            sum = ints[x] + sum;
        }
        return sum / ints.length;
    }
    //Q8
public static String extractAllOddNumbers(int[] ints){
       String odds = new String();

        for (int x = 0; x < ints.length; x++) {
            if (ints[x] % 2 != 0) {

                odds += (String) String.valueOf(ints[x]) ;
                odds += " ";
                //System.out.println(odds);
            }
           //else if (ints[x] % 2 == 0) {continue;}
        }
   return odds;
}
    // Q9
    public static String extractAllEvenNumbers(int[] ints){
        //String evens = new String();
        String evens = "";
        for (int x = 0; x < ints.length; x++) {
            if (ints[x] % 2 == 0) {

                evens += (String) String.valueOf(ints[x]);
                evens += " ";
               // System.out.println(evens);
            }
            else if (ints[x] % 2 < 0) {continue;}
        }
        return evens;
    }
    //Q10
    public static boolean contains(String[] names, String element){
      // String answer = new String();
        boolean answer = false;
        for (int x = 0; x < names.length; x++){
            if (names[x] == element){
                 answer = true;
                 //return answer;
                 //return answer;

                break;
            }
            else {return false;}
        }

        return answer;

    }
    //Q11
    public static int getIndexByElement(String[] names, String element){
       int y = 0;
        for (int x = 0; x < names.length; x++){
            if(names[x] == element){
                y = x;
                break;
            }
         //  else {continue;}
        }
        return y;
    }
    //Q12
    public static void printOddNumbersInRange(int start, int end){
        //String odds = "";
        for (int x = start; x < end; x++){
            if (x % 2 != 0) {

                System.out.println(x);
            }
        }
    }
    // Q13
    public static String printGivenStringTimesNumberGiven(String str, int n){
       //int x = n;
        String stringGiven = "";
        for(int x = 0; x < n; x++) {
            //return str;
            stringGiven = stringGiven + str + " ";
            continue;
        }
        return stringGiven;
    }
    //Q14
    public static String repeatFirstThreeLetters(String str, int n){
        String stringGiven = "";
        for (int x = 0; x < n; x++){
          stringGiven =  String.valueOf(str.charAt(0)) + String.valueOf(str.charAt(1)) +
                  String.valueOf(str.charAt(2)) + " " + stringGiven;
        }
        return stringGiven;
    }
    //Q15
    public static int wordsInAStringCounter (String str){

        String words[] = str.split(" ");
         return words.length;



    }

    public static void main(String[] args) {
        //Q1
     String[] names = {"jared","john","bishop"};
        System.out.println(getLastIndex(names));
        //Q2
        System.out.println(getSecondToLastIndex(names));
        //Q3
        System.out.println(getFirstelement(names));
        //Q4
        System.out.println(getLastElement(names));
        //Q5
        System.out.println(getSecondToLastElement(names));
        //Q6
        int[] ints = {1,2,3,4,7,8,9};
        System.out.println(getSum(ints));
        //Q7
        System.out.println(getAverage(ints));
        //Q8
        System.out.println(extractAllOddNumbers(ints));
        //Q9
        System.out.println(extractAllEvenNumbers(ints));
        //Q10
        System.out.println(contains(names, "jonny"));
        //Q11
        System.out.println(getIndexByElement(names, "bishop"));
        //Q12
       // System.out.println(printOddNumbersInRange(1, 100));
        printOddNumbersInRange(1,15);
        //Q13
        System.out.println(printGivenStringTimesNumberGiven("Yeloow", 5));
        //Q14
        System.out.println(repeatFirstThreeLetters("hatter", 5));
        //Q15
        System.out.println(wordsInAStringCounter("hello my name is jared and i love ice cream"));
    }
}
