package PVP;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PVP extends JFrame{
    
    String NumberOfPlayers;
    public PVP() {
        JFrame PVPFrame = new JFrame();
        PVPFrame.setTitle("PVP 模式");      

        //设置背景
        ImageIcon SpaceBackground = new ImageIcon("src/images/background/星空背景.GIF");
        JLabel imageLabel = new JLabel(SpaceBackground);
        imageLabel.setSize(SpaceBackground.getIconWidth(),SpaceBackground.getIconHeight());
        PVPFrame.getLayeredPane().add(imageLabel,new Integer(Integer.MIN_VALUE));
        JPanel PVPpan = (JPanel)PVPFrame.getContentPane();
        PVPpan.setOpaque(false);
        PVPpan.setLayout(null);
        
        //输入文本框
        JTextPane wordsArea = new JTextPane();
        wordsArea.setBounds(300, 200, 200, 30);
        wordsArea.setEditable(false);   //设置不可修改
        wordsArea.setFont(new Font("楷体",Font.BOLD,16));
        wordsArea.setBackground(new Color(3,70,124));   //设置背景颜色
        wordsArea.setForeground(Color.WHITE);   //设置字体颜色
        
        wordsArea.setText("How many players?");
        
        PVPpan.add(wordsArea);

        //添加输入框
        JTextField playersnumber = new JTextField(20);
        playersnumber.setOpaque(false);
        //设置文字颜色-白色
        playersnumber.setForeground(Color.WHITE);
        PVPpan.add(playersnumber);
        playersnumber.setBounds(350, 250, 100, 25);

        //添加确认按钮
        JButton confirmButton = new JButton("Confirm");
        confirmButton.setBounds(450, 300, 100, 30);
        PVPpan.add(confirmButton);

        //画面设置
        PVPFrame.setSize(SpaceBackground.getIconWidth(),SpaceBackground.getIconHeight());
        PVPFrame.setLocationRelativeTo(null);       //设置窗口显示在画面中央
        PVPFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        PVPFrame.setVisible(true);

        confirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NumberOfPlayers = playersnumber.getText();
                new PVPWonderChoose(NumberOfPlayers);
                //new PVPWonderChoose(NumberOfPlayers);
                PVPFrame.setVisible(false);     //关闭窗口-隐藏窗口
                //PVPFrame.dispose();       //关闭窗口的另外一种方式
            }
        });

    }
    
}