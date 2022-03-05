public class desafio_tres {
    public static void main(String[] args) {

        String entrada = "ola mundo";
        String resultado = entrada.replaceAll("\\s+", "");
        int aux = resultado.length();
        int t = (int) Math.round(Math.sqrt(aux));
        String saida = "";
        String[][] mat = new String[t][t];
        int count = 0;
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < t; j++) {
                if (count < resultado.length()) {
                    mat[i][j] = Character.toString(resultado.charAt(count));
                    //System.out.print(mat[i][j]);
                    count++;
                }
            }
            //System.out.println("");
        }
        for(int k = 0 ; k < t ; k++){
            for (int i = 0; i < t; i++) {
                for (int j = 0; j < t; j++) {
                    if (k == i) {
                        System.out.print(mat[i][j]);
                        if (mat[j][i] == null){

                        }
                        else {
                            saida = saida.concat(mat[j][i]);
                        }
                    }
                }
                saida = saida.concat(" ");
            }
            System.out.println("");
        }
        System.out.println(saida);
    }
}