package scrabble;

import java.util.List;

public class DictionaryImpl implements Dictionary
{
	private List<String> wordList;
	
	public DictionaryImpl(List<String> wordList) {
		this.wordList = wordList;
	}
	
	@Override
	public boolean contains(String string) {
		return wordList.contains(string);
	}
}
