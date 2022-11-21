/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package osi_implemntation_chinoredpe;

/**
 *
 * @author ShamsRashidy
 */
public class OSI_implemntation_ChinOReDPe {

    private static AbstractLogger getChainOfLoggers() {

        AbstractLogger AppLayer = new NetworkLayerLogger(AbstractLogger.HTTP);
        AbstractLogger PreLayer = new NetworkLayerLogger(AbstractLogger.TLS);
        AbstractLogger SesLayer = new DataLinkLayerLogger(AbstractLogger.PPTP);
        AbstractLogger TranLayer = new PhysicalLayerLogger(AbstractLogger.TCP);
        AbstractLogger NetLayer = new NetworkLayerLogger(AbstractLogger.IP);
        AbstractLogger DataLayer = new DataLinkLayerLogger(AbstractLogger.MAC);
        AbstractLogger PhyLayer = new PhysicalLayerLogger(AbstractLogger.DSL);

        /////////////////////////////////
        //SENDER
        AppLayer.setNextLogger(PreLayer);
        PreLayer.setNextLogger(SesLayer);
        SesLayer.setNextLogger(TranLayer);
        TranLayer.setNextLogger(NetLayer);
        NetLayer.setNextLogger(DataLayer);
        DataLayer.setNextLogger(PhyLayer);
        /////////////////////////////////
        //RECEVER
        ///////////////////////////////
//        PhyLayer.setNextLogger(DataLayer);
//        DataLayer.setNextLogger(NetLayer);
//        NetLayer.setNextLogger(TranLayer);
//        TranLayer.setNextLogger(SesLayer);
//        SesLayer.setNextLogger(PreLayer);
//        PreLayer.setNextLogger(AppLayer);

        return AppLayer;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();
        ///SENDER
        loggerChain.logMessage(AbstractLogger.HTTP,
                "Application Layer:SENDER - coded HTTP");
        loggerChain.logMessage(AbstractLogger.TLS,
                "Presentation Layer:SENDER - coded TLS");
        loggerChain.logMessage(AbstractLogger.PPTP,
                "Sesseion Layer:SENDER - coded PPTP");
        loggerChain.logMessage(AbstractLogger.TCP,
                "Transport Layer:SENDER - coded TCP");
        loggerChain.logMessage(AbstractLogger.IP,
                "Network Layer:SENDER - coded IP");
        loggerChain.logMessage(AbstractLogger.MAC,
                "DataLink Layer:SENDER - coded MAC");
        loggerChain.logMessage(AbstractLogger.DSL,
                "Physical Layer:SENDER - coded DSL");
        /// RECerver
        loggerChain.logMessage(AbstractLogger.DSL,
                "Physical Layer:REC - decoded DSL");
        loggerChain.logMessage(AbstractLogger.MAC,
                "DataLink Layer:REC - decoded MAC");
        loggerChain.logMessage(AbstractLogger.IP,
                "Network Layer:REC - decoded IP");
        loggerChain.logMessage(AbstractLogger.TCP,
                "Transport Layer:REC - decoded TCP");
        loggerChain.logMessage(AbstractLogger.PPTP,
                "Sesseion Layer:REC - decoded PPTP");
        loggerChain.logMessage(AbstractLogger.TLS,
                "Presentation Layer:REC - decoded TLS");

        loggerChain.logMessage(AbstractLogger.HTTP,
                "Application Layer:REC - decoded HTTP");

    }

}
