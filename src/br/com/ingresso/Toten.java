package br.com.ingresso;

import java.util.Random;

public class Toten {

	public Ingresso calcularTotal(Pedido pedido) {
		double preco = 28.50;

		double total = 0;
		
		if (pedido.getMeia() == true) {
			total = preco / 2;
		} else {
			total = preco;

			Random rdn = new Random();

			Ingresso ing = new Ingresso();
			ing.setFilme(pedido.getFilme());
			ing.setData(pedido.getData());
			ing.setHorario(pedido.getHorario());
			ing.setAssento(pedido.getAssento());
			ing.setValor(total);
			ing.setCodigo(rdn.nextInt(100000, 999999));

			return ing;
		}
		return null;
	}
}