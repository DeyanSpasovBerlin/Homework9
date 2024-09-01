package Zada4a3;

public class Zada4a3Main {
    public static void main(String[] args) {
        System.out.println();

        Workers allWorkers[];
        allWorkers = new Workers[10];

        System.out.println("Number\tName\tHourli rate\tWorking hour\tRegulartime pay\tOvertime pay\tTotal pay");
        for (int i= 0; i < 10; i++){
            allWorkers[i] = new Workers();
            allWorkers[i].rateAndHoursSet(i);
        }

    }
}
