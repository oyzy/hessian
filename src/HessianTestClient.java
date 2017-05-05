import com.caucho.hessian.client.HessianProxyFactory;
import entity.HelloWord;
import service.HessianService;

import java.net.MalformedURLException;


public class HessianTestClient {
    public static void main(String[] args) {
        //在服务器端的web.xml文件中配置的HessianServlet映射的访问URL地址
        String url = "http://127.0.0.1:8080/hessian/hessian";
        HessianProxyFactory factory = new HessianProxyFactory();
        HessianService service = null;
        try {
            service = (HessianService) factory.create(HessianService.class, url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        //创建IService接口的实例对象
        HelloWord helloWord = null;
        if (service != null) {
            helloWord = service.sayHelloWord();
        }
        //调用Hessian服务器端的ServiceImpl类中的getUser方法来获取一个User对象
        if (helloWord != null) {
            System.out.println(helloWord.getName());
        }

    }

}


