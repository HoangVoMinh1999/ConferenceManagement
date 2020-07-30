/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.*;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author vomin
 */
public class userDAO {

    private Session session = null;

    public List<User> findAll() {
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();
        try {
            return session.createCriteria(User.class).list();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            session.close();
        }
    }

    public User find(String username) {
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();
        try {
            return (User) session.createCriteria(User.class).add(Restrictions.eq("username", username)).uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            session.close();
        }
    }
    
        public User findByID(int id) {
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();
        try {
            return (User) session.createCriteria(User.class).add(Restrictions.eq("idUser", id)).uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            session.close();
        }
    }

    public boolean delete(User cf) {
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();
        try {
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

    public boolean save(User cf) {
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();
        try {
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

    public boolean update(User cf) {
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();
        try {
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

    public boolean checkExistedUsername(String username) {
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();
        User temp = null;
        try {
            temp = (User) session.createCriteria(User.class).add(Restrictions.eq("username", username)).uniqueResult();
            if (temp != null) {
                return true;
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            session.close();
        }
    }

    public String hashPassword(String password) throws NoSuchAlgorithmException {

        MessageDigest md;
        md = MessageDigest.getInstance("SHA-512");

        byte[] hashedPassword = md.digest(password.getBytes(StandardCharsets.UTF_8));
        password = new String(hashedPassword, StandardCharsets.UTF_8);
        return password;
    }
}
