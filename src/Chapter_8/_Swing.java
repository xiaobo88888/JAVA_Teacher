package Chapter_8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class _Swing {
    private JFrame jFrame = new JFrame("计算器");
    
    //创建JTextField
    private JTextField jTextField = new JTextField(30);//指定30列
    
    //组装视图
    private void demo(){
        //将JTextField放入窗口北边
        JPanel jPanelTextField = new JPanel();
        jPanelTextField.add(jTextField);
        jFrame.add(jPanelTextField, BorderLayout.NORTH);
        
        //将数字和关系符按钮放到窗口中间
        JPanel jPanelButton = new JPanel();
        //这里要给JPanle设置GridLayout布局管理器
        jPanelButton.setLayout(new GridLayout(4, 4, 4, 4));
        
        //添加组件并给按钮添加单击事件
        for(int i = 1; i <= 3; i++){
            JButton button = new JButton(String.valueOf(i));
            jPanelButton.add(button);
            addActionListener(button);
        }
        
        JButton buttonAdd = new JButton("+");
        jPanelButton.add(buttonAdd);
        addActionListener(buttonAdd);
        
        for(int i = 4; i <= 6; i++){
            JButton button = new JButton(String.valueOf(i));
            jPanelButton.add(button);
            addActionListener(button);
        }
        
        JButton buttonDecrease = new JButton("-");
        jPanelButton.add(buttonDecrease);
        addActionListener(buttonDecrease);
        
        for(int i = 7; i <= 9; i++){
            JButton button = new JButton(String.valueOf(i));
            jPanelButton.add(button);
            addActionListener(button);
        }

        JButton buttonMultiply = new JButton("*");
        jPanelButton.add(buttonMultiply);
        addActionListener(buttonMultiply);

        JButton buttonZero = new JButton("0");
        jPanelButton.add(buttonZero);
        addActionListener(buttonZero);

        JButton buttonDelete = new JButton("清空");
        jPanelButton.add(buttonDelete);

        JButton buttonResult = new JButton("=");
        jPanelButton.add(buttonResult);

        JButton buttonDivide = new JButton("/");
        jPanelButton.add(buttonDivide);
        addActionListener(buttonDivide);
        
        jFrame.add(jPanelButton);
        
        //给特殊按钮绑定单击事件
        //绑定清空
        buttonDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText("");
            }
        });
        //绑定等于
        buttonResult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //先获取JTextField的字符串算式
                String text = jTextField.getText();
                
            }
        });
        
        //JFrame设置最佳大小并可见
        jFrame.pack();
        jFrame.setVisible(true);
        
    }
    //给按钮绑定单击事件
    private void addActionListener(JButton button){
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //获取按钮上的文本
                String text = e.getActionCommand();
                //得到文本域的字符串
                String textFieldText = jTextField.getText();
                //设置文本域的文本
                jTextField.setText(textFieldText + text);
            }
        });
    }

    public static void main(String[] args) {
        new _Swing().demo();
    }
    
}
