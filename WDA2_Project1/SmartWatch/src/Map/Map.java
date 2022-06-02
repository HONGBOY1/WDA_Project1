package Map;
import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import java.awt.Dimension;
import java.awt.Toolkit;

import Index.Index;

public class Map extends JFrame{
    private JTextField textField = new JTextField(30);
    private JButton button = new JButton("검색");
    private JPanel panel = new JPanel();
    private JButton Previous = new JButton("이전");  

    private GoogleAPI googleAPI = new GoogleAPI();
    private JLabel googleMap = new JLabel(); 

    public class Event implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent e) {
            // TODO Auto-generated method stub
            setMap(textField.getText());
        }

        @Override
        public void mousePressed(MouseEvent e) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void mouseExited(MouseEvent e) {
            // TODO Auto-generated method stub
            
        }

    }

    public void setMap(String location){
        googleAPI.downloadMap(location);
        googleMap.setIcon(googleAPI.getMap(location));
        googleAPI.fileDelete(location);
        add(BorderLayout.SOUTH,googleMap);
        pack();
    }

    public Map(){
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setTitle("Map");
        setVisible(true);

   
         setLocation(700,250);

        panel.add(textField);
        panel.add(button);
        panel.add(Previous);
        button.addMouseListener(new Event());

        Previous.addActionListener((e)->{
			new Index();
            setVisible(false);
        });
        add(BorderLayout.NORTH,panel);
        add(BorderLayout.SOUTH,googleMap);

        pack();
        
    }
}
