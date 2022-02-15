package day02_driverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//1. Yeni bir Class olusturalim.C07_ManageWindowSet
public class C07_ManageWindowSet {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver_win32 (1)/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        //2. Amazon soyfasina gidelim. https://www.amazon.com/

        driver.get("https://www.amazon.com");

        //3. Sayfanin konumunu ve boyutlarini yazdirin

        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());

        //4. Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin

        driver.manage().window().setPosition(new Point(10,10));
        driver.manage().window().setSize(new Dimension(1050,708));

        //5. Sayfanin sizin istediginiz konum ve boyuta geldigini test edin

        int xKoordinati=driver.manage().window().getPosition().getX();
        int yKoordinati=driver.manage().window().getPosition().getY();
        int genislik=driver.manage().window().getSize().getWidth();
        int yukseklik=driver.manage().window().getSize().getHeight();

        Thread.sleep(5000);

        if (xKoordinati==10 && yKoordinati==10 && genislik==1050 && yukseklik==708){
            System.out.println("olceklendirme testi PASS");
        }else{
            System.out.println("Olceklendirme testi FAILED");
        }



        //8. Sayfayi kapatin

        driver.close();

    }
}
