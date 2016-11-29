package IR;

import java.util.Arrays;

public class MacAddress extends IR {

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
		return "MacAddress [arr=" + Arrays.toString(arr) + "]";
	}
}
