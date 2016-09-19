package demo;
import java.util.Scanner;
public class FibonacciDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of N:");
		int N = sc.nextInt();
		int[] fibo={};
		if(N>0)
		{
			fibo = new int[N];
		}
		else
		{
			System.out.println("N>0 always !!");
		}

		int result = fibonacci(N);

		System.out.println("The fibonacci series is:");
		for(int i=0;i<N;i++)
			System.out.print(fibo[i]+"\t");

		sc.close();
	}

	public static int [] fibonacci(int n)
	{
		//int result;

		
		for(int i=0;i<n;i++)
		{
			if(i==0 || i==1)
			{
				fibo[i] = i;
			}
			else{
				
			}
			fibo[i]= fibonacci(i-1) +fibonacci(i-2);
		}
		if(n==0 || n==1)
		{
			return n;
		}
		else
		{
			return fibonacci(n-1) + fibonacci(n-2);
		}  
		//return result;
	}
}
