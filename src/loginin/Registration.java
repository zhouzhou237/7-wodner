package loginin;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.awt.event.ActionEvent;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Registration extends JFrame {

	HashMap<String,char[]> Users= new HashMap<>();

	public  Registration() {
		setSize(300,290);//设计窗体的大小
		setTitle("注册窗口");
		JLabel username=new JLabel("Username"); //实例化JLabel对象
		JLabel password=new JLabel("Password");
		JTextField enter_username=new JTextField(15);//实例化用户名文本框
		JPasswordField enter_password=new JPasswordField(15);//实例化密码框
		enter_password.setEchoChar('*');//将输入密码框中的密码以*显示出来
		JButton confirm=new JButton("Confirm");
		JButton reset=new JButton("Reset");
		JButton back=new JButton("Back");
		setVisible(true);//使窗体可视化
		Container Loginin=getContentPane();//获取一个容器
//		将用户名、密码的Jlabel和用户名JTextField文本框、密码JPasswordField密码框以及确定JButton、重置JButton、注册JButton添加到container容器里面                         //
        Loginin.add(username);
		Loginin.add(password);
		Loginin.add(enter_username);
		Loginin.add(enter_password);
		Loginin.add(confirm);
		Loginin.add(reset);
		Loginin.add(back);
		setBounds(400,400,400,400);//设置窗体的长宽各为300、300  让其显示在左上方的300、300处
		Loginin.setLayout(null);
//		各个元素显示在container容器中的位置坐标
        username.setBounds(40,100,80,18);
		password.setBounds(40,200,80,18);
		enter_username.setBounds(110,100,200,18);
		enter_password.setBounds(110,200,200,18);
		confirm.setBounds(140,300,100,30);
		reset.setBounds(20,300,100,30);
		back.setBounds(260,300,100,30);


		back.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {

				new Loginin();
				CloseWindows();
			}
			
		});

		reset.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				enter_username.setText("");//对用户名文本框进行重置
				enter_password.setText("");//对密码文本框进行重置
			}
		});

		confirm.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0){

				Users.put(enter_username.getText(), enter_password.getPassword());

				for(String key: Users.keySet()){
					System.out.println(key);
					System.out.println(Users.get(key));
				}
				
				System.out.println(Users.size());

				new Loginin();
				CloseWindows();
				
			}
		});
	}

	public HashMap<String,char[]> getUsers(){
		return Users;
		
	}

	public void CloseWindows(){
		setVisible(false);
	}
   

}

