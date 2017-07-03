
public class swbServletConfig {
    private  String name ;
    private  String urlmapping ;
    private  String clazz ;
    public swbServletConfig (String name,String urlmapping,String clazz ){
    	this.name=name;
    	this.urlmapping=urlmapping;
    	this.clazz=clazz;
    }
    
    
    
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getUrlmapping() {
		return urlmapping;
	}




	public void setUrlmapping(String urlmapping) {
		this.urlmapping = urlmapping;
	}




	public String getClazz() {
		return clazz;
	}
	public void setClazz(String clazz) {
		this.clazz = clazz;
	}
    
}
