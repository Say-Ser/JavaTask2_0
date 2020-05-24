/** Класс Калькулятор
 * Класс включает в себя решения задач с 1 по 3 по курсу Java 2.0. для тестировщиков
 * @author Sayapin S. V.
 * */
package Calc;

import java.util.Scanner;


public class Calc {

    /*Методы
    * Sum - функция сложения двух чисел
    * Min - функция сложения двух чисел
    * Del - функция сложения двух чисел
    * Umn - функция сложения двух чисел
    * Calculator - метод реализующий одну из операций (Сложение, Вычитание, Умножение и Деление), над двумя числами с плавающей точкой
    * FindMaxWordOfMassiv - метод реализующий поиск слова максимальной длины в массиве слов, заданной пользователем размерностью
     * */
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
    public static float Calculator(){
        Scanner in= new Scanner(System.in);
        System.out.println("Примечание: если число имеет дробную часть, просьба отделять ее запятой. ");
        System.out.println("Введите первое число: ");
        //first - первое число
        float first=in.nextFloat();
        System.out.println("Введите второе число: ");
        //second - второе число
        float second=in.nextFloat();
        System.out.println("Введите операцию: ");
        System.out.println("1 - сумма");
        System.out.println("2 - разность");
        System.out.println("3 - деление");
        System.out.println("4 - умножение");
        // operation - выбор операции над числами
        int operation = in.nextInt();
        float result;
        switch (operation){
            case 1:
                result=Sum(first,second);break;
            case 2:
                result=Min(first,second);break;
            case 3:
                result=Del(first,second);break;
            case 4:
                result=Umn(first,second);break;
            default:
                System.out.println("Некорректная операция!");return 0;
        }
        return result;
    }
    private static String FindMaxWordOfMassiv() {
        Scanner in= new Scanner(System.in);
        int max=0;
        String maxWord = null;
        System.out.println("Введите размерность массива: ");
        int size = in.nextInt();
        System.out.println(size);
        String [] words = new String[size];
        System.out.println("Введите элементы массива: ");
        for (int i=0; i< words.length;i++)
        {
            words[i]=in.next();
        }
        System.out.println("Ваш массив: ");

        for (String word : words)
        {
            if (word.length()>max)
            {
                max=word.length();
                maxWord=word;
            }
        }

        for (String word : words)
        {
           System.out.print(word+" ");
        }
        System.out.println(" ");

        return maxWord;
    }


    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Введите номер программы, которую хотите запустить: ");
        System.out.println("1 - Калькулятор");
        System.out.println("2 - Поиск максимального слова в массиве");
        int number = in.nextInt();
        switch (number){
            case 1:
                System.out.printf("Результат выполнения программы Калькулятор: %.4f ",Calculator());
                break;
            case 2:
                System.out.println("Максимальное слово в массиве: "+FindMaxWordOfMassiv());
                break;
            default:
                System.out.println("Введен несуществующий номер, До свидания!");
        }


    }
    
}
