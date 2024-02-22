package Lab4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

/**
 * Handles add and retrieve operations on TreeMaps.
 */
public class TreeMapHandler {
    /**
     * Creates a TreeMap containing the provides entries. If there are more than one entry with the same key,
     * the first entry value is added. Following entries with identical keys will not replace the previously added value.
     *
     * @param entries entries with key and value
     * @return TreeMap with the provided entries
     */
    public TreeMap<Integer, Integer> createTreeMap(Entry[] entries) {
    	
    	//Store entries in TreeMap
    	TreeMap<Integer, Integer> tree = new TreeMap<>();
    	
    	//Stores unique keys
    	HashSet<Integer> keySet = new HashSet<>();
    	
    	for(Entry entry : entries) { 				//O(n)
    		if(!keySet.contains(entry.key)){ 		//O(1)
    			keySet.add(entry.key);				//O(1)
    			tree.put(entry.key, entry.value);	//O(log n)
    		}
    	}
        return tree;								//Tot: O(n log n)
    }
    
    /**
     * Retrieves a Map with the entries associated with the provided keys.
     *
     * @param tree the tree map
     * @param keys keys for the entries we want to retrieve
     * @return Map containing the retrieved entries
     */
    public Map<Integer, Integer> retrieve(TreeMap<Integer, Integer> tree, int[] keys) {
    	
    	//Save the entries in TreeMap 
    	TreeMap<Integer, Integer> retrievedEntries = new TreeMap<>();
    	
    	for(int i : keys) {										//O(n)
    		retrievedEntries.put(i, tree.get(i));				//O(log n)
    	}
    	
        return retrievedEntries;								//Tot: O(n log n)
    }
    
    /**
     * Retrieves a Map containing the entries between the provided keys (including the from and to key).
     * @param tree the TreeMap
     * @param fromKey low endpoint of keys (inclusive)
     * @param toKey high endpoint of keys (inclusive)
     * @return Map containing the entries between the provided keys (including the from and to key)
     */
    public Map<Integer, Integer> retrieve(TreeMap<Integer, Integer> tree, int fromKey, int toKey) {

    	TreeMap<Integer, Integer> retrievedEntries = new TreeMap<>();
    	
    	for(int i = fromKey; i <= toKey; i++) {					//O(n)
    		if(tree.containsKey(i)) {							//O(log n)
    			retrievedEntries.put(i, tree.get(i));			//O(log n)
    		}
    	}	
        return retrievedEntries;								//Tot: O(n log n)
    }				
    /**
     * Retrieves all keys from the tree.
     * @param tree the TreeMap
     * @return Collection with all keys
     */
    public Collection<Integer> retrieveAllKeys(TreeMap<Integer, Integer> tree) {
    	
    	HashSet<Integer> keyList = new HashSet<>();
    	
    	for(Integer i : tree.keySet()) {						//O(n)
    		keyList.add(i);										//O(1)
    	}
    	
        return keyList;											//Tot: O(n)
    }
    /**
     * Retrieves all values from the tree.
     * @param tree the TreeMap
     * @return Collection with all values
     */
    public Collection<Integer> retrieveAllValues(TreeMap<Integer, Integer> tree) {

    	HashSet<Integer> valueList = new HashSet<>();
    	
    	for(Integer i : tree.values()) {						//O(n)
    		valueList.add(i);									//O(1)
    	}
    	
        return valueList;										//Tot: O(n)
    }
}