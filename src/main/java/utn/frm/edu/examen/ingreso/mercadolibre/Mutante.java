
package utn.frm.edu.examen.ingreso.mercadolibre;

              /*{"A", "A", "A", "A", "C", "G"},
                {"C", "A", "G", "T", "G", "C"},
                {"T", "T", "A", "T", "G", "T"},
                {"A", "G", "A", "A", "G", "G"},
                {"C", "C", "C", "C", "T", "A"},
                {"T", "C", "A", "C", "T", "G"}*/

public class Mutante {
    public boolean isMutant(String [][] matriz){
        
        String[] dna = {"A","C","T","G"};
        int contadorSecuencia = 0;
        
        for (String palabra : dna){
            //Busca de forma horizontal, vertical y diagonal, si encuentra suma al contador de secuencias, si es mayor a 2, hay un mutante
            if(recorrerHorizontalFilXFil(matriz, palabra) || recorrerVerticalColXCol(matriz, palabra) || recorrerDiagonalPrincipal(matriz, palabra) || recorrerDiagonalSecundaria(matriz,palabra)){ 
              contadorSecuencia++;
                if (contadorSecuencia >= 2) {
                    return true;  // Si se encuentra más de una secuencia, entonces es mutante.
                }
            }
        }
        return false; // Si no se encuentra ninguna secuencia mutante.
    }
    
    //Recorrer de forma horizontal
    public boolean recorrerHorizontalFilXFil(String[][] matriz, String palabra) {
        for (int i = 0; i < matriz.length; i++) {
            int contadorCaracter = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                String elemento = matriz[i][j];
                if (elemento.equals(palabra)) {
                    contadorCaracter++;
                } else {
                    contadorCaracter = 0; // Reiniciar el contador si se encuentra un carácter diferente.
                }
                if (contadorCaracter >= 4) {
                    return true;
                }
            }
        }
        return false;
    }
        
    
    //Recorre de forma vertical
    public boolean recorrerVerticalColXCol(String[][] matriz, String palabra) {
        for (int j = 0; j < matriz[0].length; j++) {
            int contadorCaracter = 0;
            for (int i = 0; i < matriz.length; i++) {
                String elemento = matriz[i][j];
                if (elemento.equals(palabra)) {
                    contadorCaracter++;
                } else {
                    contadorCaracter = 0;
                }
                if (contadorCaracter >= 4) {
                    return true;
                }
            }
        }
        return false;
    }
    
    //Recorre la diagonal principal
    public boolean recorrerDiagonalPrincipal(String[][] matriz, String palabra) {
        for (int i = 0; i < matriz.length; i++) {
            int contadorCaracter = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                if (i + j < matriz.length) {
                    String elemento = matriz[i + j][j];
                    if (elemento.equals(palabra)) {
                        contadorCaracter++;
                    } else {
                        contadorCaracter = 0;
                    }
                    if (contadorCaracter >= 4) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    //Recorre la diagonal secundaria
    public boolean recorrerDiagonalSecundaria(String[][] matriz, String palabra){
        for (int i = 0; i < matriz.length; i++) {
            int contadorCaracter = 0;
            for(int j = 0; j < matriz[i].length; j++){
                if(i + j < matriz.length){
                    String elemento = matriz[i + j][matriz.length - 1 - i - j];
                    System.out.println(elemento);
                    if(elemento.equals(palabra)){
                        contadorCaracter++;
                    } else {
                        contadorCaracter = 0;
                    }
                    if(contadorCaracter >= 4){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public void mostrarMatriz(String[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            } 
            System.out.println();
        }
    }
}
