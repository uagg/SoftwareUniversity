import java.util.Scanner;

public class Pr04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lectures = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());
        String lecturers = null;
        double paycheck = budget / lectures;
        int jelevCount = 0;
        int royalCount = 0;
        int roliCount = 0;
        int trofonCount = 0;
        int sinoCount = 0;
        int otherSalaryCount = 0;
        for (int i = 0; i < lectures; i++) {
            lecturers = scanner.nextLine();

            switch(lecturers) {
                case "Jelev":
                    jelevCount++;
                    break;
                case "RoYaL":
                    royalCount++;
                    break;
                case "Roli":
                    roliCount++;
                    break;
                case "Trofon":
                    trofonCount++;
                    break;
                case "Sino":
                    sinoCount++;
                    break;
                default:
                    otherSalaryCount++;
                    break;
            }
        }
        System.out.printf("Jelev salary: %.2f lv\n", jelevCount * paycheck);
        System.out.printf("RoYaL salary: %.2f lv\n", royalCount * paycheck);
        System.out.printf("Roli salary: %.2f lv\n", roliCount * paycheck);
        System.out.printf("Trofon salary: %.2f lv\n", trofonCount * paycheck);
        System.out.printf("Sino salary: %.2f lv\n", sinoCount * paycheck);
        System.out.printf("Others salary: %.2f lv\n", otherSalaryCount * paycheck);
    }
}