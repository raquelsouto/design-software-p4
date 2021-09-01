package br.cesed.si.map.abstractfactory.exemplo1;

public abstract class PopUp {

	private String title;

	public PopUp(String title) {
		this.title = title;
	}

	public abstract void show();
	
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
