package scrabble;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TileTranslatorImpl implements TileTranslator
{
	private Map<String, Set<String>> tileToTranslationSetMap;
	
	public TileTranslatorImpl(Map<String, Set<String>> tileToTranslationSetMap)
	{
		this.tileToTranslationSetMap = tileToTranslationSetMap;
	}
	
	@Override
	public Set<String> getTileSet() 
	{
		return tileToTranslationSetMap.keySet();
	}

	@Override
	public Set<String> getTranslationSet(String tile) 
	{
		return tileToTranslationSetMap.get(tile);
	}

	@Override
	public Set<String> getTranslationUniverse() 
	{
		List<String> tileList = new ArrayList<String>(getTileSet());
		Set<String> tileTranslationSet = new HashSet<String>();
		for(int i=0; i<tileList.size(); i++) {
			String tile = tileList.get(i);
			tileTranslationSet.add(tile);
		}
		return tileTranslationSet;
		
	}
}