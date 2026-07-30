package exercicios;

public class Palindromo {
 
    public static boolean isPalindromo(String texto) {
        String textoFormatado = "";
        
        for(char letra : texto.toCharArray()) {
            if (!Character.isWhitespace(letra))
                textoFormatado += letra;
        }
        
        String textoRevertido = ReversorDeString.reverterString(textoFormatado);
        
        return textoFormatado.toLowerCase().equals(textoRevertido.toLowerCase());
    }
}
