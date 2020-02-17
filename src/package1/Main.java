package package1;

import package1.LinkedStack;
import javax.swing.*;

public class Main{
    static LinkedStack<String> getPalindromicDate(int year){
        //build the palindromic date and push the year, day, month onto a stack
        //example 2021 -> 12/02/2021


        String str = String.valueOf(year);


        String rev = reverse(str);

        int day = Integer.parseInt(rev.substring(0, 2));
        int month = Integer.parseInt(rev.substring(2, 2 + 2));

        String combined = rev + str;


        LinkedStack<String> date = new LinkedStack<>();

        String month1 = combined.substring(0,2);

        String day1 = combined.substring(2, 4);

        String year1 = combined.substring(4, 8);

        boolean isValid = isValidDate(Integer.parseInt(day1), Integer.parseInt(month1), Integer.parseInt(year1));

        if (isValid) {
            date.push(day1);
            date.push(month1);
            date.push(year1);

            System.out.println("Palindromic date: ");
            System.out.println(combined);
        }


        return date;
    }



    public static boolean isLeap(int year)
    {
        return (((year % 4 == 0) &&
                (year % 100 != 0)) ||
                (year % 400 == 0));
    }

    public static boolean isValidDate(int d, int m, int y)
    {
        int MAX_VALID_YR = 9999;
        int MIN_VALID_YR = 1800;

        if (y > MAX_VALID_YR ||
                y < MIN_VALID_YR)
            return false;
        if (m < 1 || m > 12)
            return false;
        if (d < 1 || d > 31)
            return false;

        if (m == 2)
        {
            if (isLeap(y))
                return (d <= 29);
            else
                return (d <= 28);
        }

        if (m == 4 || m == 6 ||
                m == 9 || m == 11)
            return (d <= 30);

        return true;
    }


    static String reverse(String input)
    {
        char[] a = input.toCharArray();
        int l, r = a.length - 1;
        for (l = 0; l < r; l++, r--)
        {
            char temp = a[l];
            a[l] = a[r];
            a[r] = temp;
        }
        return String.valueOf(a);
    }
    public static void main(String[] args) throws Exception {
        String year = JOptionPane.showInputDialog("What year do you want to try?");
        int yearInteger = Integer.parseInt(year);


        LinkedStack<String> date = getPalindromicDate(yearInteger);
        if (!date.isEmpty()) {
            String yr = date.top();
            date.pop();
            String day = date.top();
            date.pop();
            String month = date.top();
            date.pop();
                System.out.println(day + "/" + month + "/" + yr);
            }

        else {
                System.out.println("There is no palindromic date for this year");

            }

    }
}