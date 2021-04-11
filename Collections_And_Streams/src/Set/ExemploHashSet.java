//Classe mais performatica para busca de dados, não mantem a ordenação, nem pode ser reordenado.

package Set;

import java.util.HashSet;
import java.util.Set;

public class ExemploHashSet {
    public static void main(String[] args) {
        Set<Number> dados = new HashSet<>();

        dados.add(20);
        dados.add(2.4);
        dados.add(3);
        dados.add(10.0);
        dados.add(15.54);
        dados.add(34.4);
        dados.add(105);
        dados.add(52);

        System.out.println(dados);

        System.out.println(dados.contains(10.0));

        dados.remove(3);
        System.out.println(dados);

        dados.add(null);
        System.out.println(dados);

    }
}
