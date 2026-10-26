package day3;

import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your weight in pounds");
		double weightInPounds = scanner.nextDouble();
		
		System.out.println("Enter your height in meters");
		double height = scanner.nextDouble();
		
		//To convert pounds to kgs 
		double weightInKgs = weightInPounds * 0.45359237;
		//BMI = weight (kg) / height (m)
		double bmi = weightInKgs/(height*height);
		System.out.println("This is your BMI: "+ bmi);
		
		if(bmi < 18.5) {
			System.out.println("You are underweight");
		} else if(bmi >= 18.5 && bmi < 24.9){
			System.out.println("You are normal");
		} else if(bmi >= 25 && bmi < 29.9) {
			System.out.println("You are overweight");
		} else {
			System.out.println("You are obese");
		}
	}

}
