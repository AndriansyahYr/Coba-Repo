/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AndoriGL
 */
import java.util.Scanner;
public class ABSYS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String arr[];
        int masuk=in.nextInt();
        arr=new String[masuk];
        for(int i=0;i<masuk;i++){
            arr[i] = in.next();
            stringMasuk(arr[i]);
        }
    }
    static void stringMasuk(String a){
		String test = "\\s	";
		String[] part = a.split(test);
		for(int i=0;i<part.length;i++){
			System.out.println(part[i]+" "); 
		}
    }
}
