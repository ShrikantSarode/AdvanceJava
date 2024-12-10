package example.hibernate.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import example.hibernate.bean.ActorData;
import example.hibernate.utils.HibernateConfig;

public class HqlConstructorExpressionExample {

	public static void main(String[] args) {
		try (SessionFactory factory = HibernateConfig.getSessionFactory(); 
				Session session = factory.openSession();) {
			String hqlQuery = "select new example.hibernate.bean.ActorData(act.firstName, act.age) from Actor act";
			Query<ActorData> queryRef = session.createQuery(hqlQuery, ActorData.class);
			List<ActorData> actorList = queryRef.list();
			for (ActorData actorData : actorList) {
				System.out.println(actorData);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
