import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String vendedorNome = sc.next();
		double vendedorSalarioFixo = sc.nextDouble();
		double vendasTotal = sc.nextDouble();
		double comissao = 0.15;
		
		double total = vendedorSalarioFixo + vendasTotal * comissao;
		
		System.out.printf("Total = R$ %.2f%n", total);
				
		sc.close();
	}
}
