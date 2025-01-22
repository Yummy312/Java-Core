/*********** Урок 37: Вложенные классы ************/

/*
Вложенные классы в Java — это классы, которые объявляются внутри другого класса.
Они используются для логической группировки классов, которые тесно связаны друг с другом.
Вложенные классы могут быть статическими или нестатическими. Рассмотрим их подробнее:

Когда использовать вложенные классы:
Когда есть логическая зависимость между классами.
Когда один класс используется только внутри другого класса.
Когда нужно избежать "загрязнения" пространства имен.
*/
public class Classes_and_Objects {

    public static void main(String[] args) {

        // Статические вложенные классы
        OuterClass.NestedStaticClass nested = new OuterClass.NestedStaticClass();
        nested.display();

        // Внутренние классы (non-static inner class):
        Car car = new Car();
        Car.InnerCar innerCar = car. new InnerCar();
        innerCar.display();

        // Локальные классы
        Person person = new Person();
        person.methodWithLocalClass();


    }
}


//Статические вложенные классы (static nested class):

//Объявляются с ключевым словом static.
//Могут обращаться только к статическим членам внешнего класса.
//Не требуют экземпляра внешнего класса для создания объекта.

class OuterClass {
    static class NestedStaticClass {
        void display() {
            System.out.println("Это статический вложенный класс");
        }
    }
}


//Внутренние классы (non-static inner class):

//Не объявляются с ключевым словом static.
//Имеют доступ к членам внешнего класса, включая приватные.
//Для создания объекта внутреннего класса требуется объект внешнего класса.
class Car {
    public String msg ="code";
    class InnerCar {
        void display() {
            System.out.println("Это внутренний класс");
        }
    }
}


//Локальные классы (local class):

//Объявляются внутри метода или блока кода.
//Имеют доступ ко всем полям и методам внешнего класса,
//а также к переменным метода, если они являются final или "эффективно финальными".

class Person {
    void methodWithLocalClass() {
        class LocalClass {
            void display() {
                System.out.println("Это локальный класс");
            }
        }
        LocalClass localClass = new LocalClass();
        localClass.display();


    }
}