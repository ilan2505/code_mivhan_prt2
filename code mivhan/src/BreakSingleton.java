import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BreakSingleton {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Singleton instance = Singleton.getInstance();
        Constructor constructor = Singleton.getInstance().getClass().getDeclaredConstructor();
        Singleton instance2 = (Singleton) constructor.newInstance();
    }
}
