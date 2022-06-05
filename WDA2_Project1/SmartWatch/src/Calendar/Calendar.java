package Calendar;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Index.Index;
 

class Swing28    extends JFrame implements ActionListener{

       Container container = getContentPane();
       JPanel panel1 = new JPanel();
       JPanel panel2 = new JPanel();
       JButton buttonBefore = new JButton("Before");
       JButton buttonAfter = new JButton("After");

       JButton Previous = new JButton("이전");   // 이전 버튼
      
       JLabel label = new JLabel();

       JButton[] buttons = new JButton[49]; // 7*7 = 49
       String[] dayNames = {"일","월","화","수","목","금","토"};

       // Calendar 관리 클래스

       HCalendar hCalendar = new HCalendar();

public Swing28  () {

             // JFrame 설정

             setTitle("Calendar");
             setSize(550,400);  // 300,200 은 자주 쓰는 사이즈
             Dimension frameSize = getSize();
             Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
        
              setLocation((windowSize.width - frameSize.width) / 2,
                (windowSize.height - frameSize.height) / 2);

             init(); // 화면 구성
             start(); // 이벤트 설정


             setVisible(true);

             Previous.addActionListener((e)->{
                 new Index();
                setVisible(false);
              });

       }

 

       private void init() { // 이벤트 설정

             container.setLayout(new BorderLayout());

             container.add("North", panel1);

             container.add("Center", panel2);

             // penel1 구성

             buttonAfter.setFont(new Font("SansSerif", 1, 20));

             buttonBefore.setFont(new Font("SansSerif", 1, 20));

             label.setFont(new Font("SansSerif", 1, 20));

             label.setText(hCalendar.getCalText());

            

             panel1.setLayout(new FlowLayout());
             
             panel1.add(Previous); // 이전버튼

             panel1.add(buttonBefore);

             panel1.add(label);

             panel1.add(buttonAfter);

             // penel2 구성

             panel2.setLayout(new GridLayout(7,7,5,5));

             for(int i=0; i<buttons.length; i++) {

                    buttons[i] = new JButton();                  

                    panel2.add(buttons[i]);

                   

                    // 버튼 폰트 설정

                    buttons[i].setFont(new Font("Sherif", Font.BOLD, 24));

                    // buttons[0]~[6] : 일 ~ 토

                    if(i < 7) buttons[i].setText(dayNames[i]);

                    // 버튼 색 설정 : 일 : 빨간색, 토 : 파란색

                    if(i%7 == 0) { // 일요일

                           buttons[i].setForeground(Color.RED);                       

                    }

                    if(i%7 == 6) { // 토요일

                           buttons[i].setForeground(Color.BLUE);

                    }

             }

             // 날짜 출력

             hCalendar.setButtons(buttons);

             hCalendar.calSet();

       }

 

       private void start() {

             // x 버튼 종료

             this.setDefaultCloseOperation(EXIT_ON_CLOSE);

             // 버튼 이벤트 설정

             buttonAfter.addActionListener(this);
             buttonBefore.addActionListener(this);
            

       }
 

       @Override

       public void actionPerformed(ActionEvent e) {

             if(e.getSource() == buttonBefore) {        // 1달 전

                    hCalendar.allInit(-1);  // 무슨뜻?

                    label.setText(hCalendar.getCalText());

             } else if(e.getSource() == buttonAfter) {  // 1달 후

                    hCalendar.allInit(1);

                    label.setText(hCalendar.getCalText());

             }

       }

}

public class Calendar {
       public Calendar(){
              Swing28 Swing28 = new Swing28();
       }
}

 