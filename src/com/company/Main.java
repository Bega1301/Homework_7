package com.company;

import org.w3c.dom.ls.LSOutput;

public class Main {

	public static void main(String[] args) {
		Salmon salmon= new Salmon();
		salmon.setOcean("Atlantic");
		salmon.setName("Salmon Fish");
		salmon.setWeight(5);
		printInfo(salmon);

		salmon.forSale();
		salmon.makeFood();

		Tuna tuna= new Tuna();
		tuna.setOcean("Indian");
		tuna.setName("Tuna fish");
		tuna.setWeight(3);
		printInfo(tuna);

		tuna.forSale();

		Fish [] arr = {new Salmon(), new Tuna()};
		for (int i = 0; i < arr.length; i++) {
			arr [i].forSale();
			arr [i].makeFood();

		}
    }
    public static  void printInfo (Fish a){
		System.out.println(a.getName()+":"+ a.getOcean()+" Ocean "+a.getWeight()+" kg per piece");


	}




}
