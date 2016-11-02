package IR;

public class EtherType  extends IR{
	
	private String hd;
	
	public EtherType(String hd){
		this.hd = hd;
	}
	
	public String getNP2HexaDecimal(){
		return this.hd;
	}
	
	public void setNP2HexaDecimal(String hd){
		this.hd = hd;
	}
	
}
