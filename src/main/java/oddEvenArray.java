public class oddEvenArray {
    public static void main(String[] args) {
        int a[]= {1,2,3,4,5};
        int odd =0;
        int even=0;
        for (int i=0; i<a.length; i++){
            if (a[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Odd numbers count is "+odd);
        System.out.println("Even number scount is "+even);
    }
}
