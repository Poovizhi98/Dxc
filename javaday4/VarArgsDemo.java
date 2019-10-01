package javaday4;

public class VarArgsDemo {
	
	public static int sum(int...numbers)
	{
		int sum=0;
		for(int i:numbers)
		{
			sum=sum+i;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(8,8,8,8,8,8,8,88,8,8));
		System.out.println(sum(23,89,67));
		System.out.printf("the sum is %d", sum(8,8));

	}

}
