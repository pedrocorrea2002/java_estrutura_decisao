import java.util.Scanner;

public class Nono{
	public static void main(String[] args){
	
	double valor=0;
	
	Scanner numb = new Scanner(System.in);
	
	System.out.println("Digite o valor do produto");
	{while(valor == 0){	
		try{
		 valor = Integer.parseInt(numb.nextLine());
		} catch (NumberFormatException e){
			System.out.println("Não entendi, repita por favor");
		}}
	if (valor>20){
		double valorlucro=((valor/10)*3)+valor;
		System.out.println("Esse produto deve ser vendido pelo preço de "+valorlucro);
	}
	else{
		double valorlucro=((valor/10)*(4.5)+valor);
		System.out.println("Esse produto deve ser vendido pelo preço de "+valorlucro);
	}
	}}}
	
	