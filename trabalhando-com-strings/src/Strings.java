import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {
        String texto = "Texto customizado";
        String texto2 = "Texto customizado";
        String outroTexto = new String("Texto customizado");
        System.out.println(texto);
        System.out.println(outroTexto);

        System.out.println(texto == outroTexto); // false, pois o operador '==' compra o end de memória
        System.out.println(texto == texto2); // true, pois as duas variáveis estão utilizando o mesmo endereço de memória (pool de strings)
        System.out.println(texto.equals(outroTexto)); // true, pois o equals compara o conteúdo

        // Strings são Arrays de caracteres! 
        // O método toCharArray transforma uma String em uma lista de letras ou caracteres separados
        char texto2Array[] = texto2.toCharArray();
        for (char letra : texto2Array) {
            if (letra == 'y')
                System.out.println("Encontrou o y!");
        }

        // Acessando Caracteres Específicos na String, com o método '.charAt(index)'
        System.out.println(texto.charAt(0)); // primeira letra (caracter)
        System.out.println(texto.charAt(texto.length() - 1)); // última letra (caracter)

        // Capitalizar ou descapitalizar as letras
        System.out.println(texto.toLowerCase()); // método '.toLowerCase()' para deixar todas as letras minúsculas
        System.out.println(texto.toUpperCase()); // método '.toUpperCase()' para deixar todas as letras maiúsculas
        
        // Dividir uma String em palavras
        String palavras[] = texto.split(" "); /* método '.split(" ")' divide a String pelos espaços (conteúdo 
        entre parênteses. O parâmetro pode ser . ou , ou ; também), ou seja, onde tiver espaço, cria-se uma nova posição no array */ 
        System.out.println(Arrays.toString(palavras)); /* não é possível imprimir um array da forma tradicional! É necessário
        utilizar o método 'Arrays.toString(nomeDoArray)', além de precisar importar o Array  */
        String nomes = "Camila, Carina, Mauricio";
        System.out.println(Arrays.toString(nomes.split(", ")));

        // Conversõoes entre tipos
        // Converter String para Integer
        String idade = "20"; 
        Integer idadeInt = Integer.valueOf(idade); // método recebe uma String como parâmetro
        // Converter Integer para String (reverter)
        String idadeStr = String.valueOf(idadeInt); // método recebe um Integer como parâmetro
        System.out.println(idadeInt);
        System.out.println(idadeStr);
        // Concatenando o a String idade:
        idadeStr += " anos de idade";
        System.out.println(idadeStr);

        // Concatenação com StringBuilder
        String concatenacao = "Ela " + "é " + "muito " + "comum."; // concatenação deixa o código deselegante e passível de erros
        System.out.println(concatenacao);
        StringBuilder builder = new StringBuilder();
        builder.append("Ela ");
        builder.append("é ");
        builder.append("muito ");
        builder.append("comum.");
        System.out.println(builder.toString()); // para imprimir, mandar converter para String

        // Formataçao de Strings Complexas
        String nome = "Camila";
        String username = "camilinha";
        String email = "camila@email.com";

        String textoFormatado = """
            Olá, eu sou a %s, meu usuário é o %s e meu e-mail é o %s
            Eu posso ter
            múltiplas linhas.                
        """ /* 3 aspas duplas possibilita a quebra de linha
         (sempre que abrir as 3 aspas, dar um enter e seguir o texto em outra linha)*/
        .formatted(nome, username, email);
        System.out.println(textoFormatado);

    }
}
