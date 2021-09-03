package br.cesed.si.map.abstractfactory.exemplo1.ios;

import javax.swing.JOptionPane;

import br.cesed.si.map.abstractfactory.exemplo1.PopUp;

public class PopUpIos extends PopUp {

	public PopUpIos(String title) {
		super(title);
	}

	@Override
	public void show() {
		JOptionPane.showMessageDialog(null, super.getTitle());
	}

}
