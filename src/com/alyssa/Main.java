package com.alyssa;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	    LinkedList<String> characters = new LinkedList<String>();
	    try {
			characters.add("Edelgard");
			characters.add("Hubert");
			characters.add("Hilda");
			characters.add("Dimitri");
			characters.add("Dedue");
			characters.add("Jeritza");
			characters.add("Manuela");
			characters.add("Byleth");
			characters.add("Jeralt");
			characters.add("Hanneman");
			characters.add("Claude");
			characters.add("Lysithea");
			characters.add("Ashe");
			characters.add("Felix");
			characters.add("Sylvain");
			characters.add("Annette");
			characters.add("Mercedes");
			characters.add("Dorothea");
			characters.add("Petra");
			characters.add("Catherine");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	    finally {
			System.out.println(characters);
		}

	    try {
			characters.addFirst("Leonie");
			characters.addLast("Caspar");
			characters.add(10, "Linhardt");
		}
	    catch(Exception e) {
			e.printStackTrace();
		}
	    finally {
			System.out.println(characters);
		}

	    String get = characters.get(3);
	    System.out.println(get);

	    characters.toArray();
	    System.out.println(characters);

	    Object characterClone = characters.clone();
	    System.out.println(characterClone);

		characters.clear();
		System.out.println(characters);
    }
}
