import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFristFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        JLabel label = new JLabel("Name");
        JLabel labelId = new JLabel("Id");
        JTextField textField = new JTextField("nume_default");
        JTextField textFieldId = new JTextField("id_default");
        JButton insertBtn = new JButton("INSERT");

        label.setBounds(70,100,100,40);
        labelId.setBounds(70,150,100,40);
        textField.setBounds(130,100,100,40);//axa ox , oy, width, height
        textFieldId.setBounds(130,150,100,40);//axa ox , oy, width, height
        insertBtn.setBounds(130,250,100,40);//axa ox , oy, width, height

        frame.add(labelId);
        frame.add(label);
        frame.add(textField);
        frame.add(textFieldId);
        frame.add(insertBtn);

        frame.setSize(400,500);
        frame.setLayout(null);
        frame.setVisible(true);

        insertBtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Button was pressed");;
            }
        });
    }
}
