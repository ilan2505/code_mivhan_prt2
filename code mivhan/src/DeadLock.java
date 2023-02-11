public class DeadLock {
    public static Thread t1, t2;

    public static void main(String[] args) {
        final Object resource1 = new Object();
        final Object resource2 = new Object();
// t1 tries to lock resource1 then resource2
        t1 = new Thread(() -> {
            // Lock resource 1
            synchronized (resource1) {
                System.out.println("Thread1:locked resource 1");
                synchronized (resource2) {
                    System.out.println("Thread1:locked resource 2");
                }
            }
            System.out.println("t1 DONE!");
        });

// t2 tries to lock resource2 then resource1
        t2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread 2: locked resource 2");
                synchronized (resource1) {
                    System.out.println("Thread 2: locked resource 1");
                }
            }
            System.out.println("t2 DONE!");
        });

        t1.start();
        t2.start();
    }
}