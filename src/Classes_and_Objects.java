/*********** Урок 15: Методы в Java ************/


public class Classes_and_Objects {
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.name = "John";
        person1.age = 18;
        person1.speak();
    }

}

class Person {
    String name;
    int age;

    // Мы создали метод speak. Согласно конвенции название методов начинается с маленькой буквы.
    void speak(){
        /*
        Поля и методы знают о существовании друг друга,
        поэтому достаточно внутри метода ввести название поля
         */
        System.out.println("Меня зовут "+ name+ ", мне "+ age + " лет");
    }


}
