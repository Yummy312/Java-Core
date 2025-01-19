import java.io.FileReader;
import java.io.IOException;

/*********** Урок 36: Исключения ************/

/*
    Исключения в Java — это механизмы обработки ошибок, которые позволяют программе реагировать
    на неожиданные ситуации, возникающие во время выполнения. Исключения в Java разделяются
    на два типа: проверяемые (checked) и непроверяемые (unchecked).

    Проверяемые исключения (Checked exceptions): Это исключения, которые возникают во время компиляции кода и они
    должны быть либо обработаны, либо указаны в сигнатуре метода с использованием ключевого слова throws.
    Примеры: IOException, SQLException, ClassNotFoundException
    Все проверяемые исключения происходят от класса Exception.

    Непроверяемые исключения (Unchecked exceptions): Это исключения возникают во время выполнения программы
    и не требуют обязательной обработки (catch или указания в блоке throws).
    Эти исключения, которые наследуются от RuntimeException, примеры: NullPointerException,
    ArrayIndexOutOfBoundsException.

    ___Обработка исключений в Java(Блоки try-catch)___
    try: В этом блоке размещается код, который может вызвать исключение.
    catch: Этот блок перехватывает исключения, которые были выброшены в блоке try. В нем можно обработать исключение.
    finally: Этот блок выполняется всегда, независимо от того, было ли выброшено исключение или нет.
    Обычно используется для освобождения ресурсов, таких как закрытие файлов или соединений.

    Ключевые слова throw и throws используются для работы с исключениями в Java.
    Throw используется для выброса исключения в блоке кода, а throws используется в объявлении метода,
    чтобы указать, что метод может выбросить определенный тип исключения.

*/
public class Classes_and_Objects {

     /*
        Метод, который может выбросить исключение IOException с помощью ключевого слова throws.
        Это требуется для проверяемых исключений. Это позволяет передать ответственность за обработку
        исключения вызывающему коду.
      */
    public static void readFile(String filename) throws IOException {
        FileReader file = new FileReader(filename);
        file.close();
    }


    public static void main(String[] args) {

        // Пример обработки исключения:
        try {
            int result = 10 / 0;  // Деление на ноль
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Деление на ноль");
        } finally {
            System.out.println("Этот блок выполнится всегда");
        }


        try {
            readFile("example.txt");
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла");
        }


        try {
            throw new MyException("Это мое исключение");
        } catch (MyException e) {
            System.out.println("Поймано исключение: " + e.getMessage());
        }

    }
}


/*
    В Java можно создавать собственные исключения, расширяя класс Exception или RuntimeException.
    Это полезно, если вам нужно обработать специфические ошибки, связанные с вашей логикой.
*/
class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

