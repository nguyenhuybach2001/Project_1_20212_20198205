/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tuan_1;

import javax.swing.JTextArea;

/**
 *
 * @author DELL
 */
public class Bai_1_3 {
    public static void main(String[] args) {
        int i =0;
        int num =0;
        System.out.println("Cac so nguyen to tu 1000 den 2000 la:");
        for (i = 1000; i <= 2000; i++)
        {
            int counter=0;
            for(num =i; num>=1; num--)
            {
                if(i%num==0)
                {
                    counter = counter + 1;
                }
            }
            if (counter ==2){
            
        
        
        System.out.print(i + " ");
    }
        }
    }
    public void run(JTextArea jta){
        jta.append("Họ và tên : Nguyễn Huy Bách" + "\nMSSV: 20198205\n");
        jta.append("\nĐề bài: "+"In ra màn hình tất cả các số nguyên tố từ 1000 đến 2000\n");
        jta.append("\nBài làm " + "\nTất cả các số nguyên tố từ 1000 đến 2000 là: \n");
        int i =0;
        int num =0;
        for (i = 1000; i <= 2000; i++)
        {
            int counter=0;
            for(num =i; num>=1; num--)
            {
                if(i%num==0)
                {
                    counter = counter + 1;
                }
            }
            if( i % 100 == 0){
                jta.append("\n");
            }  
            if (counter ==2){      
        jta.append(i + " ");
            }
        }
    }
}

