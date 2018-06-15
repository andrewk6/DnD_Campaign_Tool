package items;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Item_Parent implements Serializable{
	private String name, desc;
	Coin cst;
	
	public Item_Parent() {
		name = "DEFAULT";
		desc = "DEFAULT CONSTRUCTOR DESC";
		cst = new Coin();
	}
	
	public Item_Parent(String name, String desc, Coin cst) {
		this.name = name;
		this.desc = desc;
		this.cst = cst;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Coin getCst() {
		return cst;
	}

	public void setCst(Coin cst) {
		this.cst = cst;
	}
	
	private void writeObject(ObjectOutputStream oos) throws IOException{
		oos.defaultWriteObject();
		
		oos.writeObject(name);
		oos.writeObject(desc);
		oos.writeObject(cst);
	}
	
	private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
		ois.defaultReadObject();
		
		name = (String) ois.readObject();
		desc = (String) ois.readObject();
		cst = (Coin) ois.readObject();
	}
}
