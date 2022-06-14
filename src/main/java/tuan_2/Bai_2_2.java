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
public class Bai_2_2 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Nhap so n: ");
            n = sc.nextInt();
        }while(n<1);
        double s = 0;
        long t = 1;
	for (int i = 1; i <= n; i++)
	{
		t = t * i;
		s = s + (double)1 / t;
	}
        System.out.println("ket qua: " +s);
    }

    public void run(JTextArea jta) {
        jta.append("Họ và tên : Nguyễn Huy Bách" + "\nMSSV: 20198205\n");
        jta.append("\nĐề bài: "+"Cho số tự nhiên N bất kỳ\n" + "Tính tổng S= 1+ 1/2! + 1/3! + … + 1/N!\n");
        jta.append("\nBài làm " + "\n");
        int n;
        do{
            String a = JOptionPane.showInputDialog(null, "Nhập n = ");
        n = Integer.parseInt(a);
        }while(n<1);
        jta.append("n = "+ n);
        double s = 0;
        long t = 1;
	for (int i = 1; i <= n; i++)
	{
		t = t * i;
		s = s + (double)1 / t;
	}
        jta.append("\nS= " +s);
    }
}
