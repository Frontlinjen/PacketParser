package IR;

public class IPv4 extends IR{
	
	private int[] arr = new int[4];
	
	public IPv4(int a, int b, int c, int d){
		arr[0] = a;
		arr[1] = b;
		arr[2] = c;
		arr[3] = d; 
	}
	
	public IPv4(String st){
		String[] ip = st.split("\\.");
		for(int i=0; i<arr.length; i++){
			arr[i] = Integer.parseInt(ip[i]);
		}
	}
	@Override 
	public String toString() {
		return arr[0] + "." + arr[1] + "." + arr[2] + "." + arr[3];
	}
	
	public String toString(){
		return arr.toString();
	}
}
