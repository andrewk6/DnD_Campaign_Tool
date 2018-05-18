import java.awt.EventQueue;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JFrame;

import items.Armor;
import items.Coin;
import items.Item;
import items.MagicItem;
import items.Weapon;

public class DM_Window {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		System.out.println("Hello");
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DM_Window window = new DM_Window();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DM_Window() {
		System.out.println("Calling Export");
		export();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void export() {
		System.out.println("Hello Out There");
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
