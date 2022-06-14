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
public class Bai_3_1 {
    public static void main(String[] args) {
        int  i, j, temp;
        //mang da cho
        int array[] = {100,30,84,27,47,4,23,13};
        //in mang da cho
        System.out.print("Mang: ");
        for (i = 0; i < ( array.length - 1 ); i++) {
        System.out.print( array[i] + " ");
        }
        //sap xep mang giam dan
        for (i = 0; i < ( array.length - 1 ); i++) {
            for (j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j+1])
                {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        //in ket qua da giam
        System.out.print("\nSap xep theo thu tu giam dan la: ");
        for (i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        }

    public void run(JTextArea jta) {
        jta.append("""
                   H\u1ecd v\u00e0 t\u00ean : Nguy\u1ec5n Huy B\u00e1ch
                   MSSV: 20198205
                   """);
        jta.append("\nĐề bài: "+"Cho một dãy số tự nhiên, viết chương trình sắp xếp dãy này theo thứ tự giảm dần.\n");
        jta.append("\nBài làm " + "\n");
        int  i, j, temp;
        //mang da cho
        int array[] = {100,30,84,27,47,4,23,13};
        //in mang da cho
        jta.append("Dãy đã cho là: ");
        for (i = 0; i < ( array.length - 1 ); i++) {
        jta.append(array[i] + " ");
        }
        //sap xep mang giam dan
        for (i = 0; i < ( array.length - 1 ); i++) {
            for (j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j+1])
                {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        //in ket qua da giam
        jta.append("\nSắp xếp theo thứ tự giảm dần là: ");
        for (i = 0; i < array.length; i++) {
            jta.append(array[i] + " ");
        }
    }
    
}
