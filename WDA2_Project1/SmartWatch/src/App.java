import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;

import WorldTime.WorldTime;
import Timer.Timer;
import StopWatch.StopWatch;
import Alarm.Alarm;

import javafx.scene.paint.Color;

public class App extends JFrame{

    // 이동하는 버튼 변수
    private JButton btnAlarm;
    private JButton btnStopWatch;
    private JButton btnTimer;
    private JButton btnWorldTime;
    
    Color color = (Color.WHITE);

    public App() {  // App  실행 함수
        
        WorldTime world = new WorldTime();   // 세계시간 메소드 불러 오기
        
        world.lblCenter = new JLabel("",JLabel.CENTER);

        btnAlarm = new JButton("알람");
        btnStopWatch = new JButton("스톱워치");
        btnTimer = new JButton("타이머");
        btnWorldTime = new JButton("세계시간");
        
        JPanel pnlbtn = new JPanel(); // 버튼 패널 추가
       
        pnlbtn.add(btnWorldTime);
        pnlbtn.add(btnTimer);
        pnlbtn.add(btnAlarm);
        pnlbtn.add(btnStopWatch);
        
        //위치 설정 
        JPanel pnlSouth = new JPanel(new BorderLayout());
        pnlSouth.add(pnlbtn, BorderLayout.SOUTH);

        JPanel pnlMain = new JPanel(new BorderLayout());
        pnlMain.add(world.lblCenter, BorderLayout.CENTER);
        pnlMain.add(pnlSouth, BorderLayout.SOUTH);

        add(pnlMain);

        
        world.ThreadTime(); // 실행과 동시에 실행
        // 버튼 클릭 이벤트
        btnAlarm.addActionListener((e)->{
            world.t1.interrupt(); 
        });
        btnStopWatch.addActionListener((e)->{
            world.t1.interrupt();
        });
        btnTimer.addActionListener((e)->{
            world.t1.interrupt();
        });
        btnWorldTime.addActionListener((e)->{
            world.aa=true;
            world.ThreadTime();
        });
        
        // 스윙 창 띄우기
        setTitle("Timer");
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        
    }
    
    public static void main(String[] args)  {
        JFrame.setDefaultLookAndFeelDecorated(true);
        new App();
        
    }
}
