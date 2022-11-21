/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package osi_implemntation_chinoredpe;

/**
 *
 * @author ShamsRashidy
 */
public class PresentationLinkLayerLogger extends AbstractLogger {

   public PresentationLinkLayerLogger(int level){
      this.level = level;
   }

   @Override
   protected void write(String message) {		
      System.out.println("Presentation Layer::Logger: " + message);
   }
}
