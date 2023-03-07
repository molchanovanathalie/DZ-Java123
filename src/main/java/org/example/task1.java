//Задать одномерный массив и найти в нем минимальный и максимальный элементы

package org.example;

public class task1 {
    public static void main(String[] args) {
        int numbers[] = new int[]{0, 2, 5, 1, 4, 3, 11};
        int s = numbers[0];
        int l = numbers[0];

        for(int i = 1; i < numbers.length; i++) {
            if(numbers[i] > l)l = numbers[i];
            else if (numbers[i] < s)s = numbers[i];
        }
        System.out.println("Максимум: " + l);
        System.out.println("Минимум: " + s);
    }
}