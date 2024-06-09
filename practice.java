package exception;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class practice{
	
	public void gcdOrHcf(int num1, int num2) {
		
		
		List<Integer> num1Factors=new LinkedList<>();
		List<Integer> num2Factors=new LinkedList<>();
		
		for(int i=1; i<=num1;i++) {
			if(num1%i==0) {
				num1Factors.add(i);
			}
		}
		System.out.println("facots of number: "+num1 +" are "+num1Factors );
		for(int i=1; i<=num2;i++) {
			if(num2%i==0) {
				num2Factors.add(i);
			}
		}
		System.out.println("facots of number: "+num2 +" are "+num2Factors );
		
		for(int i=num1Factors.size()-1;i>=0;i--) {
			if(num2Factors.contains(num1Factors.get(i))){
				System.out.println("GDC OR HCF of "+num1 +" and " +num2 +" is: "+num1Factors.get(i));
				break;
				
			}
		}
		
		
	}
	public void easyMethod(int num1,int num2) {
		int GCD=1;
		int forLoopMaxIteration;
		if(num1<num2) {
			forLoopMaxIteration=num1;
		}
		else {
			forLoopMaxIteration=num2;
		}
		for(int i=1;i<=forLoopMaxIteration;i++) {
			if(num1%i==0 && num2%i==0) {
				GCD=i;
			}
		}
		
		System.out.println("GDC OR HCF of "+num1 +" and " +num2 +" is: "+GCD);
		
	}
	
	public void armStrong(int num) {
		int armStrong=0;
		int newNum=num;
		String strNum=String.valueOf(num);
		while(newNum>0) {
			int digit=newNum%10;
			armStrong+=Math.pow(digit, strNum.length());
			newNum/=10;
		}
		if(num==armStrong) {
			System.out.println("True");
		}
		else {
			System.out.println("false");
		}
	}
	// https://www.geeksforgeeks.org/problems/sum-of-all-divisors-from-1-to-n4738/1
	public void sumOfDivisorsAndMore(int num) {
		
		int sum=0;
		for(int i=1;i<=num;i++) {
			
			sum+=(int) (i*Math.floor(num/i));
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		
		practice obj= new practice();
		obj.gcdOrHcf(10,5);
		obj.easyMethod(10,5);
		obj.armStrong(8208);
		obj.sumOfDivisorsAndMore(5);
		int num=9646324;
		num=Math.abs(num);
		int num1=12;
		int reverseNum=0;
		String reverse="";
		while(num!=0) {
			int rem=num%10;
			reverse+=rem;
			
			num=num/10;
		}
		//int finalNum=String.valueOf(reverse);
		
		System.out.println(Integer.valueOf(reverse));
		//System.out.println(reverseNum);
		
		
		for(int i=0; i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		Map<String,Integer> wordOccurences = new HashMap<>();
		
		String sentence="I am Java developer I am proud of it";
		
		for(String word: sentence.split(" ")) {
			wordOccurences.put(word, wordOccurences.getOrDefault(word, 0)+1);
		}
		
		System.out.println(wordOccurences);
		
		
		int lowerRange=10;
		int upperRange=20;
		int counter=0;
		for(int i=10;i<=20;i++) {
			
		}
	}
}
