package com.ps;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class erwe {

    public static void main(String[] args) {
        int[] i = {1,3,4,5,7,4,2,1,5,7,4,2,3};
        h3(i);
        h2(1,3,4,5,7,4,2,1,5,7,4,2,3);
        h2(i);
    }

    public static void h3(int[] i1){
        System.out.println("h3: "+Arrays.toString(i1));
    }

    public static void h2(int ...i2){
        System.out.println("h2: "+Arrays.toString(i2));
    }

    public static void h2(String ...i2){
        System.out.println("h2");
    }


    public static void mainCr(String[] args) {
        int[] arr= {4,2,67,3,68,9,6,7,8,1,5};
        int i,j,temp;
        for (i = 1;  i< arr.length; i++) {
            temp = arr[i];
            // 用for循环判断第二个数据是否比第一个数据要小，小的进入循环
            for (j = i;j>0 && temp < arr[j-1];j--){
                System.out.println("111111------i "+i +" j "+ j + " arr[j-1] "+ arr[j-1] +" temp "+ temp);
                arr[j] = arr[j-1];

                System.out.println(Arrays.toString(arr));
            }
            arr[j] = temp;
            System.out.println();
            System.out.println(Arrays.toString(arr));
            System.out.println();
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void mainXz(String[] args) {
        int[] arr= {4,2,67,3,68,9,6,7,8,1,5};
        int min,temp = 0;

        for (int i = 0; i < arr.length-1; i++) {
            min = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            if(min != i){
                System.out.println(arr[min]);
                temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }

        System.out.println(Arrays.toString(arr));


    }

    public static void mainPx(String[] args) {
        int[] arr= {4,2,67,3,68,9,6,7,8,1,5};
        int temp = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j <arr.length-1-i ; j++) {
                if(arr[j] > arr[j+1]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }

    public static void maina(String[] args) {
        String str1 = "通话";
        String str2 = "重地";
        String str3 = "童话";
        String str4 = "通话";
        String str5 = "说话";
        String str6 = "轷龚";

        Set set = new HashSet();
        set.add(str1);
        set.add(str3);
        set.add(str4);
        set.add(str5);
        set.add(str2);
        set.add(str6);
        System.out.println(set.toString());

        Iterator integer = set.iterator();
        while (integer.hasNext()){
            System.out.println(integer.next());
            System.out.println(integer.next().hashCode());

        }
        int i1 =2,i2=4;


    }

    public static void main2(String[] args) {
        String str1 = "通话";
        String str2 = "重地";
        int i = 1;
        int i1 = 2;
        float f = 3.2f;
        float f1 = 3.4f;
        System. out. println(String. format("str1：%d | str2：%d",  str1. hashCode(),str2. hashCode()));
        System. out. println(String. format("i：%d | i1：%d",  i,i1));
        System. out. println(String. format("f：%f | f1：%f",  f,f1));
        System. out. println(str1. equals(str2));
        System. out. println(str1. equals(str2));

        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder stringBuilder = new StringBuilder();
    }

    public static void main1(String[] args) {
//        List<dfs> list = new ArrayList<>();
//        dfs dfs = new dfs();
//        dfs.setAge(12);
//        dfs.setName("haha");
//        list.add(dfs);
//        dfs dfs1 = new dfs();
//        dfs1.setName("jskdfjdsl");
//        dfs1.setAge(34);
//        list.add(dfs1);

        String string = new String("哈哈");
        System.out.println(string);
//        for (dfs d: list) {
//            System.out.println(d.getAge() + " :jd: "+ d.getName());
//            System.out.println(d +" : "+ list);
//        }
    }
}
