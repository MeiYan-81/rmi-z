package com.ps;

public  class F {

    public static void main(String[] args) {
        int [] arr = {23,12,45,223,24,565,56,2,54,4};

        
        int i, j;
        for (i = 1; i < arr.length; i++) {
            int temp = arr[i];
            System.out.println("temp: "+temp);
            for (j = i; j > 0 && temp < arr[j - 1]; j--) {
                System.out.println("j: "+arr[j-1]);
                arr[j] = arr[j - 1];
            }
            arr[j] = temp;
        }

    }

    public void s(){

    }
    private void w(){

    }

    protected  void s1(){

    }

    void h(){

    }
}
