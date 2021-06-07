import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Kieran Jimenez
 */
/*
 *           "Numbers to Names" output
 * Please enter the number of the month: 3
 * The name of the month is March.
 */
public class App
{
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {

        System.out.print("Please enter the number of the month: ");
        int monthNum = in.nextInt();

        String monthName = switch (monthNum) {
            case 1 -> "January.";
            case 2 -> "February.";
            case 3 -> "March.";
            case 4 -> "April.";
            case 5 -> "May.";
            case 6 -> "June.";
            case 7 -> "July.";
            case 8 -> "August.";
            case 9 -> "September.";
            case 10 -> "October.";
            case 11 -> "November.";
            case 12 -> "December.";
            default -> "Wrong.";
        };

        System.out.println("The name of the month is " + monthName);
    }

}