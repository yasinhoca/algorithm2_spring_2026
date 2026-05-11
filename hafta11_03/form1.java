package hafta11_03;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 extends JFrame{
    private JPanel panel;
    private JTextField textField1;
    private JButton b1;
    private JButton ba;
    private JButton b3;
    private JButton b2;
    private JButton b4;
    private JButton b5;
    private JButton b6;
    private JButton b7;
    private JButton b8;
    private JButton b9;
    private JButton b0;
    private JButton bc;
    private JButton be;
    private JButton bm;
    private JButton bb;
    private JButton br;
    float sayi1,sayi2,sonuc;
    int islem;

    form1(){
        add(panel);
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+"1");
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+"2");
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+"3");
            }
        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+"4");
            }
        });
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+"5");
            }
        });
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+"6");
            }
        });
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+"7");
            }
        });
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+"8");
            }
        });
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+"9");
            }
        });
        b0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+"0");
            }
        });
        bc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                sayi1 = sayi2 = sonuc = 0;
                islem = 0;
            }
        });
        ba.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                islem = 1;
                sayi1 = Float.parseFloat(textField1.getText());
                textField1.setText("");
            }
        });
        be.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                islem = 2;
                sayi1 = Float.parseFloat(textField1.getText());
                textField1.setText("");
            }
        });
        bm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                islem = 3;
                sayi1 = Float.parseFloat(textField1.getText());
                textField1.setText("");
            }
        });
        bb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                islem = 4;
                sayi1 = Float.parseFloat(textField1.getText());
                textField1.setText("");
            }
        });
        br.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sayi2 = Float.parseFloat(textField1.getText());
                textField1.setText("");

                if(islem==1){
                    sonuc = sayi1+sayi2;
                }else if(islem==2){
                    sonuc = sayi1-sayi2;
                }else if(islem==3){
                    sonuc = sayi1*sayi2;
                }else if(islem==4){
                    sonuc = sayi1/sayi2;
                }
                textField1.setText(Float.toString(sonuc));
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
