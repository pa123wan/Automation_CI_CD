public class Charcount {
    public static void main(String[] args) {
        String str=new String("Pawan").toLowerCase();
        charCount(str);
    }

    public static void charCount(String str) {

        for (int i=0;i<str.length();i++){
            boolean same= true;
            for (int j=0; j< str.length();j++){
                if ( i!=j && str.charAt(i)==str.charAt(j)){
                    same = false;
                    break;
                }
            }
            if (same) {
                System.out.println(str.charAt(i));
            }
        }

    }
}
