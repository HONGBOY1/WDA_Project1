package WorldTime;

import java.util.Calendar;
import java.util.TimeZone;
import java.awt.image.BufferedImage;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.annotation.processing.RoundEnvironment;
import javax.swing.ImageIcon;
import javax.swing.JButton;



public class WorldTime extends JFrame{
    public boolean oftf;
    
    public JFrame f1 = new JFrame("세계시간");
       
    
    public boolean aa;
    public boolean bb;
    public boolean cc;
    public boolean dd;
    public boolean ee;
    public boolean ff;
    public boolean gg;
    public boolean hh;
    public boolean ii;
    public boolean jj;
    public Thread t1;
    public Thread t2;
    public Thread t3;
    public Thread t4;
    public Thread t5;
    public Thread t6;
    public Thread t7;
    public Thread t8;
    public Thread t9;
    public Thread t10;
    public JLabel lblCenter;
    public Object now;

   
    public JLabel lblNorth;



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
            public void run(){

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
                        }catch(InterruptedException ie) {
                            ie.printStackTrace();
                            bb = false;
                        }
                     }
                }
            };
            t2.start();
        }
        public void ParisTime() {
            t3 = new Thread() {
                public void run(){
    
                    while(cc){
    
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
    
                            try {
                                Thread.sleep(1000);
                            }catch(InterruptedException ie) {
                                ie.printStackTrace();
                                cc = false;
                            }
                         }
                    }
                };
                t3.start();
            }

            public void NewYorkTime() {
                t4 = new Thread() {
                    public void run(){
        
                        while(dd){
        
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
        
                                try {
                                    Thread.sleep(1000);
                                }catch(InterruptedException ie) {
                                    ie.printStackTrace();
                                    dd = false;
                                }
                             }
                        }
                    };
                    t4.start();
                }

                public void Sao_PauloTime() {
                    t5 = new Thread() {
                        public void run(){
            
                            while(ee) {
            
                                Calendar cal = Calendar.getInstance();
                                TimeZone zone = TimeZone.getTimeZone("America/Sao_Paulo");
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
                                    }catch(InterruptedException ie) {
                                        ie.printStackTrace();
                                        ee = false;
                                    }
                                 }
                            }
                        };
                        t5.start();
                    }

                    public void LATime() {
                        t6 = new Thread() {
                            public void run(){
                
                                while(ff) {
                
                                    Calendar cal = Calendar.getInstance();
                                    TimeZone zone = TimeZone.getTimeZone("America/Los_Angeles");
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
                                        }catch(InterruptedException ie) {
                                            ie.printStackTrace();
                                            ff = false;
                                        }
                                     }
                                }
                            };
                            t6.start();
                        }

                        public void HongKongTime() {
                            t7 = new Thread() {
                                public void run(){
                    
                                    while(gg) {
                    
                                        Calendar cal = Calendar.getInstance();
                                        TimeZone zone = TimeZone.getTimeZone("Asia/Hong_Kong");
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
                                            }catch(InterruptedException ie) {
                                                ie.printStackTrace();
                                                gg = false;
                                            }
                                         }
                                    }
                                };
                                t7.start();
                            }

                            public void SydneyTime() {
                                t8 = new Thread() {
                                    public void run(){
                        
                                        while(hh) {
                        
                                            Calendar cal = Calendar.getInstance();
                                            TimeZone zone = TimeZone.getTimeZone("Australia/Sydney");
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
                                                }catch(InterruptedException ie) {
                                                    ie.printStackTrace();
                                                    hh = false;
                                                }
                                             }
                                        }
                                    };
                                    t8.start();
                                }
                                public void SeoulTime() {
                                    t9 = new Thread() {
                                        public void run(){
                            
                                            while(ii) {
                            
                                                Calendar cal = Calendar.getInstance();
                                                TimeZone zone = TimeZone.getTimeZone("Asia/Seoul");
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
                                                    }catch(InterruptedException ie) {
                                                        ie.printStackTrace();
                                                        ii = false;
                                                    }
                                                 }
                                            }
                                        };
                                        t9.start();
                                    }

                             
                                    
                                    public void NairobiTime() {
                                        t10 = new Thread() {
                                            public void run(){
                                
                                                while(jj) {
                                
                                                    Calendar cal = Calendar.getInstance();
                                                    TimeZone zone = TimeZone.getTimeZone("Africa/Nairobi");
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
                                                        }catch(InterruptedException ie) {
                                                            ie.printStackTrace();
                                                            jj = false;
                                                        }
                                                     }
                                                }
                                            };
                                            t10.start();
                                        }

                                        
    


    

  
 


   public WorldTime(){

    
 

    JPanel p1 = new JPanel();
    JLabel imgLbl = new JLabel();
    ImageIcon bsImg = new ImageIcon(getClass().getResource("../IMG/WorldMap.png"));

    imgLbl.setIcon(bsImg);
    imgLbl.setBounds(0, 250, 900,570);
    
   

    JButton btn1 = new JButton("런던");
    btn1.setBounds(380,130,60,40);

    JButton btn2 = new JButton("파리");
    btn2.setBounds(400,180,60,40);

    JButton btn3 = new JButton("뉴욕");
    btn3.setBounds(180,200,60,40);

    JButton btn4 = new JButton("상파울루");
    btn4.setBounds(250,350,100,40);

    JButton btn5 = new JButton("LA");
    btn5.setBounds(70,200,60,40);

    JButton btn6 = new JButton("홍콩");
    btn6.setBounds(700,220,60,40);

    JButton btn7 = new JButton("시드니");
    btn7.setBounds(750,450,80,40);

    JButton btn8 = new JButton("서울");
    btn8.setBounds(730,180,60,40);

    JButton btn9 = new JButton("나이로비");
    btn9.setBounds(470,350,100,40);

  
    f1.add(btn1);
    f1.add(btn2);
    f1.add(btn3);
    f1.add(btn4);
    f1.add(btn5);
    f1.add(btn6);
    f1.add(btn7);
    f1.add(btn8);
    f1.add(btn9);
    f1.add(p1);
    p1.add(imgLbl);
    f1.setSize(870,570);
    f1.setLocation(1250,250);
    f1.setVisible(true);
    p1.setBackground(Color.WHITE);

 
    btn1.addActionListener(event ->{
        bb = true;
        aa = false;
        cc = false;
        dd = false;
        ee = false;
        ff = false;
        gg = false;
        hh = false;
        ii = false;
        jj = false;
        RondonTime();

    });

    btn2.addActionListener(event ->{
        cc = true;
        aa = false;
        bb = false;
        dd = false;
        ee = false;
        ff = false;
        gg= false;
        hh = false;
        ii = false;
        jj = false;
        ParisTime();

       });

       
    btn3.addActionListener(event ->{
        dd = true;
        aa = false;
        bb = false;
        cc = false;
        ee = false;
        ff = false;
        gg = false;
        hh = false;
        ii = false;
        jj = false;
        NewYorkTime();

       });

       btn4.addActionListener(event ->{
           ee = true;
           aa = false;
           bb = false;
           cc = false;
           dd = false;
           ff = false;
           gg = false;
           hh = false;
           ii = false;
           jj = false;
           Sao_PauloTime();
      

       });
       btn5.addActionListener(event ->{
           ff = true;
           aa = false;
           bb = false;
           cc = false;
           dd = false;
           ee = false;
           gg = false;
           hh = false;
           ii = false;
           jj = false;

           LATime();

       });
       btn6.addActionListener(event ->{
          gg = true;
          aa = false;
          bb = false;
          cc = false;
          dd = false;
          ee = false;
          ff = false;
          hh = false;
          ii = false;
          jj = false;
          HongKongTime();

       });

       btn7.addActionListener(event ->{
           hh = true;
           aa = false;
           bb = false;
           cc = false;
           dd = false;
           ee = false;
           ff = false;
           gg = false;
           ii = false;
           jj = false;
           SydneyTime();
       });

        btn8.addActionListener(event ->{
            ii = true;
            aa = false;
            bb = false;
            cc = false;
            dd = false;
            ee = false;
            ff = false;
            gg = false;
            hh = false;
            jj = false;

            SeoulTime();
      
       });

       btn9.addActionListener(event ->{
        jj = true;
        aa = false;
        bb = false;
        cc = false;
        dd = false;
        ee = false;
        ff = false;
        gg = false;
        hh = false;
        ii = false;

        NairobiTime();
  
   });

       
  }
}

  



    


       

          
       

   
     


      

    






