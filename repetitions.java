import java.util.Scanner;

public class repetitions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] charArray = s.toCharArray();
        if (charArray.length == 0) {
            System.out.println(0);
            System.exit(0);
        }
        int currentL = 1;
        int maxL = 1;
        for (int i = 0; i < charArray.length-1; i++){
            if (charArray[i] == charArray[i+1]){
                currentL++;
                maxL = Math.max(maxL, currentL);
            }
            else {
                currentL = 1;
            }
        }
        System.out.println(maxL);
    }
}
