package npcs;

public class Monster{
	//Stat Constants
	public static final int STAT_STR = 0;
	public static final int STAT_DEX = 1;
	public static final int STAT_CON = 2;
	public static final int STAT_INT = 3;
	public static final int STAT_WIS = 4;
	public static final int STAT_CHA = 5;
	
	//Speed Const
	public static final int SPEED_WALK = 0;
	public static final int SPEED_FLY = 1;
	public static final int SPEED_SWIM = 2;
	public static final int SPEED_TREMOR = 3;
	
	private String name, size, type, skills, dmg_immune, dmg_vuln, dmg_resist, cond_immune, senses, languages, desc;
	private int align, ac, hp, cr, exp;
	private int[] speed = new int[4], stats = new int[6], sts = new int[6];
	
}