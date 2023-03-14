import java.util.Scanner;

public class Tasks {

    //task 1
    public static void sum(int a, int b) {
        System.out.println("a+b=" + (a + b));
    }

    //task 2
    public static int returnSum(int a, int b) {
        return (a + b);
    }

    //task 3
    public static void person(String c, String y) {
        System.out.println("My name is " + c + " and my surname is " + y);
    }

    //task 4
    public static void Min() {
        Scanner receive = new Scanner(System.in);
        System.out.print("enter first value : ");
        int value1 = receive.nextInt();
        System.out.print("enter second value : ");
        int value2 = receive.nextInt();
        if (value1 > value2) {
            System.out.println("minimum value = " + value2);
        } else if (value1 == value2) {
            System.out.println("the values you entered are the same");
        } else {
            System.out.println("minimum value = " + value1);
        }
    }

    //task 5
    public static void Minimum() {
        Scanner receive = new Scanner(System.in);
        System.out.print("enter first value : ");
        int value1 = receive.nextInt();
        System.out.print("enter second value : ");
        int value2 = receive.nextInt();
        System.out.print("enter third value : ");
        int value3 = receive.nextInt();

        if ((value1 > value2) && (value3 > value2)) {
            System.out.println("minimum value = " + value2);
        } else if ((value2 > value1) && (value3 > value1)) {
            System.out.println("minimum value = " + value1);
        } else if ((value2 > value3) && (value1 > value3)) {
            System.out.println("minimum value = " + value3);
        }
    }

    //task 6
    public static void weight() {
        Scanner weight = new Scanner(System.in);
        System.out.print("enter David's weight : ");
        int Dweight = weight.nextInt();
        System.out.print("enter Uzi's weight : ");
        int Uweight = weight.nextInt();

        System.out.println("the remainder between their weight : " + (Dweight % Uweight));
    }

    //task 7
    public static void task7() {
        Scanner value = new Scanner(System.in);
        System.out.print("enter first value : ");
        int value1 = value.nextInt();
        System.out.print("enter second value : ");
        int value2 = value.nextInt();

        if (value1 > value2) {
            System.out.println("sum = " + (value1 + value2));
        } else {
            System.out.println("multiplication = " + (value1 * value2));
        }
    }

    //task 8
    public static void task8(int a) {
        if ((a >= 10 && a < 100) || (a <= -10 && a >= -100)) {
            System.out.println("Yes!");
        } else {
            System.out.println("No!");
        }
    }

    //task 9
    public static void task9() {
        Scanner value = new Scanner(System.in);
        System.out.print("enter first value : ");
        int value1 = value.nextInt();
        System.out.print("enter second value : ");
        int value2 = value.nextInt();
        System.out.print("enter third value : ");
        int value3 = value.nextInt();
        System.out.print("enter fourth value : ");
        int value4 = value.nextInt();

        if ((value1 + value2) > (value3 + value4)) {
            System.out.println("Yes!");
        } else {
            System.out.println("No!");
        }
    }

    //task 10
    public static void task10() {
        Scanner value = new Scanner(System.in);
        System.out.print("enter first value : ");
        int value1 = value.nextInt();
        System.out.print("enter second value : ");
        int value2 = value.nextInt();

        if (value1 < 0 && value2 < 0) {
            System.out.println("minus");
        } else if ((value1 > 0 && value2 < 0) || (value1 < 0 && value2 > 0)) {
            System.out.println(" plus and minus");
        } else {
            System.out.println("plus");
        }
    }

    //task 11
    public static void task11() {
        Scanner number = new Scanner(System.in);
        System.out.print("enter a 3 digits number : ");
        int num = number.nextInt();
        if (num >= 100 && num < 1000) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            System.out.println("digits' sum = " + sum);
        } else {
            System.out.println("the number you entered is not 3 digits!");
        }
    }

    //task 12
    public static void task12() {
        Scanner select = new Scanner(System.in);
        System.out.println("enter day : ");
        int day = select.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("enter the correct day!");
        }
    }

    //task 13
    public static void task13() {
        Scanner number = new Scanner(System.in);
        System.out.print("enter a 2 digits number");
        int num = number.nextInt();
        int units = num % 10;
        int tens = num / 10;
        if (units == tens) {
            System.out.println("Yes!");
        } else {
            System.out.println("No!");
        }
    }

    //task 14
    public static void task14() {
        Scanner number = new Scanner(System.in);
        System.out.print("enter a 3 digits number");
        int num = number.nextInt();
        int units = num % 10;
        int hundred = num / 100;
        if (units == hundred) {
            System.out.println("Yes!");
        } else {
            System.out.println("No!");
        }
    }

    //task 15
    public static void task15() {
        Scanner number = new Scanner(System.in);
        System.out.print("enter a 4 digits number");
        int num = number.nextInt();
        int units = num % 10;
        int tens = (num / 10) % 10;
        if (units == tens) {
            System.out.println("Yes!");
        } else {
            System.out.println("No!");
        }
    }

    //task 16
    public static void task16() {
        Scanner number = new Scanner(System.in);
        System.out.println("enter a first 3 digits number");
        int num1 = number.nextInt();
        System.out.println("enter a second 3 digits number");
        int num2 = number.nextInt();

        int firstTens = (num1 / 10) % 10;
        int secondTens = (num2 / 10) % 10;
        if (firstTens > secondTens) {
            System.out.println("Yes!");
        } else {
            System.out.println("No!");
        }

    }

    //task 17
    public static void task17() {
        Scanner number = new Scanner(System.in);
        System.out.print("enter a first number");
        int num1 = number.nextInt();
        System.out.print("enter a second number");
        int num2 = number.nextInt();
        System.out.print("enter a third number");
        int num3 = number.nextInt();

        if (num1 + num2 > 300 || num1 + num3 > 300 || num2 + num3 > 300) {
            System.out.println("Yes!");
        } else {
            System.out.println("No!");
            ;
        }
    }

    //task 18
    public static void task18() {
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;
        int sum = 0;
        Scanner number = new Scanner(System.in);
        System.out.print("enter a first number : ");
        int num1 = number.nextInt();
        System.out.print("enter a second number : ");
        int num2 = number.nextInt();
        System.out.print("enter a third number : ");
        int num3 = number.nextInt();
        System.out.print("enter a fourth number : ");
        int num4 = number.nextInt();

        while (num1 > 0 && num2 > 0 && num3 > 0 && num4 > 0) {
            sum1 += num1 % 10;
            num1 /= 10;
            sum2 += num2 % 10;
            num2 /= 10;
            sum3 += num3 % 10;
            num3 /= 10;
            sum4 += num4 % 10;
            num4 /= 10;
        }
        sum = sum1 + sum2 + sum3 + sum4;
        System.out.println("their sum = " + sum);
    }

    //task 19
    public static void task19() {
        Scanner number = new Scanner(System.in);
        System.out.print("enter a first number : ");
        int num1 = number.nextInt();
        System.out.print("enter a second number : ");
        int num2 = number.nextInt();
        System.out.print("enter a third number : ");
        int num3 = number.nextInt();
        System.out.print("enter a fourth number : ");
        int num4 = number.nextInt();

        if (num1 * num2 > num3 * num4) {
            System.out.println("Yes!");
        } else {
            System.out.println("No!");
        }
    }

    //task 20  same as task 10

    //task 21
    public static void task21() {
        Scanner number = new Scanner(System.in);
        System.out.print("enter a first number : ");
        int num1 = number.nextInt();
        System.out.print("enter a second number : ");
        int num2 = number.nextInt();

        int rem1 = num1 % 10;
        int rem2 = num2 % 10;

        if (rem1 > rem2) {
            System.out.println("first number's remainder is bigger than second number's");
        } else if (rem1 == rem2) {
            System.out.println("first number's remainder is equal second number's");
        } else {
            System.out.println("second number's remainder is bigger than first number's");
        }
    }

    //task 22
    public static void oddNum(int number) {
        if (number % 2 == 1) {
            System.out.println("this number is ODD!");
        } else {
            System.out.println("this number is NOT ODD!");
        }
    }

    //task 23
    public static void evenNum(int number) {
        if (number % 2 == 0) {
            System.out.println("this number is EVEN!");
        } else {
            System.out.println("this number is NOT EVEN!");
        }
    }

    //task 24
    public static void task24(int a, int b) {
        int sum1 = 0;
        int sum2 = 0;
        while (a > 0) {
            sum1 += a % 10;
            a /= 10;
        }
        while (b > 0) {
            sum2 += b % 10;
            b /= 10;
        }
        System.out.println("sum1 = " + sum1);
        System.out.println("sum2 = " + sum2);
        if (sum1 > sum2) {
            System.out.println("sum1 is bigger than sum2");
        } else if (sum1 < sum2) {
            System.out.println("sum1 is less than sum2");
        } else {
            System.out.println("sum1 is equal sum2");
        }

    }

    //task 25
    public static void polindrome(int number) {
        int remainder, sum = 0, temp;
        temp = number;
        while (number > 0) {
            remainder = number % 10;
            sum = (sum * 10) + remainder;
            number = number / 10;
        }
        if (sum == temp) {
            System.out.println("this number is polindrome!");
        } else {
            System.out.println("this number is not polindrome!");
        }

    }

}



