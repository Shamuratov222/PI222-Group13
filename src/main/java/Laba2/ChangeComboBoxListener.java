package Laba2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangeComboBoxListener implements ActionListener {
public void actionPerformed(ActionEvent e) {
int i = subversion.changeBox.getSelectedIndex();// Получение значения changeBox
switch (i){
case 0:{
subversion.Logo.setBounds(250,30,100,150); //Установка координат в случае 1
break;
}
case 1:{
subversion.Logo.setBounds(150,30,100,150); //Установка координат в случае 2
break;
}
case 2:{
subversion.Logo.setBounds(40,30,100,150); //Установка координат в случае 3

break;
}
case 3:{
int y[] = Array.getArray();
System.out.println("Начальный массив:");
for(int i1=0; i1 < Array.getArray().length; i1++) {
System.out.println(y[i1]);
}

int x[] = SortArray.Sort(y);
System.out.println("Отсортированный массив:");
for(int i1=0; i1 < Array.getArray().length; i1++) {
System.out.println(x[i1]);
}

break;
}
case 4:{
subversion.d1 = Integer.parseInt(subversion.field1.getText());
subversion.d2 = Integer.parseInt(subversion.field2.getText());
int S = (subversion.d1 * subversion.d2)/2;
System.out.println(S);

break;
}

}
}
}
