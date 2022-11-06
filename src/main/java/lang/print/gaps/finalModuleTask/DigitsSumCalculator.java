package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int t=number/1000;
        int h=number/100;
        h=h%10;
        int d=number/10;
        d=d%10;
        int g=number%10;
        int sum=t+h+d+g;

        System.out.println(sum);
    }
}
