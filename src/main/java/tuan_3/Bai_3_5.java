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
public class Bai_3_5 {
    //day so cho truoc
     int a[]={1,23,5,24,3,27,29};
     //ham kiem tra so nguyen to co trong day
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
//ham in ra day so 
public void DaySo(JTextArea jta)
{
    for (int i=0; i<a.length;i++){
        jta.append(a[i]+ " ");
}
        jta.append("");
}
//ham dem so nguyen to và hop so trong day
public void demSoNguyenTovaHopSo(JTextArea jta){
    int Snt = 0;
    int Hs=0;
    for (int i=0; i<a.length;i++){
        if(KiemTraNguyenTo (a[i])){
            Snt ++;
}else{
            Hs++;
        }
        
    }
    jta.append("\nSo nguyen to trong day co: "+ Snt+"\nSo hop so trong day co: "+Hs);
}
    public static void main(String[] args) {
       Bai_3_5 kt = new Bai_3_5();
         System.out.println("Day da cho la:");
         //kt.DaySo();
         //kt.demSoNguyenTovaHopSo();
    }

    public void run(JTextArea jta) {
    jta.append("Họ và tên : Nguyễn Huy Bách" + "\nMSSV: 20198205\n");
    jta.append("\nĐề bài: "+"Cho một dãy số tự nhiên, hãy đếm xem trong dãy số trên có bao nhiêu số nguyên tố, có bao nhiêu hợp số.\n");
    jta.append("\nBài làm " + "\n");
        Bai_3_5 kt = new Bai_3_5();
         jta.append("Day da cho la:");
         kt.DaySo(jta);
         kt.demSoNguyenTovaHopSo(jta);
    }
    }

