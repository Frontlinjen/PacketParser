
public class NP2HexaDecimal {
	private char[] c;

	public NP2HexaDecimal(char[] c) throws IllegalArgumentException{
		this.c = c;
		for (char d : c) {
			if(isValidHexa(d)){
				throw new IllegalArgumentException("You dun fucked it up");
			}
		}
	}
	
	private boolean isValidHexa(char c)
	{
		c = Character.toLowerCase(c);
		return (c >= 'a' && c <= 'f') || Character.isDigit(c);
	}
	
	public String getHexaDecimal(){
		return new String(c);
	}
	public int getDecimalValue(){
		int result = 0;
		for (int i = 0; i < c.length; i++) {
			if(Character.isAlphabetic(c[i])){
				result += (int) ((Character.toUpperCase(c[i])-31)*Math.pow(16, i));
			}
			else{
				result += (int) (c[i]*Math.pow(16, i));
			}
		}
		return result;
	}
}
