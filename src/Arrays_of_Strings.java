/*********** Урок 12************/

public class Arrays_of_Strings {
    // Цикл for each, Массивы строк
    public static void main(String[] args) {

        // Массив из строк
        String [] strings = new String [3]; // Мы объявили массив, которая может помещать в себя 3 объекта класса String

        // Инициализируем массив
        strings[0] = "Hello";
        strings[1] = "World";
        strings[2] = "!";

        // Выведем элементы массива с помощью цикла for each
        for (String item : strings) {
            System.out.println(item);
        }
    }
}
