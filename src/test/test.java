package test;
import java.util.Random;
import javax.swing.JFrame;

public class test {

	public static void main(String[] args) {
		System.out.println("Let's start!");
		JFrame frame1 = new JFrame("yeah!");
		frame1.setSize(100,200);
		frame1.setVisible(true);
		
		Random rnd = new Random();
		
		//パラメータ設定
		double benefit_company = 0;
		double benefit_employee = 0;
		double benefit_consumer = 0;
		int num_of_guests = 0;
		int price = 0;
		int costs = 0;
		int cs = 0;
		int salary = 0;
		int r[] = new int[3];
		int consumer_type = 0;
		int consumer_benefit[][] = {{10,20,30},{20,30,40}};
		int type = 0;
		
		//企業の行動決定
		price = 15;
		
		//従業員の行動決定
		r[0] = 1;
		r[1] = 0;
		r[2] = 0;
		
		//消費者の生成、行動決定
		for(int i=0; i<100; i++) {
			type = rnd.nextInt(2);
			benefit_consumer = consumer_benefit[type][0]*r[0] +
					consumer_benefit[type][1]*r[1] + consumer_benefit[type][2]*r[2];
			if(benefit_consumer > price) {
				num_of_guests += 1;
			}
		}
		
		//各陣営の効用決定
		benefit_consumer = cs - price;
		benefit_employee = cs + salary;
		benefit_company = num_of_guests*price - costs;
		
		//アウトプット
		System.out.println("企業："+benefit_company+"、従業員："+benefit_employee+"、消費者："+benefit_consumer);
		System.out.println("お わ り");

	}

}
