public class Main {
    public static void main(String[] args) {
        {
            System.out.println();
            System.out.println("Задание №1");
            for (int i = 1; i <= 10; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        {
            System.out.println();
            System.out.println("Задание №2");
            for (int i = 10; i >= 1; i--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        {
            System.out.println();
            System.out.println("Задание №3");
            for (int i = 0; i < 17; i += 2) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        {
            System.out.println();
            System.out.println("Задание №4");
            for (int i = 10; i >= -10; i--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        {
            System.out.println();
            System.out.println("Задание №5");
            for (int age = 1904; age <= 2096; age += 4) {
                System.out.println(age + " год является високосным");
            }
            System.out.println();
        }
        {
            System.out.println("Задание №6");
            for (int i = 7; i <= 98; i += 7) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        {
            System.out.println();
            System.out.println("Задание №7");
            for (int i = 1; i <= 512; i *= 2) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        {
            System.out.println();
            System.out.println("Задание №8");
            int contribution = 29_000;
            int accumulation = 0;
            for (int month = 1; month <= 12; month++) {
                accumulation = accumulation + contribution;
                System.out.println("Месяц " + month + ", сумма накоплений равна " + accumulation + " рублей");
            }
            System.out.println();
        }
        {
            System.out.println("Задание №9");
            int contribution = 29_000;
            int accumulation = 0;
            for (int month = 1; month <= 12; month++) {
                accumulation = accumulation + accumulation / 100;
                accumulation = accumulation + contribution;
                System.out.println("Месяц " + month + ", сумма накоплений равна " + accumulation + " рублей");
            }
            System.out.println();
        }
        {
            System.out.println("Задание №10");
            int x = 2;
            for (int y = 1; y <= 10 ; y++) {
                System.out.println(x + " * "+ y + " = " + x * y);
            }
        }
    }
}