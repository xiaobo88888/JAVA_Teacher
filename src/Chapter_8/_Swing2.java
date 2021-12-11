package Chapter_8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class _Swing2 {
    private JFrame jFrame = new JFrame("登录界面");
    
    private JButton buttonOk = new JButton("OK");
    
    private JLabel label = new JLabel();
    
    //组装视图
    public void demo(){
        
        JPanel jPanelButton = new JPanel();
        JPanel jPanelLabel = new JPanel();
        
        //按钮添加单击事件
        buttonOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("欢迎参加Java考试");
            }
        });
        
        jPanelLabel.add(label);
        jPanelButton.add(buttonOk);
        
        jFrame.add(jPanelLabel, BorderLayout.NORTH);
        jFrame.add(jPanelButton, BorderLayout.CENTER);
        
        jFrame.setBounds(750  , 350 , 300, 250);
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new _Swing2().demo();
    }
}
