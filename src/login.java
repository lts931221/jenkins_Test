import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class login {
    static WebDriver Driver;

    public static void beforeClass() {
        //设置驱动所在位置
        System.setProperty("webdriver.firefox.driver", "C:\\Program Files\\Mozilla Firefox\\Firefox.exe");
        System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Mozilla Firefox\\geckodriver.exe");
        //引用火狐浏览器驱动

        Driver = new FirefoxDriver();
        Driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        System.out.println("用例开始执行…………\n");
        Driver.manage().window().maximize();
    }
    
    public static void admin_login() {
        Driver.get("http://admin.xinanyuncai.com/login");
        try {
            Thread.sleep(2000);
            System.out.println("测试成功");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        login.beforeClass();
        login.admin_login();
    }


}
