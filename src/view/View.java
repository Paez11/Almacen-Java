package view;

import java.util.Scanner;

import interfaces.IDrink;
import interfaces.IView;

public class View implements IView{

	@Override
	public void showMainManu() {
		System.out.println("Menú principal");
		System.out.println("1. Para crear una bebida");
		System.out.println("2. Buscar una bebida");
		System.out.println("3. Extraer una bebida");
		System.out.println("4. Actualizar una bebida");
		System.out.println("5. Calcular precio total");
		System.out.println("6. Salir");
		
	}

	@Override
	public int readMainMenuOption() {
		// TODO Auto-generated method stub
		return this.leeEntero();
	}

	@Override
	public void showSecundaryMenu() {
		
		
	}

	@Override
	public int readSecundaryOption() {
		// TODO Auto-generated method stub
		return this.leeEntero();
	}

	@Override
	public String leeString() {
		Scanner teclado =new Scanner(System.in);
		return teclado.next();
	}

	@Override
	public void print(String s) {
		System.out.println(s);
	}

	@Override
	public void print(IDrink d) {
		System.out.println("Bebida -> "+d);
	}

	@Override
	public float leeFloat() {
		Scanner teclado =new Scanner(System.in);
		return teclado.nextFloat();
	}

	@Override
	public int leeEntero() {
		Scanner teclado =new Scanner(System.in);
		return teclado.nextInt();
	}

}
