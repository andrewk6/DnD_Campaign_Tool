package encounter;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import npcs.*;
import items.*;

public class Encounter{
	private Enviorn enviorn;
	private ArrayList<Map_Image> maps_images;
	private ArrayList<Text_Group> interestPoints;
	private ArrayList<Text_Group> readAloud;
	
	private ArrayList<NPC> npcs;
	private ArrayList<Monster> mons;
	
	private ArrayList<Item_Parent> items;
	Coin coins;
	
	private void writeObject(ObjectOutputStream oos) throws IOException{
		oos.defaultWriteObject();
		
		oos.writeObject(enviorn);
		oos.writeObject(maps_images);
		oos.writeObject(interestPoints);
		oos.writeObject(readAloud);
		oos.writeObject(npcs);
		oos.writeObject(npcs);
		oos.writeObject(mons);
		oos.writeObject(items);
		oos.writeObject(coins);
	}
	
	private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
		ois.defaultReadObject();
		
		enviorn = (String) ois.readObject();
		map_images = (String) ois.readObject();
		interestPoints = (String) ois.readObject();
		readAloud = 
		
	}
}