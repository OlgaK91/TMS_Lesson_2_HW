/*
 *В методе main объявить три переменные типа int и присвоить первой числовое значение,
 *вторая переменная равна первой переменной увеличенной на 3, а третья переменная равна сумме первых двух.
 *Вывести результат на консоль.

 */

public class Ex1 {
    public static void main(String[] args) {
        int val1 = 3;
        int val2 = val1 + 3;
        int val3 = val1 + val2;
        System.out.println(val2);
        System.out.println(val3);
    }
}
