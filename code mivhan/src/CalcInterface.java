@FunctionalInterface
public interface CalcInterface {
    public abstract Double pow(int num1,int num2);
    public default void print100(){
        System.out.println("I am getting an A!");
    }
}
