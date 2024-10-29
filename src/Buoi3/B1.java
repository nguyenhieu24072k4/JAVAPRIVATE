package Buoi3;

import java.util.Scanner;

public class B1 {
    public static void Chuyen(int n){
       String[] ones = {"", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín","mười", "mười một", "mười hai", "mười ba", "mười bốn", "mười năm", "mười sáu", "mười bảy", "mười tám", "mười chín"};
    String[]  hunder = {"","một trăm","hai trăm","ba trăm","bốn trăm","năm trăm","sáu trăm","bảy trăm","tám trăm","chín trăm"};
    if (n==0)
    System.out.println("không"); 
  else if (n<20):
    System.out.println(ones[n]); 
  else if (n<100){
    int chuc = n/10;
    int dvi = n%10;
    System.out.println(ones[chuc] + " mươi " + ones[dvi]); 
  }
    
    
  else{
        int tram = n/100;
        
   int conLai = n%100;
    if(conLai==0)
    System.out.println(hunder[tram] ) 
    else System.out.println(hunder[tram] + " " + Chuyen(conLai));
  }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Chuyen(n);
    }
