/*
 *В методе main получить введенное с консоли слово и вывести на консоль выражение:
 *введенное слово "и_тут_в_кавычках_должно_быть_введенное_слово".
 */
import java.util.Scanner;

public class Еx6 {
    public static void main(String[] args) {
        System.out.println("Введите слово");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Введенное слово " + '"'  + name + '"');
        scan.close();

    }
}
