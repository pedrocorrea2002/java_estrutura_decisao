import java.util.Scanner;

public class Quarto{
	public static void main(String[] args){
		
	int number=0,number2=0;
	
	Scanner numb = new Scanner(System.in);
	
	System.out.println("DIGITE O PRIMEIRO NÚMERO!");
	{while(number == 0){	
		try{
		 number = Integer.parseInt(numb.nextLine());
		} catch (NumberFormatException e){
			System.out.println("Não entendi, repita por favor");
		}}
	System.out.println("DIGITE O SEGUNDO NÚMERO!");
	{while(number2 == 0){	
		try{
		 number2 = Integer.parseInt(numb.nextLine());
		} catch (NumberFormatException e){
			System.out.println("Não entendi, repita por favor");
		}}
	
	if (number > number2){
		System.out.println("Você digitou "+number+" e "+number2);	
	}
	else{
		System.out.println("Você digitou "+number2+" e "+number);
}}}}}
