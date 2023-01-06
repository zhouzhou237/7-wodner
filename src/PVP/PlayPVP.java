package PVP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Cards.Cards;
import Players.Players;
import Wonders.Wonder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.CardLayout;
import java.awt.Container;


public class PlayPVP {
    Vector<Vector<Object>> contextList;

    //创建抽卡卡组
    //resources
    static Cards BRICK = new Cards("Brick", new ImageIcon("src/images/cards/resources/BRICK.png"));
    static Cards GLASS = new Cards("Glass", new ImageIcon("src/images/cards/resources/GLASS.png"));
    static Cards GOLD = new Cards("Gold", new ImageIcon("src/images/cards/resources/GOLD.png"));
    static Cards PAPER = new Cards("Paper", new ImageIcon("src/images/cards/resources/PAPER.png"));
    static Cards STONE = new Cards("Stone", new ImageIcon("src/images/cards/resources/STONE.png"));
    static Cards WOOD = new Cards("Wood", new ImageIcon("src/images/cards/resources/WOOD.png"));
    //science
    static Cards PLOT = new Cards("Plot", new ImageIcon("src/images/cards/science/PLOT.png"));
    static Cards SLATE = new Cards("Slate", new ImageIcon("src/images/cards/science/SLATE.png"));
    static Cards WHEEL = new Cards("Wheel", new ImageIcon("src/images/cards/science/WHEEL.png"));
    //score
    static Cards TWOPOINTSANDCAT  = new Cards("TwoPointsAndCat", new ImageIcon("src/images/cards/score/2分+猫猫棋子.png"));
    static Cards THREEPOINTS = new Cards("ThreePoints", new ImageIcon("src/images/cards/score/3分.png"));
    //war
    static Cards WAR = new Cards("War", new ImageIcon("src/images/cards/war/战争分数.png"));
    static Cards WAR1 = new Cards("War1", new ImageIcon("src/images/cards/war/战争分数+一个号角.png"));
    static Cards WAR2 = new Cards("War2", new ImageIcon("src/images/cards/war/战争分数+2个号角.png")); 
    
    //设置奇迹：玩家Map
    static Map<String,Players> WonderToPlayer = new HashMap<>();
    //设置奇迹(注意修改owner部分:null)
    static Wonder Alexandria = new Wonder("Alexandria", "src/images/wonders/Alexandria/1.png", null, null, null, null, WonderToPlayer.get("Alexandria"));
    static Wonder Babylon = new Wonder("Babylon", "src/images/wonders/Babylon/1.png", null, null, null, null, WonderToPlayer.get("Babylon"));
    static Wonder Ephesus = new Wonder("Ephesus", "src/images/wonders/Ephesus/1.png", null, null, null, null, WonderToPlayer.get("Ephesus"));
    static Wonder Giza = new Wonder("Giza", "src/images/wonders/Giza/1.png", null, null, null, null, WonderToPlayer.get("Giza"));
    static Wonder Halicarnassus = new Wonder("Halicarnassus", "src/images/wonders/Halicarnassus/1.png", null, null, null, null, WonderToPlayer.get("Halicarnassus"));
    static Wonder Olympia = new Wonder("Olympia", "src/images/wonders/Olympia/1.png", null, null, null, null, WonderToPlayer.get("Olympia"));
    static Wonder Rhodes = new Wonder("Rhodes", "src/images/wonders/Rhodes/1.png", null, null, null, null, WonderToPlayer.get("Rhodes"));


    public PlayPVP(Vector<Vector<Object>> contextList){
        this.contextList = contextList;

        List<String> allList= new ArrayList<>();
        //传递内部数据
        for(Vector<Object> v : contextList){        //获得内部数据
            for(int i = 0; i<v.size();i++){
                allList.add((String) v.elementAt(i));   //一个个单独的String的数据列表
                
            }
        } 
        //System.out.println(allList.size());     //测试allList

        //创建玩家编号,玩家名字，玩家选择的奇迹列表
        List<String> numberList = new ArrayList<>();
        List<String> nameList = new ArrayList<>();
        List<String> wonderList = new ArrayList<>();
        //List<String> alltheList = new ArrayList<>();    //创造一个所有玩家选择的奇迹加上放在下面的卡组的列表



        //设置玩家
        for(int i = 0;i<contextList.size();i++){
            //alltheList.add("Card"+i);
            for (int j = 0;j<allList.size();j++){
                if(j%3 == 0){
                    numberList.add(allList.get(j));
                }else if (j%3 == 1){
                    nameList.add(allList.get(j));
                }else if(j%3 == 2){
                    wonderList.add(allList.get(j));
                    //alltheList.add(allList.get(j));
                }                 
            }
            
            //创建所有玩家的数据
            if(i == 0){
                Players Player1 = new Players(numberList.get(i), nameList.get(i), wonderList.get(i));
                WonderToPlayer.put(Player1.getWonder(), Player1);
            }else if (i == 1){
                Players Player2 = new Players(numberList.get(i), nameList.get(i), wonderList.get(i));
                WonderToPlayer.put(Player2.getWonder(), Player2);
            }else if(i == 2){
                Players Player3 = new Players(numberList.get(i), nameList.get(i), wonderList.get(i));
                WonderToPlayer.put(Player3.getWonder(), Player3);
            }else if(i == 3){
                Players Player4 = new Players(numberList.get(i), nameList.get(i), wonderList.get(i));
                WonderToPlayer.put(Player4.getWonder(), Player4);
            }else if(i == 4){
                Players Player5 = new Players(numberList.get(i), nameList.get(i), wonderList.get(i));
                WonderToPlayer.put(Player5.getWonder(), Player5);
            }else if(i == 5){
                Players Player6 = new Players(numberList.get(i), nameList.get(i), wonderList.get(i));
                WonderToPlayer.put(Player6.getWonder(), Player6);
            }else if(i == 6){
                Players Player7 = new Players(numberList.get(i), nameList.get(i), wonderList.get(i));
                WonderToPlayer.put(Player7.getWonder(), Player7);
            }  
        
        }
        //设置3个列表
        for (int j = 0;j<allList.size();j++){
            if(j%3 == 0){
                numberList.add(allList.get(j));
            }else if (j%3 == 1){
                nameList.add(allList.get(j));
            }else if(j%3 == 2){
                wonderList.add(allList.get(j));
                //alltheList.add(allList.get(j));
            }                 
        }
        
        //测试输出
        //System.out.println(numberList.size());
        //System.out.println(nameList.size());
        //System.out.println(wonderList.size());

        //System.out.println(Alexandria.getOwner().getName());


        //把设置好的卡组添加到程序中
        List<Cards> allcardlist = AllCardList();
        //洗牌
        Collections.shuffle(allcardlist);    
        LinkedList<List<Cards>> lists = averageAssign(allcardlist,(contextList.size()+1));       //将卡组等分为了contextList.size()个部分
        

        //测试是否分组完好
        //for (int i = 0;i<(contextList.size()+1);i++){
            //System.out.println(lists.get(i).size());
        //}

        //创建图像页面
        JFrame playPVPFrame = new JFrame();
        playPVPFrame.setTitle("7 wonders: architects");

        ImageIcon playBackGround = new ImageIcon("C:\\Users\\zhouz\\Desktop\\7 wonders\\src\\images\\background\\游玩背景.png");
        JLabel background = new JLabel(playBackGround);
        background.setSize(playBackGround.getIconWidth(),playBackGround.getIconHeight());
        
        //设置放入容器
        Container container  = playPVPFrame.getContentPane();
        container.setLayout(null);

        //放入奇迹图片
        //JPanel wonderJPanel = new JPanel();
        //将第一个玩家选择的文明作为第一个行动的文明
        //String wonderString = jugmentwonders(wonderList.get(0));      //将文明转化为图片链接的方式
            //System.out.println(wonderString);
        //ImageIcon wonderIcon = new ImageIcon(wonderString);
        //JLabel wodnerJLabel = new JLabel(wonderIcon);
        //wonderJPanel.add(wodnerJLabel);
        //container.add(wonderJPanel);
        //wonderJPanel.setBounds(710, 400, 400, 400);

        int i = 0;
        int i_left = i+1;
        int i_right = i+2;
        getCard(lists.get(i), container, 800, 10);
        getCard(lists.get(i_left), container, 200, 400);
        getCard(lists.get(i_right), container, 1420, 400);

 
        //设置nextplayer按钮
        JButton nextPlayerButton = new JButton("Next");
        container.add(nextPlayerButton);
        nextPlayerButton.setBounds(1700, 850, 120, 70);

        JPanel wodneritJPanel = new JPanel();
        Iterator<String> wonderIterator = wonderList.iterator();
        while(wonderIterator.hasNext()){
            String wonderitString = jugmentwonders(wonderIterator.next());
            ImageIcon wonderitIcon = new ImageIcon(wonderitString);
            JLabel wonderitJLabel = new JLabel(wonderitIcon);
            wodneritJPanel.add(wonderitJLabel);
            container.add(wodneritJPanel);
            wodneritJPanel.setBounds(710, 400, 400, 400);
            nextPlayerButton.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    wonderIterator.remove();

                }
                
            });
        }
        
        //添加背景图片
        container.add(background);
        //设置画面属性      
        playPVPFrame.setSize(playBackGround.getIconWidth(),playBackGround.getIconHeight());
        playPVPFrame.setLocationRelativeTo(null);
        playPVPFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        playPVPFrame.setVisible(true);
    }


//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
//学习：ArrayList适合查询，不适合list的删减等(出现了报错：java.util.ConcurrentModificationException)
//可以使用LinkedList
    //设置分组
    public  static <T> LinkedList<List<Cards>> averageAssign(List<Cards> source, int n) {
        LinkedList<List<Cards>> result = new LinkedList<List<Cards>>();
        int remainder = source.size() % n;  //(先计算出余数)
        int number = source.size() / n;  //然后是商
        int offset = 0;//偏移量
        for (int i = 0; i < n; i++) {
            List<Cards> value = null;
            if (remainder > 0) {
                value =  source.subList(i * number + offset, (i + 1) * number + offset + 1);
                remainder--;
                offset++;
            } else {
                value =  source.subList(i * number + offset, (i + 1) * number + offset);
            }
            result.add(value);
        }
        return result;
    }

        //设置卡组
        public static List<Cards> AllCardList(){
            List<Cards> AllCardList = new LinkedList<>();
            //添加金币卡(27张)
            for(int i = 0; i<27;i++){
                AllCardList.add(GOLD);
            }
            //添加各类资源卡（各17张）
            for (int i = 0;i<17;i++){
                AllCardList.add(BRICK);
                AllCardList.add(GLASS);
                AllCardList.add(PAPER);
                AllCardList.add(STONE);
                AllCardList.add(WOOD);
            }
            //添加科技卡(各14张)
            for (int i =0;i<14;i++){
                AllCardList.add(PLOT);
                AllCardList.add(SLATE);
                AllCardList.add(WHEEL);
            }
            //添加3分卡(16张)
            for(int i = 0;i<16;i++){
                AllCardList.add(THREEPOINTS);
            }
            //添加2分卡加猫猫(24张)
            for (int i = 0;i<24;i++){
                AllCardList.add(TWOPOINTSANDCAT);
            }
            //添加战争卡牌(18张)
            for (int i = 0;i<18;i++){
                AllCardList.add(WAR);
            }
            //添加战争1卡牌(15张)
            for (int i = 0;i<15;i++){
                AllCardList.add(WAR1);
            }
            //添加战争2卡牌(8张)
            for(int i = 0;i<8;i++){
                AllCardList.add(WAR2);
            }
    
            return AllCardList;
        }

    //设置文明判断(第一阶段)
    public static String jugmentwonders(String wonder){
        switch(wonder){
            case "Alexandria" :
                return Alexandria.getStage1();
            case "Babylon" :
                return Babylon.getStage1();
            case "Ephesus" :
                return Ephesus.getStage1();
            case "Giza" :
                return Giza.getStage1();
            case "Halicarnassus" :
                return Halicarnassus.getStage1();
            case "Olympia" :
                return Olympia.getStage1();
            case "Rhodes" :
                return Rhodes.getStage1();
            default :
                return null;
        }
    }

    public static void getCard(List<Cards> cardlist,Container co,int x,int y){
        Iterator<Cards> it = cardlist.iterator();
        JPanel jPanel = new JPanel();
        CardLayout CL = new CardLayout();
        jPanel.setLayout(CL);
        Cards infoCards;
        JButton button;

        while(it.hasNext()){
            infoCards = it.next();
            ImageIcon imageIcon = infoCards.getCardImage();
            button = new JButton(imageIcon);
            jPanel.add(button);
            CL.show(jPanel, infoCards.getName());
            button.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    CL.next(jPanel);
                    it.remove();
                } 
            });
        }

        co.add(jPanel);
        jPanel.setBounds(x, y, 220, 300);
    }
}
