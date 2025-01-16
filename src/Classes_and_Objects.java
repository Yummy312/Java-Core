/*********** Урок 16: Тип возвращаемого значения метода ************/

 /*
    В Java тип возвращаемого значения метода указывается перед именем метода и определяет,
    какой тип данных метод возвращает после выполнения.
 */

public class Classes_and_Objects {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Вова";
        person.age = 18;
        int years = person.calculateYearsToRetirement();
        System.out.println("Вове до пенсии "+ years + " лет"); 

    }

}

class Person {
    String name;
    int age;


    // Метод возвращает целое число
    int calculateYearsToRetirement(){
        int years = 65-age;
        return years;
    }

}
