import java.util.Scanner;
public class teleferico {
    final static Scanner S = new Scanner(System.in);
    public static void main(String[] args) {
        int numA = S.nextInt();
        int numB = S.nextInt();
        int total = numA + numB;
        if (total<=50) {
            System.out.println('S');
        }else{
            System.out.println('N');
        }
    }
}