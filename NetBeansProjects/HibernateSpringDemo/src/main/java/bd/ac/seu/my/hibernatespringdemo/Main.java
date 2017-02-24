/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.ac.seu.my.hibernatespringdemo;

import bd.ac.seu.my.hibernatespringdemo.molel.Student;
import bd.ac.seu.my.hibernatespringdemo.utill.SessionFactorySingleton;
import org.hibernate.Session;

/**
 *
 * @author shithilboss
 */
public class Main {

    public static void main(String[] args) {
        Session session = SessionFactorySingleton.getSessionFactory().openSession();


        session.beginTransaction();
        Student student = new Student("2012200000026", "Shithil");
        session.save(student);
        session.getTransaction().commit();


        session.close();
        
        SessionFactorySingleton.getSessionFactory().close();

    }

}
