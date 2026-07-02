import java.util.Arrays;

import br.com.camilaono.moradias.Casa;

public class Main {
    public static void main(String[] args) {
        /* Instanciando o primeiro objeto do tipo Casa, chamando um construtor que aceita um valor lógico (boolean)
        onde casa1 não é inteligente
        */
        Casa casa1 = new Casa(false);
        // Instanciando o segundo objeto do tipo Casa, onde casa2 é inteligente
        Casa casa2 = new Casa(true);
        /*
        // Aqui você está criando uma terceira casa, mas usando um construtor sem parâmetros (construtor padrão).
            O que acontece com os atributos dela vai depender do que você escreveu dentro desse construtor vazio lá na
            classe Casa (por padrão, variáveis boolean começam como false se nada for dito).
        */
        Casa casa3 = new Casa();

        casa1.inteligente = false;
        casa2.inteligente = true;

        casa1.acenderLuz();
        casa2.acenderLuz();
        casa3.acenderLuz();

        /* casa3.nome = "Minha casa";
        System.out.println(casa3.nome);

        Double soma = new Matematica().soma(1.0, 1.0);
        System.out.println(soma);
        */

        Usuario u1 = new Usuario();
        u1.username = "u1";
        Usuario u2 = new Usuario();
        u2.username = "u1";
        // Método especial de comparação entre objetos (equals)
        System.out.println(u1.equals(u2)); // false, porque são objetos diferentes na memória
        Usuario[] array1 = {u1, u2};
        
        Usuario u3 = new Usuario();
        u3.username = "u1";
        Usuario u4 = new Usuario();
        u4.username = "u1";
        Usuario[] array2 = {u3, u4};

        System.out.println(Arrays.equals(array1, array2));
    


    }
}
