import java.sql.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class desafio_um {
    public static void main(String[] args) {

        int [] array = {9, 2, 1, 4, 6};
        int aux = 0;
        int mediana = 0;
        for (int i = 0 ; i < array.length; i++) {
            for (int j = 0 ; j < array.length; j++) {
                if (array[i] > array[j]){
                    aux = array[j];
                    array[j] = array[i];
                    array[i] = aux;
                }
            }
        }

        int posMediana = (array.length) % 2;

        if(posMediana == 1){
            mediana = array[(array.length - 1) / 2];
            System.out.println(mediana);
        }
        else
        {
            int valor1 = array[(array.length) / 2];
            int valor2 = array[(array.length / 2) - 1];
            mediana = (valor1 + valor2) / 2;
            System.out.println(mediana );
        }
    }
}