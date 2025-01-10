package exceptionsTasks;

import java.util.Scanner;

public class AgeStatistics {
    public static void main(String[] args) {
        int[] arr = new int[50];
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("Input ages:");

        for (int i = 0; i < 50; i++) {
            String str = sc.nextLine();
            if (str.equalsIgnoreCase("stop") || str.equalsIgnoreCase("exit")) {
                break;
            }
            try {
                arr[i] = Integer.parseInt(str);
                checkNum(arr[i]);
                count++;
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid input,please enter integer");
                i--;
            } catch (IllegalArgumentException | ArithmeticException iae) {
                System.out.println(iae.getMessage());
                i--;
            }
        }
        int[] ages = new int[count];
        System.arraycopy(arr, 0, ages, 0, count);
        detailsAges(ages);
        getStatistics(ages,count);

    }


    public static void checkNum(int a) {
        if (a > 200) {
            throw new ArithmeticException("Age is too large,try again(age<200)!");
        }
        if (a < 0) {
            throw new IllegalArgumentException("Age can not be negative,try again");
        }
    }

    public static long fact(int a) {
        long fact = 1;

        for (int i = 2; i <= a; i++) {
            try {
                fact *= i;
                if (fact > Long.MAX_VALUE / i) {
                    throw new ArithmeticException("Factorial limit is over");
                }
            } catch (ArithmeticException ae) {
                System.out.println(ae.getMessage());
                return -1;
            }
        }
        return fact;
    }

    public static void detailsAges(int[] ages) {
        System.out.println("\nDetails for each age:");
        for (int age : ages) {
            System.out.println("Age:" + age + "=>Factorial: " + fact(age) + ", " + evenOrOdd(age));
        }
    }

    public static String evenOrOdd(int a) {
        if (a % 2 == 0) {
            return "Even";
        } else if (a % 2 == 1) {
            return "Odd";
        } else {
            return "Zero";
        }
    }

    public static void getStatistics(int[] ages, int count) {
        System.out.println("\nStatistical Summary:");
        System.out.println("Total number of people:" + count);
        System.out.println("Sum of ages:" + sum(ages));
        System.out.println("Average of ages:" + sum(ages) / count);
        ageGroup(ages);
    }

    public static int sum(int[] ages) {
        int sum = 0;
        for (int num : ages) {
            sum += num;
        }
        return sum;
    }

    public static void ageGroup(int[] ages) {

        int childCount = 0, teenagerCounter = 0, adultCount = 0, seniorCount = 0;
        for (int age : ages) {
            if (age >= 0 && age <= 12) {
                childCount++;
            } else if (age >= 13 && age <= 19) {
                teenagerCounter++;
            } else if (age >= 20 && age <= 64) {
                adultCount++;
            } else {
                seniorCount++;
            }
        }
        System.out.println("Children:" + childCount + " person");
        System.out.println("Teenager:" + teenagerCounter + " person");
        System.out.println("Adult:" + adultCount + " person");
        System.out.println("Senior:" + seniorCount + " person");
    }


}
