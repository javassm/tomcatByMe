import java.io.IOException;
import java.io.InputStream;

/**
 * @author shengwenbo
 *
 */
public class swbRequest {
	  private InputStream  inputStream;
	  private String url;
	  private String method;
	  
	  public swbRequest(InputStream inputStream){
		  this.inputStream=inputStream;
		  String content=null;
		  byte[] buff=new byte[1024];
		  int len=0;
		  try {
			if((len=inputStream.read(buff))>0){
				  content=new String(buff, 0, len);
			  }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   
		  
		  System.out.println(content);
		  extractFileds(content);
	  }
	  
	  public void extractFileds(String content){
		  String command=content.split("\n")[0];
		  String[] words=command.split("\\s");
		  
		  setMethod(words[0]);
		  setUrl(words[1]);
	  }
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
}
