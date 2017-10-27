package jc_8_abstract_cl;

public class Machine {
	private static int ID = 0;

	public Machine() {
		this.ID ++;
	}
	
	public int getID() {
		return this.ID;
	}

	public void setID(int iD) {
		this.ID = iD;
	}
	
}
