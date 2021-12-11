package Chapter_8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class _Swing_ extends JFrame {
    JLabel j = new JLabel();
    JButton btn;
    
    _Swing_(){
        this.setSize(300, 200);
        this.setTitle("登录页面");
        this.add(j, BorderLayout.NORTH);
        j.setBounds(80, 20, 120, 26);
        btn = new JButton("OK");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 j.setText("欢迎参加java考试");
            }
        });
        this.add(btn);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new _Swing_();
    }
}
