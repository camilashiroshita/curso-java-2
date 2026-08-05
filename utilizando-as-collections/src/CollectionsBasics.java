import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

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
       System.out.println(Arrays.toString(arrayConvertido)); 



    }
}
