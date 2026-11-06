public class EX6_mensagem_militar {
    public static void main(String[] args) {
        char[] mns = "KHOOR ZRUOG".toCharArray();
        
        for (int i = 0; i < 26; i++) {
            StringBuilder mnsDecod = new StringBuilder();
            
            for (int j = 0; j < mns.length; j++) {
                char c = mns[j];
                
                if (c >= 'A' && c <= 'Z') {
                    char decodificado = (char) (((c - 'A' - i + 26) % 26) + 'A');
                    mnsDecod.append(decodificado);
                } else {
                    mnsDecod.append(c);
                }
            }
            System.out.println("Deslocamento " + i + ": " + mnsDecod);
        }
    }    
}
