package org.example;

public class App 
{
    public static void main( String[] args )
    {
        replace(5, 7);
        System.out.println(fibonazzi((byte)8));
        System.out.println(daysCount((byte)2, 2010));
        System.out.println(isSimple(4));
    }

    public static void replace(int x, int y) {
        System.out.println("До перемены мест:    x = " + x + " " + " y = " +y);

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("После перемены мест: x = " + x + " " + " y = " +y + "\n");
    }

    public static long fibonazzi (byte N) {
        if (N == 0 || N == 1) {
            return N;
        } else {
            return fibonazzi((byte) (N - 2)) + fibonazzi((byte) (N - 1));
        }
    }

    public static byte daysCount(byte month, int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        return 29;
                    } else {
                        return 28;
                    }
                } else if (year % 4 == 0) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                System.out.println("There is not such month.");
                break;
        }
        return 0;
    }

    public static int isSimple(int n) {
        boolean isChecked = (n != -2 && n != -1 && n != 1 && n != 2);
        if (n == 0) {
            return 1;
        }
        if (isChecked) {
            for (int i = 2; i * i <= Math.abs(n); i += 1) {
                if (n % i == 0) {
                    return i;
                }
            }
        }
        return 0;
    }
}
