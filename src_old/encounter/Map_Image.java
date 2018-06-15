package encounter;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Map_Image implements Serializable{
	private String name, link, desc;
	
	public Map_Image() {
		name = "Null Image";
		link = "Broken Link";
		desc = "NO DESC";
	}
	
	public Map_Image(String name, String link, String desc) {
		this.name = name;
		this.link = link;
		this.desc = desc;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
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
		oos.writeObject(link);
		oos.writeObject(desc);
	}
	
	private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
		ois.defaultReadObject();
		
		name = (String) ois.readObject();
		link = (String) ois.readObject();
		desc = (String) ois.readObject();
	}
}