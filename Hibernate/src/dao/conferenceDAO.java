/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import entities.*;
import java.util.List;
import org.hibernate.*;
import org.hibernate.criterion.Restrictions;
/**
 *
 * @author vomin
 */
public class conferenceDAO {
    private Session session = null;
    
    public List<Conference> findAll(){
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            Transaction trans = session.beginTransaction();
            return session.createCriteria(Conference.class).list();
        }catch(Exception e){
            e.printStackTrace();
            return null;
        } finally {
           session.close();
        }
    }
    
    public Conference find(int id){
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            Transaction trans = session.beginTransaction();
            return (Conference) session.createCriteria(Conference.class).add(Restrictions.eq("idConference",id)).uniqueResult();
        } catch (Exception e){
            e.printStackTrace();
            return null;
        } finally{
            session.close();
        }
    }
    
        public List<Conference> findByPlace(Place place){
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            Transaction trans = session.beginTransaction();
            return session.createCriteria(Conference.class).add(Restrictions.eq("place",place)).list();
        } catch (Exception e){
            e.printStackTrace();
            return null;
        } finally{
            session.close();
        }
    }
    
    public boolean delete(Conference cf){
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            Transaction trans = session.beginTransaction();
            session.delete(cf);
            trans.commit();
            System.out.println("Delete successfully !!!");
            return true;
        } catch (Exception e){
            System.out.println("Delete unsuccessfully !!!");
            e.printStackTrace();
            return false;
        } finally {
            
        }
    }
    
    public boolean save(Conference cf){
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            Transaction trans = session.beginTransaction();
            session.save(cf);
            trans.commit();
            System.out.println("Save successfully !!!");
            return true;
        } catch(Exception e){
            System.out.println("Save unsuccessfully !!!");
            e.printStackTrace();
            return false;
        } finally {
            session.close();
        }
    }
    
    public boolean update(Conference cf){
                try{
            session = HibernateUtil.getSessionFactory().openSession();
            Transaction trans = session.beginTransaction();
            session.update(cf);
            trans.commit();
            System.out.println("Update successfully !!!");
            return true;
        } catch(Exception e){
            System.out.println("Update unsuccessfully !!!");
            e.printStackTrace();
            return false;
        } finally {
            session.close();
        }
    }
}
