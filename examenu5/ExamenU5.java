package examenu5;

import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Arrays;

public class ExamenU5 {
    
    public static void main(String[] args) {
        try {
            
            FileReader fr = new FileReader("C:\\Users\\PC1\\Desktop\\Archivo.txt");
           
            BufferedReader buf = new BufferedReader(fr);
            String numeros = buf.readLine();
            String arreglo[] = numeros.split(" - ");
            
            int Matriz[] = new int[arreglo.length];
            for (int i = 0; i < Matriz.length; i++) {
                Matriz[i] = Integer.parseInt(arreglo[i]);
            }
            System.out.println("Arreglo original\n" + Arrays.toString(Matriz));
            Shellsort(Matriz);
            System.out.println("Arreglo ordenado\n" + Arrays.toString(Matriz));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ExamenU5.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ExamenU5.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void Shellsort(int arreglo[]) {
        int i, j, k, aux, salto;
        salto = arreglo.length / 2;
        while (salto > 0) {
            for (i = salto; i < arreglo.length; i++) {
                j = i - salto;
                while (j >= 0) {
                    k = j + salto;
                    if (arreglo[j] > arreglo[k]) {
                        aux = arreglo[j];
                        arreglo[j] = arreglo[k];
                        arreglo[k] = aux;
                        j -= salto;
                    } else {
                        break;
                    }
                }
            }
            salto /= 2;
        }
    }
     public static int[] Integer(String M[]) {
        int I[] = new int[M.length];
        for (int i = 0; i < M.length; i++) {
            I[i] = Integer.parseInt(M[i]);
        }
        return I;
    }
}
