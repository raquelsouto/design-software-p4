package br.cesed.si.map.abstractfactory.exemplo1.android;

import javax.swing.JOptionPane;

import br.cesed.si.map.abstractfactory.exemplo1.PopUp;

public class PopUpAndroid extends PopUp {

	public PopUpAndroid(String title) {
		super(title);
	}

	@Override
	public void show() {
		JOptionPane.showMessageDialog(null, super.getTitle());
	}

}
