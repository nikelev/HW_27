package ait.stringBuilder;

public  class HW_27 {

    public static String reverseString(String str){
        char []arr=str.toCharArray();
        String res="";
        for (int i = arr.length-1; i >=0 ; i--) {
            res+=arr[i];
        }return res;
    }

    public static String reverseStringBuilder(String str){
        return new  StringBuilder(str).reverse().toString();
    }

}
