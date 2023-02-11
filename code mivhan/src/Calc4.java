import java.util.concurrent.*;

public class Calc4 {
    public double pow(int num1,int num2) {
        ExecutorService threadPoolWasted = Executors.newFixedThreadPool(1);
        Callable<Double> myComp = ()->{
            double result = Math.pow(num1, num2);
            System.out.println(result);
            return result;
        };
        Future<Double> futureCalc = threadPoolWasted.submit(myComp);
        Double result =null;
        try {
            result = futureCalc.get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
        threadPoolWasted.shutdown();
        return result;

    }

    public static void main(String[] args) {
        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(2,5,
                300,
                TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(10));

    }
}

