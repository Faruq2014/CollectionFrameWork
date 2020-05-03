package MapInterface;

import java.util.Collection;
import java.util.Set;

public class MapBasicRule {
	/*
	 * Map is not child of collection interface. key and value pairs where key and
	 * value both are objects key can not be duplicated. value could be duplicated
	 * key and value together called an entry. group of entry objects called map.
	 * collection related terminology is not applicable to map methods: put(object
	 * key, object value): to add one key value pair to the map. if the key is
	 * value. already present old value will be replaced with new value. but returns
	 * old void putAll(map,m) void get(object key) void remove(object key) boolean
	 * contains(object key) boolean containValue(object value) boolean isEmpty() int
	 * size() void clear()
	 */
	public static void main(String[] args) {

	}

	void put(Object key, Object value) {
		/*
		 * to add one key value pair to the map. if the key is
		 *
		 * already present old value will be replaced with new value. but returns
		 * oldvalue.
		 */
	}

	void putAll() {
		// to put map object
	}

	void get(Object key) {
		return;
	}

	void remove(Object key) {

	}

	boolean contains(Object key) {
		return false;

	}

	boolean containValue(Object value) {
		return false;

	}

	boolean isEmpty() {
		return false;

	}

	int size() {
		return 0;

	}

	void clear() {
		// delete all.
	}

	Set keyset() {
		// return only key object.
		return null;
	}

	Collection values() {
		// return only values.
		return null;

	}

	Set setEntrySet() {
		// retun entry
		return null;

	}

}