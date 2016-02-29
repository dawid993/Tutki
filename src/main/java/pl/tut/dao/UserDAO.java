package pl.tut.dao;

import pl.tut.model.userClass;

public interface UserDAO {

	public void save(userClass u);
	public userClass getUserClass(int id);
}
