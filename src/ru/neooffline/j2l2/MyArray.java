package ru.neooffline.j2l2;

public class MyArray {
    private String[][] myArray;
    public MyArray(){
        this.myArray = new String[4][4];
    }
    public void getArray(String[][] strArray){
        try{
            for (int i = 0; i < strArray.length; i++) {
                for (int j = 0; j < strArray.length; j++) {
                    this.myArray[i][j] = strArray[i][j];
                }
            }
        } catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Ошибка длина не та");
        }
    }
    public void printArray(){
        for (int i = 0; i < 4; i++) {
            for (int j = 0;  j< 4 ; j++) {
                System.out.printf("%s | ",this.myArray[i][j]);
            }
            System.out.println();
        }
    }
}
