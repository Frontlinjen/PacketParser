<<<<<<< HEAD
package IR;
=======
>>>>>>> branch 'master' of https://github.com/Frontlinjen/PacketParser.git

public class NP2HexaDecimal {
	private char s1, s2;

	public NP2HexaDecimal(char s1, char s2){
		this.s1 = s1;
		this.s2 = s2;
	}
	
	private boolean isValidHexa(char c)
	{
		c = Character.toLowerCase(c);
		return (c >= 'a' && c <= 'f') || Character.isDigit(c);
	}
	public NP2HexaDecimal(String s){
		this.s1 = s.charAt(0);
		this.s1 = s.charAt(1);
	}
	
	public String getHexaDecimal(){
		return new String(new char[] {s1, s2}, 0, 2);
	}
	public int getDecimalValue(){
		int first = 0;
		int second = 0;
		if(Character.isAlphabetic(s1)){
			first = (int) ((Character.toUpperCase(s1)-31)*Math.pow(16, 0));
		}
		else{
			first = (int) (s1*Math.pow(16, 0));
		}
		if(Character.isAlphabetic(s2)){
			second = (int) ((Character.toUpperCase(s2)-31)*Math.pow(16, 1));
		}
		else{
			second = (int) (s2*Math.pow(16, 0));
		}
		return first + second;
	}
}
