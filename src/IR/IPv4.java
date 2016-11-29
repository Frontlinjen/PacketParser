package IR;

public class IPv4 extends IR{
	
	private int[] arr; 
	
	public IPv4(int a, int b, int c, int d){
		arr[0] = a;
		arr[1] = b;
		arr[2] = c;
		arr[3] = d; 
	}
	
	public IPv4(String st){
		String[] ip = st.split(".");
		for(int i=0; i<ip.length; i++){
			arr[i] = Integer.parseInt(ip[i]);
		}
	}
	
	public String toString(){
		return arr.toString();
	}
}
