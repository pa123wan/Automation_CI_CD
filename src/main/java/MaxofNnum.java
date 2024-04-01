import java.util.Scanner;

public class MaxofNnum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=scanner.nextInt();
        if (n<=0) {
            System.out.println("Enter correct value");
            return;
        }

        int[] x = new int[n];
        for (int i=0; i < n; i++) {
            System.out.println("Enter number");
            x[i]=scanner.nextInt();
        }
        System.out.println(" Max numbe ris :"+ maxNum(x));
    }

    public static int maxNum(int[] x){
        int maxNum =x[0];

        for (int i =0; i<x.length;i++){
            if (x[i]>maxNum){
                maxNum=x[i];
            }
        }
        return maxNum;
    }
}
