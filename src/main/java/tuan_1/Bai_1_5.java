/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tuan_1;

import javax.swing.JTextArea;

/**
 *
 * @author DELL
 */
public class Bai_1_5 {
     public static void main(String[] args) {
		for (int i =1000; i <= 2000; i++) {
			if (i % 3 == 0 && i % 7 == 0 && i % 5 ==0) {
				System.out.print(i + " ");
			}
		}
	}
     public void run(JTextArea jta){
        jta.append("Họ và tên : Nguyễn Huy Bách" + "\nMSSV: 20198205\n");
        jta.append("\nĐề bài: "+"In ra màn hình các số nằm giữa 1000 và 2000 đồng thời chia hết cho 3,5,7\n");
        jta.append("\nBài làm " + "\nTất cả các số nằm giữa 1000 và 2000 đồng thời chia hết cho 3,5,7 là: \n");
        for (int i =1000; i <= 2000; i++) {
			if (i % 3 == 0 && i % 7 == 0 && i % 5 ==0) {
				jta.append(i + " ");
			}
		}
    }
    
}
