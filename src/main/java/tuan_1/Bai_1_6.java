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
public class Bai_1_6 {
    public static void main(String[] args) {
        int a=0,i=0,n,tong;
        while(i<5){
            a++;
            tong=1;
            for(n=2;n<a;n++){
                if(a%n == 0)
                    tong+=n;
            }
            if(a==tong){
                System.out.print(a + " ");
                i++;
            }
        }
    }
    public void run(JTextArea jta){
        jta.append("Họ và tên : Nguyễn Huy Bách" + "\nMSSV: 20198205\n");
        jta.append("\nĐề bài: "+"In ra màn hình 5 số hoàn hảo đầu tiên \n");
        jta.append("\nBài làm " + "\n5 số hoàn hảo đầu tiên là: \n");
        int a=0,i=0,n,tong;
        while(i<5){
            a++;
            tong=1;
            for(n=2;n<a;n++){
                if(a%n == 0)
                    tong+=n;
            }
            if(a==tong){
                jta.append(a + " ");
                i++;
            }
        }
    }
    
}
