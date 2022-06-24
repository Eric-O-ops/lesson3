import java.util.Arrays;

public class Main {
    public static double generateRandomNum () {

        return  Math.random() * 10 - 5;// num from -5 to 5
    }

    public static void main(String[] args) {

        // Fill array random num

        double[] array = new double[15];
        int lengthArray = array.length;

        for (int i = 0; i < lengthArray - 1; i++) {

            array[i] = generateRandomNum();

        }

        System.out.println(Arrays.toString(array) + "\n");

        // Average num
        double sumAllNum = 0;
        double amountOfNum = 0;
        boolean key = false;

        for (double readerArray: array) {

            if (readerArray < 0){
                key = true;

            } else if (readerArray > 0 && key) {
                sumAllNum += readerArray;
                amountOfNum++;

            }
        }

        // wright out average

        if ( sumAllNum > 0) {

            double average = sumAllNum / amountOfNum;

            System.out.println("Среднее число = " + average + "\n");

        } else {

            System.out.println("Нет положительных чисел после отрицательного числа" + "\n");
        }

        // Additional task sortBobble
        boolean statusSort = false;
        int c = 0;
        double tmp;

        while (!statusSort){
            statusSort = true;
            c++;
            for (int i = 0; i < array.length - 1 ; i++) {
                if (array[i] > array[i+1]) {

                    statusSort = false;
                    tmp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = tmp;

                }
            }
            System.out.println( c + " - " +Arrays.toString(array));

        }
        System.out.println("\n" + "Итог сортировки = " + Arrays.toString(array));



        }

}


