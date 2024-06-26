//task4
//quiz
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Quiz1 extends JFrame implements ActionListener{
int currentScore=0;
int currentQuestion=0;
int correctAnswer=0,incorrectAnswer=0;
JRadioButton[] rb;
JLabel questionL;
JLabel timerLabel;
ButtonGroup group;
String[] question={"which planet is called red planent?","What is the largest ocean on Earth?"};
String[][] option={{"Mars","Jupiter"},{"Indian ocean","pacific ocean"}};
int[] correctAns={0,1};
Timer timer;
int time;
public Quiz1(){
 setTitle("Quiz");
 getContentPane().setBackground(Color.cyan);
 setLayout(null);
 
questionL=new JLabel();
questionL.setBounds(40,70,300,50);
timerLabel=new JLabel();
timerLabel.setBounds(300,70,100,50);
 rb=new JRadioButton[2];
 group=new ButtonGroup();
for(int i=0;i<rb.length;i++){
    rb[i]=new JRadioButton();
    rb[i].setBounds(40,150+(i*50),100,50);
    rb[i].addActionListener(this);
    group.add(rb[i]);
    add(rb[i]);
}
 
 add(questionL);
 add(timerLabel);
 addQuestions();

 setSize(400,400);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 setVisible(true);
}
public void addQuestions(){
    if(currentQuestion < question.length){
       questionL.setText(question[currentQuestion]);
       rb[0].setText(option[currentQuestion][0]);
       rb[1].setText(option[currentQuestion][1]);
       group.clearSelection();
       startTimer();
    }
    else{
        showSummary();
        dispose();
    }
}
public void startTimer(){
    if(timer!=null){
        timer.stop();
    }
    time=10;
    timerLabel.setText("Time"+time+"s");
    timer =new Timer(1000,new ActionListener(){
      public void actionPerformed(ActionEvent e){
        time--;
        if(time>=0){
            timerLabel.setText("time:"+time+"s");
        }
        else{
        timer.stop();
        JOptionPane.showMessageDialog(Quiz1.this,"Time's up!"); 
        currentQuestion++;
        incorrectAnswer++;
        addQuestions();
    }
}
});
timer.setRepeats(true);
timer.start();
}
public void actionPerformed(ActionEvent e){
    if(timer !=null){
        timer.stop();
    }
    JRadioButton selecteRadioButton=(JRadioButton) e.getSource();
    int selectedIndex=selecteRadioButton==rb[0] ? 0:1;


    if(selectedIndex==correctAns[currentQuestion]){
        currentScore+=10;
        correctAnswer++;
        JOptionPane.showMessageDialog(this,"your answer is correct! and your current score:"+currentScore);
        
    }
    else{
        currentQuestion+=0;
        incorrectAnswer++;
        JOptionPane.showMessageDialog(this,"your answer is wrong! your current score:"+currentScore);
    }
    currentQuestion++;
    addQuestions();
}
public void showSummary() {
    JOptionPane.showMessageDialog(this,"Quiz Over!\n\n"+ "Total Score: " + currentScore + "\n"+ "Correct Answers: " + correctAnswer + "\n" + "Incorrect Answers: " + incorrectAnswer);
}
public static void main(String[]args){
  new Quiz1();
}
}