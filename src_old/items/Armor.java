package items;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Armor extends Item_Parent implements Serializable{
	//Armor Constants
	//Type Constants
	public static final int ARMOR_TYPE_LIGHT = 0;
	public static final int ARMOR_TYPE_MEDIUM = 1;
	public static final int ARMOR_TYPE_HEAVY = 2;
	public static final int ARMOR_TYPE_SHIELD = 3;
	//Stealth Constants
	public static final int ARMOR_STEALTH_NORM = 0;
	public static final int ARMOR_STEALTH_ADV = 1;
	public static final int ARMOR_STEALTH_DISADV = 2;
	
	//Armor Attributes
	private int type, mMod, weight, ac, stealth;
	
	public Armor() {
		super();
		type = -1;
		mMod = -1;
		weight = -1;
		ac = -1;
		stealth = -1;
	}
	
	public Armor(String name, String desc, Coin cst, int type, int mMod, int weight, int ac, int stealth) {
		super(name, desc, cst);
		this.type = type;
		this.mMod = mMod;
		this.weight = weight;
		this.ac = ac;
		this.stealth = stealth;
	}
	
	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getmMod() {
		return mMod;
	}

	public void setmMod(int mMod) {
		this.mMod = mMod;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getAc() {
		return ac;
	}

	public void setAc(int ac) {
		this.ac = ac;
	}

	public int getStealth() {
		return stealth;
	}

	public void setStealth(int stealth) {
		this.stealth = stealth;
	}
	
	private void writeObject(ObjectOutputStream oos) throws IOException{
		oos.defaultWriteObject();
		//weight, ac, stealth
		oos.writeInt(type);
		oos.writeInt(mMod);
		oos.writeInt(weight);
		oos.writeInt(ac);
		oos.writeInt(stealth);
	}

	private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
		ois.defaultReadObject();
		
		type = ois.readInt();
		mMod = ois.readInt();
		weight = ois.readInt();
		ac = ois.readInt();
		stealth = ois.readInt();
	}
}