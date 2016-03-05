package pl.tut.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import pl.tut.model.Tutorial;
import pl.tut.model.TutorialPOJO;

public interface TutorialDAO {
	public void save(TutorialPOJO tutorial);
	
	public Tutorial getTutorial(int id);
}
