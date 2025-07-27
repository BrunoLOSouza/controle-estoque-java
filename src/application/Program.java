package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Entre com os dados do produto: ");
        System.out.print("NOME: ");
        product.nome = sc.nextLine();
        System.out.printf("PREÇO: ");
        product.preço = sc.nextDouble();
        System.out.printf("QUANTIDADE EM ESTOQUE: ");
        product.quantidade = sc.nextInt();

        System.out.println("Dados do Produto: " + product);
        System.out.println();

        System.out.println("Entre com o numero de produtos que deseja adicionar ao estoque: ");
        int quantidade = sc.nextInt();
        product.produtosAdd(quantidade);

        System.out.println("Dados atualizados: " + product);
        System.out.println();

        System.out.println("Entre com o numero de produtos que estão saindo do estoque: ");
        int quantidade1 = sc.nextInt();
        product.produtosRemovidos(quantidade1);

        System.out.println();
        System.out.println("Dados atualizados: " + product);

        sc.close();
    }
}
