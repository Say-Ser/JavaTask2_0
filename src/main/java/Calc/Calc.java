package Calc;

import java.util.Scanner;

public class Calc {
/** Класс Калькулятор
 * */

    /*Методы*/
    public static float Sum(float x,float y){
        return x + y;
    }
    public static float Min(float x,float y){
        return x - y;
    }
    public static float Del(float x,float y){
        return x / y;
    }
    public static float Umn(float x,float y){
        return x * y;
    }

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Введите первое число: ");
        float First=in.nextFloat();
        System.out.println("Введите второе число: ");
        float Second=in.nextFloat();
        System.out.println("Введите операцию: ");
        System.out.println("1 - сумма");
        System.out.println("2 - разность");
        System.out.println("3 - деление");
        System.out.println("4 - умножение");
        int Operation = in.nextInt();
        switch (Operation){
            case 1:System.out.println(Sum(First,Second));break;
            case 2:System.out.println(Min(First,Second));break;
            case 3:System.out.println(Del(First,Second));break;
            case 4:System.out.println(Umn(First,Second));break;
            default:
                System.out.println("Некорректная операция!");
        }
    }
}
