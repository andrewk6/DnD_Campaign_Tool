package items;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class MagicItem extends Item_Parent implements Serializable{
	//Type Constants
	public static final int ITEM_ARMOR = 0;
	public static final int ITEM_ARMOR_CHHAIN_SHIRT = 1;
	public static final int ITEM_ARMOR_LIGHT_MEDIUM_HEAVY = 2;
	public static final int ITEM_ARMOR_LIGHT_MEDIUM_HEAVY_NOT_HIDE = 3;
	public static final int ITEM_ARMOR_PLATE = 4;
	public static final int ITEM_ARMOR_SCALE_MAIL = 5;
	public static final int ITEM_ARMOR_SHIELD = 6;
	public static final int ITEM_ARMOR_STUDDED_LEATHER = 7;
	public static final int ITEM_POTION = 8;
	public static final int ITEM_RING = 9;
	public static final int ITEM_ROD = 10;
	public static final int ITEM_SCROLL = 11;
	public static final int ITEM_STAFF = 12;
	public static final int ITEM_SWORD = 13;
	public static final int ITEM_WAND = 14;
	public static final int ITEM_WEAPON_SWORD_AXE = 15;
	public static final int ITEM_WEAPON_AXE = 16;
	public static final int ITEM_WEAPON_SWORD_SLASHING = 17;
	public static final int ITEM_WEAPON_SWORD = 18;
	public static final int ITEM_WEAPON_ANY = 19;
	public static final int ITEM_WEAPON_ARROW = 20;
	public static final int ITEM_WEAPON_DAGGER = 21;
	public static final int ITEM_WEAPON_JAVELIN = 22;
	public static final int ITEM_WEAPON_LONGBOW = 23;
	public static final int ITEM_WEAPON_LONGSWORD = 24;
	public static final int ITEM_WEAPON_MACE = 25;
	public static final int ITEM_WEAPON_MAUL = 26;
	public static final int ITEM_WEAPON_SCIMITAR = 27;
	public static final int ITEM_WEAPON_TRIDENT = 28;
	public static final int ITEM_WEAPON_WARHAMMER = 29;
	public static final int ITEM_WONDEROUS_ITEM = 30;
	public static final int ITEM_MISC = 31;
	
	//Rarity Constants
	public static final int ITEM_RARITY_COMMON = 0;
	public static final int ITEM_RARITY_UNCOMMON = 1;
	public static final int ITEM_RARITY_RARE = 2;
	public static final int ITEM_RARITY_VERY_RARE = 3;
	public static final int ITEM_RARITY_LEGENDARY = 4;
	public static final int ITEM_RARITY_VERY_RARE_OR_LEGENDARY = 5;
	public static final int ITEM_RARITY_VARIES = 6;
	public static final int ITEM_RARITY_VARIES_FIGURINE = 7;
	
	//Magic Item Attributes
	private int type, rarity, charges, weight;
	boolean rAttune, attuned;
	
	public MagicItem() {
		super();
		type = -1;
		rarity = -1;
		charges = -1;
		weight = -1;
		rAttune = false;
		attuned = false;
	}
	
	public MagicItem(String name, String desc, Coin cst, int type, int rarity, int charges, int weight, boolean rAttune, boolean attuned) {
		super(name, desc, cst);
		this.type = type;
		this.rarity = rarity;
		this.charges = charges;
		this.weight = weight;
		this.rAttune = rAttune;
		this.attuned = attuned;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getRarity() {
		return rarity;
	}

	public void setRarity(int rarity) {
		this.rarity = rarity;
	}

	public int getCharges() {
		return charges;
	}

	public void setCharges(int charges) {
		this.charges = charges;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public boolean isrAttune() {
		return rAttune;
	}

	public void setrAttune(boolean rAttune) {
		this.rAttune = rAttune;
	}

	public boolean isAttuned() {
		return attuned;
	}

	public void setAttuned(boolean attuned) {
		this.attuned = attuned;
	}
	
	private void writeObject(ObjectOutputStream oos) throws IOException{
		oos.defaultWriteObject();
		
		oos.writeInt(type);
		oos.writeInt(rarity);
		oos.writeInt(charges);
		oos.writeInt(weight);
		oos.writeBoolean(rAttune);
		oos.writeBoolean(attuned);
	}
	
	private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
		ois.defaultReadObject();
		
		type = ois.readInt();
		rarity = ois.readInt();
		charges = ois.readInt();
		weight = ois.readInt();
		
		rAttune = ois.readBoolean();
		attuned = ois.readBoolean();
	}
}