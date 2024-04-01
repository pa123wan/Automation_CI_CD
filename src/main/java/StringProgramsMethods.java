import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class StringProgramsMethods {
    public static void main(String[] args) {
        String str = "abc";
        String str1 = "abc";
        StringProgramsMethods s= new StringProgramsMethods();
        System.out.println("Anagram using if statement");
        s.isanagram(str,str1);
    }

    //<---To Print count of characters--->
    public static HashMap<Character, Integer> charCount(String str) {
        str = str.toLowerCase();

        HashMap<Character, Integer> map = new HashMap<>();
        char[] array = str.toCharArray();
        for (char c : array) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        return map;
    }

 //<---To Print non repeating characters--->
    public static void printNonRepeating(String str){
     for (HashMap.Entry<Character,Integer> entry : charCount(str).entrySet()){
         if (entry.getValue()==1){
             System.out.println(entry.getKey()+" "+entry.getValue());
            }
        }
    }
 //<---To Print repeating characters--->
    public static void printDupicates(String str){
        for (HashMap.Entry<Character,Integer> entry : charCount(str).entrySet()){
            if (entry.getValue()>1){
                System.out.println(entry.getKey()+" "+entry.getValue());
            }
        }
    }

//<---To remove duplicates characters from a String METHOD(1)--->

    public void remDuplicates(String str){
        str= str.toLowerCase();
        String newString = "";

        HashSet<Character> set = new HashSet<>();

        for (int i=0; i<str.length(); i++){
            set.add(str.charAt(i));
        }

        for (char c : set){
                newString=newString+c;
        }
        System.out.println(newString);
    }
//<---To remove duplicates characters from a String METHOD(2)--->
    public static String removeDuplicates(String input) {

        StringBuilder result = new StringBuilder();
        HashSet<Character> seen = new HashSet<>();

        for (int i = 0; i < input.length();i++){
            char currentChar = input.charAt(i);

            if (!seen.contains(currentChar)){
                result.append(currentChar);
                seen.add(currentChar);
            }
        }

        return result.toString();
    }

//<---To reverse a string--->
    public void revString(String str){
        String revString ="";

        for (int i=str.length()-1; i>=0 ; i--){
            revString += str.charAt(i);
        }
        System.out.println(revString);
    }

// <----- String is Anagram or not using CharCount METHOD(1), Here Hashmap to call charCount method while declaration--->
    public void anagram(HashMap<Character,Integer> count1, HashMap<Character,Integer> count2){


        boolean key = count1.keySet().equals(count2.keySet());
        boolean value = count1.entrySet().equals(count2.entrySet());



        if (key && value){
            System.out.println("is Anagram");
        }
        else{
            System.out.println("Not anagram");
        }
    }

// <----- String is Anagram or not METHOD(1), length and array characters
    public void isanagram(String str1, String str2){
        char[] a=str1.toCharArray();
        char[] b=str2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);

        if (Arrays.equals(a,b) && a.length==b.length){
            System.out.println("is Anagram");
        }
        else{
            System.out.println("Not anagram");
        }
    }
}
