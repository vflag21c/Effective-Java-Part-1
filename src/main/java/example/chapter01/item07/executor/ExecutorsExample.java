package example.chapter01.item07.executor;

import java.util.concurrent.*;

public class ExecutorsExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        int cpu = Runtime.getRuntime().availableProcessors();
        System.out.println("cpu = " + cpu);

        ExecutorService service = Executors.newFixedThreadPool(10);
        Future<String> submit = service.submit(new Task());

//        for (int i = 0; i < 100; i++) {
//            service.submit(new Task()); // blocking queue
//        }

//        Thread thread = new Thread(new Task());
//        thread.start();

        System.out.println(Thread.currentThread() + "hello");

        System.out.println("submit.get() = " + submit.get());
        service.shutdown();
    }

    private static class Task implements Callable<String> {
        @Override
        public String call() throws Exception {
            Thread.sleep(2000L);
            return Thread.currentThread() + "world";
        }
    }

//    private static class Task implements Runnable {
//        @Override
//        public void run() {
//            try {
//                Thread.sleep(2000L);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.println(Thread.currentThread() + "world");
//        }
//    }
}
