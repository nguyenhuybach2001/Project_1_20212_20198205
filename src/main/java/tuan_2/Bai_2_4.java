/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tuan_2;

import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author DELL
 */
public class Bai_2_4 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Nhap so n: ");
            n = sc.nextInt();
        }while(n<1);
        System.out.println("So Fibonacci thu "+ n+ " la: "+ fb(n));
 
    }
    public static int fb(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        else{
            return(fb(n-2) + fb(n-1));
        }
    }

    public void run(JTextArea jta) {
        jta.append("Họ và tên : Nguyễn Huy Bách" + "\nMSSV: 20198205\n");
        jta.append("\nĐề bài: " + "Dãy Fibonaxi 1, 2, 3, … F(k) = F(k-1) + F(k-2). Tính số Fibonaxi thứ N\n");
        jta.append("\nBài làm " + "\n");   
        int n;
        
        do{
            String a = JOptionPane.showInputDialog(null, "Nhập n = ");
        n = Integer.parseInt(a);
        }while(n<1);
        jta.append("Số Fibonacci thứ "+ n+ " là: "+ fb(n));
 
    }
}
