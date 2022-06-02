package Calendar;


import java.util.Calendar;

import javax.swing.JButton;

 

// 날짜 계산

public class HCalendar {

       JButton[] buttons;

       Calendar calendar;

       int year, month;

       public HCalendar() {

             calendar = Calendar.getInstance();

             year = calendar.get(Calendar.YEAR);

             month = calendar.get(Calendar.MONTH) + 1;

       }


       public void setButtons(JButton[] buttons) {

             this.buttons = buttons;

       }

       // Label에 출력할 년월 문자열

       public String getCalText() {

             return year + "년" + month + "월";

       }

       // 달력을 새로운 년월로 새로 그리기

       public void allInit(int gap) {

             // 버튼의 날짜 지우기

             for(int i=7; i<buttons.length; i++) {

                    buttons[i].setText("");

             }

             // 년월 수정

             calInput(gap);

             // 버튼의 날짜 출력하기

             calSet();

       }

       // 년월 수정

       private void calInput(int gap) { // 연월수정 here

             month += gap; // += 왼쪽의 피연산자에 오른쪽의 피연산자를 더한 후, 그 결괏값을 왼쪽의 피연산자에 대입함. month + gap = month

             if(month <= 0) { // 1월에서 -1을 누르면 0이되고 전년으로 넘어감

                    month = 12;

                    year--;                   

             } else if(month >= 13) { // 12월에서 +1 을 누르면 13이되고 내년으로 넘어감

                    month = 1;

                    year++;

             }           

       }

       // 버튼의 날짜 출력하기

       public void calSet() {

             calendar.set(year,month-1,1); // 날자수정, set함수는 여러가지 다 바꿀수있음

             // 1일이 시작되는 요일수 = 요일수 -1

             // => 요일수가 1부터 시작, 배열은 0부터 시작

             int firstDay = calendar.get(Calendar.DAY_OF_WEEK) -1;

             for(int i=1; i<=calendar.getActualMaximum(Calendar.DATE); i++) { // getActualMaximum 그달을 값을 얻어올수있음

                    // buttons[0] ~ [6] : 일~토

                    // 그 달의 1일은 buttons[6+(요일수-1) + i]

                    buttons[6 + firstDay + i].setText(String.valueOf(i)); // ValueOf 일반 데이터를 문자로  변환

             }           

       }     

}