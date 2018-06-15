package npcs;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import items.Coin;

public class Monster implements Serializable{
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
	
	private String name, size, type, skills, dmg_immune, dmg_vuln, dmg_resist, cond_immune, senses, langs, desc;
	private int align, ac, hp, cr, exp;
	private int[] spd = new int[4], stats = new int[6], svs = new int[6];
	
	public Monster() {
		name = "";
		size = "";
		type = "";
		skills = "";
		dmg_immune = "";
		dmg_vuln = "";
		dmg_resist = "";
		cond_immune = "";
		senses = "";
		langs = "";
		desc = "";
		
		align = -1;
		ac  = -1;
		hp = -1;
		cr = -1;
		exp = -1;
		
		for(int c1 = 0; c1 < 6; c1 ++) {
			if(c1 < 4)
				spd[c1] = 0;
			stats[c1] = 0;
			svs[c1] = 0;
		}
	}
	
	public Monster(String name, String size, String type, String skills, String dmg_immune, String dmg_vuln, 
			String dmg_resist, String cond_immune, String senses, String langs, String desc, int align, int ac, 
			int hp, int cr, int exp, int[]spd, int[]stats, int[]svs) {
		this.name = name;
		this.type = type;
		this.size = size;
		this.skills = skills;
		this.dmg_immune = dmg_immune;
		this.dmg_vuln = dmg_vuln;
		this.dmg_resist = dmg_resist;
		this.cond_immune = cond_immune;
		this.senses = senses;
		this.langs = langs;
		this.desc = desc;
		this.align = align;
		this.ac = ac;
		this.hp = hp;
		this.cr = cr;
		this.exp = exp;
		if(spd.length == 4)
			this.spd = spd;
		else throw new IllegalArgumentException("Invalid speed array(SIZE)");
		if(stats.length == 6)
			this.stats = stats;
		else throw new IllegalArgumentException("Invalid stats array(SIZE)");
		if(svs.length == 6)
			this.svs = svs;
		else throw new IllegalArgumentException("Invalid saves array(SIZE)");
		
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getDmg_immune() {
		return dmg_immune;
	}

	public void setDmg_immune(String dmg_immune) {
		this.dmg_immune = dmg_immune;
	}

	public String getDmg_vuln() {
		return dmg_vuln;
	}

	public void setDmg_vuln(String dmg_vuln) {
		this.dmg_vuln = dmg_vuln;
	}

	public String getDmg_resist() {
		return dmg_resist;
	}

	public void setDmg_resist(String dmg_resist) {
		this.dmg_resist = dmg_resist;
	}

	public String getCond_immune() {
		return cond_immune;
	}

	public void setCond_immune(String cond_immune) {
		this.cond_immune = cond_immune;
	}

	public String getSenses() {
		return senses;
	}

	public void setSenses(String senses) {
		this.senses = senses;
	}

	public String getLangs() {
		return langs;
	}

	public void setLangs(String langs) {
		this.langs = langs;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getAlign() {
		return align;
	}

	public void setAlign(int align) {
		this.align = align;
	}

	public int getAc() {
		return ac;
	}

	public void setAc(int ac) {
		this.ac = ac;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getCr() {
		return cr;
	}

	public void setCr(int cr) {
		this.cr = cr;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public int[] getSpd() {
		return spd;
	}

	public void setSpd(int[] spd) {
		this.spd = spd;
	}

	public int[] getStats() {
		return stats;
	}

	public void setStats(int[] stats) {
		this.stats = stats;
	}

	public int[] getSvs() {
		return svs;
	}

	public void setSvs(int[] svs) {
		this.svs = svs;
	}

	private void writeObject(ObjectOutputStream oos) throws IOException{
		oos.defaultWriteObject();
		
		oos.writeObject(name);
		oos.writeObject(type);
		oos.writeObject(size);
		oos.writeObject(skills);
		oos.writeObject(dmg_immune);
		oos.writeObject(dmg_vuln);
		oos.writeObject(dmg_resist);
		oos.writeObject(cond_immune);
		oos.writeObject(senses);
		oos.writeObject(langs);
		oos.writeObject(desc);
		oos.writeInt(align);
		oos.writeInt(ac);
		oos.writeInt(hp);
		oos.writeInt(cr);
		oos.writeInt(exp);
		
		for(int c1 = 0; c1 < 6; c1 ++) {
			if(c1 < 4)
				oos.writeInt(spd[c1]);
			oos.writeInt(stats[c1]);
			oos.writeInt(svs[c1]);
		}
	}
	
	private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
		ois.defaultReadObject();
		
		name = (String) ois.readObject();
		type = (String) ois.readObject();
		size = (String) ois.readObject();
		skills = (String) ois.readObject();
		dmg_immune = (String) ois.readObject();
		dmg_vuln = (String) ois.readObject();
		dmg_resist = (String) ois.readObject();
		cond_immune = (String) ois.readObject();
		senses = (String) ois.readObject();
		langs = (String) ois.readObject();
		desc = (String) ois.readObject();
		align = ois.readInt();
		ac = ois.readInt();
		hp = ois.readInt();
		cr = ois.readInt();
		exp = ois.readInt();
		
		for(int c1 = 0; c1 < 6; c1 ++) {
			if(c1 < 4)
				spd[c1] = ois.readInt();
			stats[c1] = ois.readInt();
			svs[c1] = ois.readInt();
		}
	}
}

