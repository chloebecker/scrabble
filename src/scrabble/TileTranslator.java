package scrabble;

import java.util.Set;

public interface TileTranslator
{
	//The return value is the domain of this TileTranslator instance
	//part of post: !rv.contains(null)
	//part of post: String e in rv ==> e.codePointCount(0, e.length()) == 1
	public Set<String> getTileSet(); //first column --> set
	//part of post: !rv.contains(null)
	//part of post: String e in rv ==> e.codePointCount(0, e.length()) == 1
	public Set<String> getTranslationUniverse(); // second column --> set
	//part of pre: getTileSet().contains(tile)
	//part of post: !rv.contains(null)
	//part of post: String e in rv ==> e.codePointCount(0, e.length()) == 1
	public Set<String> getTranslationSet(String tile); //first column to second column
}
