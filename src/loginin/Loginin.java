package loginin;

import java.awt.*;//导入awt包
import javax.swing.*;//导入swing包

import StartGame.*;

import java.awt.event.ActionListener;//导入awt包中的监听器事件包
import java.util.HashMap;
import java.util.Map;
import java.awt.event.ActionEvent;//导入awt包中的ActionEvent事件包

public class Loginin extends JFrame {
	     
	public Loginin() { 
		setSize(500,500);//设计窗体的大小
		setTitle("登入窗口");
		JLabel username=new JLabel("Username"); //实例化JLabel对象
		JLabel password=new JLabel("Password");
		JTextField enter_username=new JTextField(15);//实例化用户名文本框
		JPasswordField enter_password=new JPasswordField(15);//实例化密码框
		enter_password.setEchoChar('*');//将输入密码框中的密码以*显示出来
		JButton confirm=new JButton("Confirm");
		JButton reset=new JButton("Reset");
		JButton registration=new JButton("registration");
		setVisible(true);//使窗体可视化
		Container Loginin=getContentPane();//获取一个容器
//		将用户名、密码的Jlabel和用户名JTextField文本框、密码JPasswordField密码框以及确定JButton、重置JButton、注册JButton添加到container容器里面                         //
        Loginin.add(username);
		Loginin.add(password);
		Loginin.add(enter_username);
		Loginin.add(enter_password);
		Loginin.add(confirm);
		Loginin.add(reset);
		Loginin.add(registration);
		setBounds(400,400,400,400);//设置窗体的长宽各为300、300  让其显示在左上方的300、300处
		Loginin.setLayout(null);
//		各个元素显示在container容器中的位置坐标
        username.setBounds(40,100,80,18);
		password.setBounds(40,200,80,18);
		enter_username.setBounds(110,100,200,18);
		enter_password.setBounds(110,200,200,18);
		confirm.setBounds(140,300,100,30);
		reset.setBounds(20,300,100,30);
		registration.setBounds(260,300,100,30);
		
		reset.addActionListener(new ActionListener() {//对重置按钮添加监听事件
 
			@Override
			public void actionPerformed(ActionEvent arg0) {

				enter_username.setText("");//对用户名文本框进行重置
				enter_password.setText("");//对密码文本框进行重置
			}
			
		});
		confirm.addActionListener(new ActionListener() {//对确定按钮添加监听事件
			 
			@Override
			public void actionPerformed(ActionEvent arg0) {

				Registration registration = new Registration();
				registration.CloseWindows();

				HashMap<String,char[]> usersMap = registration.getUsers(); 

				for(String key1 : usersMap.keySet()){
					System.out.println(key1);
					System.out.println(usersMap.get(key1));
				}
				

                String username_start = "1";
                String password_start = "1";

				Map<String,String> Administrators = new HashMap<>();
				Administrators.put(username_start, password_start);

				for(String key : Administrators.keySet()){
					if(enter_username.getText().trim().equals(key)&&new String(enter_password.getPassword()).equals(Administrators.get(key))) {//equals函数进行用户名和密码的匹配
						JOptionPane.showMessageDialog(null,"管理员登录成功");
						
						new StartGame();//进入到NewFrame这个窗体中
						setVisible(false);
					}else {
						for(String key1 : usersMap.keySet()) {
							System.out.println("11");
							System.out.println(key1);
							System.out.println(usersMap.get(key));
							if (enter_username.getText().trim().equals(key1)&&new String(enter_password.getPassword()).equals(String.valueOf(usersMap.get(key1)))) {
								JOptionPane.showMessageDialog(null,"用户登录成功");
								new StartGame();//进入到NewFrame这个窗体中
								setVisible(false);
							}else {
								JOptionPane.showMessageDialog(null,"登录失败");
							}
						}
					}	
				}

			}
				
		});
		registration.addActionListener(new ActionListener(){//对注册按钮添加监听事件
			@Override
			public void actionPerformed(ActionEvent arg0) {
				new Registration();//进入都到zhuce窗体中
				setVisible(false);
			}
			
		});
		
	}
		public static void main(String[] args) {
			new Loginin();
			
		}
		

	}



