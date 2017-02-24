/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.ac.seu.my.hibernatespringdemo.utill;

import org.hibernate.*;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 *
 * @author shithilboss
 */
public class SessionFactorySingleton {
    private static SessionFactory sessionFactory;
    private static final SessionFactorySingleton instance = new SessionFactorySingleton();

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    private SessionFactorySingleton() {
    	// A SessionFactory is set up once for an application!
	final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
			.configure() // configures settings from hibernate.cfg.xml
			.build();
	try {
		sessionFactory = new MetadataSources( registry ).buildMetadata().buildSessionFactory();
	}catch(Exception e){
            e.printStackTrace();
        }
    }

}
