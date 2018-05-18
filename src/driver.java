import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import items.Armor;
import items.Coin;
import items.Item;
import items.MagicItem;
import items.Weapon;

public class driver{
	public static void main(String[]args) {
		
	}
	
	public void exportItems() {
		Armor a = new Armor();
		Coin c = new Coin(Coin.COIN_PLATINUM, 1234);
		Item i = new Item();
		MagicItem mI = new MagicItem();
		Weapon w = new Weapon();
		
		
		File f = new File("itemImport.dat");
		if (f.exists()) {
			System.out.println("Reading the Class");
			try {
				FileInputStream fin = new FileInputStream(f);
				ObjectInputStream ois = new ObjectInputStream(fin);
				a = (Armor) ois.readObject();
				c = (Coin) ois.readObject();
				i = (Item) ois.readObject();
				mI = (MagicItem) ois.readObject();
				w = (Weapon) ois.readObject();
				ois.close();
				//fin.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Printing the Class");
			try {
				FileOutputStream fout = new FileOutputStream(f);
				ObjectOutputStream oos = new ObjectOutputStream(fout);
				oos.writeObject(a);
				oos.writeObject(c);
				oos.writeObject(i);
				oos.writeObject(mI);
				oos.writeObject(w);
				oos.close();
				//fout.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}