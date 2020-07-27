package entities;
// Generated Jul 27, 2020, 9:35:57 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Conference generated by hbm2java
 */
public class Conference  implements java.io.Serializable {


     private int idConference;
     private Place place;
     private String name;
     private String generalInfo;
     private Date startedtime;
     private Date endedtime;
     private int visitors;
     private String detail;
     private String imageUrl;
     private Integer status;
     private Set attendances = new HashSet(0);

    public Conference() {
    }

	
    public Conference(int idConference, Place place, String name, Date startedtime, Date endedtime, int visitors) {
        this.idConference = idConference;
        this.place = place;
        this.name = name;
        this.startedtime = startedtime;
        this.endedtime = endedtime;
        this.visitors = visitors;
    }
    public Conference(int idConference, Place place, String name, String generalInfo, Date startedtime, Date endedtime, int visitors, String detail, String imageUrl, Integer status, Set attendances) {
       this.idConference = idConference;
       this.place = place;
       this.name = name;
       this.generalInfo = generalInfo;
       this.startedtime = startedtime;
       this.endedtime = endedtime;
       this.visitors = visitors;
       this.detail = detail;
       this.imageUrl = imageUrl;
       this.status = status;
       this.attendances = attendances;
    }
   
    public int getIdConference() {
        return this.idConference;
    }
    
    public void setIdConference(int idConference) {
        this.idConference = idConference;
    }
    public Place getPlace() {
        return this.place;
    }
    
    public void setPlace(Place place) {
        this.place = place;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getGeneralInfo() {
        return this.generalInfo;
    }
    
    public void setGeneralInfo(String generalInfo) {
        this.generalInfo = generalInfo;
    }
    public Date getStartedtime() {
        return this.startedtime;
    }
    
    public void setStartedtime(Date startedtime) {
        this.startedtime = startedtime;
    }
    public Date getEndedtime() {
        return this.endedtime;
    }
    
    public void setEndedtime(Date endedtime) {
        this.endedtime = endedtime;
    }
    public int getVisitors() {
        return this.visitors;
    }
    
    public void setVisitors(int visitors) {
        this.visitors = visitors;
    }
    public String getDetail() {
        return this.detail;
    }
    
    public void setDetail(String detail) {
        this.detail = detail;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }
    
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
    public Integer getStatus() {
        return this.status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
    }
    public Set getAttendances() {
        return this.attendances;
    }
    
    public void setAttendances(Set attendances) {
        this.attendances = attendances;
    }




}

