package org.example.start;

import java.sql.Date;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class InputWorker {

    public static String enterMobileNo() {
        String mobileNum = null;
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {

                System.out.println("Enter mobile number:");
                mobileNum = scanner.nextLine();

                if (mobileNum.matches("(^(\\+375|80)(29|33|44|25|17)\\d{7}$)")) return mobileNum;
                else {
                    System.out.print("enter again, u entered: ");
                    System.out.println(mobileNum.isEmpty()? "nothing": mobileNum);
                }
            }
        }

    }

    public static String enterStringWithRegex(String text, String excText, String regex){
        String str = null;

        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.println(text);
            str = scanner.nextLine();

            if (str.matches(regex)) return str;
            else {
                System.out.print(excText);
                System.out.println(str.isEmpty() ? "nothing" : str);
            }
        }

    }

    public static Long enterLong(){
        Scanner scanner = new Scanner(System.in);
        Long num;
        while (true) {
           /* try {
                System.out.println("enter long: ");
                num = scanner.nextLong();
                return num;
            } catch (java.util.InputMismatchException e) {
                System.out.println("enter again: ");

            }*/

            if (scanner.hasNextLong()) {
                num = scanner.nextLong();
               return num;
            } else {
                System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
            }
        }
    }


  /*  public static String enterDate() {
        String date = null;
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {

                System.out.println("Enter date:");
                date = scanner.nextLine();

                if (date.matches("((19[6-9]\\d)|(^20\\d{2}))-(0[1-9]|(1[0-2]))-((0[1-9]$)|([1-2][0-9]$)|(3[0-1]$))")) break;
                else {
                    System.out.print("enter again, u entered: ");
                    System.out.println(date.isEmpty()? "nothing": date);
                }
            }
        } catch (NoSuchElementException e){
            e.printStackTrace();
        }

        return date;
    }
*/

  /*  public static Date enterDate(){
        String dateStr;
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {

                System.out.println("Enter date:");
                dateStr = scanner.next();


                if (dateStr.matches("((19[6-9]\\d)|(^20\\d{2}))-(0[1-9]|(1[0-2]))-((0[1-9]$)|([1-2][0-9]$)|(3[0-1]$))")) {
                    return Date.valueOf(dateStr);
                }
                else {
                    System.out.print("enter again, u entered: ");
                    System.out.println(dateStr.isEmpty()? "nothing": dateStr);
                }
            }
        } catch (NoSuchElementException e){
            e.printStackTrace();
        }

    }
*/
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Long v =  sc.nextLong();

        String m = enterStringWithRegex("Enter date:", "Enter again, u entered: ", "((19[6-9]\\d)|(^20\\d{2}))-(0[1-9]|(1[0-2]))-((0[1-9]$)|([1-2][0-9]$)|(3[0-1]$))");
        System.out.println(m);
         m = enterStringWithRegex("Enter mobile number:", "Enter again, u entered: ", "(^(\\+375|80)(29|33|44|25|17)\\d{7}$)");
        System.out.println(m);

        m = enterStringWithRegex("Enter address:", "Enter again, u entered: ", "^[a-zA-Z\\s]+[\\d]+[a-z]*$");
        System.out.println(m);

        m = enterStringWithRegex("Enter email:", "Enter again, u entered: ", "^[\\w\\-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
        System.out.println(m);



    }
}
