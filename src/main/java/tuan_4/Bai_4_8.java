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
public class Bai_4_8 {
    public static String Laydem(String hoten){
        hoten=hoten.trim();
        int i = hoten.indexOf(" ");
        int j= hoten.lastIndexOf(" ");
        String dem = hoten.substring(i+1, j);
        return dem;
    }
    public static int Dem(String []s, String s1){
        int dem =0;
        for(int i=0;i<s.length;i++){
            String a= Laydem(s[i]);
            if(a.equals(s1))
                dem++;
        }
        return dem;
    }
    public static void main(String[] args) {
        String []s={"Nguyen Thi C", "Le Thi H  ", "  Nguyen Van A", "Le Van B"};
        System.out.println("Danh sach sinh vien:");
        for(int i =0;i<s.length;i++){
            System.out.println(s[i]);
        }
        int n = Dem(s,"Thi");
        System.out.print("\nSo sinh vien co phan dem là Thi la: "+ n);
    }

    public void run(JTextArea jta) {
    jta.append("Họ và tên : Nguyễn Huy Bách" + "\nMSSV: 20198205\n");
    jta.append("\nĐề bài: "+"Cho danh sách họ tên đầy đủ học sinh. Hãy đếm xem có bao nhiêu bạn có phần đệm là  “Thị”.\n");
    jta.append("\nBài làm " + "\n");
            String []s={"Nguyen Thi C", "Le Thi H  ", "  Nguyen Van A", "Le Van B"};
        jta.append("Danh sach sinh vien:");
        for(int i =0;i<s.length;i++){
            jta.append(s[i] + ", ");
        }
        int n = Dem(s,"Thi");
        jta.append("\nSo sinh vien co phan dem là Thi la: "+ n);

    }
}
