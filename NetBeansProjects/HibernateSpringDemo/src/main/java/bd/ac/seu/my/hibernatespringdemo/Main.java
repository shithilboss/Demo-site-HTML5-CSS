/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.ac.seu.my.hibernatespringdemo;

import bd.ac.seu.my.hibernatespringdemo.molel.Student;
import bd.ac.seu.my.hibernatespringdemo.utill.SessionFactorySingleton;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.hibernate.Session;

/**
 *
 * @author shithilboss
 */
public class Main extends Application{
        private static Stage mainStage;

    @Override
    public void start(Stage stage) throws Exception {
        
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/springDemoFXMLUI.fxml"));
        
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/styles/springdemofxmlui.css");
        
        stage.setTitle("JavaFX and Maven");
        stage.setScene(scene);
        stage.show();
    }
    public static Stage getMainStage() {
        return mainStage;
    }

    public static void main(String[] args) {
        launch(args);
//      Session session = SessionFactorySingleton.getSessionFactory().openSession();
//
//
//        session.beginTransaction();
//       Student student = new Student();
//        session.save(student);
//        session.getTransaction().commit();
//
//
//        session.close();
//        
//        SessionFactorySingleton.getSessionFactory().close();

    }

}
