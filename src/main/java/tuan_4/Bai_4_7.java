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
public class Bai_4_7 {
    public static String Layten(String hoten){
        hoten=hoten.trim();
        int i = hoten.lastIndexOf(' ');
        String ten =hoten.substring(i+1);
        return ten;
    }
    public static int Dem(String []s, String s1){
        int dem =0 ;
        for(int i=0;i<s.length;i++){
            String a= Layten(s[i]);
            if(a.equals("An")){
            dem++;
        }
        }
        return dem;
    }
    public static void main(String[] args) {
        String []s= {"Nguyen Van An", "Nguyen Van B", "Nguyen Thi C", "Tran Huu An", "Le Thi Hoai An"};
        System.out.println("Danh sach sinh vien: ");
        for(int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }
        int n= Dem(s, "An");
        System.out.print("So sinh vien co ten An la: "+n);
    }

    public void run(JTextArea jta) {
    jta.append("Họ và tên : Nguyễn Huy Bách" + "\nMSSV: 20198205\n");
    jta.append("\nĐề bài: "+"Cho danh sách họ tên đầy đủ học sinh. Hãy đếm xem có bao nhiêu bạn tên “An”.\n");
    jta.append("\nBài làm " + "\n");
    String []s= {"Nguyen Van An", "Nguyen Van B", "Nguyen Thi C", "Tran Huu An", "Le Thi Hoai An"};
        jta.append("Danh sach sinh vien: ");
        for(int i=0;i<s.length;i++){
            jta.append(s[i] + ", ");
        }
        int n= Dem(s, "An");
        jta.append("\nSo sinh vien co ten An la: "+n);
    }
}
