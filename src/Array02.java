

public class Array02 {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9}; //Array unidimensional tipo de dato int
        String[] b = {"Hola", "Mundo", "Java"}; //Array unidimensional tipo de dato String


        int[] c = new int[9]; //Definimos que a es un array y que tendra 9 elementos en memoria
        //Arrays de una dimension "unidimensional"
        c[0] = 25;
        c[1] = 30;
        c[2] = -25;
        c[3] = 5;
        c[4] = 255;
        c[5] = -2;
        c[6] = 47;
        c[7] = 50;
        c[8] = -400; //Esto seria lo mismo que estuvieramos creando un array {25, 30, -25, 5, 255, -2, 47, 50, -400}
        //c[9] = 1000; //Error, el array solo tiene 9 elementos TENER PRESENTE QUE ES DIFERENTE INDICE A CANTIDAD DE ELEMENTOS

        for (int i = 0; i < c.length; i++) {
            System.out.println("El valor del array c en la posición " + i + " es: " + c[i]);
        }

        System.out.print("Los valores del array a son los siguientes: ");
        System.out.println("{" + a[0] + ", " + a[1] + ", " + a[2] + ", " + a[3] + ", " + a[4] + ", " + a[5] + ", " + a[6] + ", " + a[7] + ", " + a[8] + "}");

        System.out.print("La suma del 4to valor de ambos arrays es: ");
        System.out.println(a[3] + c[3]);
    }

}
