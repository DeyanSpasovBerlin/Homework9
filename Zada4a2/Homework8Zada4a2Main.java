package Zada4a2;

public class Homework8Zada4a2Main {
    public static void main(String[] args) {
        Clock humanClock = new Clock(){};
        Integer nowTime =humanClock.getRandomTimeSecond();
        System.out.println("Генерировано случайное число: "+nowTime);
        humanClock.printPassWork(nowTime);
        Integer timeToWork = humanClock.getRestTimeSecond(nowTime);
        humanClock.printRestTimeSecond(timeToWork);
    }
}
