package encounter;

import java.util.ArrayList;

import npcs.*;
import items.*;

public class Encounter{
	private Enviornment enviorn;
	private ArrayList<Map_Image> maps_images;
	private ArrayList<Text_Group> interestPoints;
	private ArrayList<Text_Group> readAloud;
	
	private ArrayList<NPC> npcs;
	private ArrayList<Monster> mons;
	
	private ArrayList<Item_Parent> items;
	Coin coins;
}