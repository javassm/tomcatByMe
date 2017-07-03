import java.io.IOException;
import java.io.OutputStream;

/**
 * @author shengwenbo
 *
 */
public class swbResponse {
  public OutputStream outputStream;
  public  swbResponse(OutputStream outputStream){
	  this.outputStream=outputStream;
  }
  public  swbResponse(){
	 
  }
  public void write(String content ){
	  try {
		outputStream.write(content.getBytes());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
}
