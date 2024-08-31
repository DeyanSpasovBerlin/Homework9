package Zada4a1;

public class TwoNumberDistansArray {
private Double[] twoNumberArroy = new Double[7];
    private Double num1Arr;
    private Double num2Arr;
public  TwoNumberDistansArray(Double[] twoNumberArray){
}

    /**
     * Eтдт метод возврощает моду разстояния между первое число и центральной точки
     * @param twoNumberArroyInt
     * @param flag
     * @return
     */

    public Double   getDistansArroy(Double[] twoNumberArroyInt, Integer flag){
        twoNumberArroyInt[(flag+1)] = Math.abs((twoNumberArroyInt[flag]-twoNumberArroyInt[6]));
        return twoNumberArroy[(flag+1)];
}

    /**
     * возвращает мешее по модул разстояние от двое чисел до центральной точки. Возвращает флаг 1 если ето модул от
     * пергого числа и флаг 3 если ето модуль от второго числа
     * @param twoNumberArroyInt
     * @return
     */

    public Double getMinDistans(Double[] twoNumberArroyInt){
        if(Math.min(twoNumberArroyInt[1],twoNumberArroyInt[3])==twoNumberArroyInt[1]){
            twoNumberArroyInt[4] = 1.0;
        }else {
            twoNumberArroyInt[4] = 3.0;
        }
        return twoNumberArroy[4];
    }

    /**
     * печатает первое, второе числа + центральную точки. Печатает модул двух разстояний до центральной точки.
     * Печатает минимальной модул и числа для етого модуля. ВНИМАНИЕ когда вводятся числа приходиться пользоваться
     * запятую на буквеной пад. Я пробовал добавить local.numberformat.decimalformat(.) но на моей клавиатуре ето не
     * работает.
     * @param twoNumberArroyInt
     */
    public void printResultArray(Double[] twoNumberArroyInt){
        System.out.println("First imput number is:"+twoNumberArroyInt[0]);
        System.out.println("Second imput number is:"+twoNumberArroyInt[2]);
        System.out.println("Distas between "+twoNumberArroyInt[6]+" and "+twoNumberArroyInt[0]+" is: "+twoNumberArroyInt[1]);
        System.out.println("Distas between "+twoNumberArroyInt[6]+" and "+twoNumberArroyInt[2]+" is: "+twoNumberArroyInt[3]);
        Integer index = twoNumberArroyInt[4].intValue();
        System.out.println(new StringBuilder().append("Closer distans is ").append(twoNumberArroyInt[index]).append(
                " and" +
                " this meen that ").append(twoNumberArroyInt[index-1]).append(" is closer ").append(twoNumberArroyInt[6]).toString());
    }
}
