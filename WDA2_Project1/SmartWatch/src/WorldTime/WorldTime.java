package WorldTime;

import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class WorldTime extends JFrame{
    public boolean aa;
    public Thread t1;
    public JLabel lblCenter;

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
    /*    
    public void timeget(){
        while(aa){
            Calendar t = Calendar.getInstance();
            int year = t.get(Calendar.YEAR);        //연도를 받아온다.
            int month = t.get(Calendar.MONTH);      //월를 받아온다.
            int date = t.get(Calendar.DATE);        //일를 받아온다.
            int day = t.get(Calendar.DAY_OF_MONTH); //요일을 가저온다
            int amPm = t.get(Calendar.AM_PM);       //오전/오후 받아온다.
            int hour = t.get(Calendar.HOUR);        //시를 받아온다.
            int min = t.get(Calendar.MINUTE);       //분를 받아온다.
            int sec = t.get(Calendar.SECOND);       //초를 받아온다.
            int msec = t.get(Calendar.MILLISECOND); //msec를 리턴 그러나 적요하지 않음.
            System.out.println(hour + "시"+ min +"분");
            try{
                Thread.sleep(100); // 0.1.초
            } catch(InterruptedException ie) {
 
                ie.printStackTrace();
        
                aa = false;
            }
        }
    }
    */
}