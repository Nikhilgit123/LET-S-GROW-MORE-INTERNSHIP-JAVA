// Detail study
// change var name 
// modify some color 
// overall edit code 
//NM
//sinh and cosh add using math library

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Sc_Calculator {
    private JFrame frame;
    private JTextField textField;
    double first;
    double second;
    double result;
    String operation;
    private final ButtonGroup buttonGroup = new ButtonGroup();
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Sc_Calculator window = new Sc_Calculator();
                    window.frame.setVisible(true);
			window.frame.setResizable(false);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public Sc_Calculator() {
        init();
    }
    private void init() {
        frame = new JFrame();
        frame.setForeground(Color.WHITE);
       
        frame.getContentPane().setForeground(Color.WHITE);
        frame.setBounds(100, 100, 357, 539);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        textField = new JTextField();
        textField.setFont(new Font("Times New Roman", 1, 15));
        textField.setBounds(10, 39, 320, 60);
        textField.setBackground(Color.GREEN);
        frame.getContentPane().add(textField);
        textField.setColumns(10);
        JLabel Main_lable = new JLabel("SCI_CALCULATOR");
        Main_lable.setBounds(10, 11, 320, 27);
        Main_lable.setFont(new Font("Verdana", 1, 25));
        Main_lable.setForeground(Color.orange);
        Main_lable.setBackground(Color.DARK_GRAY);
        frame.getContentPane().add(Main_lable);
        JButton button2 = new JButton("2");
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String number=textField.getText()+button2.getText();
                textField.setText(number);
            }
        });
     
        button2.setFont(new Font("Verdana", 1, 23));
        button2.setForeground(Color.black);
        button2.setBackground(Color.white);
        button2.setBounds(74, 139, 64, 50);
        frame.getContentPane().add(button2);
        JButton button5 = new JButton("5");
        button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String number=textField.getText()+button5.getText();
                textField.setText(number);
            }
        });
        button5.setFont(new Font("Verdana", 1, 23));
        button5.setForeground(Color.black);
        button5.setBackground(Color.white);
        button5.setBounds(74, 192, 64, 50);
        frame.getContentPane().add(button5);
        JButton button8 = new JButton("8");
        button8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String number=textField.getText()+button8.getText();
                textField.setText(number);
            }
        });
        button8.setFont(new Font("Verdana", 1, 23));
        button8.setForeground(Color.black);
        button8.setBackground(Color.white);
        button8.setBounds(74, 243, 64, 50);
        frame.getContentPane().add(button8);
        JButton sin_inverse = new JButton("asin");
         sin_inverse.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                double a = Math.asin(Double.parseDouble(textField.getText()));
                textField.setText("");
                textField.setText(textField.getText()+a);
            }
      
       
        });
          sin_inverse.setFont(new Font("Tahoma", 1, 12));
        sin_inverse.setForeground(Color.black);
        sin_inverse.setBackground(Color.white);
        
        sin_inverse.setBounds(139, 295, 70, 50);
        frame.getContentPane().add(sin_inverse);
        JButton button_sinh = new JButton("sinh");
        button_sinh.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                double a = Math.sinh(Double.parseDouble(textField.getText()));
                textField.setText("");
                textField.setText(textField.getText()+a);
            }
        });
        button_sinh.setFont(new Font("Verdana", Font.PLAIN, 13));
        button_sinh.setForeground(Color.black);
        button_sinh.setBackground(Color.white);
        button_sinh.setBounds(10, 398, 64, 50);
        frame.getContentPane().add(button_sinh);
        JButton button0 = new JButton("0");
        button0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String number=textField.getText()+button0.getText();
                textField.setText(number);
            }
        });
        button0.setFont(new Font("Verdana", 1, 21));
        button0.setForeground(Color.black);
        button0.setBackground(Color.white);
        button0.setBounds(10, 295, 129, 50);
        frame.getContentPane().add(button0);
        JButton btnSin = new JButton("sin");
        btnSin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                double a = Math.sin(Double.parseDouble(textField.getText()));
                textField.setText("");
                textField.setText(textField.getText()+a);

            }
        });
        btnSin.setFont(new Font("Verdana", 1, 12));
        btnSin.setForeground(Color.black);
        btnSin.setBackground(Color.white);
        // btnSin.setBounds(139, 139, 64, 50);
        btnSin.setBounds(74, 347, 64, 50);
        frame.getContentPane().add(btnSin);

        JButton btnDot = new JButton(".");
        btnDot.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String number=textField.getText()+btnDot.getText();
                textField.setText(number);
            }
        });
        btnDot.setFont(new Font("Verdana", Font.PLAIN, 21));
        btnDot.setForeground(Color.black);
        btnDot.setBackground(Color.white);
        btnDot.setBounds(202, 449, 64, 50);
        frame.getContentPane().add(btnDot);
        JButton Button_eq = new JButton("=");
        Button_eq.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String ans;
                second=Double.parseDouble(textField.getText());
                if(operation=="+")
                {
                    result=first+second;
                    ans=String.format("%.4f", result);
                    textField.setText(ans);
                }
                else if(operation=="-")
                {
                    result=first-second;
                    ans=String.format("%.4f", result);
                    textField.setText(ans);
                }
                else if(operation=="*")
                {
                    result=first*second;
                    ans=String.format("%.4f", result);
                    textField.setText(ans);
                }
                else if(operation=="/")
                {
                    result=first/second;
                    ans=String.format("%.4f", result);
                    textField.setText(ans);
                }
                else if(operation=="%")
                {
                    result=first%second;
                    ans=String.format("%.4f", result);
                    textField.setText(ans);
                }
                else if(operation=="X^Y")
                {
                    double resultt=1;
                    for(int i=0;i<second;i++)
                    {
                        resultt=first*resultt;
                        ans=String.format("%.4f", resultt);
                        textField.setText(ans);
                    }
                }

            }
        });
        Button_eq.setFont(new Font("Verdana", Font.PLAIN, 21));
        Button_eq.setForeground(Color.black);
        Button_eq.setBackground(Color.white);
        Button_eq.setBounds(266, 449, 64, 50);
        frame.getContentPane().add(Button_eq);

        JButton buttonXrx = new JButton("X^Y");
        buttonXrx.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                first=Double.parseDouble(textField.getText());
                textField.setText("");
                operation="xrx";
            }
        });
        buttonXrx.setFont(new Font("Verdana", 1, 12));
        buttonXrx.setForeground(Color.black);
        buttonXrx.setBackground(Color.white);
        buttonXrx.setBounds(202, 191, 66, 50);
        frame.getContentPane().add(buttonXrx);

        JButton buttonLog = new JButton("log");
        buttonLog.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                double a = Math.log(Double.parseDouble(textField.getText()));
                textField.setText("");
                textField.setText(textField.getText()+a);
            }
        });
        buttonLog.setFont(new Font("Verdana", Font.PLAIN, 12));
        buttonLog.setForeground(Color.black);
        buttonLog.setBackground(Color.white);
        buttonLog.setBounds(10, 347, 64, 50);
        frame.getContentPane().add(buttonLog);

        JButton btnCe = new JButton("CE");
        btnCe.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                textField.setText(null);
            }
        });
        btnCe.setFont(new Font("Verdana", Font.PLAIN, 19));
        btnCe.setForeground(Color.black);
        btnCe.setBackground(Color.RED);
        btnCe.setBounds(202, 139, 64, 50);
        frame.getContentPane().add(btnCe);

        JButton button7 = new JButton("7");
        button7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String number=textField.getText()+button7.getText();
                textField.setText(number);
            }
        });
        button7.setFont(new Font("Verdana", 1, 23));
        button7.setForeground(Color.black);
        button7.setBackground(Color.white);
        button7.setBounds(10, 243, 64, 50);
        frame.getContentPane().add(button7);

        JButton button4 = new JButton("4");
        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String number=textField.getText()+button4.getText();
                textField.setText(number);
            }
        });
        button4.setFont(new Font("Verdana", 1, 23));
        button4.setForeground(Color.black);
        button4.setBackground(Color.white);
        button4.setBounds(9, 191, 64, 50);
        frame.getContentPane().add(button4);

        JButton button1 = new JButton("1");
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String number=textField.getText()+button1.getText();
                textField.setText(number);
            }
        });
        button1.setFont(new Font("Verdana", 1, 23));
        button1.setForeground(Color.black);
        button1.setBackground(Color.white);
        // button1.setBounds(74, 398, 64, 50);
        button1.setBounds(10, 139, 64, 50);
        frame.getContentPane().add(button1);

        JButton button_cube = new JButton("x3");
        button_cube.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                double a = (Double.parseDouble(textField.getText()));
                a=a*a*a;
                textField.setText("");
                textField.setText(textField.getText()+a);
            }
        });
        button_cube.setFont(new Font("Verdana", 1, 12));
        button_cube.setForeground(Color.black);
        button_cube.setBackground(Color.white);
        // button_cube.setBounds(10, 295, 64, 50);
        
        button_cube.setBounds(202, 398, 64, 50);
        frame.getContentPane().add(button_cube);

        JButton btnEx = new JButton("ex");
        btnEx.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                double a = Math.exp(Double.parseDouble(textField.getText()));
                textField.setText("");
                textField.setText(textField.getText()+a);
            }
        });
        btnEx.setFont(new Font("Verdana", Font.PLAIN, 12));
        btnEx.setForeground(Color.black);
        btnEx.setBackground(Color.white);
        btnEx.setBounds(266, 398, 64, 50);
        frame.getContentPane().add(btnEx);
        JButton btnx = new JButton("1/x");
        btnx.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                double a =1/ (Double.parseDouble(textField.getText()));
                textField.setText("");
                textField.setText(textField.getText()+a);
            }
        });
        btnx.setFont(new Font("Verdana", 1, 12));
        btnx.setForeground(Color.black);
        btnx.setBackground(Color.white);
        btnx.setBounds(74, 449, 64, 50);
        frame.getContentPane().add(btnx);

        JButton btnSqrt = new JButton("\u221A");
        btnSqrt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                double a = Math.sqrt(Double.parseDouble(textField.getText()));
                textField.setText("");
                textField.setText(textField.getText()+a);
            }
        });
        btnSqrt.setFont(new Font("Verdana", Font.PLAIN, 17));
        btnSqrt.setForeground(Color.black);
        btnSqrt.setBackground(Color.white);
        btnSqrt.setBounds(139, 450, 64, 50);
        frame.getContentPane().add(btnSqrt);

        JButton btnCos = new JButton("cos");
        btnCos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                double a = Math.cos(Double.parseDouble(textField.getText()));
                textField.setText("");
                textField.setText(textField.getText()+a);
            }
        });
        btnCos.setFont(new Font("Verdana", 1, 12));
        btnCos.setForeground(Color.black);
        btnCos.setBackground(Color.white);
        btnCos.setBounds(139, 347, 64, 50);
        
        frame.getContentPane().add(btnCos);
        JButton btnCos_1 = new JButton("cosh");
        btnCos_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                double a = Math.cosh(Double.parseDouble(textField.getText()));
                textField.setText("");
                textField.setText(textField.getText()+a);
            }
        });
        btnCos_1.setFont(new Font("Tahoma", 1, 12));
        btnCos_1.setForeground(Color.black);
        btnCos_1.setBackground(Color.white);
        // btnCos_1.setBounds(74, 295, 64, 50);
        btnCos_1.setBounds(74, 398, 64, 50);
        frame.getContentPane().add(btnCos_1);
        JButton btnBackSpace = new JButton("X");
        btnBackSpace.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String backSpace=null;
                if(textField.getText().length()>0)
                {
                    StringBuilder str=new StringBuilder(textField.getText());
                    str.deleteCharAt(textField.getText().length()-1);
                    backSpace=str.toString();
                    textField.setText(backSpace);
                }
            }
        });
        btnBackSpace.setFont(new Font("Verdana", Font.PLAIN, 19));
        btnBackSpace.setForeground(Color.black);
        btnBackSpace.setBackground(Color.yellow);
        btnBackSpace.setBounds(266, 139, 64, 50);
        frame.getContentPane().add(btnBackSpace);
        JButton button9 = new JButton("9");
        button9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String number=textField.getText()+button9.getText();
                textField.setText(number);
            }
        });
        button9.setFont(new Font("Verdana", 1, 23));
        button9.setForeground(Color.black);
        button9.setBackground(Color.white);
        button9.setBounds(140, 243, 64, 50);
        frame.getContentPane().add(button9);
        JButton button6 = new JButton("6");
        button6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String number=textField.getText()+button6.getText();
                textField.setText(number);
            }
        });
        button6.setFont(new Font("Verdana", 1, 23));
        button6.setForeground(Color.black);
        button6.setBackground(Color.white);
        button6.setBounds(139, 191, 64, 50);
        frame.getContentPane().add(button6);
        JButton button3 = new JButton("3");
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String number=textField.getText()+button3.getText();
                textField.setText(number);
            }
        });
        button3.setFont(new Font("Verdana", 1, 23));
        button3.setForeground(Color.black);
        button3.setBackground(Color.white);
        button3.setBounds(139, 139, 64, 50);
        frame.getContentPane().add(button3);
        JButton btnTan = new JButton("tan");
        btnTan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                double a = Math.tan(Double.parseDouble(textField.getText()));
                textField.setText("");
                textField.setText(textField.getText()+a);
            }
        });
        btnTan.setFont(new Font("Verdana", 1, 12));
        btnTan.setForeground(Color.black);
        btnTan.setBackground(Color.white);
        btnTan.setBounds(202, 347, 64, 50);
        frame.getContentPane().add(btnTan);
        JButton btnTan_1 = new JButton("tanh");
        btnTan_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                double a = Math.tanh(Double.parseDouble(textField.getText()));
                textField.setText("");
                textField.setText(textField.getText()+a);
            }
        });
        btnTan_1.setFont(new Font("Verdana", Font.PLAIN, 13));
        btnTan_1.setForeground(Color.black);
        btnTan_1.setBackground(Color.white);
        // btnTan_1.setBounds(266, 243, 64, 50);          
        btnTan_1.setBounds(139, 398, 64, 50);                

        frame.getContentPane().add(btnTan_1);
        JButton btnPlus = new JButton("+");
        btnPlus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                first=Double.parseDouble(textField.getText());
                textField.setText("");
                operation="+";
            }
        });
        btnPlus.setFont(new Font("Verdana", Font.PLAIN, 21));
        btnPlus.setForeground(Color.black);
        btnPlus.setBackground(Color.white);
        btnPlus.setBounds(266, 191, 64, 50);

        frame.getContentPane().add(btnPlus);
        JButton btnSub = new JButton("-");
        btnSub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                first=Double.parseDouble(textField.getText());
                textField.setText("");
                operation="-";
            }
        });
        btnSub.setFont(new Font("Verdana", Font.PLAIN, 21));
        btnSub.setForeground(Color.black);
        btnSub.setBackground(Color.white);
        btnSub.setBounds(266, 243, 64, 50);
        frame.getContentPane().add(btnSub);
        JButton btnMul = new JButton("*");
        btnMul.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                first=Double.parseDouble(textField.getText());
                textField.setText("");
                operation="*";
            }
        });
        btnMul.setFont(new Font("Verdana", Font.PLAIN, 21));
        btnMul.setForeground(Color.black);
        btnMul.setBackground(Color.white);
        btnMul.setBounds(266, 295, 64, 50);
        frame.getContentPane().add(btnMul);
        JButton btnDivide = new JButton("/");
        btnDivide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                first=Double.parseDouble(textField.getText());
                textField.setText("");
                operation="/";
            }
        });
        btnDivide.setFont(new Font("Verdana", Font.PLAIN, 21));
        btnDivide.setForeground(Color.black);
        btnDivide.setBackground(Color.white);
        btnDivide.setBounds(266, 347, 64, 50);
        frame.getContentPane().add(btnDivide);
        JButton btnP_1 = new JButton("x2");
        btnP_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                double a = (Double.parseDouble(textField.getText()));
                a=a*a;
                textField.setText("");
                textField.setText(textField.getText()+a);
            }
        });
        btnP_1.setFont(new Font("Verdana", Font.PLAIN, 16));
        btnP_1.setForeground(Color.black);
        btnP_1.setBackground(Color.white);
        btnP_1.setBounds(202, 295, 64, 50);
        frame.getContentPane().add(btnP_1);
        JButton btnN = new JButton("n!");
        btnN.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                double a =(Double.parseDouble(textField.getText()));
                double f=1;
                while(a!=0)
                {
                    f=f*a;
                    a--;
                }
                textField.setText("");
                textField.setText(textField.getText()+f);
            }
        });
        btnN.setFont(new Font("Verdana", Font.PLAIN, 18));
        btnN.setForeground(Color.black);
        btnN.setBackground(Color.white);
      
        btnN.setBounds(202, 243, 64, 50);
        frame.getContentPane().add(btnN);
        JSeparator separator = new JSeparator();
        separator.setBounds(72, 291, 1, 2);
        frame.getContentPane().add(separator);
        JSeparator separator_1 = new JSeparator();
        separator_1.setBounds(19, 191, 1, 2);
        frame.getContentPane().add(separator_1);
        JSeparator separator_2 = new JSeparator();
        separator_2.setBounds(10, 191, 320, 2);
        frame.getContentPane().add(separator_2);
       
        JButton button = new JButton("+/-");
        button.setForeground(Color.black);
        button.setBackground(Color.white);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                double a=Double.parseDouble(String.valueOf(textField.getText()));
                a=a*(-1);
                textField.setText(String.valueOf(a));

            }
        });
        button.setFont(new Font("Tohama", 1, 12));
        button.setBounds(10, 449, 64, 50);
        frame.getContentPane().add(button);
    }
}