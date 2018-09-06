package ru.geekbrains.algorithmsJava2;

public class Arr {
    private int array[];
    private int size;
    public Arr (int size) {
        this.size = size;
        this.array = new int[size];
    }
    public void setElement(int index, int elem){
        this.array[index] = elem;
    }
    public void info () {
        for (int i = 0; i <this.size ; i++) {
            System.out.print(this.array[i] + " ");
            if (i==4) System.out.print("\n");
        }
        System.out.println();
        System.out.println(" ");
    }
    public void delete (int value) {
        int i;
        for (i=0; i <this.size ; i++) {
            if (this.array[i] == value) {
                break;
            }
        }
        for (int j = i; j<this.size;j++) {
            this.array[j] = this.array[j+1];
        }
        this.size--;
    }
    public void findElemIndex (int value) {
        int low = 0;
        int high = this.size-1;
        int mid;
        while(low<high){
            mid = (low+high)/2;
            if (value == this.array[mid]){
                System.out.println("Индекс искомого элемента: " + mid);
                return;
            }
            else {
                if (value < this.array[mid]){
                    high = mid;
                } else {
                    low = mid+1;
                }
            }
        }
        System.out.println ("Такого элемента нет в массиве");

    }

    public int getSize() {
        return size;
    }
}
