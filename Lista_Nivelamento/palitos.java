import java.util.Scanner;
public class palitos {
    public static Scanner S = new Scanner(System.in);
    public static void main(String[] args) {
        int numPalitos = S.nextInt();
        int palitoAntes = S.nextInt();
        int menorDiferenca = Integer.MAX_VALUE;
        for (int i = 0; i < numPalitos-1; i++) {
            int palitoAtual = S.nextInt();
            if (palitoAtual-palitoAntes<menorDiferenca) {
                menorDiferenca = palitoAtual-palitoAntes;
                if (menorDiferenca==0) {
                    break;
                }
            }
            palitoAntes = palitoAtual;
        }
        System.out.println(menorDiferenca);
    }
}
