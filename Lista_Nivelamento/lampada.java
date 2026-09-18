import java.util.Scanner;
public class lampada {
    final static Scanner S = new Scanner(System.in);
    public static void main(String[] args) {
        //lampada A && B
        boolean[] lampada = new boolean[2];

        int numMudancas = S.nextInt();
        // deve ta parencendo estranho comentario (IA) mas n é nao
        for (int i = 0; i < numMudancas; i++) {
            int mudanca = S.nextInt();
            if (mudanca == 1) {
                //muda so o A
                mudar1(lampada);
            }else{
                // muda A && B
                mudar2(lampada);
            }
        }
        imprimirLampada(lampada);
    }

    public static void imprimirLampada(boolean[]lampada){
        for (int i = 0; i < lampada.length; i++) {
            if (lampada[i]) {
                System.out.println('1');
            }else{
                System.out.println('0');
            }
        }
    }

    public static void mudar2(boolean[] lampada ){
        lampada[0] = !lampada[0];
        lampada[1] = !lampada[1];
    }
    public static void mudar1(boolean[] lampada ){
        lampada[0] = !lampada[0];
    }
}
