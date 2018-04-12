import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class SpecialNumber {

	public static void main(String[] args) throws IOException {
		BufferedReader  br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			String str[]=br.readLine().split(" ");
			int n=Integer.parseInt(str[0]);
			int m=Integer.parseInt(str[1]);
			int count=0;
			for(int i=n;i<=m;i++) {
				
				String bin=Integer.toBinaryString(i);
				int len=bin.length();
				if(bin.contains("1")) {
				if(allSet(i)||setFollowedUnset(bin,len)||increaseSet(i))
					count++;
				}
			}
			
			System.out.println(count);	
				
			}

	}

	private static boolean increaseSet(int n) {
		
	    int prev_count = Integer.MAX_VALUE;
	 

	    while (n > 0)
	    {
	      
	        while (n > 0 && n % 2 == 0)
	           n = n/2;
	 
	        int curr_count = 1;
	        while (n > 0 && n % 2 == 1)
	        {
	            n = n/2;
	            curr_count++;
	        }
	 
	    
	        if (curr_count >= prev_count)
	            return false;
	        prev_count = curr_count;
	    }
	 
	    return true;
	}

	private static boolean setFollowedUnset(String bin,int len) {
		int pos=0;
		for(int i=0;i<len;i++) {
		/*	if(bin.charAt(i)=='1')
				continue;*/
			 if(bin.charAt(i)=='0') {
				pos=i;
				break;
			}
		}
		for(int i=pos+1;i<len;i++) {
			if(bin.charAt(i)=='1')
				return false;
		}
		return true;
	}

	private static boolean allSet(int bin) {
		if(bin==0)
			return false;
			if(((bin+1)&bin)==0)
				return true;
		
		return false;
	}
	
}
