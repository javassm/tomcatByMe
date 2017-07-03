
public abstract class swbServlet {
  public abstract void doGet(swbRequest swbRequest,swbResponse swbResponse);
  public abstract void doPost(swbRequest swbRequest,swbResponse swbResponse);
  public void service(swbRequest swbRequest,swbResponse swbResponse){
	  if("GET".equals(swbRequest.getMethod())){
		  doGet(swbRequest,swbResponse);
	  }else{
		  doPost(swbRequest, swbResponse);
	  }
  }
  
	
}
