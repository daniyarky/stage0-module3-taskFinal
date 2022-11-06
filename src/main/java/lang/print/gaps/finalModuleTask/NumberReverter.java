package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int h=number/100;
        int d=number/10;
        d=d%10;
        int g=number%10;

        int res=100*g+10*d+h;
        System.out.println(res);


    }
}
