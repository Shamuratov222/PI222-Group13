package Laba2;

import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class info_Listener implements ActionListener {


	private BufferedReader reader;

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
	
			
		final JFrame main_GUI = new JFrame("subversion");	// создание графического окна
		main_GUI.setTitle ("Окошко информации");
		main_GUI.setBounds(540,256,422,228);
		main_GUI.setResizable(false); // фиксированный размер окна
		
		
		JPanel main_panel = new JPanel(); // Панель - используется для организации компонентов в окне
		main_panel.setLayout(null);
		main_GUI.add(main_panel);
		
		JLabel laba_info1 = new JLabel("Шамуратов Дамир Дабирьянович 19130016"); // Отображение текста или изображения
		laba_info1.setBounds(20,20,777,30);
		main_panel.add(laba_info1);
		
		JLabel laba_info2 = new JLabel("Данилов 20.03.2021 Владимир Андреевич 19130169"); // Отображение текста или изображения
		laba_info2.setBounds(20,40,777,30);
		main_panel.add(laba_info2);
		
		JLabel laba_info3 = new JLabel("Юсупова Эвелина Альфредовна 19130173"); // Отображение текста или изображения
		laba_info3.setBounds(20,60,777,30);
		main_panel.add(laba_info3);
		
		JLabel laba_info4 = new JLabel("Колесова 20.03.2021 Валерия Юрьевна 19130627"); // Отображение текста или изображения
		laba_info4.setBounds(20,80,777,30);
		main_panel.add(laba_info4);
		
		JLabel laba_info5 = new JLabel("Студенты группы:"); // Отображение текста или изображения
		laba_info5.setBounds(20,0,777,30);
		main_panel.add(laba_info5);
		
		try {
			File file = new File("src\\main\\java\\Laba2\\qwe.txt");

			FileReader fr = new FileReader(file);

			reader = new BufferedReader(fr);

			String line = reader.readLine();

			JLabel laba_info6 = new JLabel(line); // Отображение текста или изображения
			laba_info6.setBounds(20,100,777,30);
			main_panel.add(laba_info6);
			while (line != null) {

			line = reader.readLine();
			}
			} catch (FileNotFoundException e) {
			e.printStackTrace();
			} catch (IOException e) {
			e.printStackTrace();
			}
	
		main_GUI.setVisible(true);
			
		JButton button_exit2 = new JButton("Выход"); // добавляем кнопку
        button_exit2.setBounds(166,122,100,40);
        main_panel.add(button_exit2);
        button_exit2.addActionListener (new  ActionListener () {

            public void actionPerformed(ActionEvent arg0) {
            // TODO Auto-generated method stub

        main_GUI.dispatchEvent(new WindowEvent(main_GUI, WindowEvent.WINDOW_CLOSING));

            }

        });
		
	}


}
