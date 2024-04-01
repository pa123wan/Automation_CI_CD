public class NestedForLoop2 {
    public static void main(String[] args) {
        int k=1;
        for (int i = 0; i < 4; i++) {
            System.out.println("");
            for (int j = 1; j<=i+1; j++) {
                System.out.print(j);
                System.out.print("\t");
            }
        }
    }
}
