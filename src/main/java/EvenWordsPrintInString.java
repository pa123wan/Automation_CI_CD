public class EvenWordsPrintInString {
    public static void main(String[] args) {

        String str = "Hello World";

        for (String s : str.split(" ")){
            System.out.println(s+" is "+s.length());
            }
        }
    }