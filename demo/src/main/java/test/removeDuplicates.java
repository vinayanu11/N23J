package test;

public class removeDuplicates {

	public static void main(String[] args) {
		String str="aabbcd";
		String result="";
		
		for(int i=0;i<str.length();i++)
		{
			String ch=""+str.charAt(i);
			if(result.contains(ch))
			{
				continue;
			}
		
		result=result+ch;
		}
			 
			System.out.println(result);
			
		}

	}



