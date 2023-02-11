public class Calc3 implements CalcInterface{
    @Override
    public Double pow(int num1,int num2) {
        double result = 1;
        for (int i = 0; i < num2; i++) {
            result *= num1;
        }
        System.out.println(result);
        return result;
    }
}
