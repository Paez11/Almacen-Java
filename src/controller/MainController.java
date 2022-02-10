package controller;

import interfaces.IDrink;
import interfaces.IMainController;
import interfaces.IStore;
import interfaces.IView;
import model.Alcoholic;
import model.Soda;
import view.View;

public class MainController implements IMainController{
	IView view = new View();
	IStore store;
	@Override
	public void run() {
		int option=-1;
		do {
		showMainMenu();
		option=view.readMainMenuOption();
		switchMain(option);
		}while(option!=5);
		
	}
	
	/**
	 * Muestra el menu principal de las acciones
	 */
	private void showMainMenu() {
		view.showMainMenu();
	}
	
	/**
	 * Ejecuta una de las opciones disponibles del menu principal
	 * en funcion del valor option
	 * @param option valor leido por teclado despues
	 * del menu principal
	 */
	private void switchMain(int option) {
		switch(option) {
			case 1: boolean result=addDrink();
			if(result) {
				view.print("Bebida insertada");
			}else {
				view.print("Error insertando bebida");
			}
				break;
			case 2:
				view.print("Inserte el nombre de la bebida");
				String name=view.leeString();
				IDrink d=searchDrink(name);
				if(d==null) {
					view.print("La bebida no existe");
				}else {
					view.print(d);
				}
				//mostrar
				break;
			case 3:
				view.print("Inserte el nombre de la bebida");
				String name2=view.leeString();
				IDrink d2=getDrink(name2);
				if(d2==null) {
					view.print("Bebida no encontrada");
				}else {
					view.print(d2);
				}
				getDrink(name);
				//mostrar
				break;
			case 4:
				IDrink drink <--
				updateDrink(drink);
				break;
			case 5: getHowMuch();
				break;
			case 6: //bye bye
				break;
				default: //No opcion
		}
	}
	
	/**
	 * Ejecuta la accion de añadir una nueva bebida, para
	 * tomar los datos hace uso de SecundaryController
	 * @param drink bebida nueva a insertar
	 * @return devuelve false si no puede insertar por:
	 * no haber espacio, o una bebida con el mismo nombre
	 */
	private boolean addDrink() {
		view.print("Inserte el nombre de la bebida");
		String name=view.leeString();
		view.print("Inserte precio de la bebida");
		float precio=view.leeFloat();
		view.print("Inserte tipo de la bebida 1 alcoholica, 2 refresco");
		int tipo=view.leeEntero();
		IDrink newDrink=null;
		if(tipo==1) {
			newDrink=new Alcoholic(precio,name);
		}else {
			newDrink=new Soda(precio,name);
		}
		return store.addDrink(newDrink);
	}
	
	/**
	 * Busca y devuelve la bebida dada por el nombre name
	 * @param name nombre de la bebida a bucar
	 * @return devuelve la bebida o null en caso de no existir
	 */
	private IDrink searchDrink(String name) {
		
		return store.searchDrink(name);
	}
	
	/**
	 * Busca, devuelve y elimina en el almacen la bebida dada
	 * por el nombre name
	 * @param name nombre de la bebida a extraer
	 * @return la bebida o null en caso de no existir
	 */
	private IDrink getDrink(String name) {
		
		return store.getDrink(name);
	}
	
	/**
	 * Actualiza la bebida con los nuevos datos insertados
	 * @param drink bebida a ser actualizada
	 * @return devuelve false en caso de no haber podido ser actualizada por no existir
	 */
	private boolean updateDrink(IDrink drink) {
		
		return false;
	}
	
	/**
	 * Devuelve la cantidad de dinero en bebidas que
	 * existe en el almacen
	 * @return la cantidad de dinero en formato float
	 */
	private float getHowMuch() {
		return 0;
	}

}
