package example.chapter01.item06;

public class Sum {
    private static long sum() {
        // Long을 long으로 변경하여 실행
        long sum = 0L;
        for (long i = 0; i <= Integer.MAX_VALUE; i++)
            sum += i;
        return sum;
    }

    public static void main(String[] args) {
        long start = System.nanoTime();
        long x = sum();
        long end = System.nanoTime();
        System.out.println((end - start) / 1_000_000. + " ms.");
        System.out.println(x);
    }
}
