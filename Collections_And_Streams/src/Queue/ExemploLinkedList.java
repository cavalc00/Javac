/*Métodos mais utilizados na manipulação de LinkedLists*/
package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>(); //Criando o objeto LinkedList

        fila.add("Juliana");
        fila.add("Pedro");
        fila.add("Carlos");
        fila.add("Larissa");
        fila.add("João");

        System.out.println(fila);

        System.out.println(fila.peek()); //Metodo peek retorna o primeiro elemento mas não o retira da fila
        System.out.println(fila);

        System.out.println(fila.poll()); //Metodo poll retorna o primeiro elemento e o retira da fila
        System.out.println(fila);

        fila.add("Daniel");
        System.out.println(fila);

        System.out.println(fila.size());

        System.out.println(fila.isEmpty());

        boolean temCarlos = fila.contains("Carlos");
        System.out.println(temCarlos);

        fila.clear();
        System.out.println(fila.poll());
    }
}
