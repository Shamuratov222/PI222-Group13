package Laba2;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;



public class ListenerLogo implements ActionListener {

    public void actionPerformed(ActionEvent e)  {
        // TODO Auto-generated method stub 

    	subversion.Logo = new Image(); 
    	subversion.main_panel.add(subversion.Logo); //Добавление на главную панель
    	subversion.Logo.setSize(100,50); //Установка размеров
    	subversion.Logo.setLocation(300,25); //Установка местоположения
    	subversion.Logo.setVisible(true); //Установка видмости


    }

    }