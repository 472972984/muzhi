package indi.chq.test;
import com.muzhi.common.util.FastDFSClient;

public class FastDFSTest {

	public static void main(String[] args) throws Exception {
		testFastDfsClient();
		
	}
	
	public static void testFastDfsClient() throws Exception {

		// FastDFSClient fastDFSClient = new FastDFSClient("classpath:properties/client.conf");
		FastDFSClient fastDFSClient = new FastDFSClient(
				"D:\\MyEclipse workspace\\muzhi-manager\\muzhi-manager-web\\src\\main\\resources\\properties\\client.conf");
		String url = "http://192.168.171.129/"+fastDFSClient.uploadFile("C:\\Users\\47297\\Pictures\\Saved Pictures\\ssm.jpg", "jpg");
		System.out.println(url);

	}
	
}
