package ru.job4j.array;

public class Turn {

    /**
     * Метод переворачмвает массив
     * @param array принимает входящий массив
     * @return возвращает перевернутый массив
     */

    public int[] back(int[] array) {
        int tmp = 0;
        for (int index = 0; index < array.length / 2; index++) {
            tmp = array[index];
            array[index] = array[array.length - index - 1];
            array[array.length - index - 1] = tmp;
        }




        return array;
    }

}

