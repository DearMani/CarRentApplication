/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carrentapplication;
import carrentapplication.view.MainFrame;
import carrentapplication.view.ViewNavigator;





/**
 *
 * @author Manidu
 */
public class CarRentApplication {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
//         SwingUtilities.invokeLater(() -> {
//                            new MainFrame().setVisible(true);
//
//         });
 //     Session session = SessionFactoryConfiguration.getInstance().openSession();
     //  Session session = SessionFactoryConfiguration.getInstance().openSession(); 
     
     
    MainFrame mainFrame =new MainFrame();
     mainFrame.setVisible(true);
    ViewNavigator.getInstance().setMainFrame(mainFrame);
       
    // Main mainFrame =new Main();
  //  mainFrame.setVisible(true);
   //  ViewNavigator.getInstance().setMainFrame(mainFrame);     

       
  //  new AdminFrame().setVisible(true);
         
    }
    
}