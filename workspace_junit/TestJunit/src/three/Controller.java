package three;

public interface Controller {
	Response processRequest(Request request);
	void addHandler(Request request, RequestHandler requestHander);

}
