package items;
public class Armor extends Item_Parent{
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
	private int type, mModifier, weight, ac, stealth;
}