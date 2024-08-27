package iuh.fit.se;



import java.util.Scanner;

public class KiemThuHCN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

		
	        System.out.print("Nhập chiều dài HCN: ");
	        double length = scanner.nextDouble();

	      
	        System.out.print("Nhập chiều rộng HCN: ");
	        double width = scanner.nextDouble();

	     
	        double getArae = 2 * (length + width);

	      
	        double getPer = length * width;

	        // In ra chu vi
	        System.out.println("Chu vi HCN là: " + getPer);

	        System.out.println("Diện tích HCN là: " + getArae);
	    }

}
