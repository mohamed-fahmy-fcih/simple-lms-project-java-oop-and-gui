
package MainPage;
import HomePages.*;
import java.awt.*;
import java.net.URL;
public class MainRun {

    public static void main(String[] args) {

        URL url = HomeUser.class.getResource("icon1.png");
        MainRun.setIcon(url);

        HomeUser home = new HomeUser();
        home.setLocationRelativeTo(null);
        home.setVisible(true);
    }
        public static Image setIcon(URL url)
        {
                Image  img  =  Toolkit.getDefaultToolkit().getImage(url);
                return img ;
         }
    
}
