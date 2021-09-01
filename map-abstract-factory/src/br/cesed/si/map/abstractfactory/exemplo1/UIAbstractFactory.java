package br.cesed.si.map.abstractfactory.exemplo1;

public abstract class UIAbstractFactory {

	public abstract Button createButton(String label);
	
	public abstract Window createWindow(String title);
	
	public abstract PopUp createPopUp(String title);
	
}
