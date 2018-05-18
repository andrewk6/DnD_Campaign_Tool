package items;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Item extends Item_Parent{
	//Item Attributes
	private int weight, quan;
	
	public Item() {
		super();
		weight = -1;
		quan = -1;
	}
	
	public Item(String name, String desc, Coin cst, int weight, int quan) {
		super(name, desc, cst);
		this.weight = weight;
		this.quan = quan;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getQuan() {
		return quan;
	}

	public void setQuan(int quan) {
		this.quan = quan;
	}
	
	private void writeObject(ObjectOutputStream oos) throws IOException{
		oos.defaultWriteObject();
		
		oos.writeInt(weight);
		oos.writeInt(quan);
	}
	
	private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
		ois.defaultReadObject();
		
		weight = ois.readInt();
		quan = ois.readInt();
	}
}