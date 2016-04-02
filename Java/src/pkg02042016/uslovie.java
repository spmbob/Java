/* import javax.swing.*;
public class uslovie{
    public static void main(String[] args){
        double x,y;
        String title="Деление чисел";
        String text="Результат деления: ";
        int type;
        x=Double.parseDouble(JOptionPane.showInputDialog("Числитель: "));
        y=Double.parseDouble(JOptionPane.showInputDialog("Знаменатель: "));
        if(y!=0) {type=JOptionPane.PLAIN_MESSAGE;
           text=text+x+"/"+y+"="+x/y;}
        else {type=JOptionPane.ERROR_MESSAGE;
           text=text+"Деление на ноль!";}
        JOptionPane.showMessageDialog(null,text,title,type);
        }
    } */ 

/*import javax.swing.*;
public class uslovie{
    public static void main(String[] args){
        String text,str;
        text=JOptionPane.showInputDialog("Введите целое число: ");
        if (text==null) {System.exit(0);}
        int num=Integer.parseInt(text);
        if (num<0) {str="Вы ввели отрицательное число!";}
        else if (num>100) {str="Это очень большое число!";}
        else if (num>10) {str="Число, большее десяти!";}
        else {str="Число в пределах от 0 до 10 !";}
        JOptionPane.showMessageDialog(null,str);
    }
} */


/*import javax.swing.*;
public class uslovie{
    public static void main(String[] args) {
        int count,i=1,j=1,s1=0,s2=0;
        count=Integer.parseInt(JOptionPane.showInputDialog("Введите границу суммы"));
        String text="Сумма натуральных чисел от 1 до "+count+".\n";
        String str1="Оператор while: ";
        String str2="Опертаор do-while: ";
        while (i<=count) {
            s1+=i;
            i++;}
        do {
            s2+=j;
            j++;
        }while(j<=count);
        str1+=s1+"\n";
        str2+=s2;
        JOptionPane.showMessageDialog(null,text+str1+str2);
        }
    } */

/*import javax.swing.*;
public class uslovie{
    public static void main(String[] args) {
        int count,i,s=0;
        count=Integer.parseInt(JOptionPane.showInputDialog("Введите границу суммы"));
        String text="Суммы натуральных чисел от 1 до "+count+": ";
        for (i=1;i<=count;i++) {
            s+=i;}
        JOptionPane.showMessageDialog(null,text+s);
        }
    }*/


import javax.swing.*;
public class uslovie{
    public static void main(String[] args) {
        int num;
        String text,str;
        text=JOptionPane.showInputDialog("Введите целое число от 0 до 10:");
        num=Integer.parseInt(text);
        switch(num){
            case 0:
                str="Вы ввели нулевое значение !";
                break;
            case 1:
                str="Вы ввели единичное значение!";
                break;
            case 2:
            case 3:
            case 5:
            case 7:
                str="Вы ввели простое число!";
                break;
            case 4:
            case 6:
            case 8:
            case 10:
                str="Вы ввели четное число!";
                break;
            default:
            str="Вы ввели число 9 или \nвыходящие за пределы диапозона !";
           }
        JOptionPane.showMessageDialog(null,str);
        }
    }