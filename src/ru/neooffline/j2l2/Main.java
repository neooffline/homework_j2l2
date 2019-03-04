package ru.neooffline.j2l2;

public class Main {

    public static void main(String[] args) {
        String[][] arr = {
                {"2","11","11","11"},
                {"22","22","22","22"},
                {"33","33","dsd","33"},
                {"44","44","44","44"}};
        String[][] arr2 = {
                {"2","11","11","11","11"},
                {"22","22","22","22"},
                {"33","33","33","33"},
                {"44","44","44","44"}};
        MyArraySum myArraySum = new MyArraySum();
        System.out.printf("Сумма элементов массива = %d\n",myArraySum.getSum(arr2));
        System.out.printf("Сумма элементов массива = %d\n",myArraySum.getSum(arr));
    }
}
