import java.util.ArrayList;
import java.util.Scanner;

public class digito {

    final static Scanner S = new Scanner(System.in);

    public static void main(String[] args) {
        int qtdDigitos = S.nextInt();
        ArrayList<Character> digitos = new ArrayList<>();
        for (int i = 0; i < qtdDigitos; i++) {
            digitos.add(S.next().charAt(0));
        }
        ArrayList<Character> primeiroNum = new ArrayList<>();
        primeiroNum.add(digitos.get(0));
        ArrayList<Character> numAdd = new ArrayList<>();
        int i = 1;
        ArrayList<Character> proxNum = gerarProximoNum(primeiroNum);
        while (i < digitos.size()) {
            // ve se o primeiroNum aumentou
            boolean aumentouPrimeiro = false;
            for (int j = 0; j < proxNum.size(); j++) {
                if (digitos.get(i) == proxNum.get(j)) {
                    // guardando nuns dropados
                    numAdd.add(digitos.get(i));
                    i++;
                } else {
                    // se n tiver num guardado
                    // add o char no primeiroNum
                    if (numAdd.isEmpty()) {
                        primeiroNum.add(digitos.get(i));
                        i++;
                    } else {
                        // se tem nuns guardados
                        // concatena no primeiroNum
                        primeiroNum.addAll(numAdd);
                    }
                    // limpa o buffer
                    numAdd.clear();
                    // o primeiroNum aumentou
                    aumentouPrimeiro = true;
                    break;
                }
            }
            // se o primeiroNum aumentou
            // tem que recalcular o proxNum dele
            if (aumentouPrimeiro) {
                ArrayList<Character> temp = new ArrayList<>(primeiroNum);
                proxNum = gerarProximoNum(temp);
            } else {
                // se n aumentou
                // gera o proximo numero +1
                proxNum = gerarProximoNum(proxNum);
            }
        }
        // imprime como num
        for (char c : primeiroNum) {
            System.out.print(c);
        }
        System.out.println();
    }


    public static ArrayList<Character> gerarProximoNum(ArrayList<Character> sb) {
        // copia pra n alterar o num original
        ArrayList<Character> numSomar = new ArrayList<>(sb);
        int i = numSomar.size() - 1;
        if (numSomar.get(numSomar.size() - 1) != '9') {
            // tipo 67 vira 68
            numSomar.set(
                numSomar.size() - 1,
                (char) (numSomar.get(i) + 1)
            );
        } else {
            // trata os 9 da direita pra esquerda
            while (i >= 0 && numSomar.get(i) == '9') {
                numSomar.set(i, '0');
                i--;
            }
            if (i < 0) {
                // 9999 vira 10000
                ArrayList<Character> numFinal = new ArrayList<>();
                numFinal.add('1');
                for (int j = 1;
                     j < numSomar.size() + 1;
                     j++) {

                    numFinal.add('0');
                }
                return numFinal;
            } else {
                // 5689 vira 5690
                numSomar.set(
                    i,
                    (char) (numSomar.get(i) + 1)
                );
            }
        }
        return numSomar;
    }
}