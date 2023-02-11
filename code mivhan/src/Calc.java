public class Calc implements CalcInterface{
    CalcInterface strategy;

    public void setStrategy(CalcInterface powStrategy){
        strategy = powStrategy;
    }

    @Override
    public Double pow(int num1,int num2){
        if (strategy!=null){
            return strategy.pow(num1,num2);
        }
        return null;
    }

    public static void main(String[] args) {
        Calc myCalc = new Calc();
        myCalc.setStrategy((num1,num2)->{
            double result = Math.pow(num1,num2);
            System.out.println(result);
            return result;
        });
        myCalc.pow(2,3);

        myCalc.setStrategy((num1,num2)->{
            double result = 1;
            for (int i = 0; i < num2; i++) {
                result *= num1;
            }
            System.out.println(result);
            return result;
        });

        myCalc.pow(2,3);
        myCalc.setStrategy(new Calc2());
        myCalc.pow(2,3);
    }




    /*
    עליכם לממש את המתודה כך שהתוצאה שתוחזר תהיה החזקה
     כאשר num2 הוא המעריך:
     1. גרסה אחת - התוצאה תודפס והחישוב יעשה באמצעות Math.pow
    2. התוצאה תודפס אך תחושב על-ידי אופרטור *
    3. התוצאה תוחזר והפעולה תתבצע במסגרת thread נפרד
    עליכם לממש מחלקות/מתודות/כל טיפוס
    שתרצו כך שניתן יהיה לממש את הדרישות
     */
}
