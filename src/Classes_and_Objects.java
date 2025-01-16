/*********** Урок 14 ************/


/*
   Если перед ключевым словом class стоит ключевое слово public, то это публичный класс.
   В Java можно иметь только один публичный класс в одном файле, и имя этого класса должно совпадать
   с именем файла.

   Публичный класс (класс с модификатором public) может быть доступен из любого другого класса или пакета.

 */
public class Classes_and_Objects {
    // Публичный класс

    public static void main(String[] args) {

        // Создание объекта
        HelperClass1 helperClass1 = new HelperClass1();
        helperClass1.name="sss";
        System.out.println(helperClass1.name);


    }

}

// В одном Java файле может быть сколько угодно обычных классов.
class HelperClass1 {
    String name;
}

class HelperClass2 {
    String name;
}

