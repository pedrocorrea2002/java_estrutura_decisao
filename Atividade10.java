import java.util.Scanner;

public class D�cimo{
	public static void main(String[] args){
	
	double altura=0;
	String opcao=null;
	
	Scanner numb = new Scanner(System.in);
	
	System.out.println("Digite sua altura em centimetros");
	{while(altura == 0){	
		try{
		 altura = Integer.parseInt(numb.nextLine());
		} catch (NumberFormatException e){
			System.out.println("N�o entendi, repita por favor");
		}}
	
	System.out.println("Voc� � Homem ou Mulher?");
	System.out.println("a)Homem");
	System.out.println("b)Mulher");
	
	opcao = numb.next().trim();
	
	if ((opcao.equalsIgnoreCase("a"))|(opcao.equalsIgnoreCase("b"))){
		if (opcao=="a"){
			System.out.println("O seu peso ideal seria "+(((altura*(72.7/100))-58))+" KGs");
	}
		else{
			System.out.println("O seu peso ideal seria "+(((altura*(62.1/100))-(44.7)))+" KGs");
		}
		}
	else{
	while(!((opcao.equalsIgnoreCase("a"))|(opcao.equalsIgnoreCase("b")))){
		
		System.out.println("OP��O INCORRETA!");
		System.out.println("Voc� � Homem ou Mulher?");
		System.out.println("a)Homem");
		System.out.println("b)Mulher");
		
		opcao = numb.next().trim();
	}
	if ((opcao.equalsIgnoreCase("a"))){
		System.out.println("O seu peso ideal seria "+(((altura*(72.7/100))-58))+" KGs");
}
	else{
		System.out.println("O seu peso ideal seria "+(((altura*(62.1/100))-(44.7)))+" KGs");
	}}}}}
	
	