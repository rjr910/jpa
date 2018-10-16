import org.hsqldb.server.Server;

public class HSQLDBServer {

	public static void main(String[] args) {

		Server server = new Server();
		server.setDatabaseName(0, "JPADB");

		server.setDatabasePath(0, "db");
		int returnValue = server.start();
		System.out.println("Return Value= " + returnValue);
	}

}
