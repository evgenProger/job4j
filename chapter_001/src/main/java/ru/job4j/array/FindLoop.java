package ru.job4j.array;

public class FindLoop {
    public int indexOf(int[] date, int e1) {
        int rst = -1;
        for (int index = 0; index < date.length; index++) {
            if (date[index] == e1) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1;
        for (int i = start; i < finish; i++) {
            if (data[i] == el) {
                rst = i;
                break;
            }

        }
        return rst;
    }
}



