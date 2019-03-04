package ru.neooffline.j2l2;

public class MyArraySum extends Exception{
    private final int ARRAY_LENGTH = 4;
    private int sum;
    public MyArraySum(){
        this.sum = 0;
    }
    public int getSum(String[][] strArray){
        checkArray(strArray);
            for (int i = 0; i < strArray.length; i++) {
                for (int j = 0; j < strArray[i].length; j++) {
                    try {
                        sum += Integer.parseInt(strArray[i][j]);
                    } catch (NumberFormatException ex){
                        throw new MyArrayDataException("� ������: " + (i+1) +" - " + (j+1) + " ���������������� ��� ������");
                    }
                }
            }
            return sum;
    }

    private void checkArray(String[][] strArray){
        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].length != this.ARRAY_LENGTH){
                throw new MyArraySizeException("������ ����� �������");
            }
        }
    }

}
