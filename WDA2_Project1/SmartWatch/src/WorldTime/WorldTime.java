package WorldTime;

import java.util.Calendar;
import java.util.TimeZone;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;


public class WorldTime extends JFrame{
    public boolean oftf;
    public boolean aa;
    public boolean bb;
    public Thread t1;
    public Thread t2;
    public JLabel lblCenter;
    public Object now;
    public JFrame f1 = new JFrame();
   

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

    public void RondonTime() {
        t2 = new Thread() {
           public void run() {
               
               while(bb){

                    Calendar cal = Calendar.getInstance();
                    TimeZone zone = TimeZone.getTimeZone("Europe/London");
                    cal.setTimeZone(zone);
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
                   bb = false;
               }
           }
               
           }
       };
       t2.start();

    }

   


public WorldTime(){
    ThreadTime();


    JButton btn1 = new JButton("런던");
    btn1.setBounds(30,30,100,40);

    JButton btn2 = new JButton("파리");
    btn2.setBounds(160,30,100,40);

    JButton btn3 = new JButton("뉴욕");
    btn3.setBounds(290,30,100,40);

    JButton btn4 = new JButton("베를린");
    btn4.setBounds(420,30,100,40);

    oftf=true;

    f1.add(btn1);
    f1.add(btn2);
    f1.add(btn3);
    f1.add(btn4);
    f1.setSize(600,400);
    f1.setLayout(null);
    f1.setVisible(oftf);

    btn1.addActionListener(event ->{
        bb=true;
        aa=false;
        RondonTime();
      
    });

    btn2.addActionListener(event ->{
        Calendar cal = Calendar.getInstance();
        TimeZone zone = TimeZone.getTimeZone("Europe/Paris");
        cal.setTimeZone(zone);
        StringBuffer now = new StringBuffer();
        
        now.append(cal.get(Calendar.HOUR_OF_DAY));
        now.append("시");
        now.append(cal.get(Calendar.MINUTE));                    
        now.append("분");
        now.append(cal.get(Calendar.SECOND));
        now.append("초");
       
        lblCenter.setText(now.toString());
       });

       
    btn3.addActionListener(event ->{
        Calendar cal = Calendar.getInstance();
        TimeZone zone = TimeZone.getTimeZone("America/New_York");
        cal.setTimeZone(zone);
        StringBuffer now = new StringBuffer();
        
        now.append(cal.get(Calendar.HOUR_OF_DAY));
        now.append("시");
        now.append(cal.get(Calendar.MINUTE));                    
        now.append("분");
        now.append(cal.get(Calendar.SECOND));
        now.append("초");
       
        lblCenter.setText(now.toString());
       });

       btn4.addActionListener(event ->{
        Calendar cal = Calendar.getInstance();
        TimeZone zone = TimeZone.getTimeZone("Europe/Berlin");
        cal.setTimeZone(zone);
        StringBuffer now = new StringBuffer();
        
        now.append(cal.get(Calendar.HOUR_OF_DAY));
        now.append("시");
        now.append(cal.get(Calendar.MINUTE));                    
        now.append("분");
        now.append(cal.get(Calendar.SECOND));
        now.append("초");
       
        lblCenter.setText(now.toString());
       });
    
 
    t1.interrupt();
}
}

  



    


       

          
       

   
     


      

    






