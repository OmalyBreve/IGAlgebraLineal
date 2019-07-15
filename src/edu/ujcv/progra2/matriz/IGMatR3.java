package edu.ujcv.progra2.matriz;

import java.util.*;
    public class IGMatR3
    {
        public static void main(){
            int i;
            int j;
            int matriza[][]=new int[3][3];

            Scanner dato = new Scanner (System.in);
            System.out.println("Escribir datos de la matriz ");

            for (i=0;i<=2;i++){
                for (j=0;j<=2;j++){
                    System.out.print("Escribir valor " + i + " , " + j + " : ");
                    matriza [i][j] = dato.nextInt();
                }
            }
            System.out.println("MATRIZ 3x3");
            for (i=0;i<=2;i++){
                for (j=0;j<=2;j++){
                    System.out.print(matriza[i][j]+"");
                }
                System.out.println("");
            }
        }

    // public static IGVecR2 rotacionZ (double angulo, IGVecR2 vector){
//
//    }

    // public static IGVecR2 rotacionX (double angulo, IGVecR2 vector){
//
//    }

    // public static IGVecR2 rotacionY (double angulo, IGVecR2 vector){
//
//    }

}
