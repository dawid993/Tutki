package pl.tut.dao;

import pl.tut.model.UserPOJO;

public interface UserDAO {

	public void save(UserPOJO u);
	public UserPOJO getUserClass(int id);
}
