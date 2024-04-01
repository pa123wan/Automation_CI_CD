import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapPhoneBook {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        int entries = scanner.nextInt();
        scanner.nextLine();

        for (int i=0; i<entries; i++){
            String name = scanner.nextLine();
            String phoneNum=scanner.nextLine();
            map.put(name,phoneNum);
        }
        while (scanner.hasNext()){
            String query = scanner.nextLine();
            if (map.containsKey(query)) {
                System.out.println(query + "=" + map.get(query));
            }
            else{
                System.out.println("Not found");
            }
        }
    }
}