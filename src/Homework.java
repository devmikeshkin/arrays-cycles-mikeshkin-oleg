import java.util.Arrays;

public class Homework {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        int[] numbersOdd = new int[15];
        for (int i = 0, n = 1; i < numbersOdd.length; i++, n += 2) {
            numbersOdd[i] = n;
        }
        for (int i = 0; i < numbersOdd.length; i++) {
            System.out.print(numbersOdd[i] + " ");
        }
        System.out.println();
        for (int i = numbersOdd.length - 1; i >= 0; i--) {
            System.out.print(numbersOdd[i] + " ");
        }
        System.out.println();
        System.out.println();

        System.out.println("Задача 2");
        int[] numbersEven = new int[12];
        int i = 0;
        int n = 2;
        while (n < 25) {
            numbersEven[i] = n;
            i++;
            n += 2;
        }
        for (i = 0; i < numbersEven.length; i++) {
            System.out.print(numbersEven[i] + " ");
        }
        System.out.println();
        for (i = 0; i < numbersEven.length; i++) {
            System.out.println(numbersEven[i]);
        }
        System.out.println();

        System.out.println("Задача  3");
        double[] oneHundredNumbers = new double[100];
        for (i = 0; i < oneHundredNumbers.length; i++) {
            oneHundredNumbers[i] = Math.random();
        }
        double max = 0;
        double min = 1;
        double mean = 0;
        for (i = 0; i < oneHundredNumbers.length; i++) {
            if (oneHundredNumbers[i] > max)
                max = oneHundredNumbers[i];
        }
        System.out.println("Максимальное значение " + max);
        for (i = 0; i < oneHundredNumbers.length; i++) {
            if (oneHundredNumbers[i] < min)
                min = oneHundredNumbers[i];
        }
        System.out.println("Минимальное значение " + min);
        for (i = 0; i < oneHundredNumbers.length; i++) {
            mean += oneHundredNumbers[i];
        }
        System.out.println("Среднее значение " + (mean / oneHundredNumbers.length));
        System.out.println();

        System.out.println("Задача 4");
        int a = 1;
        int b;
        do {
            b = a % 5;
            if (b == 0) {
                System.out.println(a);
            }
            a++;
        }
        while (a <= 100);
        System.out.println();

        System.out.println("Задача 5");
        int[] bin = {0, 1, 0, 0, 1, 1, 0, 0, 0, 0, 1};
        for (i = 0; i < bin.length; i++) {
            if (bin[i] == 0) {
                bin[i] = 1;
            } else {
                bin[i] = 0;
            }
        }
        System.out.println(Arrays.toString(bin));
        System.out.println();

        System.out.println("Задача 6");
        int[][] square = new int[3][3];
        for (i = 0; i < square.length; i++){
        if (i==0) {
            square[i][0] =1;
            square[i][square.length-1] =1;
        }
        else if (i==1){
            square[i][1] =1;
            }
        else if (i==2){
            square[i][0]= 1;
            square[i][square.length-1]=1;
            }
        }
        System.out.println(Arrays.toString(square[0]));
        System.out.println(Arrays.toString(square[1]));
        System.out.println(Arrays.toString(square[2]));
    }

}