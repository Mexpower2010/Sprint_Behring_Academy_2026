public class simuladorTurno {
    public static void main(String[] args) {
        String[] jogadores = {"Alice", "Bob", "Carol", "Dan"};

        for (int rodada = 1; rodada <= 10; rodada++) {
            int indice = (rodada - 1) % jogadores.length;
            System.out.println("Rodada " + rodada + ": " + jogadores[indice]);
        }
    }
}
