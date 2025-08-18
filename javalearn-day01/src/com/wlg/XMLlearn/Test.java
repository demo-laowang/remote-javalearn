package com.wlg.XMLlearn;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) throws DocumentException {
        //读取XML：
        //1.创建一个xml解析器对象：（就是一个流）
        SAXReader sr = new SAXReader();
        //2.读取xml文件，返回Document对象出来：
        Document dom = sr.read(new File("A:\\Git\\learn-java\\test\\javalearn-day01\\src\\students.xml"));
        System.out.println(dom);//这里相当于将整个文档封装为Document对象了
        //3.获取根节点：（根节点只有一个）
        Element studentsEle = dom.getRootElement();
        //4.获取根节点下的多个子节点
        Iterator<Element> it1 = studentsEle.elementIterator();
        while (it1.hasNext()) {
            //4.1 获取到子节点
            Element studentEle = it1.next();
            //4.2获取子节点的属性：
            List<Attribute> atts = studentEle.attributes();
            for (Attribute a : atts) {
                System.out.println("该子节点的属性：" + a.getName() + "---" + a.getText());
            }
            //4.3获取子节点的子节点：
            Iterator<Element> it2 = studentEle.elementIterator();
            while (it2.hasNext()) {
                Element eles = it2.next();
                System.out.println("节点：" + eles.getName() + "---" + eles.getText());
            }
              System.out.println();
        }
    }
}
