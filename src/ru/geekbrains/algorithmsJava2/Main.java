package ru.geekbrains.algorithmsJava2;

public class Main {

    public static void main(String[] args) {
        Arr numbers = new Arr(10);

        for (int i = 0; i <numbers.getSize() ; i++) {
            numbers.setElement(i, (int) (Math.random() * 100));
        }
        numbers.info();
        numbers.setElement(1, 4);
        numbers.info();
        numbers.delete(4);
        numbers.info();
        numbers.findElemIndex(4);
    }
}
