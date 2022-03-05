public class desafio_dois {
    public static void main(String[] args) {

        int [] array = {1, 5, 3, 4, 2};
        int count = 0;
        int diferenca = 2;

        for (int i = 0 ; i < array.length; i++) {
            for (int j = 0 ; j < array.length; j++) {
                if ((array[i]+diferenca) == array[j]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}