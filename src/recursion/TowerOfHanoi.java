package recursion;

import java.util.Scanner;

public class TowerOfHanoi {

	private void hanoi(int n, char from, char to, char aux){
		if(n==1){
			System.out.println("Move disk 1 from " + from + " -> " + to );
		} else {
		hanoi(n-1, from, aux, to);
		System.out.println("Move disk " + n + " from " + from + " -> " + to);
		hanoi(n-1, aux, to, from);
		}
	}
	
	public static void main(String[] args){
		
		System.out.println("Enter numer of disks");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		TowerOfHanoi towerOfHanoi = new TowerOfHanoi();
		towerOfHanoi.hanoi(n, 'A', 'B', 'C');
	}
}
