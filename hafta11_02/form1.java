package hafta11_02;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 extends JFrame{
    private JTextField textField1;
    private JTextField textField2;
    private JButton button1;
    private JPanel panel;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JLabel sonuclbl;
    float sayi1,sayi2, sonuc;

    form1(){
        add(panel);
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sayi1 = Float.parseFloat(textField1.getText());
                sayi2 = Float.parseFloat(textField2.getText());
                sonuc = sayi1 + sayi2;
                sonuclbl.setText(Float.toString(sonuc));
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sayi1 = Float.parseFloat(textField1.getText());
                sayi2 = Float.parseFloat(textField2.getText());
                sonuc = sayi1 - sayi2;
                sonuclbl.setText(Float.toString(sonuc));
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sayi1 = Float.parseFloat(textField1.getText());
                sayi2 = Float.parseFloat(textField2.getText());
                sonuc = sayi1 * sayi2;
                sonuclbl.setText(Float.toString(sonuc));
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sayi1 = Float.parseFloat(textField1.getText());
                sayi2 = Float.parseFloat(textField2.getText());
                sonuc = sayi1 / sayi2;
                sonuclbl.setText(Float.toString(sonuc));
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                form1 f = new form1();
                f.setVisible(true);
            }
        });
    }


}
