package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int[] result = new int[2];
        int i = 0;
        int j = 1;
        while (j < array.length) {
            if (array[i] + array[j] == target) {
                result[0] = i;
                result[1] = j;
                break;
            }
            if ((j == array.length - 1) && (i + 1 < array.length)) {
                i++;
                j = 1;
            } else {
                j++;
            }

        }

        if (result[0] == 0 && result[1] == 0) {
            return new int[]{};
        } else {
            return result;
        }

    }
}
