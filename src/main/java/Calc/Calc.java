package Calc;

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
        float x=5.2f;
        float y=2.5f;
        int C=2;
        switch (C){
            case 1:System.out.println(Sum(x,y));break;
            case 2:System.out.println(Min(x,y));break;
            case 3:System.out.println(Del(x,y));break;
            case 4:System.out.println(Umn(x,y));break;
            default:
                System.out.println("Некорректная операция!");
        }
    }
}
