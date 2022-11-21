/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package osi_implemntation_chinoredpe;

/**
 *
 * @author ShamsRashidy
 */
public abstract class AbstractLogger {

    public static int HTTP = 1;
    public static int TLS = 2;
    public static int PPTP = 3;
    public static int TCP = 4;
    public static int IP = 5;
    public static int MAC = 6;
    public static int DSL = 7;

    protected int level;

    //next element in chain or responsibility
    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message) {
        if (this.level <= level) {
            write(message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

    abstract protected void write(String message);

}
