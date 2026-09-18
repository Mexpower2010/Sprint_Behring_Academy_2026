import java.util.Scanner;
public class garcom {
    final static Scanner S = new Scanner(System.in);
    public static void main(String[] args) {
        int qtdGarcom = S.nextInt();
        int qtdCoposQuebrados = 0;
        for (int i = 0; i < qtdGarcom; i++) {
            int numLatas = S.nextInt();
            int numCopos = S.nextInt();
            if (numLatas>numCopos) {
                qtdCoposQuebrados+=numCopos;
            }
        }
        System.out.println(qtdCoposQuebrados);
    }
}