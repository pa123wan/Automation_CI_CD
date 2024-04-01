public class SwapNumberWithout3rdNumber {
    public static void main(String[] args) {

        int a=10;
        int b=20;

        System.out.print("Before Swaping");
        System.out.println(a+" and "+b);
        a= a+b;
        b=a-b;
        a=a-b;

        System.out.print("After Swaping");
        System.out.println(a+" and "+b);

    }

}
