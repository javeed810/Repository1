
public class ReverseString {
	public static String reverseWord(String str)
	{
		char ch[]=str.toCharArray();
		char temp;
		for(int i=0;i<ch.length/2;i++)
		{
			temp=ch[i];
			ch[i]=ch[ch.length-1-i];
			ch[ch.length-1-i]=temp;
		}
		String str1=new String(ch);
		return str1;
	}
	public static void main(String[] args) {
		ReverseString rs=new ReverseString();
		String strr=rs.reverseWord("my name is khan");
		System.out.println(strr);
	}

}
