package Task4_2;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        addSweets();
    }
    public static void addSweets() {
        boolean flag = false;
        int sumPrice =0, sumWeight =0;
        ArrayList <Sweets> sweets = new ArrayList();
        Scanner in = new Scanner(System.in);
        while (!flag) {
            System.out.println("Нажмите соответствующую цифру, где: ");
            System.out.println("'1' - Шоколад \"Max Fun\"");
            System.out.println("'2' - Шоколад \"Ritter Sport\"");
            System.out.println("'3' - Шоколад \"Воздушный\"");
            System.out.println("'4' - Мармелад \"Бон-пари\"");
            System.out.println("'5' - Конфеты \"Коровка\"");
            System.out.println("'6' - Конфеты \"Старт\"");
            System.out.println("'7' - Конфеты \"Мишка косолапый\"");
            System.out.println("'8' - Конфеты \"M&Ms\"");
            System.out.println("'0' - Закончить");
            int choice = in.nextInt();
            int quantity = 0;
            switch (choice) {
                case (1):
                    Chocolate chMaxFun = new Chocolate(" \"Max Fun\"", 300, 70, "Апельсин");
                    sweets.add(chMaxFun);
                    System.out.println("Введите количество: ");
                    quantity = in.nextInt();
                    sumPrice += quantity * chMaxFun.getPrice();
                    sumWeight += quantity * chMaxFun.getWeight();
                    System.out.println("Шоколад \"Max Fun\" добавлен в подарок");
                    break;
                case (2):
                    Chocolate chRitSp = new Chocolate(" \"Ritter Sport\"", 400, 100, "Лесной орех");
                    sweets.add(chRitSp);
                    System.out.println("Введите количество: ");
                    quantity = in.nextInt();
                    sumPrice += quantity * chRitSp.getPrice();
                    sumWeight += quantity * chRitSp.getWeight();
                    System.out.println("Шоколад \"Ritter Sport\" добавлен в подарок");
                    break;
                case (3):
                    Chocolate chVozd = new Chocolate(" \"Воздушный\"", 125, 230, "Белый Пористый");
                    sweets.add(chVozd);
                    System.out.println("Введите количество: ");
                    quantity = in.nextInt();
                    sumPrice += quantity * chVozd.getPrice();
                    sumWeight += quantity * chVozd.getWeight();
                    System.out.println("Шоколад \"Воздушный\" добавлен в подарок");
                    break;
                case (4):
                    Jellybean jellyBon = new Jellybean(" \"Бон-пари\"", 250, 85, "Разноцветный");
                    sweets.add(jellyBon);
                    System.out.println("Введите количество: ");
                    quantity = in.nextInt();
                    sumPrice += quantity * jellyBon.getPrice();
                    sumWeight += quantity * jellyBon.getWeight();
                    System.out.println("Мармелад \"Бон-пари\" добавлен в подарок");
                    break;
                case (5):
                    Candy candyCow = new Candy (" \"Коровка\"", 100, 150, "С маком");
                    sweets.add(candyCow);
                    System.out.println("Введите количество: ");
                    quantity = in.nextInt();
                    sumPrice += quantity * candyCow.getPrice();
                    sumWeight += quantity * candyCow.getWeight();
                    System.out.println("Конфеты \"Коровка\" добавлен в подарок");
                    break;
                case (6):
                    Candy candyStart = new Candy (" \"Старт\"", 120, 300, "Со сгущенным молоком");
                    sweets.add(candyStart);
                    System.out.println("Введите количество: ");
                    quantity = in.nextInt();
                    sumPrice += quantity * candyStart.getPrice();
                    sumWeight += quantity * candyStart.getWeight();
                    System.out.println("Конфеты \"Старт\" добавлен в подарок");
                    break;
                case (7):
                    Candy candyBear = new Candy (" \"Мишка косолапый\"", 400, 550, "темный");
                    sweets.add(candyBear);
                    System.out.println("Введите количество: ");
                    quantity = in.nextInt();
                    sumPrice += quantity * candyBear.getPrice();
                    sumWeight += quantity * candyBear.getWeight();
                    System.out.println("Конфеты \"Мишка косолапый\" добавлен в подарок");
                    break;
                case (8):
                    Candy candyMMs = new Candy (" \"M&Ms\"", 350, 250, "C орехом");
                    sweets.add(candyMMs);
                    System.out.println("Введите количество: ");
                    quantity = in.nextInt();
                    sumPrice += quantity * candyMMs.getPrice();
                    sumWeight += quantity * candyMMs.getWeight();
                    System.out.println("Конфеты \"M&Ms\" добавлен в подарок");
                    break;
                case (0): flag = true;
                    break;
            }
        }

        int i = 0;
        System.out.println("\nПодарок состоит из:");
        for (Sweets sweet:sweets) {
            i++;
            System.out.println(i + ". " + sweet.toString());
        }
        System.out.println(String.format("\nВес подарка: %s гр.\nОбщая цена подарка: %s руб.", sumWeight, sumPrice));

    }
}

