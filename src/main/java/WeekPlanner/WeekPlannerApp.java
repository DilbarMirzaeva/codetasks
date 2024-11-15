package WeekPlanner;

import java.util.Scanner;

public class WeekPlannerApp {
    public static void main(String[] args) {
        String[][] schedule = new String[7][2];
        schedule[0][0] = "Sunday";
        schedule[0][1] = "do home work";

        schedule[1][0] = "Monday";
        schedule[1][1] = "go to courses; watch a film";

        schedule[2][0] = "Tuesday";
        schedule[2][1] = "go shopping";

        schedule[3][0] = "Wednesday";
        schedule[3][1] = "read a book";

        schedule[4][0] = "Thursday";
        schedule[4][1] = "exercise";

        schedule[5][0] = "Friday";
        schedule[5][1] = "clean the house";

        schedule[6][0] = "Saturday";
        schedule[6][1] = "spend time with family";

        Scanner sc=new Scanner(System.in);
        String week;
        while(true){
            System.out.print("Please, input the day of the week:");
            if(sc.hasNextLine()){
                week=sc.nextLine();
                boolean b=false;

                if(week.equals("exit")){
                    System.out.println("EXIT the program");
                    break;
                }

                for (int i = 0; i < schedule.length; i++) {

                    if (week.equalsIgnoreCase(schedule[i][0])) {
                            System.out.println("Your tasks for " +week +":"+schedule[i][1]);
                            b=true;
                            break;
                        }

                        else if(week.startsWith("change")) {
                            String day = week.substring(6).trim();
                        if (day.equalsIgnoreCase(schedule[i][0])) {
                            System.out.println("Please, input new tasks for " + day);
                            schedule[i][1] = sc.nextLine();
                            b = true;
                            break;
                        }
                        }
                }
                if (!b) {
                    System.out.println("Sorry, I don't understand you, please try again.");
                }
            }
        }
    }
}
