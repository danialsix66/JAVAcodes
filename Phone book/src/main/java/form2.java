import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form2 extends JFrame {
    private JTextField textField1, textField2, textField3;

    public form2() {
        super("Save Data App");
        setLayout(new GridLayout(4, 2));

        JLabel label1 = new JLabel("Field 1:");
        textField1 = new JTextField();
        add(label1);
        add(textField1);

        JLabel label2 = new JLabel("Field 2:");
        textField2 = new JTextField();
        add(label2);
        add(textField2);

        JLabel label3 = new JLabel("Field 3:");
        textField3 = new JTextField();
        add(label3);
        add(textField3);

        JButton saveButton = new JButton("Save");
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data1 = textField1.getText();
                String data2 = textField2.getText();
                String data3 = textField3.getText();

                // اینجا می‌توانید کد ذخیره کردن داده‌ها را اضافه کنید
                System.out.println("Data saved.");
            }
        });
        add(saveButton);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new form2();
    }
}
