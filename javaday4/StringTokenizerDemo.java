package javaday4;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
	/// Efficient than String Buffer
      public static void main(String[] args) {
		String message="String is immutable whereas StringTokenizer:is:mutable";
		StringTokenizer st=new StringTokenizer(message);
		System.out.println(st.countTokens());
		int totalToken=st.countTokens();
		int count=0;
		while(st.hasMoreTokens())
		{
			count++;
		System.out.println(count+":"+st.nextToken());
		}
		System.out.println("Total words are: "+totalToken);
	}
}
