import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author shengwenbo
 *
 */
public class swbTomcat {
  private int port=8080;
  private Map<String, Class<swbServletConfig>> sevletMap=new HashMap<String, Class<swbServletConfig>>();
  public  swbTomcat(int port){
	  this.port=port;
  }
  public swbTomcat() {
	  
	  
  }
  public void start() throws IOException, ClassNotFoundException{
	  ServerSocket serverSocket=new ServerSocket(port);
	  System.out.println("tomcat is start"+this.port);
	  initServlet();
	  while(true){
		  Socket socket=  serverSocket.accept();
		  swbRequest request=new swbRequest(socket.getInputStream());
		  
		  swbResponse response=new swbResponse(socket.getOutputStream());
			dispatch(request,response);
			socket.close();
		
	  }
	
  }
  public  void dispatch(swbRequest swbRequest,swbResponse swbResponse){
	Class<?> clazz=sevletMap.get(swbRequest.getUrl());
	
		try {
			if(null!= clazz){
			swbCourrentServlet swbCourrentServlet=(swbCourrentServlet) clazz.newInstance();
			swbCourrentServlet.service(swbRequest, swbResponse);
			}else{
				swbResponse.write("404  not found");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			swbResponse.write("404  not found"+Arrays.toString(	e.getStackTrace()));
		
		} 
		
	
	  swbCourrentServlet servlet1=new swbCourrentServlet();
	  servlet1.service(swbRequest, swbResponse);
  }
  

private void initServlet() throws ClassNotFoundException{
	  for(swbServletConfig servletConfig:ServletConfigMapping.getConfigs()){
		  sevletMap.put(servletConfig.getUrlmapping(), (Class<swbServletConfig>) Class.forName(servletConfig.getClazz()));
	  }
  }
  public static void main(String []args) throws IOException, ClassNotFoundException{
	  new swbTomcat().start();
  }
}
