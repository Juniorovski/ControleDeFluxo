package ControleFluxo;

import java.security.InvalidParameterException;
import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o numero do primeiro parametro: ");
		int paramUm = scanner.nextInt();
		
		System.out.println("Digite o numero segundo parametro: ");
		int paramDois = scanner.nextInt();
		

		scanner.close();
		try {
			contarParametro(paramUm,paramDois);
		} catch (Exception e) {
			System.err.println("Error ao executar o codigo" + e);
		}
	}

	private static void contarParametro(int paramUm, int paramDois)throws InvalidParameterException {
		if(paramUm > paramDois) {
			throw  new InvalidParameterException("Parametro Um maior que Parametro Dois!");
		}
		else {
			int contagem = paramDois - paramUm;
			
			for (int i = 0; i < contagem; i++) {
				 System.out.println("Contando os parametros:" +i);
			}
			
		}
		
	}
}
