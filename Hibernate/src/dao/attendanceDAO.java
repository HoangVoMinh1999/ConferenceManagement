/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.*;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author vomin
 */
public class attendanceDAO {

    private Session session = null;

    public List<Attendance> findAll() {
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            Transaction trans = session.beginTransaction();
            return session.createCriteria(Attendance.class).list();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            session.close();
        }
    }

    public List<Attendance> findByConference(AttendanceId id) {
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            Transaction trans = session.beginTransaction();
            return session.createCriteria(Attendance.class).add(Restrictions.eq("idConference", id.getIdConference())).list();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            session.close();
        }
    }

    public List<Attendance> findByUser(AttendanceId id) {
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            Transaction trans = session.beginTransaction();
            return session.createCriteria(Attendance.class).add(Restrictions.eq("id", id)).list();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            session.close();
        }
    }

    public boolean delete(Attendance at) {
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            Transaction trans = session.beginTransaction();
            session.delete(at);
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

    public boolean save(Attendance at) {
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            Transaction trans = session.beginTransaction();
            session.save(at);
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

    public boolean update(Attendance at) {
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            Transaction trans = session.beginTransaction();
            session.update(at);
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
