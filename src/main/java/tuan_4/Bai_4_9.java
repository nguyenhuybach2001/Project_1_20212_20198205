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
public class Bai_4_9 {
    public static String Layten(String hoten){
        hoten=hoten.trim();
        int i = hoten.lastIndexOf(' ');
        String ten =hoten.substring(i+1);
        return ten;
    }
    public static int Dem(String []s){
        int dem=0;
        char a='H';
        for(int i =0; i<s.length;i++){
            String ten = Layten(s[i]);
            char b=ten.charAt(0);
            if(a==b){
                dem++;
            }
        }
        return dem;
    }
    public static void main(String[] args) {
        String []s={"Nguyen Van Hoai","Le Hong Hai","Trieu Van Ba"};
        System.out.println("Danh sach sinh vien:");
        for(int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }
        int n = Dem(s);
        System.out.print("So sinh vien có ten bat dau bang chu H là: "+n);
    }

    public void run(JTextArea jta) {
    jta.append("Họ và tên : Nguyễn Huy Bách" + "\nMSSV: 20198205\n");
    jta.append("\nĐề bài: "+"Cho danh sách họ tên đầy đủ học sinh. Hãy đếm xem có bao nhiêu bạn  có tên bắt đầu bằng chữ “H”.\n");
    jta.append("\nBài làm " + "\n");
    String []s={"Nguyen Van Hoai","Le Hong Hai","Trieu Van Ba"};
        jta.append("Danh sach sinh vien:");
        for(int i=0;i<s.length;i++){
            jta.append(s[i] + ", ");
        }
        int n = Dem(s);
        jta.append("\nSo sinh vien có ten bat dau bang chu H là: "+n);
    
    }
}
