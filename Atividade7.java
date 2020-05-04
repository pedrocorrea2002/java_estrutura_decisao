import java.util.Scanner;

public class Sétimo{
	public static void main(String[] args){
	
	String nome1,nome2;	
	int idade=0,idade2=0;
	
	Scanner numb = new Scanner(System.in);
	Scanner nome = new Scanner(System.in);
	
	System.out.println("Primeira pessoa, digite seu nome");
	nome1 = nome.next().trim();
	
	System.out.println("Certo, agora digite sua idade");
	{while(idade == 0){	
		try{
		 idade = Integer.parseInt(numb.nextLine());
		} catch (NumberFormatException e){
			System.out.println("Não entendi, repita por favor");
		}}
	System.out.println("Agora é a vez da segunda pessoa, digite seu nome");
	nome2 = nome.next().trim();
	
	System.out.println("Certo, agora digite sua idade");
	{while(idade2 == 0){	
		try{
		 idade2 = Integer.parseInt(numb.nextLine());
		} catch (NumberFormatException e){
			System.out.println("Não entendi, repita por favor");
		}}
	
	if (idade>idade2){
		System.out.println("Então você é o mais velho, "+nome1+" de "+idade+" anos ^-^");	
	}
	else{
		System.out.println("Então você é o mais velho, "+nome2+" de "+idade2+" anos ^-^");
}}}}}
