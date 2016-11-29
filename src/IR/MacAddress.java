package IR;

import java.util.Arrays;

public class MacAddress extends IR {
	public static void main (String[]args){
		MacAddress a = new MacAddress("ab:24:12:af:1a:2a");
		MacAddress b = new MacAddress(new NP2HexaDecimal("a1"), new NP2HexaDecimal("ab"), new NP2HexaDecimal("ff"), new NP2HexaDecimal("12"), new NP2HexaDecimal("45"), new NP2HexaDecimal("11"));
		
		System.out.println(a.toString() + "    " + b.toString());
	}
	private NP2HexaDecimal[] arr = new NP2HexaDecimal[6];
	
	public MacAddress(NP2HexaDecimal a,NP2HexaDecimal b,NP2HexaDecimal c,
						NP2HexaDecimal d,NP2HexaDecimal e,NP2HexaDecimal f){
		arr[0] = a;
		arr[1] = b;
		arr[2] = c;
		arr[3] = d;
		arr[4] = e;
		arr[5] = f;
	}
	public MacAddress(String st){
		String[] MacAdd = st.split(":");
			for(int i=0; i<MacAdd.length; i++){
				arr[i] = new NP2HexaDecimal(MacAdd[i].toCharArray());
			}
	}
	@Override
	public String toString() {
		String hex = "";
		for (int i = 0; i < arr.length-1; i++) {
			hex = hex + arr[i] + ":";
		}
		hex  += arr[arr.length-1];
		return hex;
		 
	};
}
