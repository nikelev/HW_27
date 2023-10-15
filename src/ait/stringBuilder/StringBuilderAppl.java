package ait.stringBuilder;

public class StringBuilderAppl {
    public static void main(String[] args) {
        String str = new String("Java");
        str += 11;
        System.out.println(str);
        System.out.println("==================StringBuilder================");

        StringBuilder builder = new StringBuilder("Java");
        builder.append(11);
        System.out.println(builder);
        System.out.println("================================================");

        str = arrayConcat(new String[]{"one", "two", "three", "four", "five"});
        System.out.println(str);
        System.out.println("================================================");

        str = arrayConcatAdvanced(new String[]{"one", "two", "three", "four", "five"});
        System.out.println(str);

        System.out.println("========================HW_27==========================");
        String qwe="qwerty";
        System.out.println(HW_27.reverseStringBuilder(qwe));
        System.out.println(HW_27.reverseString(qwe));
    }

    public static String arrayConcat(String[] arr) {
        String res = " ";
        for (int i = 0; i < arr.length - 1; i++) {
            res = res + arr[i] + " => ";
            System.out.println(res);

        }
        res = res + arr[arr.length - 1];
        return res;
    }

    public static String arrayConcatAdvanced(String[] arr) {
        StringBuilder res= new StringBuilder("");
        for (int i = 0; i < arr.length - 1; i++) {
           res.append(arr[i]).append("=>");
            //System.out.println(res);

        }
        res.append(arr[arr.length-1]);
        return res.toString();
    }
}
