import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class AutomatProxy implements Runnable {
    private Thread thread;
    Socket socket;
    InputStream in;
    PrintWriter out;
    int characters;

    public AutomatProxy(){
        try {
            socket = new Socket("127.0.0.1", 8765);
            System.out.println("Connecting....");
            in = socket.getInputStream();
            out = new PrintWriter(socket.getOutputStream(), true);

            thread = new Thread(this::run);
            thread.start();
        } catch (UnknownHostException e) {
            System.err.println("The server must be running.");
            System.err.println("Not connected.");
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
        if(socket != null && socket.isConnected()){
            System.out.println("Connected");
        }
    }

    public void gotApplication() {
        out.println("gotApplication");
    }

    public void checkApplication() {
        out.println("checkApplication");
    }

    public void rentApartment() {
        out.println("rentApartment");
    }

    @Override
    public void run() {
        try{
            while ((characters = in.read()) != -1){
                System.out.print((char) characters);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
