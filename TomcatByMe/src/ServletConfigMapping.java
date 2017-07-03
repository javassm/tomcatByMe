import java.util.ArrayList;
import java.util.List;

public class ServletConfigMapping {
 private  static List<swbServletConfig> configs=new ArrayList<>();
 static{
	 configs.add(new swbServletConfig("swbservlet", 
			 "/swb",
			 "swbCourrentServlet"));
 }
 
 public static List<swbServletConfig> getConfigs(){
	 return configs;
 }
}
