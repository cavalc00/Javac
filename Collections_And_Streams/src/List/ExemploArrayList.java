/*Métodos mais utilizados na manipulação de ArraysLists*/

package List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ExemploArrayList {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>(); //ArrayList é uma classe para trabalharmos com array de forma dinamica, possuindo varios metodos que ajudam na manipilação.

        nomes.add("Vinicius");  //Metodo para inserção de dados
        nomes.add("Carlos");
        nomes.add("Maria");
        nomes.add("João");
        nomes.add("Juliana");
        nomes.add("Heitor");
        
        System.out.println(nomes);

        nomes.set(2, "Anderson");   //Metodo para modificar um elemento da lista

        System.out.println(nomes);

        nomes.remove(3); //Metodo remove tira o elemento da posição escolhida(Tambem pode ser usado o nome ou valor do elemento).

        System.out.println(nomes);

        Collections.sort(nomes);
        System.out.println(nomes);

        System.out.println(nomes.get(0));  //Metodo get retorna o valor no indice passado
        System.out.println(nomes.size());   //Metodo get retorna um inteiro com o tamanho da lista
        System.out.println(nomes.contains("Heitor")); //Metodo contains retorna um booleano para informar se contem ou não o elemento passado
        System.out.println(nomes.contains("Fernanda"));

        System.out.println(nomes.isEmpty());// Metodo isEmpty retorna sea lista esta vazia ou não

        System.out.println(nomes.indexOf("Vinicius")); //Metodo indexOf retorna o indice que o elemento passado esta, ou retorna -1 caso não encontre o elemento passado

        nomes.clear(); //Metodo clear remove todos os elementos da lista

    }
}
