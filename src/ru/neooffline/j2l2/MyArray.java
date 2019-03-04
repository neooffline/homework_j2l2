package ru.neooffline.j2l2;

import java.util.InputMismatchException;

public class MyArray extends Exception{
    private final int ARRAYLENGHT = 4;
    private boolean emptyArray;
    private int[][] myArray;
    public MyArray(){
        this.myArray = new int[ARRAYLENGHT][ARRAYLENGHT];
        this.emptyArray = true;
    }
    public void getArray(String[][] strArray){
        try{
            for (int i = 0; i < strArray.length; i++) {
                for (int j = 0; j < strArray[i].length; j++) {
                    try {
                        this.myArray[i][j] = Integer.parseInt(strArray[i][j]);
                        this.emptyArray = false;
                    } catch (NumberFormatException ex){
                        ex.printStackTrace();
                        this.emptyArray = true;
                    }
                }
            }
            this.emptyArray = false;
        } catch (ArrayIndexOutOfBoundsException ex){
            this.emptyArray = true;
            System.out.println("Ошибка длина не та");
            ex.printStackTrace();
        }
    }

    public void printArray(){
        for (int i = 0; i < this.myArray.length; i++) {
            for (int j = 0;  j< this.myArray[i].length ; j++) {
            if(!emptyArray){
                System.out.printf("%s | ",this.myArray[i][j]);}
        }
            if(!emptyArray)
            System.out.println();
        }
    }

}
