package encounter;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Enviorn implements Serializable{
	private String weather, terrain, desc;
	private Map_Image img;
	
	public Enviorn() {
		weather = "NONE";
		terrain = "NONE";
		desc = "DEFAULT";
		img = null;
	}
	
	public Enviorn(String weather, String terrain, String desc, Map_Image img) {
		this.weather = weather;
		this.terrain = terrain;
		this.desc = desc;
		this.img = img;
	}
	
	private void writeObject(ObjectOutputStream oos) throws IOException{
		oos.defaultWriteObject();
		
		oos.writeObject(weather);
		oos.writeObject(terrain);
		oos.writeObject(desc);
		oos.writeObject(img);
	}
	
	private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
		ois.defaultReadObject();
		
		weather = (String) ois.readObject();
		terrain = (String) ois.readObject();
		desc = (String) ois.readObject();
		img = (Map_Image)ois.readObject();
	}
}