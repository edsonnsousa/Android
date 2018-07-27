public class ConversorRomanosTeste {

    @Test
    public void ConverterUmNumeroRomano() {
       ConversorRomanos conversor = new ConversorRomanos();
       int resultado = conversor.converte("I");
       assertEquals (1, resultado);
    }
    
    @Test
    public void converterDoisNumeroIguais() {
    	ConversorRomanos conversor = new ConversorRomanos();
    	int resultado = conversor.converte("XX");
       
       assertEquals(20, resultado);
}
    @Test
    public void converterDoisNumerosESegundoNumeroMenor() {
    	ConversorRomanos conversor = new ConversorRomanos();
    	int resultado = conversor.converte("XI");
       
       assertEquals(11, resultado);
}
    @Test
    public void converterDoisNumerosEPrimeiroNumeroMenor() {
    	ConversorRomanos conversor = new ConversorRomanos();
    	int resultado = conversor.converte("IX");
       
       assertEquals(9, resultado);
}
    @Test
    public void converterTresSimbolosDistintos() {
    	ConversorRomanos conversor = new ConversorRomanos();
    	int resultado = conversor.converte("XXVIII");
       
       assertEquals(28, resultado);
}
}
