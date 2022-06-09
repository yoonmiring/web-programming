
public class word {
	public static void main(String[] args) {
		word word = new word("hello world");
		System.out.println(word.isVowel(0));
		System.out.println(word.isVowel(1));
	}
	private String letters;

	public word(String letters) {
		this.letters = letters.toLowerCase();
	}
	
	//i번째 글자가 모음인지
	public boolean isVowel(int i) {
		

		return letters.substring(i,i + 1).equals("a")||letters.substring(i,i + 1).equals("i")||letters.substring(i,i + 1).equals("u")||letters.substring(i,i + 1).equals("e")||letters.substring(i,i + 1).equals("o");
	}
	
}
