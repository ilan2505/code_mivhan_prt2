public class Calc2 implements CalcInterface{
    @Override
    public Double pow(int num1,int num2) {
        double result = Math.pow(num1, num2);
        System.out.println(result);
        return result;
    }
}
