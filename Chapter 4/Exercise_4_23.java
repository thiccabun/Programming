// Zack Friedman 9/24/18

import java.util.Scanner;

public class Exercise_4_23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter employee's name: ");
		String name = input.next();
		
		System.out.print("Enter number of hours worked: ");
		double hours = input.nextDouble();
		
		System.out.print("Enter hourly pay rate: ");
		double payRate = input.nextDouble();
		
		System.out.print("Enter federal tax withholding rate: ");
		double fedTaxWithholdingRate = input.nextDouble();
		
		System.out.print("Enter state tax withholding rate: ");
		double stateTaxWithholdingRate = input.nextDouble();
		
		double grossPay = hours * payRate;
		double fedTaxWithholding = grossPay * fedTaxWithholdingRate;
		double stateTaxWithholding = grossPay * stateTaxWithholdingRate;
		double totalDeduction = fedTaxWithholding + stateTaxWithholding;
		double netPay = grossPay - totalDeduction;
		
		String out = "\n";
		out += "Employee Name: " + name + "\n";
		out += "Hours Worked: " + hours + "\n";
		out += "Pay Rate: $" + payRate + "\n";
		out += "Gross Pay: $" + grossPay + "\n";
		out += "Deductions:\n";
		out += "  Federal Withholding (" + fedTaxWithholdingRate * 100 + "%): $" + (int)(fedTaxWithholding * 100) / 100.0 + "\n";
		out += "  State Withholding (" + stateTaxWithholdingRate * 100 + "%): $" + (int)(stateTaxWithholding * 100) / 100.0 + "\n";
		out += "  Total Deduction: $" + totalDeduction + "\n";
		out += "Net Pay: $" + netPay + "\n";
		System.out.println(out);
	}
}