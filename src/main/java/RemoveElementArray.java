import java.util.Arrays;
import java.util.Scanner;

public class RemoveElementArray {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter element to remove: ");
        int element = scanner.nextInt();
        System.out.println(Arrays.toString(RemoveArray(array,element)));
    }

    public static int[] RemoveArray(int[] array, int element){
        int[] newArray= new int[array.length-1];
        int index =0;
        for (int i=0; i<array.length;i++){
            if (array[i]!=element){
                newArray[index]=array[i];
                index++;
            }
        }
        return newArray;
    }
}
