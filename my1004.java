import java.text.DecimalFormat;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double sum = 0.0;
        for(int i=0; i<12; i++)
        {
            double a = in.nextDouble();
            sum += a;
        }
        double avgMoney = sum/12.0;
        DecimalFormat df = new DecimalFormat(".00");
        String str = df.format(avgMoney);
        System.out.println("$"+str);
        in.close();
	}

	/* (non-Java-doc)
	 * @see java.lang.Object#Object()
	 */
	public Main() {
		super();
	}

}