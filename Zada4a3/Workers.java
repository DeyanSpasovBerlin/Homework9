package Zada4a3;

import java.util.Random;

public class Workers {
    private String workersName[] = {"Боян", "Огнян", "Стоян", "Иван", "Драган", "Петкан", "Николай", "Павел", "Стефан", "Добромир"};
    private Integer workersHour;
    private Double workersRate;
    private Double regularHoursSalary;
    private Double overtimeHoursSalary;
    private Double totalSalary;
    Random randNum = new Random();
    public void rateAndHoursSet(int j) {
        workersHour = randNum.nextInt(0, 60);
        workersRate = randNum.nextDouble(8, 25);
        workersRate = Math.round(workersRate * 100.0) / 100.0;
        if (workersHour <= 40) {
            regularHoursSalary = Math.round(workersHour * workersRate * 100.0) / 100.0;
            overtimeHoursSalary = 0.0;
            totalSalary = regularHoursSalary;
        } else {
            regularHoursSalary = 40 * workersRate;
            overtimeHoursSalary = (60 - workersHour) * workersRate;
            overtimeHoursSalary = Math.round(overtimeHoursSalary*100.0)/100.0;
            totalSalary = regularHoursSalary + overtimeHoursSalary;
        }
        System.out.println(j + " " + workersName[j] + "\t" + workersRate + "\t" + workersHour + "\t" + regularHoursSalary + "\t" + overtimeHoursSalary + "\t" + totalSalary);
    }
}
