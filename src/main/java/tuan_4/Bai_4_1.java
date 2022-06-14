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
public class Bai_4_1 {
    public static void main(String[] args) {
        String st= "  Nguyen   Van     A    ";
        System.out.print("Xau cho truoc: "+ st);
        st = st.trim();
        st = st.replaceAll("\\s+", " ");
        System.out.print("\nXau da chinh: "+st);
    }

    public void run(JTextArea jta) {
jta.append("Họ và tên : Nguyễn Huy Bách" + "\nMSSV: 20198205\n");
    jta.append("\nĐề bài: "+"Cho trước 1 xâu ký tự là họ tên người đầy đủ nhưng khi nhập có thể thừa một số dấu cách. Hãy xóa đi các dấu cách thừa và in ra họ tên chính xác.\n");
    jta.append("\nBài làm " + "\n");
    String st= "  Nguyen   Van     A    ";
        jta.append("Xau cho truoc: "+ st);
        st = st.trim();
        st = st.replaceAll("\\s+", " ");
        jta.append("\nXau da chinh: "+st);
    }
}
