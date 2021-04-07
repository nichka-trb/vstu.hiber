/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

import hiber.entity.Studentyi;
import Hiber.NewHibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Query;


public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        String hql = "FROM Studentyi";
       // String hql = "FROM Gruppyi WHERE nazvanie like 'A-%' ";
        Query query =  s.createQuery(hql);
        List <Studentyi> students = query.list();
       
        
        
        /* for(int i = 0; i < students.size(); i++){
        System.out.println(students.get(i).getFamiliya() +"\t " +students.get(i).getImya() 
                            +" " + students.get(i).getOtchestvo() +"\t " + students.get(i).getGruppyi().getNazvanie());
        }*/
    }
    
}
