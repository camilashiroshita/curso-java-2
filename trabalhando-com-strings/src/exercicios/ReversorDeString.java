package exercicios;

public class ReversorDeString {
    
    public static String reverterString(String texto) {
        String textoRevertido = "";
        for (int i = texto.length() - 1; i >= 0; i--) 
            textoRevertido += texto.charAt(i);
        return textoRevertido;

    }
}
