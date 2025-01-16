/*********** Урок 11************/

public class Arrays {
    // Массивы
    public static void main(String[] args) {
        // Целочисленный массив
        int [] numbers = new int[5]; // Мы объявили массив, которая может помещать в себя 5 чисел

        // Инициализируем массив
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i*10;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        /*
        Если мы заранее знаем какие числа мы хотим поместить в массив,
        то мы можем инициализировать массив вот таким образом
        */
        int [] numbers1 = {1, 22, 45, 65, 77};
        for (int i = 0; i < numbers1.length; i++) {
            System.out.println(numbers1[i]);
        }
    }
}
