import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }
        //Задание 2
        System.out.println("Задание 2");
        for(int b = 10; b >= 1; b-- ){
            System.out.println(b);
        }
        //Задание 3
        System.out.println("Задание 3");
        for(int c = 0; c < 17; c = c + 2){
            System.out.println(c);
        }
        //Задание 4
        System.out.println("Задание 4");
        for(int d = 10; d > -11; d--){
            System.out.println(d);
        }
        //Задание 5
        System.out.println("Задание 5");
        for(int year = 1904; year < 2097; year = year + 4){
            System.out.printf("%d год является високосным%n", year);
        }
        //Задание 6
        System.out.println("Задание 6");
        for(int e = 7; e < 99; e = e + 7){
            System.out.println(e);
        }
        // Задание 7
        System.out.println("Задание 7");
        for(int f = 1; f < 513; f = f * 2){
            System.out.println(f);
        }
        // Задание 8
        System.out.println("Задание 8");
        int salary;
        salary = 29000;
        int total = 0;
        for(int i = 1; i < 13; i++){
            total = total + salary;
            System.out.println(total);
        }
        // Задание 9
        System.out.println("Задание 9");
        total = 0;
        for(int month = 1; month < 13; month++){
            total = total + (total / 100);
            total = total + salary;
            System.out.println(total);
        }
        // Задание 10
        System.out.println("Задание 10");
        for (int g = 1; g < 11; g++){
            int x = 2 * g;
            System.out.println("2 * "+ g + " = " + x);
        }
    }
    }
