import java.util.Scanner;

public class Segundo{
	public static void main(String[] args){
		
	int number=0,number2=0;
	
	Scanner numb = new Scanner(System.in);
	
	System.out.println("DIGITE O PRIMEIRO N�MERO!");
	{while(number == 0){	
		try{
		 number = Integer.parseInt(numb.nextLine());
		} catch (NumberFormatException e){
			System.out.println("N�o entendi, repita por favor");
		}}
	System.out.println("DIGITE O SEGUNDO N�MERO");
	{while(number2 == 0){	
		try{
		 number2 = Integer.parseInt(numb.nextLine());
		} catch (NumberFormatException e){
			System.out.println("N�o entendi, repita por favor");
		}}
	int r = number+number2;
	
	if (r > 10){
		System.out.println("A soma � "+r);	
	}

}}}}
