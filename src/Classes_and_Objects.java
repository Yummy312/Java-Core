/*********** Урок 24: Класс Object и метод toString()   ************/

/*
В Java класс Object является родительским (базовым) классом для всех других классов.
Это означает, что каждый класс в Java, включая стандартные и пользовательские,
по умолчанию наследует класс Object. Он предоставляет базовый набор методов,
которые могут быть использованы всеми объектами в Java, независимо от их типа.

_______Основные методы класса Object_______:

Метод toString() возвращает строковое представление объекта. По умолчанию этот метод
возвращает строку, которая представляет собой имя класса и хеш-код объекта.
Этот метод можно переопределить, чтобы вернуть более информативное представление объекта.
*/
public class Classes_and_Objects {
    public static void main(String[] args) {

        Person person = new Person("Dean", 27);
        System.out.println(person.toString());

        System.out.println("ss");

    }

}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Переопределяем метод toString чтобы вернуть более информативное представление объекта.
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }

}

