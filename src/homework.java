import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите первое число");
        int a = scanner.nextInt();
        System.out.println(a + "первое число ");
        System.out.println("введите знак");
        char sing = scanner.next().charAt(0);
        System.out.println("введите второе число");
        int b =  scanner.nextInt();
        System.out.println("ответ: ");
        if (sing == '*') {
            int result = myltiply(a, b);
            System.out.println("ответ: "+ result);
        }
        if (sing == '+') {
            int result = sum(a, b);
            System.out.println("ответ: "+ result);
        }
        if (sing == '/') {
            int result = devision(a, b);
            System.out.println("ответ: "+ result);
        }
        if (sing == '-') {
            int result = minus(a, b);
            System.out.println("ответ: "+ result);
        }


    }




    public static int sum(int a, int b)  {return a + b; }

    public static int minus(int a, int b)  {return a - b; }

    public static int myltiply(int a, int b)  {return a * b; }

    public static int devision(int a, int b)  {return a / b; }



    }






