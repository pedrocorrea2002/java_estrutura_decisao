import java.util.Scanner;

public class Quarto{
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
	System.out.println("DIGITE O SEGUNDO N�MERO!");
	{while(number2 == 0){	
		try{
		 number2 = Integer.parseInt(numb.nextLine());
		} catch (NumberFormatException e){
			System.out.println("N�o entendi, repita por favor");
		}}
	
	if (number > number2){
		System.out.println("Voc� digitou "+number+" e "+number2);	
	}
	else{
		System.out.println("Voc� digitou "+number2+" e "+number);
}}}}}
