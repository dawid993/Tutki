package pl.tut.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import pl.tut.hibernateconf.HibernateUtill;
import pl.tut.model.Tutorial;
import pl.tut.model.user;

public class TutorialDAOImp {

	private SessionFactory sessionFactory;

	public TutorialDAOImp() {
		sessionFactory = HibernateUtill.getSessionFactory();
	}

	public void save(Tutorial tutorial) {
		Session session = sessionFactory.openSession();
		Transaction trans = session.getTransaction();

		try {
			trans.begin();
			if (tutorial.getId() == 0)
				session.persist(tutorial);
			else
				session.merge(tutorial);
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
		} finally {
			session.close();
		}
	}

	public Tutorial getTutorial(int id) {
		Session session = sessionFactory.openSession();
		Transaction trans = session.getTransaction();
		
		try {
			trans.begin();
			Tutorial tut = session.get(Tutorial.class, id);			
			trans.commit();
			return tut;
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
		} finally {
			session.close();
		}
		return null;
	}
        
        public void saveUser(user u) {
		Session session = sessionFactory.openSession();
		Transaction trans = session.getTransaction();

		try {
			trans.begin();
			if (u.getId() == 0)
				session.persist(u);
			else
				session.merge(u);
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
		} finally {
			session.close();
		}
	}
        
       	public user getUser(int id) {
		Session session = sessionFactory.openSession();
		Transaction trans = session.getTransaction();
		
		try {
			trans.begin();
			user u = session.get(user.class, id);			
			trans.commit();
			return u;
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
		} finally {
			session.close();
		}
		return null;
	} 
        
}
