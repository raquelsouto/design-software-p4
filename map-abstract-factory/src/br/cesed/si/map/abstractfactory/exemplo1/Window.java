package br.cesed.si.map.abstractfactory.exemplo1;

public abstract class Window {

	private String title;

	public Window(String title) {
		this.title = title;
	}

	public abstract void addButton(Button botao);
	
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	
}
