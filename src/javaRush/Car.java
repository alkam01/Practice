package javaRush;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Car {
    private Engine engine;
      class Engine {
         private boolean isRunning;
         public void start(){
             isRunning=true;
         }
         public void stop(){
             isRunning=false;
         }
     }
}