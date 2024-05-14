package week1.day1;

public class Fibonacci {

	public static void main(String[] args) {
		int C=1;
		int P=0;
		System.out.println(P );
		System.out.println(C );
		int next = 0;
		 while (next <30) {
		next = C + P;
		System.out.println(next);
		P = C;
		C = next;
			}

	}
		}
	

