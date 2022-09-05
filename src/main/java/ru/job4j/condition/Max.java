package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static void main(String[] args) {
        int result = Max.max(3, 5);
        System.out.println(result);
        result = Max.max(8, 6);
        System.out.println(result);
        result = Max.max(3, 3);
        System.out.println(result);
    }
}
