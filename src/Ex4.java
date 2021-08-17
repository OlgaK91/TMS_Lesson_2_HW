/*
 *В методе main объявить переменную типа double и присвоить ей произвольные числовые значения.
 *Сделать явное приведение переменной к типу int.
 *Результат вывести на консоль.
 */

public class Ex4 {
    public static void main(String[] args) {
        double a = 2.56;
        a = (int) a;
        System.out.println(a);
    }
}
