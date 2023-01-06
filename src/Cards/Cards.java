package Cards;

import javax.swing.ImageIcon;

public class Cards {
    private String name;    //卡牌名字
    private ImageIcon cardImage;
    private ImageIcon cardbackImage = new ImageIcon("src/images/cards/卡牌背面/卡背.png");    //卡背
    private int point;
    private String caregory;    //种类
    private int cardWidth = 223;
    private int cardHeight = 302;

    public Cards(String name, ImageIcon cardImage){
        this.name = name;
        this.cardImage = cardImage;
    }

    public ImageIcon getCardImage(){
        return cardImage;
    }

    public int getPoint(){
        return point;
    }

    public ImageIcon getCardbackImage(){
        return cardbackImage;
    }

    public String getName(){
        return name;
    }
    
    public String getCaregory(){
        return caregory;
    }

    public int getCardWidth(){
        return cardWidth;
    }

    public int getCardHeight(){
        return cardHeight;
    }

    public void jugemenycard(String nameofcard){
        if (nameofcard == name){
            getCardImage();
        }
    }
}
