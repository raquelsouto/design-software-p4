package br.cesed.si.map.abstractfactory.exemplo1.ios;

import br.cesed.si.map.abstractfactory.exemplo1.Button;
import br.cesed.si.map.abstractfactory.exemplo1.PopUp;
import br.cesed.si.map.abstractfactory.exemplo1.UIAbstractFactory;
import br.cesed.si.map.abstractfactory.exemplo1.Window;

public class UIFactoryIos extends UIAbstractFactory {

	@Override
	public Button createButton(String label) {
		return new ButtonIos(label);
	}

	@Override
	public Window createWindow(String title) {
		return new WindowIos(title);
	}

	@Override
	public PopUp createPopUp(String title) {
		return new PopUpIos(title);
	}

}
