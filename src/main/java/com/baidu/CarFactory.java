package com.baidu;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * 车工厂
 */
public class CarFactory {

    public Object productCar(String name,String path) {
//        if (name.equalsIgnoreCase("benchi")){
//            return new BenChi();
//        }else if (name.equalsIgnoreCase("dazhong")){
//            return new Dazhong();
//        }
//        return null;

//        try {
//            return (Car) Class.forName(name).newInstance();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
        Map<String, String> map = Utils.getMap(path);
        String className = map.get(name);
        try {
            return  Class.forName(className).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }


}
