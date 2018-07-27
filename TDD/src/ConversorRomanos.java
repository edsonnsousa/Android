import java.util.HashMap;
import java.util.Map;



public class ConversorRomanos {

    
    private static Map<Character, Integer> valores = new HashMap<Character, Integer>() {{
        put('I', 1);
        put('V', 5);
        put('X', 10);
    }};
    
    public int converte(String numeroRomano) {
        int acumula = 0;
        int simboloDaDireita = 0;

        for(int i = numeroRomano.length() - 1; i >= 0; i--) {
            
            int atual = valores.get(numeroRomano.charAt(i));
            
            
            int multiplicador = 1;
            if(atual < simboloDaDireita) multiplicador = -1;
            acumula += valores.get(numeroRomano.charAt(i)) * multiplicador;
            
            
            simboloDaDireita = atual;
        }
        return acumula;
    }
}
