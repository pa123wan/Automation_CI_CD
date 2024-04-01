public class MaxOfMinNumber {
    public static void main(String[] args) {
        int a[][] = {{1,2,3}, {4,5,6}, {7,8,9}};

        int minNum = a[0][0];
        int colNum=0;
        for (int i=0; i<3; i++) {
            for (int j = 0; j < 3; j++) {
                if (a[i][j] < minNum) {
                    minNum = a[i][j];
                    colNum =j;
                }
            }
        }
        System.out.println("The minimum number in matrix is "+minNum);
        int max=a[0][colNum];
        for (int k=0; k<3;k++){
            if (a[k][colNum] > max) {
                max = a[k][colNum];
            }
        }
        System.out.println("The maximum number in minimum coloumn is "+max);
    }
}


/*
1 2 3
4 5 6
7 8 9
 */