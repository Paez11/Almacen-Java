package controller;

import interfaces.IDrink;
import interfaces.IMainController;
import interfaces.IView;

public class MainController implements IMainController{
	IView view;
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
			case 1: addDrink();
				break;
			case 2:
				String name <---
				searchDrink(name);
				//mostrar
				break;
			case 3:
				String name <---
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
		
		return false;
	}
	
	/**
	 * Busca y devuelve la bebida dada por el nombre name
	 * @param name nombre de la bebida a bucar
	 * @return devuelve la bebida o null en caso de no existir
	 */
	private IDrink searchDrink(String name) {
		
		return null;
	}
	
	/**
	 * Busca, devuelve y elimina en el almacen la bebida dada
	 * por el nombre name
	 * @param name nombre de la bebida a extraer
	 * @return la bebida o null en caso de no existir
	 */
	private IDrink getDrink(String name) {
		
		return null;
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
