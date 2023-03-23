package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MinimumPrice {
	
	public static void countSwaps(List<Integer> a) {
	    // Write your code here
	    int count=0;
	        for(int i=0;i<a.size()-1;i++){
	            for(int j=i+1;j<a.size();j++){
	                if(a.get(i)>a.get(j)){
	                    int temp= a.get(i);
	                    a.set(i, a.get(j));
	                    a.set(j, temp);
	                    count++;
	                }
	            }
	        }
	        System.out.println("list: "+a);
	        System.out.println("Array is sorted in "+count+" swaps.");
	        System.out.println("First Element: "+a.get(0));
	        System.out.println("Last Element: "+a.get(a.size()-1));
	    }
	public static int maxToys(List<Integer> prices, int k) {
		int count=0;
	    int totalPrice=0;
	    Collections.sort(prices);
	    for(int i=0;i<prices.size();i++){
	        if(prices.get(i)<k){
	            if((totalPrice+prices.get(i))<k){
	                totalPrice+=prices.get(i);
	                count++;
	            }
	            else{
	                break;
	            }
	        }
	    }
	    System.out.println(prices);
	    System.out.println(totalPrice);
	    System.out.println(count);
	    return count;
	}

	public static void main(String[] args) {
//		 Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int m1=sc.nextInt();
//         int p1=sc.nextInt();
//         int  m2=sc.nextInt();
//         int p2=sc.nextInt();
//         int price=0;
//         double div1=(double)p1/m1;
//         double div2= (double)p2/m2;
//         System.out.println("p1/m1"+(div1));
//         
//         System.out.println("p2/m2"+div2);
//         if(div1>div2) {
//        	 int remainder= (n)%m2;
//        	 price+= ((n-m1)/m2)*p2;
//        	 price+=remainder*m1;
//         }
//         else {
//        	 int remainder= (n)%m1;
//        	 price+= ((n-m2)/m1)*p1;
//        	 price+=remainder*p2;
//         }
//         System.out.println("price: "+price);
         
         List<Integer> l= new ArrayList<>();
         l.add(3);
         l.add(7);
         l.add(2);
         l.add(9);
         l.add(4);
         maxToys(l, 15);
         
//         countSwaps(l);

	}

}
