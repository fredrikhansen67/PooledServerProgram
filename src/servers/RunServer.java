package servers;

/**
 * Created by fredrik on 2017-10-16.
 */
public class RunServer {

public static void main(String args[]) {
    ThreadPooledServer server = new ThreadPooledServer(9000);
    new Thread(server).start();

    try {
        System.out.println("Server started...");
        Thread.sleep(20 * 1000);
    } catch (InterruptedException e) {
        System.out.println("Ooops!");
        e.printStackTrace();
    }
    System.out.println("Stopping Server");
    server.stop();
    }
}
