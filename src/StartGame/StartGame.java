package StartGame;

import java.applet.Applet;
import java.io.File;
import java.net.MalformedURLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import PVE.PVE;
import PVP.PVP;

//调用music的内容

import music.code.*;

import java.awt.event.ActionListener;//导入awt包中的监听器事件包
import java.awt.event.ActionEvent;//导入awt包中的ActionEvent事件包

public class StartGame extends JFrame{
	public StartGame(){

		//播放背景音乐
		Background bgm = new Background();
		try {  
            bgm.setAudioClip(Applet  
                    .newAudioClip((new File("C:\\Users\\zhouz\\Desktop\\7 wonders\\src\\music\\bgm\\Mystica-Bandari.wav")).toURL()));  
        } catch (MalformedURLException e) {  
            e.printStackTrace();  
        }  
        bgm.loop();//循环播放

		//设置按钮音效
		ButtonClick1 buttonClick1 = new ButtonClick1();
		ButtonClick2 buttonClick2 = new ButtonClick2();

		//设置窗口
		JFrame game = new JFrame("Game");
		game.setTitle("欢迎来到新窗口");

		//设置背景
		ImageIcon image = new ImageIcon("src/images/background/7-wonders-architects.png");
		JLabel imageJLabel = new JLabel(image);
		imageJLabel.setSize(image.getIconWidth(),image.getIconHeight()); 
		game.getLayeredPane().add(imageJLabel,new Integer(Integer.MIN_VALUE));
		JPanel pan = (JPanel)game.getContentPane();
		pan.setOpaque(false);
		pan.setLayout(null);

		//设置按钮
		JButton PVP = new JButton("PVP");
		JButton PVE = new JButton("PVE");

		//设置静音按钮
		ImageIcon quiet = new ImageIcon("src/images/button/Quiet.jpg");
		JButton quietButton = new JButton();
		quietButton.setOpaque(false);
		quietButton.setContentAreaFilled(false);
		quietButton.setFocusPainted(false);
		quietButton.setBorder(null);
		quietButton.setIcon(quiet);

		//加入Jpanel
		pan.add(PVP);
		pan.add(PVE);
		pan.add(quietButton);
		PVP.setBounds(368, 150, 100, 30);
		PVE.setBounds(368, 200, 100, 30);
		quietButton.setBounds(770, 340, quiet.getIconWidth(), quiet.getIconHeight());
		
		//System.out.println(image.getIconWidth());
		//System.out.println(image.getIconHeight());

		game.setSize(image.getIconWidth(),image.getIconHeight());
		game.setLocationRelativeTo(null);
		game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		game.setVisible(true);

		quietButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				buttonClick2.playMusic();
				bgm.stop();
			}

		});

		PVP.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				buttonClick1.playMusic();
				new PVP();
				game.setVisible(false);
			}

		});

		PVE.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				buttonClick1.playMusic();
				new PVE();
				game.setVisible(false);
			}

		});
	}
}
