import java.util.Scanner;

public class Terceiro{
	public static void main(String[] args){
		
	int number=0;
	
	Scanner numb = new Scanner(System.in);
	
	System.out.println("DIGITE UM NÚMERO!");
	{while(number == 0){	
		try{
		 number = Integer.parseInt(numb.nextLine());
		} catch (NumberFormatException e){
			System.out.println("Não entendi, repita por favor");
		}}
		
	if (number > 0){
		System.out.println(number+" é um número positivo!");	
	}
	else{
		System.out.println(number+" é um número negativo!");
}}}}
