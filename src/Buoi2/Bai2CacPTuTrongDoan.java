package Buoi2;

import java.util.Scanner;
 

public class Bai2CacPTuTrongDoan {
	public void xuat(int a[]) {
		int sum=0;
		for(int i=0;i<5;i++) {
			System.out.println(a[i]+" ");
		}
		
	}
	public int tong(int a[]) {
		int sum=0;
		for(int i=0;i<5;i++) {
			sum +=a[i];
		}
		return sum;
	}
	public int tongD(int a[], int x,int y) {
		int sum=0;
		for(int i=x;i<y;i++) {
			sum +=a[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		
		Scanner src= new Scanner(System.in);
		
		int[] a = new int[5];
		
		for(int i=0;i<5;i++) {
			a[i]= src.nextInt();
			}
		
		
	}

}
