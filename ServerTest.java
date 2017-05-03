/**
 * Created by Alessandro Arosio on 02/05/2017.
 */
import javax.swing.*;

public class ServerTest {
    public static void main(String[] args){
        Server serverApp = new Server();
        serverApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        serverApp.startRunning();
    }
}
