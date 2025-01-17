/*********** Урок 23(продолжение): Форматирование строк в Java ************/


public class Classes_and_Objects {
    public static void main(String[] args) {

        /*
        Помимо методов println и print у нас есть методы такие как printf и этот метод нужен чтобы
        форматировать строку. Синтаксис: System.out.printf(String format, Object... args);


        Примеры спецификаторов формата:
            %d — целое число.
            %f — число с плавающей точкой (по умолчанию 6 знаков после запятой).
            %s — строка.
            %c — символ.
            %n — новая строка (аналог \n).

        */

        System.out.printf("This is a string, %s", "NICE ");

        int age = 18;
        String name = "Bob";
        String country = "India";
        System.out.printf("/\nHello my name is %s and im %d y.o. I'm from %s", name, age, country);

        // Мы можем указать размер числа(длину). Например, пусть будет 6
        System.out.printf("\nВаш счет составляет %6d долларов", 155555);

        // Форматирование вещественных чисел. Мы хотим чтобы у нас было 2 числа после запятой.
        System.out.printf("\nЧисло: %.2f ", 2.22); // Число: 2,22
    }

}

