import java.util.HashMap;
import java.util.Map;



public class ConversorRomanos {

    
    private static Map<Character, Integer> valores = new HashMap<Character, Integer>() {{
        put('I', 1);
        put('V', 5);
        put('X', 10);
    }};
    
    public int converte(String numeroRomano) {
        int acumulador = 0;
        int simboloDaDireita = 0;

        for(int i = numeroRomano.length() - 1; i >= 0; i--) {
            // pega o inteiro referente ao simbolo atual
            int atual = valores.get(numeroRomano.charAt(i));
            
            // tornar o o numero negativo
            int multiplicador = 1;
            if(atual < simboloDaDireita) multiplicador = -1;
            acumulador += valores.get(numeroRomano.charAt(i)) * multiplicador;
            
            // atualiza o da direita
            simboloDaDireita = atual;
        }
        return acumulador;
    }
}
