/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tuan_4;

import javax.swing.JTextArea;

/**
 *
 * @author DELL
 */
public class Bai_4_6 {
    public static void main(String[] args) {
        String s=" abcd";
        StringBuilder str = new StringBuilder(s);
        String s1 =str.reverse().toString();
        System.out.print("Xau s la: "+ s+ "\nXau s1 là: "+s1);
    }

    public void run(JTextArea jta) {
    jta.append("Họ và tên : Nguyễn Huy Bách" + "\nMSSV: 20198205\n");
    jta.append("\nĐề bài: "+"Cho trước xâu ký tự S, in ra xâu S1 ngược lại xâu S.\n");
    jta.append("\nBài làm " + "\n");
    String s=" abcd";
        StringBuilder str = new StringBuilder(s);
        String s1 =str.reverse().toString();
        jta.append("Xau s la: "+ s+ "\nXau s1 là: "+s1);
    }
}
