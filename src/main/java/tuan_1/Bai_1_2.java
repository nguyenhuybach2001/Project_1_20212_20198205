/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tuan_1;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author DELL
 */
public class Bai_1_2 {
    public static void main(String args[])
    {
        int count, n, a =1, i =0;
        while(i<20){
            a++;
            count =0;
            for(n = 2;n<=(a/2);n++)
                if(a%n == 0) 
                    count ++;
            if(count == 0){
                System.out.print(a + " ");
                i++;
            }
        }     
    }
    public void run(JTextArea jta)
    {   
        jta.append("Họ và tên : Nguyễn Huy Bách" + "\nMSSV: 20198205\n");
        jta.append("\nĐề bài: "+"In ra màn hình 20 số nguyên tố đầu tiên\n");
        jta.append("\nBài làm " + "\n20 số nguyên tố đầu tiên là: \n");
        int count, n, a =1, i =0;
        while(i<20){
            a++;
            count =0;
            for(n = 2;n<=(a/2);n++)
                if(a%n == 0) 
                    count ++;
            if(count == 0){
                jta.append(a + " ");
                i++;
            }
        }     
    }
           
}
