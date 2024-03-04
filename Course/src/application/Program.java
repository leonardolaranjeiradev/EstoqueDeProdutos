package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produto produto = new Produto();
		System.out.println("Insira os dados do Produto: ");
		System.out.print("Nome: ");
		produto.nome = sc.nextLine();		
		System.out.print("Preço: ");
		produto.preco = sc.nextDouble();		
		System.out.print("Quantidade no estoque: ");
		produto.quantidade = sc.nextInt();
		
		System.out.println();
		System.out.println("Dados do Produto: " + produto);
		
		System.out.println();
		System.out.print("Insira a quantidade de produtos a serem adicionados no estoque: ");
		int quantidade = sc.nextInt();		
		produto.addProdutos(quantidade);
		
		System.out.println();		
		System.out.println("Dados atualizados: " + produto);
		
		System.out.println();
		System.out.print("Insira a quantidade de produtos a serem removidos do estoque: ");
		quantidade = sc.nextInt();
		produto.removerProdutos(quantidade);
		
		System.out.println();
		System.out.println("Dados atualizados: " + produto);
		
		sc.close();
	}

}
