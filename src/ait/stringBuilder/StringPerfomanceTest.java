package ait.stringBuilder;

public class StringPerfomanceTest {
    private static final int MAX_ITERATION = 100_000;
    private static final String WORD = "meow";

    public static void main(String[] args) {
        //String
        String str = "";
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < MAX_ITERATION; i++) {
            str = str + WORD;
        }
        long t2 = System.currentTimeMillis();
        System.out.println(t2 - t1);

        System.out.println("==============================");
        //StringBuilder
        StringBuilder builder = new StringBuilder("");
        t1 = System.currentTimeMillis();
        for (int i = 0; i < MAX_ITERATION; i++) {
            builder.append(WORD);

        }
        t2 = System.currentTimeMillis();
        str = builder.toString();
        System.out.println(t2 - t1);

        System.out.println("==============================");
        //StringBuffer
        StringBuffer buffer = new StringBuffer("");
        t1 = System.currentTimeMillis();
        for (int i = 0; i < MAX_ITERATION; i++) {
            buffer.append(WORD);

        }
        t2 = System.currentTimeMillis();
        str = buffer.toString();
        System.out.println(t2 - t1);
    }
}
