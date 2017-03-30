/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7b_2;

/**
 *
 * @author andro
 */
interface TVStation {

    String SATELLITE_NAME = "SKY Network";
    String CABLE_TV_NAME = "TATA";
    double SIGNAL_FREQUENCY = 67;

    abstract void show();
}

class Programme {
    
    String programmeName;
    String sponser;
    
    Programme(String programmeName, String sponser) {
        this.programmeName = programmeName;
        this.sponser = sponser;
    }
    
    void display() {
        System.out.println("Programme Name : " + this.programmeName);
        System.out.println("Sponser : " + this.sponser);
    }
}

class Broadcast extends Programme implements TVStation {

    public Broadcast(String programmeName, String sponser) {
        super(programmeName, sponser);
    }

    @Override
    public void show() {
        System.out.println("Satellite Name : " + SATELLITE_NAME);
        System.out.println("Cable TV Name : " + CABLE_TV_NAME);
        System.out.println("Signal Frequency : " + SIGNAL_FREQUENCY);
    }
}

public class Lab7b_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Broadcast broadcast = new Broadcast("MasterChef", "Ford");
        broadcast.display();
        broadcast.show();
        
        
    }

}
