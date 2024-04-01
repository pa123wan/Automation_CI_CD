import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class SpecialSymbolsAndSpaceRemoval {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt();
            System.out.println(N);
        scanner.nextLine();

             for (int i = 0; i < N; i++) {
            String str = scanner.nextLine();
            if (regexDef(str)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }

    public static boolean regexDef(String str) {
        try {
            Pattern.compile(str);
            return true;
        } catch (PatternSyntaxException exception) {
            return false;
        }
    }

}