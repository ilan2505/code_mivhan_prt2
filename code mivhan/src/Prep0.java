import java.util.concurrent.*;

public class Prep0 {
    public static void main(String[] args) {
        Runnable r1 = ()-> System.out.println(Thread.currentThread().getName());
        Thread thread = new Thread(r1);
        thread.run();
        thread.start();
        thread.start();
        thread.run();

        ConcreteSomething concrete = new ConcreteSomething();
        concrete.doSomething(80.5);

        MyInterface<Double,String> concrete2 = new MyInterface<Double, String>() {
            @Override
            public String doSomething(Double value) {
                return String.valueOf(value);
            }
        };

        concrete2.doSomething(80.5);

        MyInterface<Double,String> lambda = String::valueOf;

        BFunction<Double,Double,String> computation = (val1,val2)->{
            return String.valueOf(Math.pow(val1,val2));
        };

        var result = computation.doSomething(2.0,3.0);
        var result2 = result;
        System.out.println(result);

        var queue = new PriorityBlockingQueue<Runnable>();
        PriorityBlockingQueue<Runnable> queue2 = new PriorityBlockingQueue<>();
//        queue2 = new LinkedBlockingQueue<>() not possible
        BlockingQueue<Runnable> queue3 = new PriorityBlockingQueue<>();
        queue3 = new LinkedBlockingQueue<>();


        Liskov l1 = new liskovConcrete();
        l1 = new Liskov() {
            @Override
            public void doSomething() {

            }
        };
//        l1.doSomething2();

        ExecutorService threadPool1 = Executors.newFixedThreadPool(3);
    }
}
