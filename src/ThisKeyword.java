/*********** Урок 19: Ключевое слово this ************/
/*
Ключевое слово this в Java используется для ссылки на текущий объект внутри метода
или конструктора класса. Оно позволяет обращаться к членам текущего объекта,
таким как поля (переменные) или методы, а также позволяет различать локальные переменные
и поля с одинаковыми именами.
*/
public class ThisKeyword {
    public static void main(String[] args) {

        Human human1 = new Human();
        human1.setAge(18);
        human1.setName("John");
        human1.getInfo();
    }
}

class Human{
    String name;
    int age;

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public  void getInfo(){
        System.out.println(name+ ", "+age);
    }
}