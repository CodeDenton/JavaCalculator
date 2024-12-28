import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class MyFrame extends JFrame {
    double firstNum;
    double secondNum;
    char sign;
    boolean firstOpp = false;
    boolean decimalPressed = false;

    MyFrame() {
        //Make Empty Frame
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setLayout(null);
    this.setSize(500, 350);
    this.setResizable(false);

    JLabel Box = new JLabel("", SwingConstants.CENTER);
    Box.setBounds(150, 0 , 185 ,100 );
    Box.setBorder(BorderFactory.createLineBorder(Color.black, 5));
    add(Box);

    //Make Button
    JButton button1 = new JButton("1");
    button1.setBounds(150,100,50,50);
    add(button1);

    //Make other button
    JButton button2 = new JButton("2");
    button2.setBounds(195,100,50,50);
    add(button2);

    JButton button3 = new JButton("3");
    button3.setBounds(240,100,50,50);
    add(button3);

    JButton buttonPlus = new JButton("+");
    buttonPlus.setBounds(285,100,50,50);
    add(buttonPlus);

    JButton buttonSubtract = new JButton("-");
    buttonSubtract.setBounds(285,145,50,50);
    add(buttonSubtract);

    JButton buttonMultiply = new JButton("*");
    buttonMultiply.setBounds(285,190,50,50);
    add(buttonMultiply);

    JButton buttonDivide = new JButton("/");
    buttonDivide.setBounds(285,235,50,50);
    add(buttonDivide);

    JButton button4 = new JButton("4");
    button4.setBounds(150,145,50,50);
    add(button4);

    JButton button5 = new JButton("5");
    button5.setBounds(195,145,50,50);
    add(button5);

    JButton button6 = new JButton("6");
    button6.setBounds(240,145,50,50);
    add(button6);

    JButton button7 = new JButton("7");
    button7.setBounds(150,190,50,50);
    add(button7);

    JButton button0 = new JButton("0");
    button0.setBounds(150,235,50,50);
    add(button0);

    JButton buttonEnter = new JButton("ENTER");
    buttonEnter.setBounds(150,280,185,50);
    add(buttonEnter);

    JButton buttonCE = new JButton("CE");
    buttonCE.setBounds(240,235,50,50);
    add(buttonCE);

    JButton button8 = new JButton("8");
    button8.setBounds(195,190,50,50);
    add(button8);

    JButton button9 = new JButton("9");
    button9.setBounds(240,190,50,50);
    add(button9);

    JButton buttonDecimal = new JButton(".");
    buttonDecimal.setBounds(195,235,50,50);
    add(buttonDecimal);

    this.setVisible(true);

    // String X = Box.getText();
    
    
    button1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)            {
            //Here goes the action (method) you want to execute when clicked
            if(firstOpp == false) {
                System.out.println(decimalPressed);
                if(decimalPressed == false) {
                    String result = String.valueOf((int) firstNum) + 1; // Concatenate as a string
                    // Convert back to double if needed
                    firstNum = Double.parseDouble(result);
                } else if(decimalPressed == true) {
                    firstNum += 0.1;
                }
                System.out.println(firstNum);
                Box.setText(Box.getText() + "1");
            } else if(firstOpp == true) {
                if(decimalPressed == false) {
                    String result = String.valueOf((int) secondNum) + 1; // Concatenate as a string
                    // Convert back to double if needed
                    secondNum = Double.parseDouble(result);

                } else if (decimalPressed == true) {
                    secondNum += 0.1;
                }
                Box.setText(Box.getText() + "1");
                System.out.println(secondNum);
                }
                

        }
    });
    button2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)            {
           //Here goes the action (method) you want to execute when clicked
           if(firstOpp == false) {
            System.out.println(decimalPressed);
            if(decimalPressed == false) {
                String result = String.valueOf((int) firstNum) + 2; // Concatenate as a string
                // Convert back to double if needed
                firstNum = Double.parseDouble(result);
            } else if(decimalPressed == true) {
                firstNum += 0.2;
            }
            System.out.println(firstNum);
            Box.setText(Box.getText() + "2");
        } else if(firstOpp == true) {
            if(decimalPressed == false) {
                String result = String.valueOf((int) secondNum) + 2; // Concatenate as a string
                // Convert back to double if needed
                secondNum = Double.parseDouble(result);

            } else if (decimalPressed == true) {
                secondNum += 0.2;
            }
            Box.setText(Box.getText() + "2");
            System.out.println(secondNum);
            }
            

    }
});
    button3.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)            {
            //Here goes the action (method) you want to execute when clicked
            if(firstOpp == false) {
                System.out.println(decimalPressed);
                if(decimalPressed == false) {
                    String result = String.valueOf((int) firstNum) + 3; // Concatenate as a string
                    // Convert back to double if needed
                    firstNum = Double.parseDouble(result);
                } else if(decimalPressed == true) {
                    firstNum += 0.3;
                }
                System.out.println(firstNum);
                Box.setText(Box.getText() + "3");
            } else if(firstOpp == true) {
                if(decimalPressed == false) {
                    String result = String.valueOf((int) secondNum) + 3; // Concatenate as a string
                    // Convert back to double if needed
                    secondNum = Double.parseDouble(result);

                } else if (decimalPressed == true) {
                    secondNum += 0.3;
                }
                Box.setText(Box.getText() + "3");
                System.out.println(secondNum);
                }
                

        }
    });
    button4.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)            {
            //Here goes the action (method) you want to execute when clicked
            if(firstOpp == false) {
                System.out.println(decimalPressed);
                if(decimalPressed == false) {
                    String result = String.valueOf((int) firstNum) + 4; // Concatenate as a string
                    // Convert back to double if needed
                    firstNum = Double.parseDouble(result);
                } else if(decimalPressed == true) {
                    firstNum += 0.4;
                }
                System.out.println(firstNum);
                Box.setText(Box.getText() + "4");
            } else if(firstOpp == true) {
                if(decimalPressed == false) {
                    String result = String.valueOf((int) secondNum) + 4; // Concatenate as a string
                    // Convert back to double if needed
                    secondNum = Double.parseDouble(result);

                } else if (decimalPressed == true) {
                    secondNum += 0.4;
                }
                Box.setText(Box.getText() + "4");
                System.out.println(secondNum);
                }
                

        }
    });
    button5.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)            {
            //Here goes the action (method) you want to execute when clicked
            if(firstOpp == false) {
                System.out.println(decimalPressed);
                if(decimalPressed == false) {
                    String result = String.valueOf((int) firstNum) + 5; // Concatenate as a string
                    // Convert back to double if needed
                    firstNum = Double.parseDouble(result);
                } else if(decimalPressed == true) {
                    firstNum += 0.5;
                }
                System.out.println(firstNum);
                Box.setText(Box.getText() + "5");
            } else if(firstOpp == true) {
                if(decimalPressed == false) {
                    String result = String.valueOf((int) secondNum) + 5; // Concatenate as a string
                    // Convert back to double if needed
                    secondNum = Double.parseDouble(result);

                } else if (decimalPressed == true) {
                    secondNum += 0.5;
                }
                Box.setText(Box.getText() + "5");
                System.out.println(secondNum);
                }
                

        }
    });
    button6.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)            {
            //Here goes the action (method) you want to execute when clicked
            if(firstOpp == false) {
                System.out.println(decimalPressed);
                if(decimalPressed == false) {
                    String result = String.valueOf((int) firstNum) + 6; // Concatenate as a string
                    // Convert back to double if needed
                    firstNum = Double.parseDouble(result);
                } else if(decimalPressed == true) {
                    firstNum += 0.6;
                }
                System.out.println(firstNum);
                Box.setText(Box.getText() + "6");
            } else if(firstOpp == true) {
                if(decimalPressed == false) {
                    String result = String.valueOf((int) secondNum) + 6; // Concatenate as a string
                    // Convert back to double if needed
                    secondNum = Double.parseDouble(result);

                } else if (decimalPressed == true) {
                    secondNum += 0.6;
                }
                Box.setText(Box.getText() + "6");
                System.out.println(secondNum);
                }
                

        }
    });
    button7.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)            {
            //Here goes the action (method) you want to execute when clicked
            if(firstOpp == false) {
                System.out.println(decimalPressed);
                if(decimalPressed == false) {
                    String result = String.valueOf((int) firstNum) + 7; // Concatenate as a string
                    // Convert back to double if needed
                    firstNum = Double.parseDouble(result);
                } else if(decimalPressed == true) {
                    firstNum += 0.7;
                }
                System.out.println(firstNum);
                Box.setText(Box.getText() + "7");
            } else if(firstOpp == true) {
                if(decimalPressed == false) {
                    String result = String.valueOf((int) secondNum) + 7; // Concatenate as a string
                    // Convert back to double if needed
                    secondNum = Double.parseDouble(result);

                } else if (decimalPressed == true) {
                    secondNum += 0.7;
                }
                Box.setText(Box.getText() + "7");
                System.out.println(secondNum);
                }
                

        }
    });
    button8.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)            {
            //Here goes the action (method) you want to execute when clicked
            if(firstOpp == false) {
                System.out.println(decimalPressed);
                if(decimalPressed == false) {
                    String result = String.valueOf((int) firstNum) + 8; // Concatenate as a string
                    // Convert back to double if needed
                    firstNum = Double.parseDouble(result);
                } else if(decimalPressed == true) {
                    firstNum += 0.8;
                }
                System.out.println(firstNum);
                Box.setText(Box.getText() + "8");
            } else if(firstOpp == true) {
                if(decimalPressed == false) {
                    String result = String.valueOf((int) secondNum) + 8; // Concatenate as a string
                    // Convert back to double if needed
                    secondNum = Double.parseDouble(result);

                } else if (decimalPressed == true) {
                    secondNum += 0.8;
                }
                Box.setText(Box.getText() + "8");
                System.out.println(secondNum);
                }
                

        }
    });
    button9.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)            {
            //Here goes the action (method) you want to execute when clicked
            if(firstOpp == false) {
                System.out.println(decimalPressed);
                if(decimalPressed == false) {
                    String result = String.valueOf((int) firstNum) + 9; // Concatenate as a string
                    // Convert back to double if needed
                    firstNum = Double.parseDouble(result);
                } else if(decimalPressed == true) {
                    firstNum += 0.9;
                }
                System.out.println(firstNum);
                Box.setText(Box.getText() + "9");
            } else if(firstOpp == true) {
                if(decimalPressed == false) {
                    String result = String.valueOf((int) secondNum) + 9; // Concatenate as a string
                    // Convert back to double if needed
                    secondNum = Double.parseDouble(result);

                } else if (decimalPressed == true) {
                    secondNum += 0.9;
                }
                Box.setText(Box.getText() + "9");
                System.out.println(secondNum);
                }
                

        }
    });
    button0.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)            {
            //Here goes the action (method) you want to execute when clicked
            if(firstOpp == false) {
                System.out.println(decimalPressed);
                if(decimalPressed == false) {
                    String result = String.valueOf((int) firstNum) + 0; // Concatenate as a string
                    // Convert back to double if needed
                    firstNum = Double.parseDouble(result);
                } else if(decimalPressed == true) {
                    firstNum += 0.0;
                }
                System.out.println(firstNum);
                Box.setText(Box.getText() + "0");
            } else if(firstOpp == true) {
                if(decimalPressed == false) {
                    String result = String.valueOf((int) secondNum) + 0; // Concatenate as a string
                    // Convert back to double if needed
                    secondNum = Double.parseDouble(result);

                } else if (decimalPressed == true) {
                    secondNum += 0.0;
                }
                Box.setText(Box.getText() + "0");
                System.out.println(secondNum);
                }
                

        }
    });
    buttonPlus.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)            {
            //Here goes the action (method) you want to execute when clicked
            Box.setText(Box.getText() + " + ");
            System.out.println('+');
            sign = '+';
            firstOpp = true;
            decimalPressed = false;


        }
    });

    buttonSubtract.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)            {
            //Here goes the action (method) you want to execute when clicked
            Box.setText(Box.getText() + " - ");
            System.out.println('-');
            sign = '-';
            firstOpp = true;
            decimalPressed = false;



        }
    });

    buttonMultiply.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)            {
            //Here goes the action (method) you want to execute when clicked
            Box.setText(Box.getText() + " * ");
            System.out.println('*');
            sign = '*';
            firstOpp = true;
            decimalPressed = false;



        }
    });

    buttonDivide.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)            {
            //Here goes the action (method) you want to execute when clicked
            Box.setText(Box.getText() + " / ");
            System.out.println('/');
            sign = '/';
            firstOpp = true;
            decimalPressed = false;



        }
    });

    buttonEnter.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)            {
            //Here goes the action (method) you want to execute when clicked
            System.out.println('=');
            calculater calc = new calculater(firstNum, secondNum, sign);

            int count = 0;
            for(int i=0; i<Box.getText().length(); i++) {
                String result = Box.getText();
                if(result.charAt(i) == '+') {
                    count++;
                } else if(result.charAt(i) == '-') {
                    count++;
                } else if(result.charAt(i) == '*') {
                    count++;
                } else if(result.charAt(i) == '/') {
                    count++;
                }
            }
            if(count > 1) {
                Box.setText("One operation at a time!");
            }else if(sign == '+') {
                Box.setText(""+ calc.add());
                firstNum = calc.add();
                secondNum = 0;
                decimalPressed = false;
                System.out.println(calc.add());
            } else if(sign == '-') {
                Box.setText(""+ calc.subtract());
                firstNum = calc.subtract();
                secondNum = 0;
                decimalPressed = false;
                System.out.println(calc.subtract());
            } else if(sign == '*') {
                Box.setText(""+ calc.multiply());
                firstNum = calc.multiply();
                secondNum = 0;
                decimalPressed = false;
                System.out.println(calc.multiply());
            } else if(sign == '/') {
                Box.setText(""+ calc.divide());
                firstNum = calc.divide();
                secondNum = 0;
                decimalPressed = false;
                System.out.println(calc.divide());
            } 
        }
    });

    buttonCE.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)            {
            //Here goes the action (method) you want to execute when clicked
            Box.setText("");   
            firstNum = 0;
            secondNum = 0;
            firstOpp = false;
            decimalPressed = false;
        }
    });

    buttonDecimal.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)            {
            //Here goes the action (method) you want to execute when clicked
            Box.setText(Box.getText() + ".");   
            decimalPressed = true;
            
        }
    });
   
}
}
