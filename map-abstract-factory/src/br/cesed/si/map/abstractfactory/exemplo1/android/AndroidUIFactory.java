package br.cesed.si.map.abstractfactory.exemplo1.android;

import br.cesed.si.map.abstractfactory.exemplo1.Button;
import br.cesed.si.map.abstractfactory.exemplo1.PopUp;
import br.cesed.si.map.abstractfactory.exemplo1.UIAbstractFactory;
import br.cesed.si.map.abstractfactory.exemplo1.Window;

public class AndroidUIFactory extends UIAbstractFactory {

	@Override
	public Button createButton(String label) {
		return new ButtonAndroid(label);
	}

	@Override
	public Window createWindow(String title) {
		return new WindowAndroid(title);
	}

	@Override
	public PopUp createPopUp(String title) {
		return new PopUpAndroid(title);
	}

}
