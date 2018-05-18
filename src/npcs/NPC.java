package npcs;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class NPC implements Serializable{
	private String name, race, desc;
	
	public NPC() {
		name= "";
		race = "";
		desc = "";
	}
	
	public NPC(String name, String race, String desc) {
		this.name = name;
		this.race = race;
		this.desc = desc;
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	private void writeObject(ObjectOutputStream oos) throws IOException{
		oos.defaultWriteObject();
		
		oos.writeObject(name);
		oos.writeObject(race);
		oos.writeObject(desc);
	}
	
	private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
		ois.defaultReadObject();
		
		name = (String) ois.readObject();
		race = (String) ois.readObject();
		desc = (String) ois.readObject();
	}
}