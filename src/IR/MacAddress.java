package IR;

public class MacAddress {

	private Hexa[] arr;
	
	public MacAddress(Hexa a,Hexa b,Hexa c,Hexa d,Hexa e,Hexa f){
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
				arr[i] = Integer.parseInt(ip[i]);
			}
	}
}
