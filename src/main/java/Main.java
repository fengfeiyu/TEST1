import com.baidu.Car;
import com.baidu.CarFactory;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.*;

public class Main {

    public static void main(String[] args) {
//
//        Car benchi = new BenChi();
//        benchi.run();
//        Car dazhong = new Dazhong();
//        dazhong.run();
//        CarFactory factory = new CarFactory();
////        Car dazhong = factory.productCar("com.baidu.Dazhong");
////        dazhong.run();
        CarFactory carFactory = new CarFactory();
        Car dazhong =(Car) carFactory.productCar("dazhong", "F:\\TEST\\src\\main\\java\\com\\baidu\\product.xml");
        dazhong.run();
    }
}
