package Zada4a1;

import java.sql.Array;
import java.util.Scanner;

public class Homework8Zada4a1Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please insert first number:");
        Double input1 = Double.valueOf(reader.nextLine());
        System.out.println("Your first nuber is: "+input1);
        System.out.println("Please insert second number:");
        Double input2 = Double.valueOf(reader.nextLine());
        System.out.println("Your second nuber is: "+input2);
        TwoNumbersDistans inputTwoNumber = new TwoNumbersDistans(input1,input2);
        Double distans1 = inputTwoNumber.getDistans(input1);
        Double distans2 = inputTwoNumber.getDistans(input2);
        Double[] minDistans = inputTwoNumber.minDistans(distans1,distans2);
        inputTwoNumber.printResult(distans1,distans2,minDistans);
        // with Arroy
        System.out.println("Please insert first number:");
        Double[] kundenInputArroy = new Double[7];
        kundenInputArroy[0] = reader.nextDouble();
        System.out.println("Your first nuber is: "+kundenInputArroy[0]);
        System.out.println("Please insert second number:");
        kundenInputArroy[2] = reader.nextDouble();
        System.out.println("Your second nuber is: "+kundenInputArroy[2]);
        System.out.println("Please insert center point number:");
        kundenInputArroy[6] = reader.nextDouble();
        System.out.println("The center point point is: "+kundenInputArroy[6]);
        TwoNumberDistansArray kundenTwoNumberDistansArroy = new TwoNumberDistansArray(kundenInputArroy);
        kundenTwoNumberDistansArroy.getDistansArroy(kundenInputArroy,0);
        kundenTwoNumberDistansArroy.getDistansArroy(kundenInputArroy,2);
        kundenTwoNumberDistansArroy.getMinDistans(kundenInputArroy);
        kundenTwoNumberDistansArroy.printResultArray(kundenInputArroy);
    }

}
