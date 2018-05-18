package items;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Weapon extends Item_Parent implements Serializable{
	//Type Constants
	public static final int TYPE_MELEE = 0;
	public static final int TYPE_RANGED = 1;
	
	//Handedness Constants
	public static final int ONE_HANDED = 0;
	public static final int TWO_HANDED = 1;
	public static final int ONE_OR_TWO_HANDED = 2;
	
	//Prof Constants
	public static final int PROF_SIMPLE = 0;
	public static final int PROF_MARTIAL = 1;
	
	//Dmg Type Constants
	public static final int DAMAGE_TYPE_SLASHING = 0;
	public static final int DAMAGE_TYPE_BLUDGEONING = 1;
	public static final int DAMAGE_TYPE_PIERCING = 2;
	public static final int DAMAGE_TYPE_FIRE = 3;
	public static final int DAMAGE_TYPE_COLD = 4;
	public static final int DAMAGE_TYPE_POISON = 5;
	public static final int DAMAGE_TYPE_ACID = 6;
	public static final int DAMAGE_TYPE_PSYCHIC = 7;
	public static final int DAMAGE_TYPE_NECROTIC = 8;
	public static final int DAMAGE_TYPE_RADIANT = 9;
	public static final int DAMAGE_TYPE_LIGHTNING = 10;
	public static final int DAMAGE_TYPE_THUNDER = 11;
	public static final int DAMAGE_TYPE_FORCE = 12;
	
	//Weapon Properties
	public static final int PROPERTY_AMMUNITION = 0;
	public static final int PROPERTY_FINESSE = 1;
	public static final int PROPERTY_HEAVY = 2;
	public static final int PROPERTY_LIGHT = 3;
	public static final int PROPERTY_LOADING = 4;
	public static final int PROPERTY_RANGE = 5;
	public static final int PROPERTY_REACH = 6;
	public static final int PROPERTY_SPECIAL = 7;
	public static final int PROPERTY_THROWN = 8;
	public static final int PROPERTY_VERSATILE = 9;
	
	//Weapon Attributes
	private int die, dieNum, mMod, type, hand, prof, weight, rng_short, rng_far, dmg_type, quan;
	private ArrayList<Integer> properties;
	
	public Weapon() {
		super();
		this.die = -1;
		this.dieNum = -1;
		this.mMod = -1;
		this.type = -1;
		this.hand = -1;
		this.prof = -1;
		this.weight = -1;
		this.rng_short = -1;
		this.rng_far = -1;
		this.dmg_type = -1;
		this.quan = -1;
		this.properties = null;
	}
	
	public Weapon(String name, String desc, Coin cst, int die, int dieNum, int mMod, int type, int hand, 
			int prof, int weight, int rng_short, int rng_far, int dmg_type, int quan, ArrayList<Integer> properties) {
		super(name, desc, cst);
		this.die = die;
		this.dieNum = dieNum;
		this.mMod = mMod;
		this.type = type;
		this.hand = hand;
		this.prof = prof;
		this.weight = weight;
		this.rng_short = rng_short;
		this.rng_far = rng_far;
		this.dmg_type = dmg_type;
		this.quan = quan;
		this.properties = properties;
	}
	
	public Weapon(String name, String desc, Coin cst, int die, int dieNum, int mMod, int type, int hand, 
			int prof, int weight, int rng_short, int rng_far, int dmg_type, int quan) {
		super(name, desc, cst);
		this.die = die;
		this.dieNum = dieNum;
		this.mMod = mMod;
		this.type = type;
		this.hand = hand;
		this.prof = prof;
		this.weight = weight;
		this.rng_short = rng_short;
		this.rng_far = rng_far;
		this.dmg_type = dmg_type;
		this.quan = quan;
		this.properties = new ArrayList<Integer>();
	}

	public int getDie() {
		return die;
	}

	public void setDie(int die) {
		this.die = die;
	}

	public int getDieNum() {
		return dieNum;
	}

	public void setDieNum(int dieNum) {
		this.dieNum = dieNum;
	}

	public int getmMod() {
		return mMod;
	}

	public void setmMod(int mMod) {
		this.mMod = mMod;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getHand() {
		return hand;
	}

	public void setHand(int hand) {
		this.hand = hand;
	}

	public int getProf() {
		return prof;
	}

	public void setProf(int prof) {
		this.prof = prof;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getRng_short() {
		return rng_short;
	}

	public void setRng_short(int rng_short) {
		this.rng_short = rng_short;
	}

	public int getRng_far() {
		return rng_far;
	}

	public void setRng_far(int rng_far) {
		this.rng_far = rng_far;
	}

	public int getDmg_type() {
		return dmg_type;
	}

	public void setDmg_type(int dmg_type) {
		this.dmg_type = dmg_type;
	}

	public int getQuan() {
		return quan;
	}

	public void setQuan(int quan) {
		this.quan = quan;
	}

	public ArrayList<Integer> getProperties() {
		return properties;
	}

	public void setProperties(ArrayList<Integer> properties) {
		this.properties = properties;
	}
	
	private void writeObject(ObjectOutputStream oos) throws IOException{
		oos.defaultWriteObject();
		
		oos.writeInt(die);
		oos.writeInt(dieNum);
		oos.writeInt(mMod);
		oos.writeInt(type);
		oos.writeInt(hand);
		oos.writeInt(prof);
		oos.writeInt(weight);
		oos.writeInt(rng_short);
		oos.writeInt(rng_far);
		oos.writeInt(dmg_type);
		oos.writeInt(quan);
		oos.writeObject(properties);
	}
	
	private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
		ois.defaultReadObject();
		
		die = ois.readInt();
		dieNum = ois.readInt();
		mMod = ois.readInt();
		type = ois.readInt();
		hand = ois.readInt();
		prof = ois.readInt();
		weight = ois.readInt();
		rng_short = ois.readInt();
		rng_far = ois.readInt();
		dmg_type = ois.readInt();
		quan = ois.readInt();
		properties = (ArrayList<Integer>) ois.readObject();
	}
}