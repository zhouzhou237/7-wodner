package WondersIntroduction;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Halicarnassus {
    public Halicarnassus() {
        JFrame HalicarnassusFrame = new JFrame();
        HalicarnassusFrame.setTitle("Halicarnassus");

        ImageIcon Halicarnassusbackground = new ImageIcon("C:\\Users\\zhouz\\Desktop\\7 wonders\\src\\images\\文明背景\\Halicarnassus.png");
        JLabel HalicarnassusLabel = new JLabel(Halicarnassusbackground);
        HalicarnassusLabel.setSize(Halicarnassusbackground.getIconWidth(),Halicarnassusbackground.getIconHeight());
        HalicarnassusFrame.getLayeredPane().add(HalicarnassusLabel,new Integer(Integer.MIN_VALUE));
        JPanel HalicarnassusPanel = (JPanel)HalicarnassusFrame.getContentPane();
        HalicarnassusPanel.setOpaque(false);     //不透明
        HalicarnassusLabel.setLayout(null);

        //画面设置
        HalicarnassusFrame.setSize(Halicarnassusbackground.getIconWidth(),Halicarnassusbackground.getIconHeight());;
        HalicarnassusFrame.setLocationRelativeTo(null);
        HalicarnassusFrame.setVisible(true);        
    }
}
