import java.awt.event.*;
import java.awt.*;
import java.io.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Panel extends JFrame {

    String newLine = "   +   ", text2;
    List list;
    JFrame frame1 = new JFrame();
    TextArea text1;
    String[] myList = {"Некрасова Ирина","Кирилл Климович", "Мария Костенко", "Лепель Андрей", "Иванов Николай", "Руденко Екатерина", "Некрасов Павел", "Мирницкая Анастасия"};

    Panel() {
        super("Пробное окно");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 400);


        text1 = new TextArea();
        list = new List();
for(int i=0; i<myList.length;i++)
{
    list.add(myList[i]);
}


        list.setMultipleMode(true);
        add(new JScrollPane(list));
        add(new JScrollPane(text1));
        setLayout(null);

        list.setSize(150, 110);
        list.setLocation(10, 10);
        text1.setSize(500, 200);
        text1.setLocation(200, 50);
        add(text1);
        add(list);

        list.addMouseListener(new ButtonActionListener());
    }

    class ButtonActionListener implements MouseListener {
        public void mouseClicked(MouseEvent e) {
            String field = "";
            list = (List)e.getSource();
            int selections[] = list.getSelectedIndexes();
            Object selectedValues[] = list.getSelectedObjects();
            for (int i = 0, n = selections.length; i < n; i++) {
                Object text = selectedValues[i];
                field += ' ' + (String) text;
            }

            //text1.add(field);
            text1.setText(field);
            if (field.length() >= 100) {
                DemoDialog dialog = new DemoDialog(frame1, "Dialog window", false);
                dialog.setLocationRelativeTo(null);
            }
        }

        public void mouseEntered(MouseEvent e) {
        }

        public void mouseExited(MouseEvent e) {
        }

        public void mousePressed(MouseEvent e) {
        }

        public void mouseReleased(MouseEvent e) {
        }


        public void actionPerformed(ActionEvent e) {
            String string = "";
            string = text1.getText();
            list.add(string);
        }
    }

    class DemoDialog extends JDialog implements ActionListener {
        JLabel btn;

        public DemoDialog(JFrame ff, String title, boolean b) {
            super(ff, title, b);
            btn = new JLabel();
            setSize(300, 200);
            add(btn);
            btn.setText("More than 100 symbols!");
            setLocationRelativeTo(null);
            setLayout(new FlowLayout(FlowLayout.LEFT));
            setVisible(true);

        }

        public void actionPerformed(ActionEvent ae) {
            this.dispose();
        }
    }

}