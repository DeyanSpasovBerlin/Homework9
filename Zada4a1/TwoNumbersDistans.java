package Zada4a1;

import java.sql.Array;

public class TwoNumbersDistans {
    private Double num1;
    private Double num2;
    public TwoNumbersDistans(Double num1,Double num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public Double getDistans(Double num){
        Double distans = Math.abs(num -10);
        return distans;
    }
    public Double[] minDistans(Double distans1, Double distans2){
        Double numAndDistans[];
        numAndDistans = new Double[2];
        Double resMinDistans = Math.min(distans1,distans2);
        if(resMinDistans == distans1){
            numAndDistans[0] = distans1;
            numAndDistans[1] = resMinDistans;
            return numAndDistans;
        } else {
            numAndDistans[0] = distans2;
            numAndDistans[1] = resMinDistans;
            return numAndDistans;
        }
    }
    public void printResult(Double distans1,Double distans2,Double minDistans[]){
        System.out.println("First imput number is:"+num1);
        System.out.println("Second imput number is:"+num2);
        System.out.println("Distas between 10 and "+num1+" is: "+distans1);
        System.out.println("Distas between 10 and "+num2+" is: "+distans2);
        System.out.println(new StringBuilder().append("Closer distans is ").append(minDistans[1]).append("  ").append("").append("  ").append("").toString());
    }
}
