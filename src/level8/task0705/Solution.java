package level8.task0705;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        div(0.0,100.0);
        div(0.0,-100.0);
    }

    public static void div(double a, double b){
        System.out.println(b/a);
    }
}
/*
В методе main вызови метод div() 2 раза. Первый раз — с такими аргументами, чтобы вывод в консоли был "Infinity", а второй — "-Infinity".
        Код метода div() изменять нельзя.

        Требования:
        •	В методе main() метод div() должен вызываться 2 раза.
        •	Результатом двух вызовов метода div() должен быть вывод в консоли "Infinity" и "-Infinity".
        •	Код метода div() не изменяй

 */