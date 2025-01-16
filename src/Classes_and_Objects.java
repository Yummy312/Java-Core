/*********** Урок 20: Конструкторы ************/

/*
Конструктор в Java — это специальный метод, который используется для инициализации объектов класса.
Конструкторы вызываются автоматически при создании нового объекта с помощью ключевого слова new.
В отличие от обычных методов, конструкторы не имеют возвращаемого типа (даже void)
и всегда имеют то же имя, что и класс.
*/
public class Classes_and_Objects {
    public static void main(String[] args) {

        Person person = new Person("Vlad", 22);

        System.out.println("Hello my name is " + person.getName() + " and i am "+ person.getAge());

    }

}

class Person {
    private String name;
    private int age;

    // Конструктор
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
