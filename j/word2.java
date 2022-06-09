package j;

public class word2 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		word word = new word("hello world");
		System.out.println(word.isVowel(0));

	}
	private String letters;
	public word(String letters) {
		this.letters = letters.toLowerCase();
	}
	
	//i번째 글자가 모음인지
	public boolean isVowel(int i) {
		return "aueio".contains(letters.substring(i, i + 1));
	}
	//i번째 글자가 자음인지
	public boolean isConsonant(int i) {
		return !("aueio".contains(letters.substring(i, i + 1)));
	}
}
