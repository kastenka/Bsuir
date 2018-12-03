import java.awt.event.*;
import java.awt.*;
import java.io.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/*
Разработать приложение с 5 (минимум) элементами управления библиотеки Swing
 (кнопка (JButton), список (JList), текстовое поле (JTextField), раскрывающий список (JComboBox),
 текстовая область (JTextArea), флажок (JCheckBox), радиокнопки (JRadioButton), лэйбл (JLabel))
  исходя из задания вариантов. Подгрузку данных осуществлять из файла (при необходимости),
  сохранять данные также в файл. Обязательна реализация механизма закрытия окна. Также можно использовать
   систему подсветки данных, при желании.

14.  Система бронирование авиабилета.
 */
public class Panel extends JFrame {

    int k =0;
    File file = new File("booking.txt");
    JButton reserveButton, cleanButton;
    JList classList;
    JTextArea nameArea;
    JTextField fromField, toField;
    JComboBox monthBox, dayBox, yearBox;
    JRadioButton mealRB, noMealRB;
    JLabel nameLabel, fromLabel, toLabel, dateLabel, classLabel, mealLabel;
    ButtonGroup mealGroup;
    Object boxA, boxB, boxC;

    static String[] allClasses = {"Business", "First", "Economy"};
    static String[] box1 = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14",
                            "15","16","17","18","19","20","21","22","23","24","25","26","27",
                            "28","29","30","31"};
    static String[] box2 = {"January","February","March","April","May","June","July","August",
                            "September","October","November","December"};
    static String[] box3 = {"2018","2019"};


    public Panel(String str){
       super(str);
       setSize(500, 450);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setLayout(null);

       reserveButton = new JButton("Book tickets");
       cleanButton = new JButton("Clear");
       classList = new JList(allClasses);
       nameArea = new JTextArea();
       fromField = new JTextField();
       toField = new JTextField();
       monthBox = new JComboBox(box2);
       dayBox = new JComboBox(box1);
       yearBox = new JComboBox(box3);
       mealRB = new JRadioButton("Yes");
       noMealRB = new JRadioButton("No");
       nameLabel = new JLabel("Surname & Name:");
       fromLabel = new JLabel("From:");
       toLabel = new JLabel("To:");
       dateLabel = new JLabel("Fly out:");
       classLabel = new JLabel("Class:");
       mealLabel = new JLabel("Meal:");
       mealGroup = new ButtonGroup();


       nameArea.setBounds(245, 40 , 210 ,20);
       fromField.setBounds(245, 80 , 210 ,20);
       toField.setBounds(245, 120 , 210 ,20);
       dayBox.setBounds(245, 160 , 40 ,20);
       monthBox.setBounds(285, 160 , 100 ,20);
       yearBox.setBounds(385, 160 , 70 ,20);
       classList.setBounds(245, 200 , 210 ,60);
       mealRB.setBounds(245, 280 , 70 ,20);
       noMealRB.setBounds(355, 280 , 70 ,20);

       nameLabel.setBounds(100, 40 , 120 ,20);
       fromLabel.setBounds(100, 80 , 120 ,20);
       toLabel.setBounds(100, 120 , 120 ,20);
       dateLabel.setBounds(100, 160 , 120 ,20);
       classLabel.setBounds(100, 200 , 120 ,20);
       mealLabel.setBounds(100, 280 , 120 ,20);

       reserveButton.setBounds(170, 340, 150, 50 );
       cleanButton.setBounds(20, 20, 100 ,20 );


       mealGroup.add(mealRB);
       mealGroup.add(noMealRB);
       add(reserveButton);
       add(cleanButton);
       add(classList);
       add(nameArea);
       add(fromField);
       add(toField);
       add(monthBox);
       add(dayBox);
       add(yearBox);
       add(mealRB);
       add(noMealRB);
       add(nameLabel);
       add(fromLabel);
       add(toLabel);
       add(dateLabel);
       add(classLabel);
       add(mealLabel);


        monthBox.addActionListener(new BoxActionListener());
        dayBox.addActionListener(new BoxActionListener());
        yearBox.addActionListener(new BoxActionListener());
        cleanButton.addActionListener(new CleanActionListener());
        reserveButton.addActionListener(new ButtonActionListener());
        mealRB.addActionListener(new FlagActionListener());
        noMealRB.addActionListener(new FlagActionListener());
    }

    public class ButtonActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if(toField.getText().equals("") || fromField.getText().equals("") || nameArea.getText().equals(""))
            {
                JFrame frame1 = new JFrame();
                JOptionPane.showMessageDialog(frame1, "Please,full all fields!");
            }
            else{
                try{
                    if(!file.exists()){
                        file.createNewFile();
                    }
                    FileWriter out = new FileWriter(file, true);
                    try{
                        String text1 = nameArea.getText();
                        String text2 = fromField.getText();
                        String text3 = toField.getText();
                        String text4 = (String)classList.getSelectedValue();

                        out.write(text1 + ":  ");
                        out.write(text2 + " - ");
                        out.write(text3 + "\n");
                        out.write(text4 + " class\n");
                        if(k == -1)
                            out.write("Without meal" + "\n");
                        else if(k == 1)
                            out.write("With meal" + "\n");
                        out.write("Fly out:" + boxA + " " + boxB + " " + boxC + "\n\n");
                    } finally{
                        out.close();
                    }
                    JOptionPane.showMessageDialog(null, "Your flight is booked!");
                }catch(IOException e1){
                    throw new RuntimeException(e1);
                }

            }

        }
    }

    public class FlagActionListener implements  ActionListener{
        public void actionPerformed(ActionEvent e) {
            k = 0;
            if(e.getSource() == mealRB){
                k++;
            }
            else if(e.getSource() == noMealRB){
                k--;
            }
        }
    }

    public class CleanActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==cleanButton){
                nameArea.setText(null);
                toField.setText(null);
                fromField.setText(null);
            }
        }
    }

    public class BoxActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {

            if(e.getSource()==dayBox) {
                boxA = dayBox.getSelectedItem();
            }
            if(e.getSource()==monthBox) {
                boxB = monthBox.getSelectedItem();
            }
            if(e.getSource()==yearBox) {
                boxC = yearBox.getSelectedItem();
            }

        }
    }

}



