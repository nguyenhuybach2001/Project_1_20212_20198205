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
public class Bai_3_6 {
    public static void main(String[] args) {
        int a[]= {2,3,5,78,23,35,7};
        System.out.print("Cac so trong day là: ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
        System.out.print("\nCac so thoa man là: ");
       
        for(int i=0;i<a.length;i++){
            for(int j = 0; j<a.length;j++){
                if(a[i]%a[j]==0){
                System.out.print(a[j]+" ");
                }
            }
        }
        
    }

    public void run(JTextArea jta) {
        jta.append("Họ và tên : Nguyễn Huy Bách" + "\nMSSV: 20198205\n");
    jta.append("\nĐề bài: "+"Cho một dãy số tự nhiên, hãy in ra tất cả các số hạng của dãy trên thỏa mãn: số này là ước số thực sự của 1 số hạng khác trong dãy trên.\n");
    jta.append("\nBài làm " + "\n");
        int a[]= {2,3,5,78,23,35,7};
        jta.append("Cac so trong day là: ");
        for(int i=0;i<a.length;i++){
            jta.append(a[i] + " ");
        }
        jta.append("\nCac so thoa man là: ");
       
        for(int i=0;i<a.length;i++){
            for(int j = 0; j<a.length;j++){
                if(a[i]%a[j]==0){
                    
                jta.append(a[j]+" ");
                }
            }
        }
    }
}

