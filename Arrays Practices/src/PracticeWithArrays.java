
public class PracticeWithArrays {

	public static void main(String[] args) {
		PracticeWithArrays practiceWithArrays = new PracticeWithArrays();
		System.out.println(practiceWithArrays.howManyLetters("Mustafa", "a"));
		
		
	}
	int howManyLetters(String word,String letter) {
		
		int counter = 0;
		
		for (int i = 0; i < word.length(); i++) {
			if (word.substring(i, i+1).equals(letter)) {
				counter++;
			}
		}
		
		return counter;
	}
	
	
	

}
