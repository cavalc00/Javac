//Classe TreeSet ordena os elementos em forma de arvore binaria e já ordenada, também pode ser reordanada depois de sua criação.
// Não é tão performatica quanto as outras clases da implementação Set.

package Set;


import java.util.Set;
import java.util.TreeSet;

public class ExemploTreeSet {
    public static void main(String[] args) {
        Set<Integer> sequencia = new TreeSet<>();

        sequencia.add(16);
        sequencia.add(3);
        sequencia.add(1);
        sequencia.add(45);
        sequencia.add(10);
        sequencia.add(32);

        System.out.println(sequencia);


    }
}
