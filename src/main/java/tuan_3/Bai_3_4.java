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
public class Bai_3_4 {
    public static void main(String[] args) {
    int A[]={2,13,124,23,24,31,124};
    int max = A[0];
    String  index = "";
    int i = 1; 
    //tim so max
    for (int j = 0; j < A.length; j++) {     
        if (A[j] > max) {         
            max = A[j];
    }  
    } 
    //tim vi tri so max
    for (int j = 0; j < A.length; j++){
        if(max == A[j]){
            j = j +1;
            index = index + j + " ";
        }
    }
    System.out.print("Day da cho la ");
    for (int j = 0; j < A.length; j++){
    System.out.print(A[j] + " ");
    }
    System.out.println("\nSo max trong day là " + max + " ,nam o vi tri " + index);
}

    public void run(JTextArea jta) {
    jta.append("Họ và tên : Nguyễn Huy Bách" + "\nMSSV: 20198205\n");
    jta.append("\nĐề bài: "+"Cho một dãy các số tự nhiên, tìm và in ra 1 giá trị max của dãy này và tất cả các chỉ số ứng với giá trị max này.\n");
    jta.append("\nBài làm " + "\n");
    int A[]={2,13,124,23,24,31,124};
    int max = A[0];
    String  index = "";
    int i = 1; 
    //tim so max
    for (int j = 0; j < A.length; j++) {     
        if (A[j] > max) {         
            max = A[j];
    }  
    } 
    //tim vi tri so max
    for (int j = 0; j < A.length; j++){
        if(max == A[j]){
            j = j +1;
            index = index + j + " ";
        }
    }
    jta.append("Dãy đã cho là: ");
    for (int j = 0; j < A.length; j++){
    jta.append(A[j] + " ");
    }
    jta.append("\nSố max trong dãy là " + max + " ,nằm ở vị trí " + index.trim().replaceAll(" ", ", "));
    }
}
