/*********** Урок 25: Наследование  ************/

/*
Наследование в Java — это механизм, который позволяет одному классу наследовать
характеристики (поля и методы) другого класса. Это позволяет повторно использовать код
и улучшать его структуру, а также облегчает создание новых классов, базируясь
на уже существующих.

______Основные концепции наследования_______:
- Родительский (суперкласс) — это класс, от которого наследуют другие классы.
- Дочерний (подкласс) — это класс, который наследует свойства и поведение родительского класса.
- Ключевое слово extends используется для создания наследования в Java.

______Типы наследования______:
- В Java поддерживается только одиночное наследование, то есть класс может наследовать
только один другой класс. Например, класс Dog может наследовать только от одного класса
Animal, но не от двух или более классов.

- Несмотря на то, что Java не поддерживает множественное наследование классов,
класс может реализовывать несколько интерфейсов.

______Ключевое слово super______:
super используется для обращения к членам родительского класса:
- super() — вызывает конструктор родительского класса.
- super.method() — вызывает метод родительского класса.
- super.field — доступ к полям родительского класса.
*/
public class Classes_and_Objects {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.bark();
        dog.eat();
        dog.showName();

    }

}

class Animal{
    String name = "Some Animal";

    public void eat(){
        System.out.println("Animal is eating.");
    }

    public void sleep(){
        System.out.println("Animal is sleeping.");
    }
}

// Класс Dog наследуется от класса Animal
class Dog extends Animal{

    // напишем метод, который будет свойственен только данному классу
    public void bark(){
        System.out.println("Bow wow!");
    }

    // Переопределяем метод eat унаследованный от родительского класса Animal
    @Override
    public void eat() {
        System.out.println("Dog is eating.");
    }

    public void showName(){
        System.out.println(name);
    }

}