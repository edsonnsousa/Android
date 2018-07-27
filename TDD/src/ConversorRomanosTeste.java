import static org.junit.Assert.*;

import org.junit.Test;

public class ConversorRomanosTeste {

    @Test
    public void converteOSimboloI() {
       ConversorRomanos conversor = new ConversorRomanos();
       int resultado = conversor.converte("I");
       assertEquals (1, resultado);
    }
    
    @Test
    public void converteOSimboloV() {
    	ConversorRomanos conversor = new ConversorRomanos();
    	int resultado = conversor.converte("V");
       
       assertEquals(5, resultado);
}
    @Test
    public void converteOSimboloXX() {
    	ConversorRomanos conversor = new ConversorRomanos();
    	int resultado = conversor.converte("XX");
       
       assertEquals(20, resultado);
}
    @Test
    public void converteOSimboloXI() {
    	ConversorRomanos conversor = new ConversorRomanos();
    	int resultado = conversor.converte("XI");
       
       assertEquals(11, resultado);
}
}
