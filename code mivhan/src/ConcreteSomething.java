public class ConcreteSomething implements MyInterface<Double,String>{
    @Override
    public String doSomething(Double value) {
        return String.valueOf(value);
    }
}
