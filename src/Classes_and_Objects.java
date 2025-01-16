/*********** Урок 17: Методы. Параметры метода ************/

/*
    Параметры метода в Java передаются в круглых скобках после имени метода.
    Они позволяют передать значения внутрь метода при его вызове.
*/
public class Classes_and_Objects {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("John");
        System.out.println(person.name); //John

        Person person2 = new Person();
        person2.setNameAndAge("Max", 22);
        System.out.println("My name is " + person2.name + " and i'm " + person2.age); // My name is Max and i'm 22


    }

}

class Person {
    String name;
    int age;



    /*
    Каждый параметр должен иметь тип данных и имя. Тип указывает, какого типа данные метод ожидает,
    а имя используется внутри метода для доступа к переданным значениям.
    */
    void setName(String newName) {
        name = newName;
    }

    // Метод с двумя параметрами: String и int
    void setNameAndAge(String newName, int newAge) {
        name = newName;
        age = newAge;
    }
}
