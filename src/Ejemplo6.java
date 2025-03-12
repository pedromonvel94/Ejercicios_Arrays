public class Ejemplo6 {
    public static void main(String[] args) {
        double[][] notas = new double[4][5]; // 4 filas (notas) y 5 columnas (materias)

        // Ejemplo de cómo asignar valores al array
        notas[0][0] = 8.5; // Lengua
        notas[0][1] = 7.0; // Matemáticas
        notas[0][2] = 9.0; // Ciencias
        notas[0][3] = 6.5; // Sociales
        notas[0][4] = 7.5; // Inglés

        notas[1][0] = 8.0;
        notas[1][1] = 6.0;
        notas[1][2] = 7.5;
        notas[1][3] = 8.5;
        notas[1][4] = 9.0;

        notas[2][0] = 9.5;
        notas[2][1] = 8.0;
        notas[2][2] = 7.0;
        notas[2][3] = 6.0;
        notas[2][4] = 8.5;

        notas[3][0] = 7.5;
        notas[3][1] = 8.5;
        notas[3][2] = 9.0;
        notas[3][3] = 7.0;
        notas[3][4] = 6.5;

        // Ejemplo de cómo imprimir los valores del array
        String[] materias = {"Lengua", "Matemáticas", "Ciencias", "Sociales", "Inglés"};
        for (int i = 0; i < 4; i++) {
            System.out.print("Notas del estudiante " + (i + 1) + ": ");
            for (int j = 0; j < 5; j++) {
                System.out.print(materias[j] + ": " + notas[i][j] + " ");
            }
            System.out.println();
        }

        // Calcular y mostrar el promedio de cada materia
        for (int j = 0; j < 5; j++) {
            double suma = 0;
            for (int i = 0; i < 4; i++) {
                suma += notas[i][j];
            }
            double promedio = suma / 4;
            System.out.println("Promedio de " + materias[j] + ": " + promedio);
        }
    }
}