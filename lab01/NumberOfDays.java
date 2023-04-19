import java.util.Scanner;
public class NumberOfDays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year, month, days;

        while (true) {
            // Get year input
            System.out.print("Enter a year: ");
            while (!input.hasNextInt()) {
                System.out.println("Invalid input. Please enter a non-negative integer for the year.");
                input.next();
            }
            year = input.nextInt();
            if (year < 0) {
                System.out.println("Invalid input. Please enter a non-negative integer for the year.");
                continue;
            }

            // Get month input
            System.out.print("Enter a month (1-12, full name, abbreviation, or 3-letter code): ");
            String monthString = input.next();
            switch (monthString.toLowerCase()) {
                case "january":
                case "jan":
                case "1":
                    month = 1;
                    break;
                case "february":
                case "feb":
                case "2":
                    month = 2;
                    break;
                case "march":
                case "mar":
                case "3":
                    month = 3;
                    break;
                case "april":
                case "apr":
                case "4":
                    month = 4;
                    break;
                case "may":
                case "5":
                    month = 5;
                    break;
                case "june":
                case "jun":
                case "6":
                    month = 6;
                    break;
                case "july":
                case "jul":
                case "7":
                    month = 7;
                    break;
                case "august":
                case "aug":
                case "8":
                    month = 8;
                    break;
                case "september":
                case "sep":
                case "9":
                    month = 9;
                    break;
                case "october":
                case "oct":
                case "10":
                    month = 10;
                    break;
                case "november":
                case "nov":
                case "11":
                    month = 11;
                    break;
                case "december":
                case "dec":
                case "12":
                    month = 12;
                    break;
                default:
                    System.out.println("Invalid input. Please enter a valid month.");
                    continue;
            }

            // Calculate number of days in month
            switch (month) {
                case 4:
                case 6:
                case 9:
                case 11:
                    days = 30;
                    break;
                case 2:
                    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                        days = 29;
                    } else {
                        days = 28;
                    }
                    break;
                default:
                    days = 31;
                    break;
            }

            // Display results
            System.out.println("There are " + days + " days in " + monthString + " " + year + ".");
            break;
        }
        input.close();
    }
}

