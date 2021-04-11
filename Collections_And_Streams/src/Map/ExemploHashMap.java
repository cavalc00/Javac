//A Classe map não implementa a interface Collections, sua maior diferença é a necessidade de informar uma chave que
// sevirá para identificação(como se fosse um indexador), e um valor para onde a chave aponta. A chave não pode se repetir
//e os valores podem. Pode ser ordenado.

package Map;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {
    public static void main(String[] args) {
        Map<String, Integer> campeoesMundiais = new HashMap<>();

        campeoesMundiais.put("Brasil", 5);
        campeoesMundiais.put("Itália", 4);
        campeoesMundiais.put("Argentina", 2);
        campeoesMundiais.put("Inglaterra", 1);
        campeoesMundiais.put("França", 2);
        campeoesMundiais.put("Uruguai", 2);
        campeoesMundiais.put("Espanha", 1);
        campeoesMundiais.put("Alemanha", 4);

        System.out.println(campeoesMundiais);

        campeoesMundiais.put("Brasil", 6); //Se informado uma chave já existente irá atualizar a mesma com o novo valor passado
        System.out.println(campeoesMundiais);

        System.out.println(campeoesMundiais.get("Alemanha")); //Get retorna o valor da chave informada

        System.out.println(campeoesMundiais.containsKey("Espanha")); // Retorna se existe essa chave no map

        campeoesMundiais.remove("França");
        System.out.println(campeoesMundiais); //Remove a chave passada.

        System.out.println(campeoesMundiais.containsValue(6)); //retorna true caso tiver algum valor 6 no map

        System.out.println(campeoesMundiais.size()); //retorna o tamanho do map.
        
        for (Map.Entry<String, Integer> entry : campeoesMundiais.entrySet()){ //para navegar no map
            System.out.println(entry.getKey()+"---->"+entry.getValue());
        }

        for (String key : campeoesMundiais.keySet()){ //Outro modo de navegação
            System.out.println(key+"-------->"+campeoesMundiais.get(key));
        }



    }
}
