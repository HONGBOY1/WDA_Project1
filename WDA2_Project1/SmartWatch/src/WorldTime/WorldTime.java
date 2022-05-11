package WorldTime;

import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class WorldTime extends JFrame{
    public boolean aa;
    public Thread t1;
    public JLabel lblCenter;
	public Object now;

    public WorldTime(){
            
    }

    public void ThreadTime() {
        t1 = new Thread() {
           public void run() {
               
               while(aa){
               Calendar cal = Calendar.getInstance();
                   
                   // String으로 객체를 생성하는것보다
                   // 메모리를 더 효율적으로 사용하기 위해서 StirngBuffer 사용
                   
                   StringBuffer now = new StringBuffer();
                   
                   now.append(cal.get(Calendar.HOUR_OF_DAY));
                   now.append("시");
                   now.append(cal.get(Calendar.MINUTE));                    
                   now.append("분");
                   now.append(cal.get(Calendar.SECOND));
                   now.append("초");

                   lblCenter.setText(now.toString());
                              
               try {
                    Thread.sleep(1000); 
               } catch(InterruptedException ie) {
                   ie.printStackTrace();
                   aa = false;
               }
           }
               
           }
       };
       t1.start();
   }
}