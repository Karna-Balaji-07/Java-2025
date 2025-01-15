import java.util.Arrays;
//import java.util.Scanner;

public class Arrays_Sample {
    public static void main(String[] args){
        int n = 10;
        int[] arr = new int[n];
        arr[0]  = 3;
        System.out.println(arr[0]);
        System.out.println(arr[2]);
        System.out.println(arr.length);
        int[] arra = arr.clone();
        System.out.println(Arrays.toString(arra));

//        var input = new Scanner(System.in);
        int x = 10;
        var arrs = new int[x];
        arrs[0] = 100;
        System.out.println(arrs[0]);
     }
}
