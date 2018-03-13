/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jealcode.hibernate.app;

import jealcode.hibernate.entities.Auto;
import jealcode.hibernate.manager.SessionManager;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *       //revisar java funcional
 *
 * @author educacionit
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SessionFactory factory = SessionManager.getSessionFactory();
        Session session = factory.openSession();
        Transaction transaction;
        Auto auto;
        Query query;
        switch (4) {
            case 1:
                //Metodo para agregar un auto simple
                auto = new Auto("Mazda", "5");
                transaction = session.beginTransaction();
                session.save(auto);
                transaction.commit();
                session.close();
                factory.close();
                break;
            case 2:
                //Metodo para actualizar
                auto = new Auto("Mazda", "5");
                auto.setId(1L);
                transaction = session.beginTransaction();
                session.update(auto);
                transaction.commit();
                session.close();
                factory.close();
                break;
            case 3:
                //Metodo para borrar
                auto = new Auto("Mazda", "5");
                auto.setId(1L);
                transaction = session.beginTransaction();
                session.delete(auto);
                transaction.commit();
                session.close();
                factory.close();
                break;
            case 4:
                query = session.createQuery("SELECT COUNT(alias) FROM Auto alias");
                Long count = (Long) query.uniqueResult();
                System.out.println(count);
                session.close();
                factory.close();
                break;
            case 5:
                query = session.createQuery("SELECT MAX(alias.au_id) FROM Auto alias");
                Long max = (Long) query.uniqueResult();
                System.out.println(max);
                session.close();
                factory.close();
                break;

        }
        /*
        auto = new Auto("Mazda", "5");
        //auto.setAu_id(1L);
        Query query = session.createQuery("FROM Auto a WHERE a.au_modelo in(:modelos)");
        List<String> modelos = new ArrayList<>();
        modelos.add("5");
        query.setParameterList("modelos", modelos);
        //  Query query = session.createQuery("FROM Auto a WHERE a.au_marca = :marca AND a.au_modelo = :modelo ORDER BY au_id DESC");
        //  query.setParameter("marca", "Fiat");
        // query.setParameter("modelo", "Punto");
        // Query query = session.createQuery("FROM Auto");
        List<Auto> autos = query.list();
        autos.forEach(System.out::println);
        session.close();
        factory.close();

        /*
        Transaction transaction = session.beginTransaction();
        try {
            session.save(auto);
            //  session.delete(auto);
            transaction.commit();

            Auto auto2 = (Auto) session.get(Auto.class, 2L);
            System.out.println(auto2);
        } catch (HibernateException exception) {
            //transaction.rollback();
        } finally {
            session.close();
            factory.close();
        }*/
    }
}
