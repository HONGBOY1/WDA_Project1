import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Toolkit;
import java.awt.Dimension;


public class Index extends JFrame {
    private JButton Calendar;  // 달력 버튼
    private JButton Calculator;// 계산기 버튼
    private JButton Map;       // 맵 버튼
    private JButton Time;      // 시계 버튼
    public JButton Next;       // 다음 버튼
    
   
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

        p1.setBounds(100, 100, 100, 100);
        p2.setBounds(300, 300, 100, 100);
        p3.setBounds(300, 100, 100, 100);
        p4.setBounds(200, 200, 100, 100);
        p5.setBounds(0, 0, 0, 0);
        
        p1.add(Calendar);
        p2.add(Calculator);
        p3.add(Map);
        p4.add(Time);
   

        f.add(p1);
        f.add(p2);
        f.add(p3);
        f.add(p4);
        f.add(p5);

        Calendar.addActionListener((e)->{
        
        });
        Calculator.addActionListener((e)->{
        
        });
        Map.addActionListener((e)->{
            
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
         f.setSize(500,500);
         f.setDefaultCloseOperation(EXIT_ON_CLOSE);
         f.setLocationRelativeTo(null);
         f.setVisible(true);
    }

    public static void main(String[] args)  {
        JFrame.setDefaultLookAndFeelDecorated(true);
        new Index();  
    }
}
