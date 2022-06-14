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
public class Bai_1_7 {
    public static void main(String[] args) {
        int a1=0,a2=0,a3=0,a4=0,a5=0;
        for(int i=0;i<=100;i++)
            switch(i%5){
                case 0: a1++; break;
                case 1: a2++; break;
                case 2: a3++; break;
                case 3: a4++; break;
            }
        System.out.println("Co tat ca " + a1 + " so chi het cho 5");
        System.out.println("Co tat ca " + a2 + " so chia 5 du 1");
        System.out.println("Co tat ca " + a3 + " so chia 5 du 2");
        System.out.println("Co tat ca " + a4 + " so chia 5 du 3");
    }
    public void run(JTextArea jta){
        jta.append("Họ và tên : Nguyễn Huy Bách" + "\nMSSV: 20198205\n");
        jta.append("\nĐề bài: "+"Trong các số tự nhiên <=100 hãy đếm xem có bao nhiêu số\n"+"a,Chia hết cho 5\n"+"b,Chia 5 dư 1\n"+"c,Chia 5 dư 2\n"+"c,Chia 5 dư 3\n");
        jta.append("\nBài làm " );
        int a1=0,a2=0,a3=0,a4=0,a5=0;
        for(int i=0;i<=100;i++)
            switch(i%5){
                case 0: a1++; break;
                case 1: a2++; break;
                case 2: a3++; break;
                case 3: a4++; break;
            }
        jta.append("\na,Có tất cả " + a1 + " số chia hết cho 5");
        jta.append("\nb,Có tất cả " + a2 + " số chia 5 dư 1");
        jta.append("\nc,Có tất cả " + a3 + " số chia 5 dư 2");
        jta.append("\nd,Có tất cả " + a4 + " số chia 5 dư 3");
    }
    
}
