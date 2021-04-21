/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

import entity.Studentyi;
import Hiber.NewHibernateUtil;
import entity.Gruppyi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;



public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        Query query = s.createQuery("From Studentyi");
        Query query1 = s.createQuery("From Gruppyi");
        List <Studentyi> stds = query.list();
        List <Gruppyi> grup = query1.list();
        System.out.println("Задание 1. Вариант 9");
        for(Studentyi st: stds){
            System.out.println(st.getFamiliya() + " " + st.getImya() + " " + st.getOtchestvo() +
                    " учится в группе " + st.getGruppyi().getNazvanie());
                   }
        System.out.println("Задание 2. Вариант 9");
        for(Gruppyi g: grup){
            System.out.println("Группа " + g.getNazvanie() + " имеет " + g.getStudentyis().size() + " студента(ов).");
        }  }
    }
