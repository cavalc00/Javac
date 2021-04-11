//Classe performatica para busca, mantem a ordem de inserção. Não pode ser reordenado após sua criação

package Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class ExemploLinkedHashSet {
    public static void main(String[] args) {
        Set<Integer> sequencia = new LinkedHashSet<>();

        sequencia.add(31);
        sequencia.add(43);
        sequencia.add(3);
        sequencia.add(543);
        sequencia.add(678);


        System.out.println(sequencia);

        sequencia.remove(3);
        System.out.println(sequencia);
    }
}
