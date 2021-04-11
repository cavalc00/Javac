import java.util.function.UnaryOperator;

public class sad {

    public static void main(String[] args) {
        UnaryOperator<Integer> calcula = valor -> valor*3;
        int valor = 10;

        System.out.println(calcula.apply(valor));
    }
}
