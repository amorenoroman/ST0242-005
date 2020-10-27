/**
 * En este taller validaremos una hipótesis sobre el comportamiento en tiempo de ejecución de un 
 * algoritmo con varios tamaños de problema usando ecuaciones de recurrencia para calcular la complejidad
 * @Author Alejandra Palacio y Valentina Moreno 
 * @Date 20/08/2020
 */
public class Taller4{

    /**
     * Este método nos permitirá calcular el elemento con mayor valor en un arreglo de enteros
     * @param array
     * @param i
     * @param j
     * @return int
     */
    public int punto1(int[] array, int i, int j) {
        int mitad;
        int maxIzquierda;
        int maxDerecha;
        if (i == j)
            return array[i];
        else
            mitad = (i + j) / 2;
        maxIzquierda = punto1(array, i, mitad);
        maxDerecha = punto1(array, mitad + 1, j);
        if (maxIzquierda > maxDerecha)
            return maxIzquierda;
        else
            return maxDerecha;
    }

    /**
     * Este método nos permite atravesar por un arreglo de volumenes
     * y calculará si la combinación de alguno de estos logra llegar al objetivo.
     * @param int start
     * @param int[] volumenes
     * @param int volumen
     * @return boolean
     * 
     * @see sumaGrupo
     */
    private static boolean punto2(int start, int[] volumenes, int volumen){
        if(start<volumenes.length & volumen!=0){
            return punto2(start+1, volumenes, volumen) || punto2(start+1, volumenes, volumen-volumenes[start]);
        } else if(volumen == 0){
            return true;
        } else{
            return false;
        }
    }

    /**
     * Este método no permitirá calcular los elementos de una lista de volumenes que
     * logran cumplir con el volumen preestablecido
     * @param int[] nums
     * @param int target
     * 
     * @return boolean
     */
    private static boolean sumaVolumenes(int [] nums, int target){
        return punto2(0, nums, target);
    }

    /**
     * Este método calcula el valor enésimo de la serie de Fibonacci recursivamente.
     * @param n
     * @return int
     */
    public int punto3(int n){
         if (n>1){
            return punto3(n-1) + punto3(n-2); 
         }
         else if (n==1) {
             return 1;
         }
         else if (n==0){
             return 0;
         }
         else{ 
        System.out.println("Error");
        return -1;
         }
    }


}