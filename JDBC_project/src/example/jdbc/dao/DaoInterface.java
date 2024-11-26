package example.jdbc.dao;

import java.util.Collection;

public interface DaoInterface<T, K> {

	// A method to retrieve all records
	Collection<T> retrieveAll();

	// A method to retrieve a single record based upon its Identity
	T retrieveOne(K key);
}
