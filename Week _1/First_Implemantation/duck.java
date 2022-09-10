/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duck;

/**
 *
 * @author ShamsRashidy
 */
public abstract class duck{
    FlyWithWings flybehiver;
    Quckbehiver quckbehiver;
    public  void performQuck(){
        quckbehiver.quck();
}
    public void pperformFly(){
    flybehiver.fly();
}
public abstract void display();
public void swim(){
    System.out.println("All duck flat, even decoys");
}

}
