package patern;

import java.util.Arrays;
import java.util.Random;

public class DrumKitTestDrive {
    public static void main(String[] args) {

        int[] array = new int[10];  // что тут происходит ?-создаем массив array в ктором 10 элементов

        for (int i = 0; i < array.length; i++){// что тут происходит ?-простой цикл для перебора массива
            array[i] = new Random().nextInt(100);// что тут происходит ?-каждый элемент массива будет записываться рандомным числом
            //что происходит в цикле-?-заполняется массив числами
        }
        System.out.print("Before sorting the array: " + Arrays.toString(array) + "\n");
        bubbleSort(array);  // что тут происходит ?-активируется метод bubbleSort который принимает значение intового массива
        System.out.println("After sorting the array: " + Arrays.toString(array));

    }

    public static void bubbleSort(int[] sortArr) { // что тут происходит ?- объявляется новый публичный статичный метод bubbleSoft который принимает значение intового массива
        for (int i = 0; i < sortArr.length; i++) {// что тут происходит ? -создается простой цикл для перебора массива
            for (int j = 0; j < sortArr.length - i - 1; j++) {// что тут происходит ?-создается второй цикл для сортировки массива
                if (sortArr[j] > sortArr[j + 1]) {// что тут происходит ? условие: если массив с индексом j больше того же массива с индексом j+1
                    int temp = sortArr[j];// что тут происходит ? то создается переменная темп и принимает в себя массив с индексом j
                    sortArr[j] = sortArr[j + 1];// что тут происходит ? массив с индексом j присваеват тот же массив с индексом j+1
                    sortArr[j + 1] = temp;// что тут происходит ? массив с индексом j+1 принимает переменную темп
                }
            }
        }
    }
}