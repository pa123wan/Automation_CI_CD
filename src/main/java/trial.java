import java.util.HashSet;

public class trial {

    public static void main(String[] args) {
        String str1 = "Mahabharat";
        RemoveDuplicates(str1);

    }

    public static void RemoveDuplicates(String name) {
        name = name.toLowerCase();
        char[] character = name.toCharArray();
        boolean isNotduplicate = false;

        for(int i =0; i< name.length(); i++){
            boolean isDuplicate =false;
            for (int j=i+1; j<name.length(); j++){
                if (character[i]==character[j]){
                    isDuplicate =true;
                    break;
                }
            }
            if (isDuplicate){
                System.out.println(character[i]);
                isNotduplicate = true;
            }

        }
        if (!isNotduplicate){
            System.out.println("No duplicates found");
        }
    }
}