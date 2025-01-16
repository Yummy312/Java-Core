/*********** Урок 22: Ключевое слово final ************/

/*

Ключевое слово final в Java используется для обозначения, что значение переменной, метод или класс
не может быть изменено или переопределено. Это ключевое слово используется для создания неизменяемых
объектов или обеспечения неизменности в коде.
*/
public class Classes_and_Objects {
    public static void main(String[] args) {
        final int X = 10;
        System.out.println(X);

        System.out.println(Test.CONSTANT);
    }

}


class Test {
    public static final int CONSTANT = 0;

}