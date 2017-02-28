/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.ac.seu.my.hibernatespringdemo;

import bd.ac.seu.my.hibernatespringdemo.molel.Student;
import bd.ac.seu.my.hibernatespringdemo.utill.SessionFactorySingleton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * FXML Controller class
 *
 * @author shithilboss
 */
public class SpringDemoFXMLUIController implements Initializable {

  //  private TextField studentID;
   // private TextField studentName;

    /**
     * Initializes the controller class.
     */
   // private SessionFactory factory;
   // private Session session;
    private Transaction transaction;
    @FXML
    private TextField studentIDfield;
    @FXML
    private TextField studentNamefield;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handelSubmitAction(ActionEvent event) {
        String studentId = studentIDfield.getText();
        String name = studentNamefield.getText();
        
        Student student = new Student(studentId, name);
       
        
        try(Session session = SessionFactorySingleton.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            // factory = SessionFactorySingleton.getSessionFactory();
            //  session = factory.openSession();
            
            try{
                session.save(student);
                transaction.commit();
            }catch(Exception e){
                // e.printStackTrace();// transaction.rollback();
            }
        }
        
        
        studentIDfield.setText("");
        studentNamefield.setText("");
       // SessionFactorySingleton.getSessionFactory().close();
    }
    
}
