/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentapplication.view;


import com.raven.main.Main;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Manidu
 */


@Setter
@Getter
public class ViewNavigator {
          private   AdminFrame adminFrame ;
          private CustomerFrame customerFrame;
          private  MainFrame mainFrame;
          private Main chartFrame;
          
          private static ViewNavigator navigator;
          private ViewNavigator(){
              
          }
          
          public static ViewNavigator getInstance(){
                    if(navigator ==null){
                            navigator =new ViewNavigator();
                    }
                    return navigator;
          }
          
          public void disposeAdminFrame(){
                this.adminFrame.dispose();
          }
          public void visibleAdminFrame(){
              this.adminFrame.setVisible(true);
          }
          
           public void disposeCustomerFrame(){
                this.customerFrame.dispose();
          }
          public void visibleCustomerFrame(){
              this.customerFrame.setVisible(true);
          }
         
           public void disposeMainFrame(){
                this.mainFrame.dispose();
          }
          public void visibleMainFrame(){
              this.mainFrame.setVisible(true);
          }
          
               public void disposeChartFrame(){
                this.chartFrame.dispose();
          }
          public void visibleChartFrame(){
              this.chartFrame.setVisible(true);
          }
                   
}