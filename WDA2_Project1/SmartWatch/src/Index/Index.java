package Index;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import App.App;

import java.awt.Image;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.Dimension;

import Calculator.Calculator;
import Map.Map;
import Calendar.Calendar;

public class Index extends JFrame {
    private JButton Calendar;  // 달력 버튼
    private JButton Calculator;// 계산기 버튼
    private JButton Map;       // 맵 버튼
    private JButton Time;      // 시계 버튼
    
    JFrame f = new JFrame("제목");

    public Index(){

        Calendar = new JButton("달력");
        Calculator = new JButton("계산기");
        Map = new JButton("지도");
        Time = new JButton("시계");
            
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel();
        JPanel p5 = new JPanel();

      
       
        JLabel imgLbl = new JLabel();
       
        ImageIcon bsImg = new ImageIcon(getClass().getResource("../IMG/watch.png"));
        imgLbl.setIcon(bsImg);
        imgLbl.setBounds(0, 250, 100, 100);
        
      

        p5.add(imgLbl);

        p1.setBounds(110, 200, 80, 80);       //달력
        p2.setBounds(270, 380, 80, 80);       //계산기
        p3.setBounds(270, 200, 80, 80);       //지도
        p4.setBounds(190, 290, 80, 80);       //시계
        
        p1.add(Calendar);
        p2.add(Calculator);
        p3.add(Map);
        p4.add(Time);

      
        p1.setBackground(Color.BLACK);
        p2.setBackground(Color.BLACK);
        p3.setBackground(Color.BLACK);
        p4.setBackground(Color.BLACK);
        p5.setBackground(Color.BLACK);
        
        f.add(p1);
        f.add(p2);
        f.add(p3);
        f.add(p4);
        f.add(p5);
        /**  
        * 이동하는 이벤트 버튼 
        */
        
        Calendar.addActionListener((e)->{
            new Calendar();
            f.setVisible(false);
        });
        Calculator.addActionListener((e)->{
            new Calculator();
            f.setVisible(false); 
        });
        Map.addActionListener((e)->{
            new Map();
            f.setVisible(false);
        });
        Time.addActionListener((e)->{
            new App();
            f.setVisible(false); 
        });

         // 스윙 창 띄우기
        Dimension frameSize = getSize();
        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
        
        f.setLocation((windowSize.width - frameSize.width) / 2,
                (windowSize.height - frameSize.height) / 2);
         f.setTitle("Smart Watch");
         f.setSize(450,680);
         f.setDefaultCloseOperation(EXIT_ON_CLOSE);
         f.setLocationRelativeTo(null);
         f.setVisible(true);
         
    }

    public static void main(String[] args)  {
        JFrame.setDefaultLookAndFeelDecorated(true);
        new Index();  
    }
}
