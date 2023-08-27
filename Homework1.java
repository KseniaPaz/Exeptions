 // 1. Реализуйте метод, принимающий в качестве аргументов двумерный массив.
    // Метод должен проверить что длина строк и столбцов с одинаковым индексом одинакова, 
    //детализировать какие строки со столбцами не требуется.
    
package Homework1;

public class Homework1 {
    public static void main(String[] args) {

        int[][] ints = new int[3][];
        ints[0] = new int[]{0, 1, 0};
        ints[1] = new int[]{1, 2, 1};
        ints[2] = new int[]{0, 1, 0};

        matrix(ints);
    }

    public static void matrix(int [][] mat){
        try {
            for (int i = 0; i < mat.length; i++) {
                for (int j = i; j < mat.length; j++){
                    if (mat[i].length != mat[j].length){
                        throw new RuntimeException("Матрица не квадратная");
                    }
                }

        }

        } catch (RuntimeException e){
            e.printStackTrace();
        }
    }
}