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
public class Bai_4_5 {
    public static void main(String[] args) {
        String s= "0110111010001111";
        System.out.print("Xau ky tu da cho: "+ s);
        char[] s1= s.toCharArray();
        for(int i=0;i< s1.length;i++){
            if(s1[i]=='0'){
                s1[i] = '1';
            }else if(s1[i]=='1'){
                s1[i]='0';
            }
        }
        System.out.print("\nXau ky tu da doi la: ");
        System.out.print(s1);
    }

    public void run(JTextArea jta) {
    jta.append("Họ và tên : Nguyễn Huy Bách" + "\nMSSV: 20198205\n");
    jta.append("\nĐề bài: "+"Cho một xâu ký tự bao gồm toàn các ký tự 0,1. Hãy biến đổi xâu này theo cách 0->1, 1->0 và in ra kết quả.\n");
    jta.append("\nBài làm " + "\n");
    String s= "0110111010001111";
        jta.append("Xau ky tu da cho: "+ s);
        char[] s1= s.toCharArray();
        for(int i=0;i< s1.length;i++){
            if(s1[i]=='0'){
                s1[i] = '1';
            }else if(s1[i]=='1'){
                s1[i]='0';
            }
        }
        jta.append("\nXau ky tu da doi la: ");
        jta.append(String.valueOf(s1));
    }
}
