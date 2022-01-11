// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;
public class MyClass{
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int inputarr[]=new int[n];
        for(int i=0;i<n;i++){
            inputarr[i]=sc.nextInt();
        }
        Arrays.sort(inputarr);
        Set<List<Integer>> triplet=new HashSet<List<Integer>>();
        for(int i=0;i<n;i++){
           int j=i+1,k=n-1,sum=0;
           while(j<k){
            sum=inputarr[i]+inputarr[j]+inputarr[k];
               if(sum==0){
                   triplet.add(Arrays.asList(inputarr[i],inputarr[j++],inputarr[k--]));
                }
                else if(sum<0){
                   j++;
                }else{
                 k--;
                }
           }
        }
        
        for(List l:triplet){
            System.out.println(l);
            
        }
    }
}