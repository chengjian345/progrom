package Com.net.chat;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPseriver {

	public static void main(String[] args) throws Exception {
		//创建服务器套接字
		ServerSocket fwqtjz = new ServerSocket(8899);
		//在死循环里不断监听
		while(true){
			//获取客户端套接字
			Socket khdtjz=fwqtjz.accept();
			
			//通过客户端套接字获取客户端的IP地址
			String ip=khdtjz.getInetAddress().getHostAddress();
			//通过客户端套接字获取客户端的端口号
			int port=khdtjz.getPort();
			System.out.println("和客户端ip地址是"+ip+",端口是"+port+"连接上了");
			String xinxi="客户端你好,来自服务的问候";
			//通过客户端套接字获取输入流
			OutputStream os=khdtjz.getOutputStream();
			//通过输入流写入到网络中
			os.write(xinxi.getBytes());
		}
	}
}
