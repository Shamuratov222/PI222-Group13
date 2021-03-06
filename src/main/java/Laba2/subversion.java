package Laba2; //пакет Java классов

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; //библиотека для события слушателя
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.text.NumberFormat;

import javax.swing.*; // Библиотека для GUI (построена на основе awt)

public class subversion {

protected JFrame main_GUI;
protected static JPanel main_panel;
protected static subversion student;
protected static JComboBox combo_student;
protected static int d1,d2;
protected static JComboBox changeBox;
protected static Image Logo;
protected static JFormattedTextField field1;
protected static JFormattedTextField field2;
public subversion() {
main_GUI = new JFrame("subversion"); // создание графического окна
main_GUI.setTitle ("Using subversion for developers");
main_GUI.setBounds(500,200,420,320);
main_GUI.setResizable(false); // фиксированный размер окна

main_panel = new JPanel(); // Панель - используется для организации компонентов в окне
main_panel.setLayout(null);
main_GUI.add(main_panel);

JLabel laba_info = new JLabel("Лабораторная работа №2"); // Отображение текста или изображения
laba_info.setBounds(120,0,150,30);
main_panel.add(laba_info);

JButton button_exit = new JButton("Выход"); // добавляем кнопку
button_exit.setBounds(270,200,100,40);
ActionListener actionListener = new ListenerButton(); //создаем слушатель
button_exit.addActionListener(actionListener); // добавляем слушатель к кнопке
main_panel.add(button_exit);

JButton button_info = new JButton("Информация"); // добавляем кнопку
button_info.setBounds(30,200,150,40);
ActionListener info_Listener = new info_Listener(); //создаем слушатель
button_info.addActionListener(info_Listener); // добавляем слушатель к кнопке
main_panel.add(button_info);

//Image logo = new Image();
//logo.setSize(100,100);
//logo.setLocation(300,60);
//logo.setVisible(true);
//main_panel.add(logo);

JMenu menu = new JMenu("Главная");
JMenuBar menuBar = new JMenuBar();
JMenuItem menu1 = new JMenuItem("Отобразить логотип УГАТУ");
JMenuItem menu2 = new JMenuItem("Выход");
JMenuItem menu3 = new JMenuItem("Загрузить файл в проект13");
menu2.addActionListener(actionListener);
ActionListener list = new ListenerLogo();

menu1.addActionListener(list);



field1 = new JFormattedTextField();
NumberFormat.getIntegerInstance();
field1.setBounds(30, 105, 90, 30);
main_panel.add(field1);
field2 = new JFormattedTextField();
NumberFormat.getIntegerInstance();
field2.setBounds(200, 105, 90, 30);

main_panel.add(field2);

JLabel diag1 = new JLabel("Диагональ 1"); // Отображение текста или изображения
diag1.setBounds(30,80,90,30);
main_panel.add(diag1);

JLabel diag2 = new JLabel("Диагональ 2"); // Отображение текста или изображения
diag2.setBounds(200,80,90,30);
main_panel.add(diag2);

String[] transfer = {"Переместить логотип в правый верхний угол", "Переместить логотип в середину", "Переместить логотип в левый верхний угол", "Отсортировать данные в проекте13", "Рассчитать площадь ромба"};
changeBox = new JComboBox(transfer);
changeBox.setBounds(30,140,350,30);
ActionListener logo_hh = new ChangeComboBoxListener();
changeBox.addActionListener( logo_hh);
main_panel.add(changeBox);
changeBox.setEnabled(true);

menu.add(menu1);
menu.add(menu2);
menu.add(menu3);
menuBar.add(menu);
main_GUI.setJMenuBar(menuBar);

main_GUI.setVisible(true);

main_GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // закрытие окна JFrame и процесса Java

}


public static void main(String[] args) { // интересные заметки: http://www.mstu.edu.ru/study/materials/java/
subversion student= new subversion();

}

}