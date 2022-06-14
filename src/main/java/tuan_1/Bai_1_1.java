/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tuan_1;

import javax.swing.JTextArea;

/**
 *
 * @author DELL
 */
public class Bai_1_1 {
    //In ra màn hình tất cả các hợp số <100
    public static void main(String[] args) {
        int a,b, count = 0;
        for(a=1;a<=100;a++ ){
            count = 0;
            for(b=2;b<=a;b++){
                if(a%b == 0) 
                    count ++;
            }
            if(count > 1)
                System.out.print(a + " ");
        }
        //System.out.println(count );
    }
    
    public void run(JTextArea jta)
    {
        jta.append("Họ và tên : Nguyễn Huy Bách" + "\nMSSV: 20198205\n");
        jta.append("\nĐề bài: "+"In ra màn hình tất cả các hợp số <100\n");
        jta.append("\nBài làm " + "\nTất cả các hợp số <100 là: \n");
        int a,b, count = 0;
        for(a=1;a<=100;a++ ){
            count = 0;
            for(b=2;b<=a;b++){
                if(a%b == 0) 
                    count ++;
            }
            
            if(count > 1){              
            if( a % 10 == 0){
                jta.append("\n");
            }
                jta.append( a + " ");
            }
        }
        
        
    }
}
