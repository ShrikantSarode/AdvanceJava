package example.jdbc.dao;

import java.util.Collection;

public interface DaoInterface<T, K> {

	//get all data
	Collection<T> retrieveAll();
}
