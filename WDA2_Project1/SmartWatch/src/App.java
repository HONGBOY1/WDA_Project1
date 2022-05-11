import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;

import WorldTime.WorldTime;
import Timer.Timer;
import StopWatch.StopWatch;
import Alarm.Alarm;
import javafx.*;
import javafx.scene.paint.Color;
import javafx.stage.Window;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Dimension;

public class App extends JFrame{

    // 이동하는 버튼 변수
    private JButton btnAlarm;
    private JButton btnStopWatch;
    private JButton btnTimer;
    private JButton btnWorldTime;
    public JButton Previous;   // 이전 버튼

    public Thread t1;
    public boolean aa;

    Font font;

    Color color = (Color.WHITE);

    public void Timer() {

   }

    public App() {  // App  실행 함수
    

       font = new Font("맑은 고딕",Font.BOLD,35); //폰트 기본값

        WorldTime world = new WorldTime();   // 세계시간 메소드 불러 오기

        world.lblCenter = new JLabel("",JLabel.CENTER);
        world.lblCenter.setFont(font);
        
        btnAlarm = new JButton("알람");
        btnStopWatch = new JButton("스톱워치");
        btnTimer = new JButton("타이머");
        btnWorldTime = new JButton("세계시간");
        Previous = new JButton("이전");
        
        JPanel pnlbtn = new JPanel(); // 버튼 패널 추가
        JPanel Prebtn = new JPanel(); // 이전 버튼을 위한 패널

        pnlbtn.add(btnWorldTime);
        pnlbtn.add(btnTimer);
        pnlbtn.add(btnAlarm);
        pnlbtn.add(btnStopWatch);
        Prebtn.add(Previous);

        //위치 설정 
        JPanel pnlSouth = new JPanel(new BorderLayout());
        JPanel pnlNorth = new JPanel(new BorderLayout());
        pnlSouth.add(pnlbtn, BorderLayout.SOUTH);
        pnlNorth.add(Prebtn, BorderLayout.NORTH);

        JPanel pnlMain = new JPanel(new BorderLayout());
        pnlMain.add(world.lblCenter, BorderLayout.CENTER);
        pnlMain.add(pnlSouth, BorderLayout.SOUTH);
        pnlMain.add(pnlNorth, BorderLayout.NORTH);
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
        Previous.addActionListener((e)->{
            new Index();
            setVisible(false);
        });
        Dimension frameSize = getSize();
        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((windowSize.width - frameSize.width) / 2,
                (windowSize.height - frameSize.height) / 2);
        setTitle("Smart Watch");
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        
    }
    
}
