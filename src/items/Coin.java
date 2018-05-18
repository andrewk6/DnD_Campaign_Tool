package items;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Coin implements Serializable{
	//Coin Constants
	public static final int COIN_COPPER = 0;
	public static final int COIN_SILVER = 1;
	public static final int COIN_ELECTRUM = 2;
	public static final int COIN_GOLD = 3;
	public static final int COIN_PLATINUM = 4;
	
	private int[] coins = new int[5];
	
	public Coin() {
		for(int c1 = 0; c1 < coins.length; c1 ++)
			coins[c1] = 0;
	}
	
	public Coin(int[] coins) {
		if(coins.length > this.coins.length)
			throw new IllegalArgumentException("Invalid Coin Array");
		for(int c1 = 0; c1 < coins.length; c1 ++)
			this.coins[c1] = coins[c1];
	}
	
	public Coin(int coin, int val) {
		if(coin < this.COIN_COPPER || coin > this.COIN_PLATINUM)
			throw new IllegalArgumentException("Invalid COin Type");
		for(int c1 = 0; c1 < coins.length; c1 ++) {
			if(c1 == coin)
				coins[c1] = val;
			else
				coins[c1] = 0;	
		}
	}
	
	public int getCopper() {
		return coins[this.COIN_COPPER];
	}
	
	public int getSilver() {
		return coins[this.COIN_SILVER];
	}
	
	public int getElectrum() {
		return coins[this.COIN_ELECTRUM];
	}
	
	public int getGold() {
		return coins[this.COIN_GOLD];
	}
	
	public int getPlatinum() {
		return coins[this.COIN_PLATINUM];
	}
	
	private void writeObject(ObjectOutputStream oos) throws IOException{
		oos.defaultWriteObject();
		
		for(int c1 = 0; c1 < 5; c1 ++)
			oos.writeInt(coins[c1]);
	}
	
	private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
		ois.defaultReadObject();
		
		for(int c1 = 0; c1 < 5; c1 ++)
			coins[c1] = ois.readInt();
	}
}