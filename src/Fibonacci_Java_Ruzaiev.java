/**
 * ---------- ENG ----------
 * find Fibonacci series (0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233...)
 * print part of series between num1 < num2
 * for example num1 = 3, num2 = 20, print 5, 8, 13
 * for print 0, 1, 1, 2, 3, 5, enter num1 = -1, num2 = n.
 * ---------- UKR ----------
 * найдіть послідовність чисел Фібоначчі (0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233...),
 * які знаходяться між введеними користувачем будь якими позитивними цілими числами num1 та num2 (де num1 < num2)
 * Наприклад, якщо  num1 = 3, num2 = 20, тоді вивести рядок = 5, 8, 13.
 * Для отримання ряду з "0" ввести num1 = -1, num2 = n.
 * ---------- Algorithmic visualization Fibonacci series ----------
 *  a = -1 b = 1
 *
 *  a   b   a
 * -1 + 1 = 0
 *    /   /
 *  b   a   b
 *  1 + 0 = 1
 *    /   /
 *  0 + 1 = 1
 *    /   /
 *  1 + 1 = 2
 *    /   /
 *  1 + 2 = 3
 *    /   /
 *  2 + 3 = 5
 *  ---------
 *  a + b = a
 *  b + a = b
 */

import java.util.Scanner;

public class Fibonacci_Java_Ruzaiev {
    public static void main(String[] args) {

        int a = -1, b = 1;

        System.out.println("Enter integer num_1:");
        Scanner input = new Scanner(System.in);
        int num_1 = input.nextInt();

        System.out.println("Enter integer num_2:");
        Scanner in = new Scanner(System.in);
        int num_2 = in.nextInt();


        for (int i = 0; i < num_2; i++) {
            a = a + b;
            b = a + b;
            if (a >= num_2) break;
            if (a > num_1) {
                System.out.print(a + ", ");
            }

            if (b >= num_2) break;
            if (b > num_1) {
                System.out.print(b + ", ");
            }
        }
    }
}
// loop do while with num_1 --- num_2

//        do {
//            a = a + b;
//            b = a + b;
//            if (a >= num_2) break;
//        if (a > num_1) {
//            System.out.print(a + ",");
//        }
//        if (b >= num_2) break;
//        if (b > num_1) {
//            System.out.print( b + ",");
//        }
//
//        } while (a < num_2 & b < num_2);

// loop while with num_1 --- num_2

//        while (a < num_2 || b < num_2) {
//            a = a + b;
//            b = a + b;
//            if (a >= num_2) break;
//            if (a > num_1) {
//                System.out.print(a + ",");
//            }
//            if (b >= num_2) break;
//            if (b > num_1) {
//                System.out.print(b + ",");
//            }
//
//        }

//     just fibonacci without num_1
//        for (int i = 0; i < num_2; i++) {
//            a = a + b;
//            b = a + b;
//        if (a >= num_2) break;
//            System.out.print(a + ", ");
//        if (b >= num_2) break;
//            System.out.print( b + ", ");
//        }

//    }
//}



