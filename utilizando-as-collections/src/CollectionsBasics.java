import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CollectionsBasics {
    public static void main(String[] args) {

        /*
        ----- Não prático -----
        String nomes[] = {"Camila", "Carina", "Mauricio"};
        String idades[] = new String[3];
        */

        // ArrayList é criado com tamanho 10, por padrão!
        // Inicializando e declarando um ArrayList
        List<String> nomesArrayList = new ArrayList<>(){{
            add("1");
            add("2");
            add("3");
        }};        

        //Get
        System.out.println(nomesArrayList.get(0));
        System.out.println(nomesArrayList.get(1));
        
        //Insert ou Update
        nomesArrayList.set(0, "0");
        nomesArrayList.set(1, "1");
        nomesArrayList.set(2, "2");
        nomesArrayList.add("3");
        System.out.println(nomesArrayList);

        //Delete -  remove e desloca todos os elementos seguintes uma posição para a esquerda.
        nomesArrayList.remove(1);
        nomesArrayList.remove("3");
        System.out.println(nomesArrayList);

        //Sort - ordena
        Collections.sort(nomesArrayList);
        System.out.println(nomesArrayList);
        
        // Reconstruindo o array
        nomesArrayList.add("2");
        nomesArrayList.add("3");
        nomesArrayList.set(1, "1");

        // Percorrendo um ArrayList
        // for-each
        for (String nome : nomesArrayList) {
            System.out.println(nome);
        }

        // método iterator (collection) - percorrer o array
        Iterator<String> it = nomesArrayList.iterator();
        while (it.hasNext()) {
            String itemAtual = it.next();
            System.out.println(itemAtual);
        }

        /* 
        Conversões entre Array e ArrayList 
        -Criando lista
        */
       List<String> listaDeNomes = List.of("Camila", "Carina");
       System.out.println(listaDeNomes);
       // - Criando uma lista a partir de um Array (converter)
       String arrayDeNomes[] = {"Cami", "Cari"};
       List<String> listaConvertida = Arrays.asList(arrayDeNomes);
       System.out.println(listaConvertida);

       // - Criando um Array a partir de uma lista (converter)
       String arrayConvertido[] = listaConvertida.toArray(new String[0]);
       System.out.println("Array: " + Arrays.toString(arrayConvertido)); 

       // Map e HashMap (para salvar um conj de identificador e valor)
       Map<String, String> mapaDeUsuarios = new HashMap<>();

       // método put (para colocar elemento)
       mapaDeUsuarios.put("camila", "Camila");
       mapaDeUsuarios.put("carina", "Carina");
       mapaDeUsuarios.put("patricia", "Patricia");
       
       /*
       Outra forma de inicialização (com duas chaves):
       Map<String, String> mapaDeUsuarios = new HashMap<>() {{
        put("camila", "Camila");
        put("carina", "Carina");
        put("patricia", "Patricia");       
       }};       
       */
      System.out.println(mapaDeUsuarios);

      // método get (obter/acessar valor)
      System.out.println(mapaDeUsuarios.get("camila")); // imprimindo o valor associado à chave
      
      // método put (incluir ou, caso a chave já exista, será feita a substituição do valor )
      mapaDeUsuarios.put("camila", "Camilinha"); // substituindo
      System.out.println(mapaDeUsuarios);
      mapaDeUsuarios.put("mauricio", "Mauricio"); // incluindo
      
      // método remove (para remover a chave)
      mapaDeUsuarios.remove("carina");
      System.out.println(mapaDeUsuarios);

      // iteração com for-each e chamar o método '.values'
      for (String valor : mapaDeUsuarios.values()) {
        System.out.println(valor);
      }

      // percorrer as chaves com o método '.keySet'
      for (String chave : mapaDeUsuarios.keySet()) {
        System.out.println(chave);
      }

    }
}
