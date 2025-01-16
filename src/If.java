/*********** Урок 6 ************/

public class If {
    public static void main(String[] args) {
        // Оператор if сработает только в том случае, если условие истинно

        if(5 > 1){
            System.out.println("Да верно");
        }
        // Иначе сработает оператор else
        else {
            System.out.println("Нет, не верно");
        }


        int myInt = 15;

        if(myInt < 10){
            System.out.println("Переменная myInt меньше 10");
        }
        else if(myInt > 10){
            System.out.println("Переменная myInt больше 10");
        }
        else {
            System.out.println("Ни один из предыдущих случаев");
        }
    }
}
