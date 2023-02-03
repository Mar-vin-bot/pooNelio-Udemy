package app;

import entities.Client;

public class Program {

	public static void main(String[] args) {

		/*
		 * hashCode numemro gerado para cada obj com nivel de precisão muito alto se
		 * dois obj possuem o mesmo numero de hascode podemos dizer que pode ser o msm
		 * obj. Metodo usado para confirmar com 100% se obj é o mesmo é equals que é
		 * metodo mais lento de verificação contudo preciso. Usar em conjunto hascode e
		 * equals
		 */

		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Joao", "joao@gmail.com");

		Client c3 = new Client("Jhon", "Jhon@gmail.com");
		Client c4 = new Client("Jhon", "Jhon@gmail.com");

		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println("------ c1 c2------- ");
		System.out.println("Equals: " + c1.equals(c2));
		System.out.println(c1 == c2);
		System.out.println();
		System.out.println("--------- c2 c3------");
		System.out.println(c3.hashCode());
		System.out.println(c4.hashCode());
		System.out.println("Equals: " + c3.equals(c4));
		System.out.println(c3 == c4); // nessa situação é analisado se as referencias são iguais c3, c4
	}
}
