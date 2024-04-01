

public class ReverseString {
    public static void main(String[] args) {

        String name ="PawaP";
        String revName ="";

        for (int i=name.length()-1; i>=0; i--){
            revName= revName + name.charAt(i);
        }
        System.out.println(revName);

        if (name.equalsIgnoreCase(revName)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Pallindrome");
        }
    }
}






















/*
String inputName ="tata";
        String revName ="";
        for(int i =inputName.length()-1; i>=0; i--){
            revName = revName+ inputName.charAt(i);
        }
        System.out.println("The reverse string is: " +revName);

        if (revName.equals(inputName)){
            System.out.println("String is palindrome");
        }
        else {
            System.out.println("Not palindrome");
        }


 */