import java.util.Scanner;

public class Quinto{
	public static void main(String[] args){
		
	int number=0;
	
	Scanner numb = new Scanner(System.in);
	
	System.out.println("DIGITE UM N�MERO");
	{while(number == 0){	
		try{
		 number = Integer.parseInt(numb.nextLine());
		} catch (NumberFormatException e){
			System.out.println("N�o entendi, repita por favor");
		}}
	
	if (number%2 == 0){
		System.out.println(number+" � um n�mero par!");	
	}
	else{
		System.out.println(number+" � um n�mero impar!");
}}}}
