package WorldTime;

import javax.swing.JFrame;

public class WorldTime extends JFrame{
    public WorldTime(){
        
    }
    public void set(){
        setTitle("SmartWatch");
        setSize(500,500);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}