# Network in Java

Java networking is a concept of connection two or more different devices together. In this way, we can share data.

## Socket

Socket is used for communication between application.

```java
import java.net.ServerSocket;
import java.net.Socket;

public class MainClassServerSocket {
  public static void main(String[] args) {
    ServerSocket serverSocket = null;
    Socket socket = null;

    try {
      serverSocket = new ServerSocket(9000);
      System.out.println("ready to get client-side request");

      socket = serverSocket.accept();
      System.out.println("connect with client-side");
      System.out.println("socket : " + socket);
    } catch (Exception e) {
      e.printStackTrece();
    } finally {
      try {
        if(socket != null) socket.close();
        if(serverSocket != null) serverSocket.close();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}
```

