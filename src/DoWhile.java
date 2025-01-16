import java.util.Scanner;

/*********** Урок 8************/

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value;

        /*
        Цикл do-while в Java сначала выполняет блок кода, а затем проверяет условие. Если условие истинно,
        цикл продолжается, если ложно — завершает свою работу. Это отличает его от цикла while, который
        проверяет условие перед выполнением блока кода.
        */

        do {
            System.out.println("Введи 5");
            value = scanner.nextInt();
        } while (value!=5);

        System.out.println("Вы ввели 5");


//        Scanner userInput = new Scanner(System.in);
//        String secretWord = "Bingo";
//        boolean start = true;
//
//        do {
//            System.out.println("Введи секретное слово");
//
//            if(userInput.nextLine().equals(secretWord)){
//                start = false;
//            }
//            else{
//                System.out.println("Неверное слово");
//            }
//        } while (start);

    }
}
