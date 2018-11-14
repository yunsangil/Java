package word;

class Word {	
	private String EnglishWord=null;
	private String KoreanWord=null;
	
	public String getEnglishWord() {
		return EnglishWord;
	}
	public void setEnglishWord(String englishWord) {
		EnglishWord = englishWord;
	}
	public String getKoreanWord() {
		return KoreanWord;
	}
	public void setKoreanWord(String koreanWord) {
		KoreanWord = koreanWord;
	}
	public String toString() {
		return EnglishWord + " / "+ KoreanWord;
	}
}
