/*
*By: Caesar W. & Obina E.
*Class: JAVA 1
*Instructor: Dr.Primo
*Assignment: Group-Project
*Date: 12/05/2018
*Due: 12/06/2018 @9:30AM
*/
//START
package onlinetest;
/*Java 1 - Short Exam*/  
  
import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;  
  
class OnlineTest extends JFrame implements ActionListener  
{  
    JLabel crwhLabel;  
    JRadioButton obiButton[]=new JRadioButton[5];  
    JButton crwh1,crwh2;  
    ButtonGroup obiGroup;  
    int crwhCountInt=0,crwhCurrent=0,a=1,b=1,present=0;  
    int obiInt[]=new int[10];      
    OnlineTest(String s)  
    {  
        super(s);  
        crwhLabel=new JLabel();  
        add(crwhLabel);  
        obiGroup=new ButtonGroup();  
        for(int i=0;i<5;i++)  
        {  
            obiButton[i]=new JRadioButton();     
            add(obiButton[i]);  
            obiGroup.add(obiButton[i]);  
        }  
        crwh1=new JButton("Next");  
        crwh2=new JButton("Bookmark");  
        crwh1.addActionListener(this);  
        crwh2.addActionListener(this);  
        add(crwh1);add(crwh2);  
        set();  
        crwhLabel.setBounds(30,40,450,20);  
        obiButton[0].setBounds(50,80,100,20);  
        obiButton[1].setBounds(50,110,100,20);  
        obiButton[2].setBounds(50,140,100,20);  
        obiButton[3].setBounds(50,170,100,20);  
        crwh1.setBounds(100,240,100,30);  
        crwh2.setBounds(270,240,100,30);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setLayout(null);  
        setLocation(250,100);  
        setVisible(true);  
        setSize(600,350);  
    }  
    public void actionPerformed(ActionEvent e)  
    {  
        if(e.getSource()==crwh1)  
        {  
            if(check())  
                crwhCountInt=crwhCountInt+1;  
            crwhCurrent++;  
            set();    
            if(crwhCurrent==9)  
            {  
                crwh1.setEnabled(false);  
                crwh2.setText("Result");  
            }  
        }  
        if(e.getActionCommand().equals("Bookmark"))  
        {  
            JButton bk=new JButton("Bookmark"+a);  
            bk.setBounds(480,20+30*a,100,30);  
            add(bk);  
            bk.addActionListener(this);  
            obiInt[a]=crwhCurrent;  
            a++;  
            crwhCurrent++;  
            set();    
            if(crwhCurrent==9)  
                crwh2.setText("Result");  
            setVisible(false);  
            setVisible(true);  
        }  
        for(int i=0,z=1;i<a;i++,z++)  
        {  
        if(e.getActionCommand().equals("Bookmark"+z))  
        {  
            if(check())  
                crwhCountInt=crwhCountInt+1;  
            present=crwhCurrent;  
            crwhCurrent=obiInt[z];  
            set();  
            ((JButton)e.getSource()).setEnabled(false);  
            crwhCurrent=present;  
        }  
        }  
      
        if(e.getActionCommand().equals("Result"))  
        {  
            if(check())  
                crwhCountInt=crwhCountInt+1;  
            crwhCurrent++;  
            //This will print out the 'dialog box' text);  
            JOptionPane.showMessageDialog(this,"This is your correct Percentage = " + crwhCountInt + "%");  
            System.exit(0);  
        }  
    }  
    void set()  
    {  
        obiButton[4].setSelected(true);  
        if(crwhCurrent==0)  
        {  
            crwhLabel.setText("Question #1: A(n)_____ constructor is one that requires no arguments. ");  //Answer: B
            obiButton[0].setText("Class");
            obiButton[1].setText("Default");
            obiButton[2].setText("Write");
            obiButton[3].setText("Explicit");   
        }  
        if(crwhCurrent==1)  
        {  
            crwhLabel.setText("Question #2: System.out is an object of the class ______. ");  //Answer: D
            obiButton[0].setText("Applet");
            obiButton[1].setText("Output");
            obiButton[2].setText("System");
            obiButton[3].setText("PrintStream");  
        }  
        if(crwhCurrent==2)  
        {  
            crwhLabel.setText("Question #3: When can you use a private constructor?");  //Answer: B
            obiButton[0].setText("When your bored with public.");
            obiButton[1].setText("To disallow instantiation of that class.");
            obiButton[2].setText("Never");
            obiButton[3].setText("To protect your class members.");  
        }  
        if(crwhCurrent==3)  
        {  
            crwhLabel.setText("Question #4: You are _____ required to write a constructor method for a class.");  //Answer: B
            obiButton[0].setText("Often");
            obiButton[1].setText("Never");
            obiButton[2].setText("Always");
            obiButton[3].setText("Sometimes");  
        }  
        if(crwhCurrent==4)  
        {  
            crwhLabel.setText("Question #5: An object is a(n) ______ of a class.");  //Answer: A
            obiButton[0].setText("Instance");
            obiButton[1].setText("Method");
            obiButton[2].setText("Field");
            obiButton[3].setText("Constant");  
        }  
        if(crwhCurrent==5)  
        {  
            crwhLabel.setText("Question #6: An abstact class ____. ");  //Answer: B
            obiButton[0].setText("Doesn't have any subclasses");
            obiButton[1].setText("Cannot be instantiated");
            obiButton[2].setText("Is a superclass with many subclasses");
            obiButton[3].setText("Is the baseclass of all other classes");  
        }  
        if(crwhCurrent==6)  
        {  
            crwhLabel.setText("Question #7: In JAVA, an array starts counting at _____. ");  //Answer: A
            obiButton[0].setText("0");
            obiButton[1].setText("1");
            obiButton[2].setText("-1");  
            obiButton[3].setText("2");  
        }  
        if(crwhCurrent==7)  
        {  
            crwhLabel.setText("Question #8: A Class defines _____. "); //Answer: C
            obiButton[0].setText("Behavior and Values");
            obiButton[1].setText("Values and Atrributes");
            obiButton[2].setText("Behavior and Attributes");  
            obiButton[3].setText("Attributes and Apples");         
        }  
        if(crwhCurrent==8)  
        {  
            crwhLabel.setText("Question #9: In every Java Program _____. ");  //Answer: B
            obiButton[0].setText("All variables must be integers");
            obiButton[1].setText("There ust be a method called 'Main'");
            obiButton[2].setText("At least two variables detected");
            obiButton[3].setText("Answer not present");  
        }  
        if(crwhCurrent==9)  
        {  
            crwhLabel.setText("Question #10: How many superclasses can you inherited subclass have?");  //Answer: D
            obiButton[0].setText("Two");
            obiButton[1].setText("Multiple");
            obiButton[2].setText("None");  
            obiButton[3].setText("One");  
        }  
        crwhLabel.setBounds(30,40,450,20);  
        for(int i=0,j=0;i<=90;i+=30,j++)  
            obiButton[j].setBounds(50,80+i,200,20);  
    }  
    boolean check()  
    {  
        if(crwhCurrent==0)  
            return(obiButton[1].isSelected());  
        if(crwhCurrent==1)  
            return(obiButton[2].isSelected());  
        if(crwhCurrent==2)  
            return(obiButton[3].isSelected());  
        if(crwhCurrent==3)  
            return(obiButton[0].isSelected());  
        if(crwhCurrent==4)  
            return(obiButton[2].isSelected());  
        if(crwhCurrent==5)  
            return(obiButton[2].isSelected());  
        if(crwhCurrent==6)  
            return(obiButton[1].isSelected());  
        if(crwhCurrent==7)  
            return(obiButton[3].isSelected());  
        if(crwhCurrent==8)  
            return(obiButton[1].isSelected());  
        if(crwhCurrent==9)  
            return(obiButton[2].isSelected());  
        return false;  
    }  
    public static void main(String s[])  
    {  
        new OnlineTest("Java 1 - Short Exam");  
    }  
}
//END