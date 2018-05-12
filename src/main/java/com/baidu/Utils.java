package com.baidu;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Utils {

    public static Map<String, String> getMap(String path) {
        SAXReader reader = new SAXReader();
        Map<String,String> map = new HashMap();
        try {
            Document document = reader.read(new File(path));
            Element beans = document.getRootElement();
            Iterator iterator = beans.elementIterator();
            while (iterator.hasNext()){
                Element bean =(Element) iterator.next();
                String id = bean.attributeValue("id");
                String clazz = bean.attributeValue("class");
                map.put(id,clazz);
            }

        } catch (DocumentException e) {
            e.printStackTrace();
        }
        return map;
    }
}
