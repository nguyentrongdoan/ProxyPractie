import com.code.MathCalculator;
import com.code.MathCalculatorProxy;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        MathCalculatorProxy proxy = new MathCalculatorProxy();
//        double result = proxy.add(1,2);
//        System.out.println("1+2 = " + result);
//        result = proxy.add(2, Double.MAX_VALUE);
//        System.out.println("2 + Double.MAX_VALUE = " + result);


        MathCalculatorProxy proxy1 = new MathCalculatorProxy();
        double result1 = proxy1.sub(3,1);
        System.out.println("3-1 = " + result1);
        result1 = proxy1.sub(3, Double.MAX_VALUE);
        System.out.println(result1);
    }
}
