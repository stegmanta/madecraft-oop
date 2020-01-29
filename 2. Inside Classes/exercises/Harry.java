// package exercises;

public class Harry {

	private boolean cloakOn;
	private String spell;

	Harry() {
		System.out.println("making Harry Potter...");
	}

	void castSpell(String spell) {
		System.out.println("casting spell: " + spell);
	}

	 	String makeInvisible(boolean invisible) {
		this.cloakOn = invisible;

		if (cloakOn)
			System.out.println("Harry is invisible");
		else
			System.out.println("Harry is visible");
	}

	void spyOnSnape() {
		System.out.println("Harry sees Professor Snape doing nefarious things.");
	}

	public static void main(String[] args) {
		// 1. make harry potter
		Harry potter = new Harry();
		// 2. become invisible
		// potter.makeInvisible();
		// 3. spy on professor snape
		potter.spyOnSnape();
		// 4. become visible again
		//do spell
		potter.castSpell("PoopSock");
	}

}
