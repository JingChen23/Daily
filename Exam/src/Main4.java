import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfCase = in.nextInt();
        int caseNum = 0;
        while (caseNum < numberOfCase){
            int year = in.nextInt();
            int month = in.nextInt();
            int day = in.nextInt();
            int month1 = in.nextInt();
            int day1 = in.nextInt();

            int[] days = {0,31,28,31,30,31,30,31,31,30,31,30,31};

            int result = 0;

            if (month1 == month && day1 > day){
                result += day1 - day;
            }
            if (month1 > month) {

                for (int i = month+1; i < month1 ; i++){
                    result += days[i];
                }
                result += days[month] - day;
                result += day1;
            }
            if (month1 < month || month1 == month && day1 < day){
                for (int i = month+1; i < days.length; i++){
                    result += days[i];
                }
                for (int i = 0; i < month1; i++){
                    result += days[i];
                }
                result += days[month] - day;
                result += day1;
            }

            if (year%4 == 0){
                if (month <= 2) {
                    if (month1 > 2 || month1 == month && day > day1) result++;
                }
            }

            if ((year+1)%4 == 0){
                if (month1 > 2){
                    if(month > month1 || month == month1 && day > day1) result++;
                }
            }

            System.out.println(result);
            caseNum++;
        }
    }
}
