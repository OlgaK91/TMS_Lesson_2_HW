/*
 *В методе main объявить четрые переменные типа int и присвоить им произвольные числовые значения.
 *Первая переменная должна быть в двоичном формате, вторая - в восьмеричном, третья - в десячином, четрветая в шестнадцатиричном.
 *Вывести результат на консоль.
 */

public class Ex2 {
    public static void main(String[] args) {
        int val1 = Integer.valueOf("101011", 2);
        int val2 = Integer.valueOf("43", 8);
        int val3 = 43;
        int val4 = Integer.valueOf("43", 16);
        System.out.println(val1);
        System.out.println(val2);
        System.out.println(val3);
        System.out.println(val4);

    }
}
