package Zada4a2;

import java.util.Random;

public class Clock {
    private Integer timeSecond;
    private Integer randomTimeSecond;
    public Clock(){};
    public Clock(Integer timeSecond,Integer randomTimeSecond){
        this.timeSecond = timeSecond;
        this.randomTimeSecond = randomTimeSecond;
    }
    public Integer getRandomTimeSecond() {
        Random pickRandomTimeSecond = new Random();
        randomTimeSecond =  pickRandomTimeSecond.nextInt(0,28800);
        return randomTimeSecond;
    }
    public Integer getRestTimeSecond(Integer nowTimeSecond){
        Integer restTimeSecond = 28800 - nowTimeSecond;
        return restTimeSecond;
    }
    public void printRestTimeSecond(Integer timeToWorkSecond){
        System.out.println("До конца рабочего дня остаютьсяМ "+timeToWorkSecond+" секунды.");
        switch ((timeToWorkSecond/3600)){
            case 0:
                System.out.println("Ето означает, что до конца рабочего дня остаeться меньше одного часа часа");
                break;
            default:
                System.out.println("Ето означает, что до конца рабочего дня остаються: "+(timeToWorkSecond/3600)+" часа "+(timeToWorkSecond%3600)/60+" минуты.");
        }
    }
    public void printPassWork(Integer passTime){
        System.out.println("От начала рабочего дня прошли "+passTime+" секунды");
        System.out.println("Ето означает, что от начало рабочего дня прошли "+(passTime/3600)+" часа и "+(passTime%3600)/60+" минуты.");
    }
}
