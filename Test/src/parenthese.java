import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class parenthese {
    private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {


	        String inputSentence ="((()))";
	        		
	        		//"(I want (to write a language parser),would (you) help me)";
	        int openingBraceNum = 2;

	        int res = closingBracePosition(inputSentence, openingBraceNum);
	        System.out.println(res);

	}

	private static int closingBracePosition(String str, int openingBraceNum) {
		 int n=str.length();
		 System.out.println(n);
	      int open=0,close=0,count=0,pos=0;
	        boolean flag=false;
	      for(int i=0;i<n;i++){
	          if(str.charAt(i)=='(')
	              open++;
	          else if(str.charAt(i)==')')
	             close++; 
	      }
	        if(open==close){
	              for(int i=0;i<n;i++){
	          if(str.charAt(i)=='(')
	              count++;
	            if(count==openingBraceNum)  {
	                pos=i;
	                flag=true;
	                for(int k=pos+1;k<n;k++){
	                    if(str.charAt(k)=='(')
	                        flag =false;
	                    else if(!flag && str.charAt(k)==')')
	                        flag=true;
	                    else if(flag && str.charAt(k)==')')
	                    {
	                        pos=k;
	                        return pos+1;
	                     
	                    }
	                        
	                }
	            }    
	              }      
	        }
	    
	        
	      return -1;
	    }


	

}
