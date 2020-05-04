import java.util.Scanner;

public class Segundo{
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
	System.out.println("DIGITE O SEGUNDO NÚMERO");
	{while(number2 == 0){	
		try{
		 number2 = Integer.parseInt(numb.nextLine());
		} catch (NumberFormatException e){
			System.out.println("Não entendi, repita por favor");
		}}
	int r = number+number2;
	
	if (r > 10){
		System.out.println("A soma é "+r);	
	}

}}}}
