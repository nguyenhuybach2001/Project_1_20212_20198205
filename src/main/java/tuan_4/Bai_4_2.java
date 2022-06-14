/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tuan_4;
import java.util.Map;
import java.util.TreeMap;
import javax.swing.JTextArea;
/**
 *
 * @author DELL
 */
public class Bai_4_2 {
    public static void main(String[] args) {
        String str = "abcdasoidjabcadijdabc";
        String xaucon = "abc";
        int dem = 0;
        int n = xaucon.length();
        char arr[] = str.toCharArray();
        String kt = new String();
        for(int i =0;i<=str.length()-n;i++){
            kt = str.substring(i, i+n);
            if(kt.equals(xaucon))
                dem++;
        }
        System.out.print("Xau da cho: "+ str);
        System.out.print("\nXau con: "+ xaucon);
        System.out.print("\nSo lan xuat hien cua xau con trong xau da cho la: "+dem);
    }

    public void run(JTextArea jta) {
jta.append("Họ và tên : Nguyễn Huy Bách" + "\nMSSV: 20198205\n");
    jta.append("\nĐề bài: "+"Cho trước xâu ký tự bất kỳ. Hãy đếm xem trong xâu có bao nhiêu lần xuất hiện xâu con “abc”.\n");
    jta.append("\nBài làm " + "\n");
    String str = "abcdasoidjabcadijdabc";
        String xaucon = "abc";
        int dem = 0;
        int n = xaucon.length();
        char arr[] = str.toCharArray();
        String kt = new String();
        for(int i =0;i<=str.length()-n;i++){
            kt = str.substring(i, i+n);
            if(kt.equals(xaucon))
                dem++;
        }
        jta.append("Xau da cho: "+ str);
        jta.append("\nXau con: "+ xaucon);
        jta.append("\nSo lan xuat hien cua xau con trong xau da cho la: "+dem);
    }
}
