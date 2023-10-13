package HackerRank;

import java.util.ArrayList;
import java.util.List;

public class Proprostions {
	
	    /*
	     * Complete the 'plusMinus' function below.
	     *
	     * The function accepts INTEGER_ARRAY arr as parameter.
	     */

	    public static void main(String[] args) {
	    	
	    	List <Integer> arr=new ArrayList();
	    	
//	      arr.add(-4);
//	      arr.add(3);
//	      arr.add(-9);
//	      arr.add(0);
//	      arr.add(4);
//	      arr.add(1);
//	     double positive=0;
//	     double negative=0;
//	     double zero=0;
//	     
//	     int count1=0;
//	     int count2=0;
//	     int count3=0;
//	     
//	         for(int i=0;i<arr.size();i++){
//	            Object obj= arr.get(i);
//	            int num=(int)obj;
//	            if(num>0){
//	                count1++;
//	                positive=(double)count1/arr.size();
//	              
//	            }
//	            else if(num<0){
//	            
//	                count2++;
//	                negative=(double)count2/arr.size();
//	            }
//	            else{
//	                
//	                count3++;
//	                zero=(double)count3/arr.size();
//	            }
//	         }
//	         
//	         System.out.println(String.format("%.6f", positive));
//	         System.out.println(String.format("%.6f", negative));
//	         System.out.println(String.format("%.6f", zero));
	    	
	    	
	    	arr.add(1);
	        arr.add(2);
	        arr.add(3);
	        arr.add(4);
	        arr.add(5);
	       
	       // for minimum
	       int max=(int)arr.get(1);
	        for(int i=0;i<arr.size();i++){
	            int a=arr.get(i);
	            if(max<a){
	                max=a;
	            }
	        }
	        int minSum=0;
	        for(int i=0;i<arr.size();i++){
	            int a=(int)arr.get(i);
	            if(a!=max){
	                minSum=minSum+a;
	            }
	        }
	        
	        // for max
	       int min=(int)arr.get(1);
	        for(int i=0;i<arr.size();i++){
	            int a=arr.get(i);
	            if(min>a){
	                min=a;
	            }
	        }
	        int maxSum=0;
	        for(int i=0;i<arr.size();i++){
	            int a=(int)arr.get(i);
	            if(a!=min){
	                maxSum=maxSum+a;
	            }
	        }
	        
	        System.out.println(minSum+"\t"+maxSum);
	    }

	}
