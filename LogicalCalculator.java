import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;


public class LogicalCalculator extends conversion implements ActionListener {
    public static void main(String[] args) {
        new LogicalCalculator();
    }
    double number=0;
    double  answer;
    String numberHEXA="0";
    String answerforbinary="";
    int calculation;
    JPanel panel1 = new JPanel();
    JFrame frame = new JFrame("Porgrammer Calculator");
    ButtonGroup checkBoxGroup1 = new ButtonGroup();
    JLabel label = new JLabel("Logical");
    JTextField textField = new JTextField();
    JButton button0 = new JButton("0");
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");
    JButton buttonvirgul = new JButton(".");
    JButton buttonA = new JButton("A");
    JButton buttonB = new JButton("B");
    JButton buttonC = new JButton("C");
    JButton buttonD = new JButton("D");
    JButton buttonE = new JButton("E");
    JButton buttonF = new JButton("F");
    JRadioButton buttonrBinary = new JRadioButton("Bin");
    JRadioButton buttonDecimal = new JRadioButton("Dec");
    JRadioButton buttonrHexadicimal = new JRadioButton("Hex");
    JButton buttonminus = new JButton("-");
    JButton buttonplus = new JButton("+");
    JButton buttonmltiplucation = new JButton("*");
    JButton buttondivide = new JButton("/");
    public static int binaryorhexaordecimal=0;
    JButton buttonequal = new JButton("=");
    Border border;
    JButton buttonClear = new JButton("Cl");
    JButton buttonDelete = new JButton("Dl");
    JButton ButtonXor=new JButton("xor");
    JButton ButtonAnd=new JButton("And");
    JButton Buttonor=new JButton("or");
    JButton ButtonShiftRight =new JButton(">>");
    JButton ButtonShiftleft=new JButton("<<");
    String answerforhexa="";
    String numberforbinary="0";


    LogicalCalculator() {
        screenGUI();
    }
    public void screenGUI() {
        label.setBounds(30, 0, 100, 50);
        label.setForeground(Color.BLACK);
        textField.setText("");
        textField.setBounds(30, 40, 520, 40);
        textField.setFont(new Font("Arial", Font.BOLD, 20));
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.LEFT);
        border = BorderFactory.createLineBorder(Color.BLACK, 2);
        textField.setBorder(border);
        button7.setBounds(290, 190, 50, 30);
        button7.setFont(new Font("Arial", Font.BOLD, 14));
        button8.setBounds(340, 190, 50, 30);
        button8.setFont(new Font("Arial", Font.BOLD, 14));
        button9.setBounds(390, 190, 50, 30);
        button9.setFont(new Font("Arial", Font.BOLD, 14));
        button4.setBounds(290, 220, 50, 30);
        button4.setFont(new Font("Arial", Font.BOLD, 14));
        button5.setBounds(340, 220, 50, 30);
        button5.setFont(new Font("Arial", Font.BOLD, 14));
        button6.setBounds(390, 220, 50, 30);
        button6.setFont(new Font("Arial", Font.BOLD, 14));
        button1.setBounds(290, 250, 50, 30);
        button1.setFont(new Font("Arial", Font.BOLD, 14));
        button2.setBounds(340, 250, 50, 30);
        button2.setFont(new Font("Arial", Font.BOLD, 14));
        button3.setBounds(390, 250, 50, 30);
        button3.setFont(new Font("Arial", Font.BOLD, 14));
        button0.setBounds(290, 280, 100, 30);
        button0.setFont(new Font("Arial", Font.BOLD, 14));
        buttonvirgul.setBounds(390, 280, 50, 30);
        buttonvirgul.setFont(new Font("Arial", Font.BOLD, 14));
        buttonDecimal.setBounds(10, 95, 50, 30);
        buttonDecimal.setFont(new Font("Arial", Font.BOLD, 12));
        buttonDecimal.setForeground(Color.white);
        buttonDecimal.setBackground(Color.BLACK);
        panel1.add(buttonrBinary);
        panel1.add(buttonDecimal);
        panel1.add(buttonrHexadicimal);
        checkBoxGroup1 = new ButtonGroup();
        checkBoxGroup1.add(buttonrBinary);
        checkBoxGroup1.add(buttonDecimal);
        checkBoxGroup1.add(buttonrHexadicimal);
        buttonrBinary.setBounds(60, 95, 50, 30);
        buttonrBinary.setFont(new Font("Arial", Font.BOLD, 12));
        buttonrBinary.setForeground(Color.white);
        buttonrBinary.setBackground(Color.BLACK);
        buttonrHexadicimal.setBounds(110, 95, 50, 30);
        buttonrHexadicimal.setFont(new Font("Arial", Font.BOLD, 12));
        buttonrHexadicimal.setForeground(Color.white);
        buttonrHexadicimal.setBackground(Color.BLACK);
        panel1.setBackground(Color.BLACK);
        panel1.setBounds(110, 95, 250, 120);
        buttonA.setBounds(240, 160, 50, 30);
        buttonA.setFont(new Font("Arial", Font.BOLD, 14));
        buttonB.setBounds(240, 190, 50, 30);
        buttonB.setFont(new Font("Arial", Font.BOLD, 14));
        buttonC.setBounds(240, 220, 50, 30);
        buttonC.setFont(new Font("Arial", Font.BOLD, 14));
        buttonD.setBounds(240, 250, 50, 30);
        buttonD.setFont(new Font("Arial", Font.BOLD, 14));
        buttonE.setBounds(240, 280, 50, 30);
        buttonE.setFont(new Font("Arial", Font.BOLD, 14));
        buttonF.setBounds(190, 280, 50, 30);
        buttonF.setFont(new Font("SansSerif", Font.BOLD, 14));
        buttondivide.setBounds(440, 190, 50, 30);
        buttondivide.setFont(new Font("Arial", Font.BOLD, 14));
        buttonClear.setBounds(440, 160, 50, 30);
        buttonClear.setFont(new Font("Arial", Font.BOLD, 14));
        buttonClear.setBackground(new Color(255, 0, 0));
        buttonDelete.setBounds(390, 160, 50, 30);
        buttonDelete.setFont(new Font("Arial", Font.BOLD, 14));
        buttonmltiplucation.setBounds(440, 220, 50, 30);
        buttonmltiplucation.setFont(new Font("Arial", Font.BOLD, 14));
        buttonmltiplucation.addActionListener(this);
        buttonminus.setBounds(440, 250, 50, 30);
        buttonminus.setFont(new Font("Arial", Font.BOLD, 14));
        buttonminus.addActionListener(this);
        buttonplus.setBounds(440, 280, 50, 30);
        buttonplus.setFont(new Font("Arial", Font.BOLD, 14));
        buttonplus.addActionListener(this);
        buttonequal.setBounds(490, 250, 50, 60);
        buttonequal.setFont(new Font("Arial", Font.BOLD, 14));
        ButtonXor.setBounds(190, 250, 50, 30);
        ButtonXor.setFont(new Font("Arial", Font.BOLD, 8));
        ButtonAnd.setBounds(190, 220, 50, 30);
        ButtonAnd.setFont(new Font("Arial", Font.BOLD, 8));
        Buttonor.setBounds(190, 190, 50, 30);
        Buttonor.setFont(new Font("Arial", Font.BOLD, 10));
        ButtonShiftRight.setBounds(340, 160, 50, 30);
        ButtonShiftRight.setFont(new Font("Arial", Font.BOLD, 10));
        ButtonShiftleft.setBounds(290, 160, 50, 30);
        ButtonShiftleft.setFont(new Font("Arial", Font.BOLD, 10));
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        button0.addActionListener(this);
        buttonvirgul.addActionListener(this);
        buttonrBinary.addActionListener(this);
        buttonrHexadicimal.addActionListener(this);
        buttonmltiplucation.addActionListener(this);
        buttonClear.addActionListener(this);
        buttonA.addActionListener(this);
        buttonB.addActionListener(this);
        buttonC.addActionListener(this);
        buttonD.addActionListener(this);
        buttonE.addActionListener(this);
        buttonF.addActionListener(this);
        buttonDecimal.addActionListener(this);
        buttonrBinary.addActionListener(this);
        buttonDelete.addActionListener(this);
        ButtonAnd.addActionListener(this);
        ButtonXor.addActionListener(this);
        Buttonor.addActionListener(this);
        ButtonShiftRight.addActionListener(this);
        ButtonShiftleft.addActionListener(this);
        buttonequal.addActionListener(this);
        buttondivide.addActionListener(this);
        //frame adds package
        frame.add(label);
        frame.add(textField);
        frame.add(button9);
        frame.add(button8);
        frame.add(button7);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button0);
        frame.add(buttonvirgul);
        frame.add(buttonrBinary);
        frame.add(buttonrHexadicimal);
        frame.add(buttonDecimal);
        frame.add(ButtonXor);
        frame.add(buttonA);
        frame.add(buttonB);
        frame.add(buttonC);
        frame.add(buttonD);
        frame.add(buttonE);
        frame.add(buttonF);
        frame.add(buttondivide);
        frame.add(buttonClear);
        frame.add(buttonDelete);
        frame.add(buttonmltiplucation);
        frame.add(buttonminus);
        frame.add(buttonplus);
        frame.add(buttonequal);
        frame.add(ButtonXor);
        frame.add(ButtonAnd);
        frame.add(Buttonor);
        frame.add(ButtonShiftRight);
        frame.add(ButtonShiftleft);
        //Frame settings
        frame.setSize(600, 390);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(new Color(255, 255, 255));
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == buttonClear) {
            label.setText("");
            textField.setText("");
            number = 0;
        }
        if (source == buttonDelete) {
            int length = textField.getText().length();
            int number = length - 1;
            if (length > 0) {
                StringBuilder back = new StringBuilder(textField.getText());
                back.deleteCharAt(number);
                textField.setText(back.toString());
            }
            textField.getText();
            label.setText("");
        }
        if (Objects.equals(e.getActionCommand(), "Bin")) {
            binarymode();
            binaryorhexaordecimal = 1;
        }
        if (Objects.equals(e.getActionCommand(), "Hex")) {
            hexdacimalmode();
            binaryorhexaordecimal = 2;
        }
        if (Objects.equals(e.getActionCommand(), "Dec")) {
            decimalmode();
            binaryorhexaordecimal = 3;
        }
        if (binaryorhexaordecimal == 3) {
            if (source == button1) {
                textField.setText(textField.getText() + "1");
            }
            else if (source == button0) {
                textField.setText(textField.getText() + "0");
            } else if (source == button2) {
                textField.setText(textField.getText() + "2");
            } else if (source == button3) {
                textField.setText(textField.getText() + "3");
            } else if (source == button4) {
                textField.setText(textField.getText() + "4");
            } else if (source == button5) {
                textField.setText(textField.getText() + "5");
            } else if (source == button6) {
                textField.setText(textField.getText() + "6");
            } else if (source == button7) {
                textField.setText(textField.getText() + "7");
            } else if (source == button8) {
                textField.setText(textField.getText() + "8");
            } else if (source == button9) {
                textField.setText(textField.getText() + "9");
            } else if (source == buttonvirgul) {
                if (!textField.getText().contains(".")) {
                    textField.setText(textField.getText() + ".");
                }
            } else if (source == buttonplus) {
                if (number == 0) {

                    String str = textField.getText();

                    number = Double.parseDouble(str);
                    textField.setText("");
                    label.setText(str + "+");
                }
                else {
                    String str = textField.getText();
                    System.out.println(textField.getText());

                    number = number + Double.parseDouble(str);
                    textField.setText("");
                    label.setText(number + "+");

                }
                calculation = 1;
            }
             else if (source == buttonminus) {
                if (number == 0) {
                    String str = textField.getText();

                    number = Double.parseDouble(textField.getText());
                    textField.setText("");
                    label.setText(str + "-");
                }
                calculation = 2;
            } else if (source == buttonmltiplucation) {
                if (!textField.getText().isEmpty()) {
                    if (number == 0) {String str = textField.getText();

                        number = Double.parseDouble(textField.getText());
                        textField.setText("");
                        label.setText(str + "X");
                    }
                    calculation = 3;
                }
            } else if (source == buttondivide) {
                if (number == 0) {
                    String str = textField.getText();
                    number = Double.parseDouble(textField.getText());
                    textField.setText("");
                    label.setText(str + "/");
                }
                calculation = 4;
            }
            else if (Objects.equals(e.getActionCommand(), "=")) {
                switch (calculation) {
                    case 1:
                        String str = textField.getText();
                        System.out.println(number);
                        answer = number + Double.parseDouble(str);
                        if (Double.toString(answer).endsWith(".0")) {
                            textField.setText(Double.toString(answer).replace(".0", ""));
                        } else {
                            textField.setText(Double.toString(answer));
                        }
                        label.setText("");
                        break;
                    case 2:
                        String str1 = textField.getText();
                        answer = number - Double.parseDouble(str1);
                        if (Double.toString(answer).endsWith(".0")) {
                            textField.setText(Double.toString(answer).replace(".0", ""));
                        } else {
                            textField.setText(Double.toString(answer));
                        }
                        label.setText("");
                        break;
                    case 3:
                        String str2 = textField.getText();
                        answer = number * Double.parseDouble(str2);
                        if (Double.toString(answer).endsWith(".0")) {
                            textField.setText(Double.toString(answer).replace(".0", ""));
                        } else {
                            textField.setText(Double.toString(answer));
                        }
                        label.setText("");
                        break;
                    case 4:
                        answer = number / Double.parseDouble(textField.getText());
                        if (Double.toString(answer).endsWith(".0")) {
                            textField.setText(Double.toString(answer).replace(".0", ""));
                        } else {
                            textField.setText(Double.toString(answer));
                        }
                        label.setText("");
                        break;
                }
            }  } else if (binaryorhexaordecimal == 2) {
            if (source == button1) {
                textField.setText(textField.getText() + "1");
            } else if (source == button0) {
                textField.setText(textField.getText() + "0");
            } else if (source == button2) {
                textField.setText(textField.getText() + "2");
            } else if (source == button3) {
                textField.setText(textField.getText() + "3");
            } else if (source == button4) {
                textField.setText(textField.getText() + "4");
            } else if (source == button5) {
                textField.setText(textField.getText() + "5");
            } else if (source == button6) {
                textField.setText(textField.getText() + "6");
            } else if (source == button7) {
                textField.setText(textField.getText() + "7");
            } else if (source == button8) {
                textField.setText(textField.getText() + "8");
            } else if (source == button9) {
                textField.setText(textField.getText() + "9");
            } else if (source == buttonA) {
                textField.setText(textField.getText() + "A");
            } else if (source == buttonB) {
                textField.setText(textField.getText() + "B");
            } else if (source == buttonC) {
                textField.setText(textField.getText() + "C");
            } else if (source == buttonD) {
                textField.setText(textField.getText() + "D");
            } else if (source == buttonE) {
                textField.setText(textField.getText() + "E");
            } else if (source == buttonF) {
                textField.setText(textField.getText() + "F");
            } else if (source == buttonvirgul) {
                if (!textField.getText().contains(".")) {
                    textField.setText(textField.getText() + ".");
                }
            } else if (source == buttonplus) {
                if (Objects.equals(numberHEXA, "0")) {
                    String str = textField.getText();
                    numberHEXA = textField.getText();
                    textField.setText("");
                    label.setText(str + "+");
                } else {
                    numberHEXA = sumoftwohex(numberHEXA, textField.getText());
                    textField.setText("");
                    label.setText(numberHEXA + "+");
                }
                calculation = 1;
            } else if (source == buttonminus) {
                if (Objects.equals(numberHEXA, "0")) {
                    String str = textField.getText();
                    numberHEXA = textField.getText();
                    textField.setText("");
                    label.setText(str + "-");
                } else {
                    numberHEXA = (substractionoftwohex(numberHEXA, textField.getText()));
                    textField.setText("");
                    if (Objects.equals(numberHEXA, "")) {
                        numberHEXA = "0";
                    }
                    label.setText(numberHEXA + "-");
                    calculation = 2;
                }
            } else if (source == buttonmltiplucation) {
                if (!textField.getText().isEmpty()) {
                    if (Objects.equals(numberHEXA, "0")) {
                        String str = textField.getText();
                        numberHEXA = textField.getText();
                        textField.setText("");
                        label.setText(str + "x");
                    } else {
                        numberHEXA = (multiplcationhex(numberHEXA, textField.getText()));
                        textField.setText("");
                        label.setText(numberHEXA + "x");
                    }
                    calculation = 3;
                }
            } else if (source == buttondivide) {
                if (!textField.getText().isEmpty()) {
                    if (Objects.equals(numberHEXA, "0")) {
                        String str = textField.getText();
                        numberHEXA = textField.getText();
                        textField.setText("");
                        label.setText(str + "/");
                    } else {
                        numberHEXA = (duvidedhex(numberHEXA, textField.getText()));
                        textField.setText("");
                        label.setText(numberHEXA + "/");
                    }
                }
                calculation = 4;
            }  else if (Objects.equals(e.getActionCommand(), "=")) {
                switch (calculation) {
                    case 1:
                        answerforhexa = sumoftwohex(numberHEXA, textField.getText());
                        if (answerforhexa.endsWith(".0")) {
                            textField.setText(answerforhexa.replace(".0", ""));
                        } else {
                            textField.setText(answerforhexa);
                        }
                        label.setText("");
                        break;
                    case 2:
                        answerforhexa = substractionoftwohex(numberHEXA, textField.getText());
                        if (answerforhexa.endsWith(".0")) {
                            textField.setText(answerforhexa.replace(".0", ""));
                        } else {
                            textField.setText(answerforhexa);
                        }
                        label.setText("");
                        break;
                    case 3:
                        answerforhexa = multiplcationhex(numberHEXA, textField.getText());
                        if (answerforhexa.endsWith(".0")) {
                            textField.setText(answerforhexa.replace(".0", ""));
                        } else {
                            textField.setText(answerforhexa);
                        }
                        label.setText("");
                        break;
                    case 4:
                        answerforhexa = duvidedhex(numberHEXA, textField.getText());
                        if (answerforhexa.endsWith(".0")) {
                            textField.setText(answerforhexa.replace(".0", ""));
                        } else {
                            textField.setText(answerforhexa);
                        }
                        label.setText("");
                        break;
                }
            }
        }
        else if (binaryorhexaordecimal == 1) {
            if (source == button1) {
                textField.setText(textField.getText() + "1");
            } else if (source == button0) {
                textField.setText(textField.getText() + "0");
            } else if (source == buttonvirgul) {
                if (!textField.getText().contains(".")) {
                    textField.setText(textField.getText() + ".");
                }
            } else if (source == buttonplus) {
                if (Objects.equals(answerforbinary, "0")) {
                    String str = textField.getText();
                    numberforbinary = textField.getText();
                    textField.setText("");
                    label.setText(str + "+");
                } else {
                    numberforbinary = sumbinary(numberforbinary, textField.getText());
                    textField.setText("");
                    label.setText(numberforbinary + "+");
                }
                calculation = 1;
            } else if (source == buttonminus) {
                if (number == 0) {
                    String str = textField.getText();
                    numberforbinary =textField.getText();
                    textField.setText("");
                    label.setText(str +"-");
                } else {
                    numberforbinary = substractionbinary(numberforbinary, textField.getText());
                    textField.setText("");
                    label.setText(numberforbinary + "-");
                }
                calculation = 2;
            } else if (source == buttonmltiplucation) {
                if (!textField.getText().isEmpty()) {
                    if (number == 0) {
                        String str = textField.getText();
                        numberforbinary = textField.getText();
                        textField.setText("");
                        label.setText(str + "*");
                    } else {
                        numberforbinary =multiplcationbin(numberforbinary, textField.getText());
                        textField.setText("");
                        label.setText(number + "*");
                    }
                    calculation = 3;
                }
            } else if (source == buttondivide) {
                //
                if (number == 0) {
                    String str = textField.getText();
                    numberforbinary = textField.getText();
                    textField.setText("");
                    label.setText(str + "/");
                } else {
                    numberforbinary = multiplcationbin(numberforbinary, textField.getText());
                    textField.setText("");
                    label.setText(number + "/");
                }
                calculation = 4;
            }
            else if (source==ButtonAnd) {
                if (Objects.equals(numberforbinary, "0")) {
                    String str = textField.getText();
                    numberforbinary = textField.getText();
                    textField.setText("");
                    label.setText(str + "And");
                } else {
                    numberforbinary = andoperation(numberforbinary, textField.getText());
                    textField.setText("");
                    label.setText(numberforbinary + "And");
                }
                calculation = 5;
            }
            else if (source==ButtonXor) {
                if (Objects.equals(numberforbinary, "0")) {
                    String str = textField.getText();
                    numberforbinary = textField.getText();
                    textField.setText("");
                    label.setText(str + "xor");
                } else {
                    numberforbinary =xoroperation(numberforbinary, textField.getText());
                    textField.setText("");
                    label.setText(numberforbinary + "xor");
                }
                calculation = 6;
            }
            else if (source==Buttonor) {
                if (Objects.equals(numberforbinary, "0")) {
                    String str = textField.getText();
                    numberforbinary = textField.getText();
                    textField.setText("");
                    label.setText(str + "or");
                } else {
                    numberforbinary =oroperation(numberforbinary, textField.getText());
                    textField.setText("");
                    label.setText(numberforbinary + "or");
                }
                calculation = 7;
            }
            else if (source==ButtonShiftRight) {
                numberforbinary = textField.getText();
                textField.setText(Rightshift(numberforbinary));

            }
            else if (source==ButtonShiftleft) {
                numberforbinary = textField.getText();
                textField.setText(Leftshift(numberforbinary));
            }
            else if (Objects.equals(e.getActionCommand(), "=")) {
                switch (calculation) {
                    case 1:
                        answerforbinary = sumbinary(String.valueOf(numberforbinary), textField.getText());
                        if (answerforbinary.endsWith(".0")) {
                            textField.setText(answerforbinary.replace(".0", ""));
                        } else {
                            textField.setText(answerforbinary);
                        }
                        label.setText("");
                        break;
                    case 2:
                        answerforbinary = substractionbinary(String.valueOf(numberforbinary), textField.getText());
                        if (answerforbinary.endsWith(".0")) {
                            textField.setText(answerforbinary.replace(".0", ""));
                        } else {
                            textField.setText(answerforbinary);
                        }
                        label.setText("");
                        break;
                    case 3:
                        answerforbinary = multiplcationbin(String.valueOf(number), textField.getText());
                        if (answerforbinary.endsWith(".0")) {
                            textField.setText(answerforbinary.replace(".0", ""));
                        } else {
                            textField.setText(answerforbinary);
                        }
                        label.setText("");
                        break;
                    case 4:
                        answerforbinary = duvidedbinary(String.valueOf(number), textField.getText());
                        if (answerforbinary.endsWith(".0")) {
                            textField.setText(answerforbinary.replace(".0", ""));
                        } else {
                            textField.setText(answerforbinary);
                        }
                        label.setText("");
                        break;
                    case 5:
                        answerforbinary = andoperation(numberforbinary, textField.getText());
                        if (answerforbinary.endsWith(".0")) {
                            textField.setText(answerforbinary.replace(".0", ""));
                        } else {
                            textField.setText(answerforbinary);
                        }
                        label.setText("");
                        break;
                    case 6:
                        answerforbinary = xoroperation(numberforbinary, textField.getText());
                        if (answerforbinary.endsWith(".0")) {
                            textField.setText(answerforbinary.replace(".0", ""));
                        } else {
                            textField.setText(answerforbinary);
                        }
                        label.setText("");
                        break;
                    case 7:
                        answerforbinary = oroperation(numberforbinary, textField.getText());
                        if (answerforbinary.endsWith(".0")) {
                            textField.setText(answerforbinary.replace(".0", ""));
                        } else {
                            textField.setText(answerforbinary);
                        }
                        label.setText("");
                        break;
                }
            }
        } }
    public void decimalmode () {
        button1.setEnabled(true);
        button2.setEnabled(true);
        button3.setEnabled(true);
        button4.setEnabled(true);
        button5.setEnabled(true);
        button6.setEnabled(true);
        button7.setEnabled(true);
        button8.setEnabled(true);
        button9.setEnabled(true);
        button0.setEnabled(true);
        buttonA.setEnabled(false);
        buttonB.setEnabled(false);
        buttonC.setEnabled(false);
        buttonD.setEnabled(false);
        buttonE.setEnabled(false);
        buttonF.setEnabled(false);
        ButtonAnd.setEnabled(false);
        Buttonor.setEnabled(false);
        ButtonXor.setEnabled(false);
        ButtonShiftleft.setEnabled(false);
        ButtonShiftRight.setEnabled(false);
    }
    public void hexdacimalmode () {
        button0.setEnabled(true);
        button1.setEnabled(true);
        button2.setEnabled(true);
        button3.setEnabled(true);
        button4.setEnabled(true);
        button5.setEnabled(true);
        button7.setEnabled(true);
        button8.setEnabled(true);
        button9.setEnabled(true);
        buttonA.setEnabled(true);
        buttonB.setEnabled(true);
        buttonC.setEnabled(true);
        buttonD.setEnabled(true);
        buttonE.setEnabled(true);
        buttonF.setEnabled(true);
        ButtonAnd.setEnabled(false);
        Buttonor.setEnabled(false);
        ButtonXor.setEnabled(false);
        ButtonShiftleft.setEnabled(false);
        ButtonShiftRight.setEnabled(false);
    }
    public void binarymode () {
        ButtonAnd.setEnabled(true);
        Buttonor.setEnabled(true);
        ButtonXor.setEnabled(true);
        button1.setEnabled(true);
        button0.setEnabled(true);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);
        buttonA.setEnabled(false);
        buttonB.setEnabled(false);
        buttonC.setEnabled(false);
        buttonD.setEnabled(false);
        buttonE.setEnabled(false);
        buttonF.setEnabled(false);
        ButtonShiftleft.setEnabled(true);
        ButtonShiftRight.setEnabled(true);
    }
}
