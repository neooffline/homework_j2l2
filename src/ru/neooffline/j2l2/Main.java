package ru.neooffline.j2l2;

public class Main {

    public static void main(String[] args) {
        String[][] arr = {
                {"44","22","42","olo"},
                {"44","44","44","33"},
                {"44","44","44","33"},
                {"44","44","44","33"}};
        MyArray myArray = new MyArray();
        myArray.getArray(arr);
        myArray.printArray();
    }
}
