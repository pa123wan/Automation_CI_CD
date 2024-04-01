public class MostRepeatNum {
    public static void main(String[] args) {
        int a[]={1,9,3,4,3,3,7,9};
        int maxCount =0;
        int maxRepeat=0;

        for (int i=0; i< a.length;i++) {
            int count =0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
            if (maxCount<count){
                maxCount=count;
                maxRepeat=a[i];
            }
        }
        System.out.println(maxRepeat);
    }
}
