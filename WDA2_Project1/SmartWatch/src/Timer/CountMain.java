package Timer;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;

import javax.swing.JFrame;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import java.awt.Font;
import App.App;

import jaco.mp3.player.MP3Player;

/*텍스트 창에 숫자를 입력하고 버튼을 누르면 그 숫자가 카운트되면서 출력되는 프로그램*/
public class CountMain extends Frame implements TextListener, ActionListener{
	Label lbl_info;//라벨을 생성합니다.
	TextField txt1 = new TextField(15); //텍스트 창을 하나 생성합니다. 길이는 15로 합니다.
	Button btn1 = new Button("시작"); //버튼을 하나 생성합니다. 
	
    Button Previous = new  Button("이전");;   // 이전 버튼
	int i; //반복문 변수를 생성합니다.
	String num=null; //텍스트 창에 입력한 숫자를 저장할 변수입니다.
	int count; //입력한 숫자를 셀 변수를 생성합니다.
	String result; //lbl_info 레이블에 출력될 결과값입니다.
	Font font;

	MP3Player mp3 = new MP3Player((getClass().getResource("../Timer/Timer.mp3")));

	public CountMain(String str){
		super(str); //윈도우 프레임을 생성합니다.
		lbl_info = new Label();//레이블의 초기값은 공란입니다.
		Panel panel = new Panel();
		Panel panel2 = new Panel();//패널 2개를 생성합니다.
		txt1.addTextListener(this);//텍스트창을 텍스트 이벤트에 등록합니다.
		btn1.addActionListener(this); //버튼을 버튼 이벤트에 등록합니다.
		panel.add(txt1); //패널에 텍스트창을 등록합니다. 윈도우 화면에 보여집니다.
		panel.add(btn1); //패널에 버튼을 등록합니다. 윈도우 화면에 보여집니다.
		panel.add(Previous); 
		panel2.add(panel); //패널2에 버튼과 텍스트창을 등록한 패널을 등록합니다.
		font = new Font("Sherif",Font.BOLD,35); //폰트 기본값
		lbl_info.setFont(font);

		Previous.addActionListener((e)->{
			new App();
		    setVisible(false);
        });

	

		add("North", panel2); //패널 2는 화면 상단에 등록합니다.
		add("Center",lbl_info); //화면 하단에 레이블을 등록합니다.
		
		setSize(350, 250); //윈도우 프레임의 크기를 정합니다.
		setVisible(true); //화면에 보여집니다.

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
			System.exit(0); //'x'를 누르면 화면이 닫힙니다.
				}
		});
		   
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CountMain("Timer"); //main에서 실행시킵니다
	}

	
	@Override
	public void textValueChanged(TextEvent e) { //텍스트 창 이벤트를 구현하는 메소드입니다.
		// TODO Auto-generated method stub
		num=(txt1.getText());//텍스트 창에서 입력한 숫자를 읽어 num에 String으로 저장합니다.
		count=Integer.parseInt(num); //num을 integer 형으로 형변환하여 count에 저장합니다
	}
	@Override
	public void actionPerformed(ActionEvent e) { //버튼 이벤트를 구현하는 메소드입니다.
		// TODO Auto-generated method stub
		btn1=(Button)e.getSource(); //버튼 이벤트 구현을 위해 소스를 읽어옵니다.
		for(i=count; i>=0; i--){ //입력한 숫자를 셉니다.
			try{
				Thread.sleep(1000); //카운트 속도는 1초로 합니다.
				result = i + "초"; //레이블에 출력할 문자열을 result에 대입힙나다.
				lbl_info.setText(result); //레이블에 결과값을 등록합니다. 화면 하단에 카운트 결과가 출력됩니다.
				if(i==0){
					mp3.play();
				}

			}catch(InterruptedException a){ //예외 처리
				System.out.println(a.getMessage()); //예외 처리 메시지를 출력합니다.
				break;
			}
		}
	}
}