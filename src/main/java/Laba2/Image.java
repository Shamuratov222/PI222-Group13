package Laba2;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JComponent;

public class Image extends JComponent {

BufferedImage img;

public Image() {
try {
img = ImageIO.read(new File("src/main/java/Laba2/Логотип УГАТУ.jpg"));
} catch (IOException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}
public void paintComponent(Graphics g) {

if(img==null) return;
g.drawImage(img,0, 0,100,50,null); //Отвечает за сжатие картинки

}
}