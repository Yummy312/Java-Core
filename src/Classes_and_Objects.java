/*********** Урок 26: Интерфейсы  ************/

/*
Интерфейсы в Java — это один из механизмов, который позволяет задавать контракты
или соглашения для классов, не предоставляя при этом конкретную реализацию методов.
Интерфейсы содержат абстрактные методы (методы без реализации), которые должны
быть реализованы в классах, подписавшихся на эти интерфейсы, а также могут содержать
константы и методы с реализацией по умолчанию (начиная с Java 8).

______Основные особенности интерфейсов______:
- Интерфейс может содержать любое количество абстрактных методов.
Все классы, реализующие интерфейс, обязаны переопределить их.
- Множественное наследование интерфейсов — в отличие от классов, Java позволяет классу
реализовывать несколько интерфейсов.
- Ключевое слово implements используется для реализации интерфейса классом.
- Константы — интерфейсы могут содержать константы
(переменные с модификаторами public static final), доступные всем классам, которые его реализуют.
- Интерфейсы также могут содержать статические методы (с Java 8), которые могут быть
вызваны напрямую через интерфейс.
- Интерфейсы могут содержать переменные, но они всегда являются
по умолчанию public static final. Это означает, что они должны быть инициализированы сразу,
и их значение не может быть изменено.

______Ограничения интерфейсов______:

- Интерфейсы не могут иметь поля, которые изменяются. Это ограничивает их в некоторых ситуациях,
где требуется состояние.
- Интерфейсы не могут иметь конструкторы(создание объектов интерфейса невозможно),
они только задают контракт для классов.
*/
public class Classes_and_Objects {
    public static void main(String[] args) {

        Animal animal1 = new Animal(1);
        Person person1 = new Person("John");
        animal1.showInfo(); // Id is 1
        person1.showInfo(); // Name is John



        /*
           Данная конструкция позволяет вызывать только методы интерфейса Info
           для этого объекта, несмотря на то, что объект является экземпляром класса Animal
        */
        Info animal2 = new Animal(2);
        animal2.showInfo(); // Id is 2


        /*
           Данная конструкция позволяет вызывать только методы интерфейса Info
           для этого объекта, несмотря на то, что объект является экземпляром класса Person
        */
        Info person2 = new Person("Peter");
        person2.showInfo(); // Name is Peter

    }

}

interface Info{
    public void showInfo();

}
interface Move {
    public void move();
}

class Animal implements Info, Move{
    public int id;

    public Animal(int id) {
        this.id = id;
    }
    public void sleep(){
        System.out.println("I am sleeping");
    }
    @Override
    public void showInfo(){
        System.out.println("Id is " + this.id);
    }
    @Override
    public void move(){
        System.out.println("Animal is moving");
    }
}

class Person implements Info, Move {
    String name;

    public Person(String name) {
        this.name = name;
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    @Override
    public void showInfo(){
        System.out.println("Name is " + this.name);
    }
    @Override
    public void move(){
        System.out.println("Human is moving");
    }
}

