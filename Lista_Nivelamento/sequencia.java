import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;
public class sequencia {
    public static Scanner S = new Scanner(System.in);
    public static void main(String[] args) {
        int numNumeros = S.nextInt();
        Queue <Integer>filaNums = new ArrayDeque<>();
        for (int i = 0; i < numNumeros; i++) {
            filaNums.offer(S.nextInt());
        }
        fazerMenorNum(filaNums);
    }
    public static int fazerMenorNum(Queue <Integer> filaNums){
        int menorNum = filaNums.poll();
        while (true) {
            if (filaNums.peek()-1==menorNum) {
                
            }else{
                
            }
        }
        return menorNum;
    }
}
