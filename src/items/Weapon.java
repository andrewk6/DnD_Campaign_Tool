package items;
import java.util.ArrayList;

public class Weapon extends Item_Parent{
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
	public static final int SLASHING = 0;
	public static final int BLUDGEONING = 1;
	public static final int PIERCING = 2;
	public static final int FIRE = 3;
	public static final int COLD = 4;
	public static final int POISON = 5;
	public static final int ACID = 6;
	public static final int PSYCHIC = 7;
	public static final int NECROTIC = 8;
	public static final int RADIANT = 9;
	public static final int LIGHTNING = 10;
	public static final int THUNDER = 11;
	public static final int FORCE = 12;
	
	//Weapon Properties
	public static final int AMMUNITION = 0;
	public static final int FINESSE = 1;
	public static final int HEAVY = 2;
	public static final int LIGHT = 3;
	public static final int LOADING = 4;
	public static final int RANGE = 5;
	public static final int REACH = 6;
	public static final int SPECIAL = 7;
	public static final int THROWN = 8;
	public static final int VERSATILE = 9;
	
	//Weapon Attributes
	private int die, dieNum, mMod, type, hand, prof, weight, rng_short, rng_far, dmg_type, quantity;
	private ArrayList<Integer> properties;
}