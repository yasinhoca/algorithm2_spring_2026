package hafta11;

// Eğer swing ui görünmüyorsa
// file/settings/plugins penceresinde
// marketplace sekmesinde swing ui diyerek
// eklentiyi kur
// IDE'yi bir kere aç kapat


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 extends JFrame{
    private JTextField textField1;
    private JButton button1;
    private JPanel panel;
    private JLabel label1;

    form1(){
        add(panel);
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String isim = textField1.getText();
                label1.setText("Hoşgeldin " + isim);
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
