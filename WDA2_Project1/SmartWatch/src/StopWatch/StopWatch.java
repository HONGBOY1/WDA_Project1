package StopWatch;

    import javax.swing.*;  
    import java.awt.HeadlessException;  
    import java.awt.BorderLayout;  
    import java.awt.FlowLayout;  
    import java.awt.Font;  
    import java.awt.event.ActionListener;  
    import java.awt.event.ActionEvent;  
    import App.App;
    /** 
     *     
     */  
    public class StopWatch extends JFrame {  
     
        /**
         * 
         */
        private static final long serialVersionUID = 1L;
    
        private static final String INITIAL_LABEL_TEXT = "00:00:00 000";  
       
        //       
        private CountingThread thread = new CountingThread();  
       
        //           
        private long programStart = System.currentTimeMillis();  
       
        //             
        private long pauseStart = programStart;  
       
        //           
        private long pauseCount = 0;  
       
        private JLabel label = new JLabel(INITIAL_LABEL_TEXT);  
       
        private JButton startPauseButton = new JButton("시작");  
       
        private JButton resetButton = new JButton("리셋");  
       
        public JButton Previous = new JButton("이전");
       
        

        private ActionListener startPauseButtonListener = new ActionListener() {  
            public void actionPerformed(ActionEvent e) {  
                if (thread.stopped) {  
                    pauseCount += (System.currentTimeMillis() - pauseStart);  
                    thread.stopped = false;  
                    startPauseButton.setText("정지");  
                } else {  
                    pauseStart = System.currentTimeMillis();  
                    thread.stopped = true;  
                    startPauseButton.setText("시작");  
                }  
            }  
        };  
       
        private ActionListener resetButtonListener = new ActionListener() {  
            public void actionPerformed(ActionEvent e) {  
                pauseStart = programStart;  
                pauseCount = 0;  
                thread.stopped = true;  
                label.setText(INITIAL_LABEL_TEXT);  
                startPauseButton.setText("시작");  
            }  

           
        };  
       
        public StopWatch(String title) throws HeadlessException {  
            super(title);  
            setDefaultCloseOperation(EXIT_ON_CLOSE);  
            setLocation(730, 280);  
            setResizable(false);  
        
       
            setupBorder();  
            setupLabel();  
            setupButtonsPanel();  
       
            startPauseButton.addActionListener(startPauseButtonListener);  
            resetButton.addActionListener(resetButtonListener);  
       
            thread.start(); // 
            
            Previous.addActionListener((e)->{
                setVisible(false);
                new App();
            });
        }  
       
        //            
        private void setupBorder() {  
            JPanel contentPane = new JPanel(new BorderLayout());  
            contentPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));  
            this.setContentPane(contentPane);  
        }  
       
        //       
        private void setupButtonsPanel() {  
            JPanel panel = new JPanel(new FlowLayout());  
            panel.add(startPauseButton);  
            panel.add(resetButton);  
            add(panel, BorderLayout.SOUTH); 

            JPanel Prebtn = new JPanel(); // 이전 버튼을 위한 패널
            Prebtn.add(Previous);
            add(Prebtn, BorderLayout.NORTH); 

            
          
        }  
       
        //       
        private void setupLabel() {  
            label.setHorizontalAlignment(SwingConstants.CENTER);  
            label.setFont(new Font(label.getFont().getName(), label.getFont().getStyle(), 40));  
            this.add(label, BorderLayout.CENTER);  
        }  
       
        //       
       
        private class CountingThread extends Thread {  
       
            public boolean stopped = true;  
       
            private CountingThread() {  
                setDaemon(true);  
            }  
       
            @Override  
            public void run() {  
                while (true) {  
                    if (!stopped) {  
                        long elapsed = System.currentTimeMillis() - programStart - pauseCount;  
                        label.setText(format(elapsed));  
                    }  
       
                    try {  
                        sleep(1);  // 1        
                    } catch (InterruptedException e) {  
                        e.printStackTrace();  
                        System.exit(1);  
                    }  
                }  
            }  
       
            //          
            private String format(long elapsed) {  
                int hour, minute, second, milli;  
       
                milli = (int) (elapsed % 1000);  
                elapsed = elapsed / 1000;  
       
                second = (int) (elapsed % 60);  
                elapsed = elapsed / 60;  
       
                minute = (int) (elapsed % 60);  
                elapsed = elapsed / 60;  
       
                hour = (int) (elapsed % 60);  
       
                return String.format("%02d:%02d:%02d %03d", hour, minute, second, milli);  
            }  
        }  
    }  