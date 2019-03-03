package ru.neooffline.j2l2;

public class Main {

    public static void main(String[] args) {
        String[][] arr = {{"4","2","4","40","55"},{"44","44","44","40","55"}};
        MyArray myArray = new MyArray();
        myArray.getArray(arr);
        myArray.printArray();
    }
}
