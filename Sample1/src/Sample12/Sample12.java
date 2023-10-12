package Sample12;

public class Sample12 {
	 public static void main(String[] args) {
	        int num1 = 10;
	        int num2 = 5;

	        System.out.println("num1 + num2的各種運算:");
	        System.out.println("num1 + num2 = " + (num1 + num2));
	        System.out.println("num1 - num2 = " + (num1 - num2));

	        System.out.println("num1 * num2 = " + (num1 * num2));
	        System.out.println("num1 / num2 = " + (num1 / num2));
	        System.out.println("num1 % num2 = " + (num1 % num2));
	        int a = 0;
	        int b = 0;
	        int c = 0;
	        b = a++;
	        c = ++a;
	        System.out.println("因为是在指定值之后才递增，所以b的值：" + b);
	        System.out.println("因为是在递增之后才指定值，所以c的值：" + c);
	    }
}
