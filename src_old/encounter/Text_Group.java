package encounter;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Text_Group implements Serializable{
	private String name, desc;
	
	public Text_Group() {
		name = "DEFAULT";
		desc = "EMPTY TEXT_GROUP";
	}
	
	public Text_Group(String name, String desc) {
		this.name = name;
		this.desc = desc;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		oos.writeObject(desc);
	}
	
	private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
		ois.defaultReadObject();
		
		name = (String) ois.readObject();
		desc = (String) ois.readObject();
	}
}