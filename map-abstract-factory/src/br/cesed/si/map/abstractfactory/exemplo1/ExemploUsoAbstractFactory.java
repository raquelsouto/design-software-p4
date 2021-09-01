package br.cesed.si.map.abstractfactory.exemplo1;

import br.cesed.si.map.abstractfactory.exemplo1.android.AndroidUIFactory;

public class ExemploUsoAbstractFactory {

	public static void main(String[] args) {

		UIAbstractFactory fabricaUI = new AndroidUIFactory();
		
		Button botao1 = fabricaUI.createButton("OK");
		
		PopUp popUp = fabricaUI.createPopUp("Titulo do PopUp");
		popUp.show();
		
		Window janela = fabricaUI.createWindow("Titulo da Janela");
		
		janela.addButton(botao1);
		
		
	}

}
