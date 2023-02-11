
@FunctionalInterface
public interface MyInterface<T,R> {
    public abstract R doSomething(T value);
    public static void doSomethingElse(String msg){
        System.out.println("Echo: " + msg);
    }

}
