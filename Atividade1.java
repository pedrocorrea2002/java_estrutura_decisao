import java.util.Scanner;

public class Primeiro{
	public static void main(String[] args){
		
	int number=0;
	
	Scanner numb = new Scanner(System.in);
	
	System.out.println("DIGITE UM N�MERO!");
	{while(number == 0){	
		try{
		 number = Integer.parseInt(numb.nextLine());
		} catch (NumberFormatException e){
			System.out.println("N�o entendi, repita por favor");
		}}
	if (number > 20){
		System.out.println("O n�mero digitado foi "+number);	
	}

}}}
