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
public class Bai_4_4 {
    public static void main(String[] args) {
        String s= " Nguyen Van B  ";
        String ho=new String();
        System.out.println("Ho va ten: "+ s);
        s=s.trim();
        int i;
        for(i=0;i<=s.length();i++){
        ho = s.substring(i,i+1);
        if(ho.equals(" "))
            break;
        }
        System.out.print("Ho: "+ s.substring(0,i));
    }

    public void run(JTextArea jta) {
    jta.append("Họ và tên : Nguyễn Huy Bách" + "\nMSSV: 20198205\n");
    jta.append("\nĐề bài: "+"Cho trước 1 xâu ký tự là họ tên người đầy đủ, hãy tách ra phần họ của người này.\n");
    jta.append("\nBài làm " + "\n");
    String s= " Nguyen Van B  ";
        String ho=new String();
        jta.append("Ho va ten: "+ s);
        s=s.trim();
        int i;
        for(i=0;i<=s.length();i++){
        ho = s.substring(i,i+1);
        if(ho.equals(" "))
            break;
        }
        jta.append("\nHo: "+ s.substring(0,i));
    }
}
