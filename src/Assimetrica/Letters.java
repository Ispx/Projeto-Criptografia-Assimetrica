package Assimetrica;


import java.util.ArrayList;
import java.util.List;

public class Letters {
	protected List<String> letters = new ArrayList<>(){{add("a");add("b");add("c");add("d");add("e");add("f");add("g");add("h");add("i");add("j");add("k");add("l");add("m");add("n");add("o");add("p");add("q");add("r");add("s");add("t");add("u");add("v");add("w");add("x");add("y");add("z");}};

	public Letters() {
		
	}

	public void addLetters(String letters) {
		this.letters.add(letters);
	}
	
	public int size() {
		return letters.size();
	}



}
