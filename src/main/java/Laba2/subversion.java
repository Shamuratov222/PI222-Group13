package Laba2; //����� Java �������

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; //���������� ��� ������� ���������
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.text.NumberFormat;

import javax.swing.*; // ���������� ��� GUI (��������� �� ������ awt)

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
main_GUI = new JFrame("subversion"); // �������� ������������ ����
main_GUI.setTitle ("Using subversion for developers");
main_GUI.setBounds(500,200,420,320);
main_GUI.setResizable(false); // ������������� ������ ����

main_panel = new JPanel(); // ������ - ������������ ��� ����������� ����������� � ����
main_panel.setLayout(null);
main_GUI.add(main_panel);

JLabel laba_info = new JLabel("������������ ������ �2"); // ����������� ������ ��� �����������
laba_info.setBounds(120,0,150,30);
main_panel.add(laba_info);

JButton button_exit = new JButton("�����"); // ��������� ������
button_exit.setBounds(270,200,100,40);
ActionListener actionListener = new ListenerButton(); //������� ���������
button_exit.addActionListener(actionListener); // ��������� ��������� � ������
main_panel.add(button_exit);

JButton button_info = new JButton("����������"); // ��������� ������
button_info.setBounds(30,200,150,40);
ActionListener info_Listener = new info_Listener(); //������� ���������
button_info.addActionListener(info_Listener); // ��������� ��������� � ������
main_panel.add(button_info);

//Image logo = new Image();
//logo.setSize(100,100);
//logo.setLocation(300,60);
//logo.setVisible(true);
//main_panel.add(logo);

JMenu menu = new JMenu("�������");
JMenuBar menuBar = new JMenuBar();
JMenuItem menu1 = new JMenuItem("���������� ������� �����");
JMenuItem menu2 = new JMenuItem("�����");
JMenuItem menu3 = new JMenuItem("��������� ���� � ������13");
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

JLabel diag1 = new JLabel("��������� 1"); // ����������� ������ ��� �����������
diag1.setBounds(30,80,90,30);
main_panel.add(diag1);

JLabel diag2 = new JLabel("��������� 2"); // ����������� ������ ��� �����������
diag2.setBounds(200,80,90,30);
main_panel.add(diag2);

String[] transfer = {"����������� ������� � ������ ������� ����", "����������� ������� � ��������", "����������� ������� � ����� ������� ����", "������������� ������ � �������13", "���������� ������� �����"};
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

main_GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �������� ���� JFrame � �������� Java

}


public static void main(String[] args) { // ���������� �������: http://www.mstu.edu.ru/study/materials/java/
subversion student= new subversion();

}

}