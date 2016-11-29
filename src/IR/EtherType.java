package IR;

public class EtherType  extends IR{
	
	private NP2HexaDecimal hd;
	
	public EtherType(NP2HexaDecimal hd){
		this.hd = hd;
	}
	
	public NP2HexaDecimal getNP2HexaDecimal(){
		return this.hd;
	}
	
	public void setNP2HexaDecimal(NP2HexaDecimal hd){
		this.hd = hd;
	}
	
	public String toString(){
		return hd.toString();
	}
}
