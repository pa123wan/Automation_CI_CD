public class ConsecutiveIntegersCount {
    public static void main(String[] args) {
        int a[]={8,2,3,1,5,8,7};
        int count=0;
        int max=0;
        for (int i=0; i<a.length-1; i++){
            if (a[i]+1==a[i+1]){
                count++;
            }
            else {
                count=0;
            }
            max=Math.max(max,count+1);
        }
        System.out.println(max);
    }
}
