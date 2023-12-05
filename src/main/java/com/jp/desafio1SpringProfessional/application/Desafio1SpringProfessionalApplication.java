package com.jp.desafio1SpringProfessional.application;

import com.jp.desafio1SpringProfessional.entities.Order;
import com.jp.desafio1SpringProfessional.services.OrderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Locale;

@SpringBootApplication
@ComponentScan({"com.jp.desafio1SpringProfessional"})
public class Desafio1SpringProfessionalApplication implements CommandLineRunner {

		private OrderService orderService;

	public Desafio1SpringProfessionalApplication(OrderService orderService){
		this.orderService = orderService;
	}

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		SpringApplication.run(Desafio1SpringProfessionalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("----------");

		Order order1 = new Order(1034, 150.0, 20.0);
		System.out.printf("Pedido código " + order1.getCode() + "\nValor Total: R$ %.2f%n", orderService.total(order1));

		System.out.println("----------");

		Order order2 = new Order(2282, 800.0, 10.0);
		System.out.printf("Pedido código " + order2.getCode() + "\nValor Total: R$ %.2f%n", orderService.total(order2));

		System.out.println("----------");

		Order order3 = new Order(1309, 95.90, 0.0);
		System.out.printf("Pedido código " + order3.getCode() + "\nValor Total: R$ %.2f%n", orderService.total(order3));

	}
}
