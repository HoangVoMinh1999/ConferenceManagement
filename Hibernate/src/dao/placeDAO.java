/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.Place;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author vomin
 */
public class placeDAO {

    private Session session = null;

    public List<Place> findAll() {
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            Transaction trans = session.beginTransaction();
            return session.createCriteria(Place.class).list();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            session.close();
        }
    }

    public Place find(int id) {
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            Transaction trans = session.beginTransaction();
            return (Place) session.createCriteria(Place.class).add(Restrictions.eq("idPlace", id)).uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            session.close();
        }
    }

    public boolean delete(Place cf) {
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            Transaction trans = session.beginTransaction();
            session.delete(cf);
            trans.commit();
            System.out.println("Delete successfully !!!");
            return true;
        } catch (Exception e) {
            System.out.println("Delete unsuccessfully !!!");
            e.printStackTrace();
            return false;
        } finally {

        }
    }

    public boolean save(Place cf) {
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            Transaction trans = session.beginTransaction();
            session.save(cf);
            trans.commit();
            System.out.println("Save successfully !!!");
            return true;
        } catch (Exception e) {
            System.out.println("Save unsuccessfully !!!");
            e.printStackTrace();
            return false;
        } finally {
            session.close();
        }
    }

    public boolean update(Place cf) {
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            Transaction trans = session.beginTransaction();
            session.update(cf);
            trans.commit();
            System.out.println("Update successfully !!!");
            return true;
        } catch (Exception e) {
            System.out.println("Update unsuccessfully !!!");
            e.printStackTrace();
            return false;
        } finally {
            session.close();
        }
    }
}
