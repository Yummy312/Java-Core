import java.util.Scanner;

/*********** Урок 7************/
public class Input {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите что-нибудь : ");
        String input = scanner.nextLine();
        System.out.println("Вы ввели "+input);
    }
}
