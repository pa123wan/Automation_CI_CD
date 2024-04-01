public class Minimum_in_Matrix {
    public static void main(String[] args) {
        int a[][] = {{1,9,5},{11,6,2},{4,3,8}};
        int min = a[0][0];
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                if (a[i][j]<min){
                    min = a[i][j];
                }
            }
        }
        System.out.println(min);
    }
}
