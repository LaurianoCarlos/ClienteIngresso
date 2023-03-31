package br.com.ingresso;


public class Main {

  public static void main(String[] args) {

    Pedido pedido = new Pedido();
    pedido.setFilme("Lagoa Azul");
    pedido.setData("29/03/2023");
    pedido.setHorario("20:00");
    pedido.setMeia(false);
    pedido.setAssento("A10");

    Toten toten = new Toten();
    Ingresso ingresso = toten.calcularTotal(pedido);

    ingresso.exibirIngresso();

    
  }
}