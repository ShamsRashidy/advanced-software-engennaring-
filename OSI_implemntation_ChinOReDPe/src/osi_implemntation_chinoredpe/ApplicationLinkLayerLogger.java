/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package osi_implemntation_chinoredpe;

/**
 *
 * @author ShamsRashidy
 */
public class ApplicationLinkLayerLogger extends AbstractLogger {

   public ApplicationLinkLayerLogger(int level){
      this.level = level;
   }

   @Override
   protected void write(String message) {		
      System.out.println("Application Layer::Logger: " + message);
   }
}
