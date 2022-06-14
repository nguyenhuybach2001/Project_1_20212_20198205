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
public class Bai_4_3 {
    public static void main(String[] args) {
        String s="   Nguyen Thi  B";
        System.out.print("Ho va ten: "+ s);
        s= s.trim();//cat bo khang trang du thua
        int i =s.lastIndexOf(' ');//tim vi tri khoang trang cuoi cung
        String ten = s.substring(i+1);//cat tu vi tri thu i+1
        System.out.print("\nTen da duoc tach la: "+ten);
        }

    public void run(JTextArea jta) {
    jta.append("Họ và tên : Nguyễn Huy Bách" + "\nMSSV: 20198205\n");
    jta.append("\nĐề bài: "+"Cho trước 1 xâu ký tự là họ tên người đầy đủ, hãy tách ra phần tên của người này.\n");
    jta.append("\nBài làm " + "\n");
    String s="   Nguyen Thi  B";
        jta.append("Ho va ten: "+ s);
        s= s.trim();//cat bo khang trang du thua
        int i =s.lastIndexOf(' ');//tim vi tri khoang trang cuoi cung
        String ten = s.substring(i+1);//cat tu vi tri thu i+1
        jta.append("\nTen da duoc tach la: "+ten);
    }
}
