import java.util.Scanner;

public class missingnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long i = 0;
        // int[] nums = new int[n-1];
        long sum = 0;
        while (i < n-1){
            sum += sc.nextLong();
            i++;
        }
        System.out.println((n*(n+1)/2) - sum);
        // System.out.println("sum equals:" + sum);


    }

    
}