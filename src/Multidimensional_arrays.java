/*********** Урок 13************/

public class Multidimensional_arrays {
    // Многомерные массивы
    public static void main(String[] args) {

        // Двумерный массив представляет собой массив массивов,
        // что позволяет хранить данные в виде таблицы (строк и столбцов).

        int [][] twoDimensionalArray =  {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(twoDimensionalArray[2][2]); // 9

        for(int i=0; i<twoDimensionalArray.length; i++){
            for(int j=0; j<twoDimensionalArray[i].length; j++){
                System.out.print(twoDimensionalArray[i][j] + " ");
            }
            System.out.println();

        }







        // Способ 2 объявления и инициализации массива
        String [][] strings = new String[2][2];
        strings[0][0] = "Hello";
        strings[0][1] = "World";
        strings[1][0] = "Hi";
        strings[1][1] = "Bye";
        System.out.println();
        System.out.println(strings[1][1]); // Bye



    }
}
