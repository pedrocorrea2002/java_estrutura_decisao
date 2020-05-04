import java.util.Scanner;

public class Oitavo{
	public static void main(String[] args){
	
	String senha="aedb",tentativa=null;
	
	Scanner nome = new Scanner(System.in);
	
	System.out.println("Digite a senha");
	tentativa = nome.next().trim();
	
	if (tentativa.equalsIgnoreCase(senha)){
		System.out.println("ACESSO PERMITIDO");
	}
	else{
	while(!tentativa.equalsIgnoreCase(senha)){
		System.out.println("VOCÊ NÃO TEM ACESSO AO SISTEMA");
		System.out.println("Digite novamente a senha");
		tentativa = nome.next().trim();
	}
	System.out.println("ACESSO PERMITIDO");
	}}}