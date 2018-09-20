public class mathMethods {
    public static void main(String[] args) {

        double a=1, b=6, c=-16, square, minusAnswer, plusAnswer;

        square=(Math.pow(b,2))-(4*a)*c;

        minusAnswer=((b*-1)-square)/(2*a);
        plusAnswer=((b*-1)+square)/(2*a);

        System.out.println(minusAnswer+"\n"+plusAnswer);
    }
}
