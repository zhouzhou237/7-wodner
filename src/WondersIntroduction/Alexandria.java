package WondersIntroduction;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Alexandria {
    public Alexandria() {
        JFrame AlexandraFrame = new JFrame();
        AlexandraFrame.setTitle("Alexandra");

        ImageIcon Alexbackground = new ImageIcon("C:\\Users\\zhouz\\Desktop\\7 wonders\\src\\images\\文明背景\\Alexandria.png");
        JLabel alexLabel = new JLabel(Alexbackground);
        alexLabel.setSize(Alexbackground.getIconWidth(),Alexbackground.getIconHeight());
        AlexandraFrame.getLayeredPane().add(alexLabel,new Integer(Integer.MIN_VALUE));
        JPanel alexPanel = (JPanel)AlexandraFrame.getContentPane();
        alexPanel.setOpaque(false);     //不透明
        alexLabel.setLayout(null);

        //画面设置
        AlexandraFrame.setSize(Alexbackground.getIconWidth(),Alexbackground.getIconHeight());;
        AlexandraFrame.setLocationRelativeTo(null);
        AlexandraFrame.setVisible(true);
    }
}
