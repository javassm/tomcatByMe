
public class swbCourrentServlet extends swbServlet{

	@Override
	public void doGet(swbRequest swbRequest, swbResponse swbResponse) {
		// TODO Auto-generated method stub
	swbResponse.write("get response");
	}

	@Override
	public void doPost(swbRequest swbRequest, swbResponse swbResponse) {
		// TODO Auto-generated method stub
		swbResponse.write("post response");
	}

}
