/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package utn.frm.edu.examen.ingreso.mercadolibre;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ExamenIngresoMercadoLibre {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Mutante mutante = new Mutante();
        
        //System.out.println("Ingrese la dimesion de la matriz: ");
        //int d = entrada.nextInt();
        /*String[][] mutanteDna = new String[6][6];
        
        for(int i = 0; i < mutanteDna.length; i++){
            for(int j = 0; j < mutanteDna[0].length; j++){
                do{
                    System.out.println("CARACTER PERMITIDO: A - C - G - T" + "\n POSICION: " + i + " " + j);
                    mutanteDna[i][j] = entrada.next();
                } while (!mutanteDna[i][j].equals("A") && !mutanteDna[i][j].equals("C") && !mutanteDna[i][j].equals("G") && !mutanteDna[i][j].equals("T"));
                System.out.println(mutanteDna[i][j]);
            }
            System.out.println();     
        }
        mutante.mostrarMatriz(mutanteDna);
        */
        
        String[][] mutantDna = {
                {"A", "A", "C", "A", "C", "G"},
                {"C", "A", "G", "T", "G", "C"},
                {"T", "T", "A", "T", "G", "T"},
                {"A", "G", "G", "A", "G", "G"},
                {"C", "T", "C", "C", "T", "A"},
                {"T", "C", "A", "C", "T", "G"}
        };
        
        String[][] mutante1 = {
                {"T", "G", "A", "A", "C", "C"},
                {"T", "A", "G", "T", "C", "C"},
                {"T", "T", "A", "C", "G", "T"},
                {"T", "G", "C", "A", "G", "G"},
                {"C", "A", "G", "C", "T", "A"},
                {"T", "C", "A", "C", "T", "G"}
        
        };
        
        String[][] noMutante1 = {
                {"A", "C", "A", "A", "C", "G"},
                {"C", "T", "G", "T", "G", "C"},
                {"T", "T", "A", "T", "G", "T"},
                {"A", "G", "A", "A", "G", "G"},
                {"C", "C", "G", "C", "T", "A"},
                {"T", "C", "A", "C", "T", "G"}
            
            
        };
        
        String[][] nonMutantDna = {
                {"A", "T", "G", "C", "G", "A"},
                {"C", "A", "G", "T", "T", "C"},
                {"T", "T", "A", "T", "G", "T"},
                {"A", "G", "C", "A", "G", "G"},
                {"C", "C", "T", "A", "T", "A"},
                {"T", "C", "A", "C", "T", "G"}
        };
        
        String[][] mutante2 = {
                {"A", "T", "G", "C", "G", "T"},
                {"G", "T", "G", "T", "T", "C"},
                {"G", "T", "A", "T", "G", "T"},
                {"G", "T", "T", "C", "C", "C"},
                {"G", "C", "T", "A", "T", "A"},
                {"T", "C", "A", "C", "T", "G"}
        };
        
        boolean esMutante = mutante.isMutant(mutante2);
        
        if(esMutante){
            System.out.println("|*o*| HAY UN MUTANTE |*o*|");
        } else {
            System.out.println("No hay MUTANTES presentes");
        }
        
    }
}

