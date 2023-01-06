package PVP;

import java.util.ArrayList;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.table.DefaultTableModel;

import WondersIntroduction.Alexandria;
import WondersIntroduction.Babylon;
import WondersIntroduction.Ephesus;
import WondersIntroduction.Giza;
import WondersIntroduction.Halicarnassus;
import WondersIntroduction.Olympia;
import WondersIntroduction.Rhodes;

import javax.swing.DefaultComboBoxModel;

import java.awt.Font;

import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;

public class PVPWonderChoose extends JFrame{

    String getText;
    

    public PVPWonderChoose(String getText) {

        JFrame ChooseWonderFrame = new JFrame();
        ChooseWonderFrame.setTitle("Choose Wonder");
        
        //设置背景图片
        ImageIcon ChooseWonderBackground = new ImageIcon("C:\\Users\\zhouz\\Desktop\\7 wonders\\src\\images\\background\\游玩背景.png");
        JLabel imageLabel = new JLabel(ChooseWonderBackground);
        imageLabel.setSize(ChooseWonderBackground.getIconWidth(),ChooseWonderBackground.getIconHeight());
        ChooseWonderFrame.getLayeredPane().add(imageLabel,new Integer(Integer.MIN_VALUE));

        //设置窗口
        ChooseWonderFrame.setSize(ChooseWonderBackground.getIconWidth(),ChooseWonderBackground.getIconHeight());
        ChooseWonderFrame.setLocationRelativeTo(null);
        ChooseWonderFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ChooseWonderFrame.setVisible(true);

        this.getText = getText;
        //System.out.println(getText);

        JPanel backgroundJpanel = (JPanel)ChooseWonderFrame.getContentPane();
        backgroundJpanel.setOpaque(false);
        backgroundJpanel.setLayout(null);

        //展示多少玩家的文本框
        //JTextPane ceshi = new JTextPane();
        //ceshi.setBounds(20, 20, 400, 20);
        //ceshi.setEditable(false);
        //ceshi.setText("Here are " + getText + " Player:");
        //backgroundJpanel.add(ceshi);

            //设置数据
        Vector<Vector<Object>> contextList = new Vector<>();    //数据列表

        Vector<Object> titleList = new Vector<>();      //标题列表
        titleList.add("玩家");
        titleList.add("名字");
        titleList.add("奇迹");


        // 创建DefaultTableMode模型 管理数据容器
        DefaultTableModel model = new DefaultTableModel(contextList, titleList);
        JTable table = new JTable(model);   //设置表格    
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(180, 60, 400, 300);
        backgroundJpanel.add(scrollPane);



        //创建奇迹列表
        ArrayList<String> wonderList = new ArrayList<>();
        wonderList.add("Alexandria");
        wonderList.add("Babylon");
        wonderList.add("Ephesus");
        wonderList.add("Giza");
        wonderList.add("Halicarnassus");
        wonderList.add("Olympia");
        wonderList.add("Rhodes");

        //创建加入列表加入按钮

        //创建文本提示
        JTextPane nopPane = new JTextPane();
        nopPane.setBounds(1125, 65, 250, 50);
        nopPane.setEditable(false);
        nopPane.setFont(new Font("楷体",Font.BOLD,16));
        nopPane.setForeground(Color.BLACK);
        nopPane.setText("CHOOSE YOUR  PLAYER  : "); 
        backgroundJpanel.add(nopPane); 

        //创建玩家序号选择
        JLabel playersLabel = new JLabel("Player: ");
        DefaultComboBoxModel<Object> NumberOfPlayer = new DefaultComboBoxModel<>();
        for (int i = 1; i<(Integer.parseInt(getText)+1); i ++){
            NumberOfPlayer.addElement("Player" + i);
        }
        JComboBox<Object> comboBoxList1 = new JComboBox<>(NumberOfPlayer);
        playersLabel.setBounds(1000, 200, 100, 40);
        comboBoxList1.setBounds(1050, 200, 80, 40);
        backgroundJpanel.add(playersLabel);
        backgroundJpanel.add(comboBoxList1);

        //创建玩家名字
        JLabel nameLabel = new JLabel("Name: ");
        JTextField nameofPlayerField = new JTextField(20);
        nameLabel.setBounds(1150, 200, 100, 40);
        nameofPlayerField.setBounds(1200, 200, 80, 40);
        backgroundJpanel.add(nameLabel);
        backgroundJpanel.add(nameofPlayerField);

        //创建选择奇迹
        JLabel wonderJLabel = new JLabel("Wonder: ");
        DefaultComboBoxModel<Object> wonderchoose = new DefaultComboBoxModel<>();
        for (int i = 0;i<wonderList.size(); i ++){
            wonderchoose.addElement(wonderList.get(i));
        }
        JComboBox<Object> comboBoxList2 = new JComboBox<>(wonderchoose);
        wonderJLabel.setBounds(1300, 200, 100, 40);
        comboBoxList2.setBounds(1350, 200, 110, 40);
        backgroundJpanel.add(wonderJLabel);
        backgroundJpanel.add(comboBoxList2);

        //创建确认按钮
        JButton confirmButton = new JButton("Confirm");
        confirmButton.setBounds(1430, 270, 100, 40);
        backgroundJpanel.add(confirmButton);

        //添加7大奇迹图标

        //Alexandria
        ImageIcon AlexandriaIcon = new ImageIcon("src/images/cards/7大奇迹/Alexandria.png");        
        JButton alexandriaButton = new JButton();
        alexandriaButton.setOpaque(false);
        alexandriaButton.setContentAreaFilled(false);
        alexandriaButton.setFocusPainted(false);
        alexandriaButton.setBorder(null);
        alexandriaButton.setIcon(AlexandriaIcon);
        alexandriaButton.setBounds(100,250,AlexandriaIcon.getIconWidth(), AlexandriaIcon.getIconHeight());
        backgroundJpanel.add(alexandriaButton);

        //Babylon
        ImageIcon BabylonIcon = new ImageIcon("src/images/cards/7大奇迹/Babylon.png");
        JButton babylButton = new JButton();
        babylButton.setOpaque(false);
        babylButton.setContentAreaFilled(false);
        babylButton.setFocusPainted(false);
        babylButton.setBorder(null);
        babylButton.setIcon(BabylonIcon);
        babylButton.setBounds(500, 250, BabylonIcon.getIconWidth(), BabylonIcon.getIconHeight());
        backgroundJpanel.add(babylButton);

        //Ephesus
        ImageIcon EphesusIcon = new ImageIcon("src/images/cards/7大奇迹/Ephesus.png");
        JButton ephesusButton = new JButton();
        ephesusButton.setOpaque(false);
        ephesusButton.setContentAreaFilled(false);
        ephesusButton.setFocusPainted(false);
        ephesusButton.setBorder(null);
        ephesusButton.setIcon(EphesusIcon);
        ephesusButton.setBounds(900, 250, EphesusIcon.getIconWidth(), EphesusIcon.getIconHeight());
        backgroundJpanel.add(ephesusButton);

        //Giza
        ImageIcon GizaIcon = new ImageIcon("src/images/cards/7大奇迹/Giza.png");
        JButton gizaButton = new JButton();
        gizaButton.setOpaque(false);
        gizaButton.setContentAreaFilled(false);
        gizaButton.setFocusPainted(false);
        gizaButton.setBorder(null);
        gizaButton.setIcon(GizaIcon);
        gizaButton.setBounds(1300, 250, GizaIcon.getIconWidth(), GizaIcon.getIconHeight());
        backgroundJpanel.add(gizaButton);

        //Halicarnassus
        ImageIcon HalicarnassusIcon = new ImageIcon("src/images/cards/7大奇迹/Halicarnassus.png");
        JButton HalicarnassusButton = new JButton();
        HalicarnassusButton.setOpaque(false);
        HalicarnassusButton.setContentAreaFilled(false);
        HalicarnassusButton.setFocusPainted(false);
        HalicarnassusButton.setBorder(null);
        HalicarnassusButton.setIcon(HalicarnassusIcon);
        HalicarnassusButton.setBounds(300, 500, HalicarnassusIcon.getIconWidth(), HalicarnassusIcon.getIconHeight());
        backgroundJpanel.add(HalicarnassusButton);

        //Olympia
        ImageIcon OlympiaIcon = new ImageIcon("src/images/cards/7大奇迹/Olympia.png");
        JButton OlympiaButton = new JButton();
        OlympiaButton.setOpaque(false);
        OlympiaButton.setContentAreaFilled(false);
        OlympiaButton.setFocusPainted(false);
        OlympiaButton.setBorder(null);
        OlympiaButton.setIcon(OlympiaIcon);
        OlympiaButton.setBounds(700, 500, OlympiaIcon.getIconWidth(), OlympiaIcon.getIconHeight());
        backgroundJpanel.add(OlympiaButton);

        //Rhodes
        ImageIcon RhodesIcon = new ImageIcon("src/images/cards/7大奇迹/Rhodes.png");
        JButton RhodesButton = new JButton();
        RhodesButton.setOpaque(false);
        RhodesButton.setContentAreaFilled(false);
        RhodesButton.setFocusPainted(false);
        RhodesButton.setBorder(null);
        RhodesButton.setIcon(RhodesIcon);
        RhodesButton.setBounds(1100, 500, RhodesIcon.getIconWidth(), RhodesIcon.getIconHeight());
        backgroundJpanel.add(RhodesButton);

        //设置各个按钮
        confirmButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e ) {
                String playernumber = comboBoxList1.getSelectedItem().toString();
                String name = nameofPlayerField.getText();
                String wonderchooseelement = comboBoxList2.getSelectedItem().toString();

                Vector<Object> list = new Vector<>();       //选项列表
                list.addElement(playernumber);
                list.addElement(name);
                list.addElement(wonderchooseelement);
                //将数据放在model容器中
                model.addRow(list);

                //清空数据
                nameofPlayerField.setText("");
                NumberOfPlayer.removeElement(playernumber);
                wonderchoose.removeElement(wonderchooseelement);

                if (NumberOfPlayer.getSize() ==  0){
                    ChooseWonderFrame.setVisible(false);
                    new PlayPVP(contextList);
                }

            }
        });
        

        alexandriaButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e ) {
                new Alexandria();
            }
        });

        babylButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e ) {
                new Babylon();
            }
        });

        ephesusButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e ) {
                new Ephesus();
            }
        });

        gizaButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e ) {
                new Giza();
            }
        });

        HalicarnassusButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e ) {
                new Halicarnassus();
            }
        });

        OlympiaButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e ) {
                new Olympia();
            }
        });

        RhodesButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e ) {
                new Rhodes();
            }
        });

    }



}
