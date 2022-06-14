/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tuan_3;

import javax.swing.JTextArea;

/**
 *
 * @author DELL
 */
public class Bai_3_2 {
     int a[]={1,23,5,24,23,27,29};
public boolean KiemTraNguyenTo(int n){
  
    if(n<2)
    {
        return false;
    }

    for(int i=2; i<=Math.sqrt(n); i++)
    {
        if(n%i==0){
        return false;
}
    }
    return true;
}

public void Mang(JTextArea jta)
{
    for (int i=0; i<a.length;i++){
        jta.append(a[i]+ " ");
}
        jta.append(" ");
}
public void xuatSoNguyenTo(JTextArea jta){
    for (int i=0; i<a.length;i++){
        if(KiemTraNguyenTo (a[i])){
            jta.append(a[i]+ " ");
}
        jta.append(" ");
    }
}
    public static void main(String[] args) {
       Bai_3_2 kt = new Bai_3_2();
         System.out.println("Day da cho la:");
         //kt.Mang();
         System.out.println("Cac so nguyen to trong day la: ");
         //kt.xuatSoNguyenTo();
    }

    public void run(JTextArea jta) {
        jta.append("Họ và tên : Nguyễn Huy Bách" + "\nMSSV: 20198205\n");
        jta.append("\nĐề bài: "+"Cho dãy số tự nhiên, in ra màn hình tất cả các số nguyên tố của dãy này.\n");
        jta.append("\nBài làm " + "\n");
        Bai_3_2 kt = new Bai_3_2();
         jta.append("Dãy đã cho là:");
         kt.Mang(jta);
         jta.append("\nCác số nguyên tố trong dãy là: ");
         kt.xuatSoNguyenTo(jta);
        
    }
    }

