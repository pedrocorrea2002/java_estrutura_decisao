import java.util.Scanner;

public class Sexto{
	public static void main(String[] args){
		
	int nota=0,nota2=0,nota3=0;
	
	Scanner numb = new Scanner(System.in);
	
	System.out.println("Olá professor");
	System.out.println("digite a nota da primeira prova do aluno");
	{while(nota == 0){	
		try{
		 nota = Integer.parseInt(numb.nextLine());
		} catch (NumberFormatException e){
			System.out.println("Não entendi, repita por favor");
		}}
	System.out.println("digite a nota da segunda prova do aluno");
	{while(nota2 == 0){	
		try{
		 nota2 = Integer.parseInt(numb.nextLine());
		} catch (NumberFormatException e){
			System.out.println("Não entendi, repita por favor");
		}}
	System.out.println("digite a nota da terceira prova do aluno");
	{while(nota3 == 0){	
		try{
		 nota3 = Integer.parseInt(numb.nextLine());
		} catch (NumberFormatException e){
			System.out.println("Não entendi, repita por favor");
		}}
	
	if ((((nota*2)+(nota2*3)+(nota3*5))/10)>=7){
		System.out.println("O aluno foi aprovado!");	
	}
	else{
		System.out.println("O aluno foi reprovado");
}}}}}}
