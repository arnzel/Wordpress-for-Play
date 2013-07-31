package models;
// Generated on the Jul 31, 2013 1:54:11 PM by Play!

import play.db.jpa.JPASupport;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * WpLinks generated by Play!
 */
@Entity
@Table(name="wp_links"
    ,catalog="wpEvent"
    , uniqueConstraints = {  }
)
public class WpLinks extends JPASupport implements java.io.Serializable {

    // Fields

     @Id
    
    @Column(name="link_id", unique=true, nullable=false, insertable=true, updatable=true)
        public long linkId;
    
    @Column(name="link_url", unique=false, nullable=false, insertable=true, updatable=true)
        public String linkUrl;
    
    @Column(name="link_name", unique=false, nullable=false, insertable=true, updatable=true)
        public String linkName;
    
    @Column(name="link_image", unique=false, nullable=false, insertable=true, updatable=true)
        public String linkImage;
    
    @Column(name="link_target", unique=false, nullable=false, insertable=true, updatable=true, length=25)
        public String linkTarget;
    
    @Column(name="link_description", unique=false, nullable=false, insertable=true, updatable=true)
        public String linkDescription;
    
    @Column(name="link_visible", unique=false, nullable=false, insertable=true, updatable=true, length=20)
        public String linkVisible;
    
    @Column(name="link_owner", unique=false, nullable=false, insertable=true, updatable=true)
        public long linkOwner;
    
    @Column(name="link_rating", unique=false, nullable=false, insertable=true, updatable=true)
        public int linkRating;
    
    @Column(name="link_updated", unique=false, nullable=false, insertable=true, updatable=true, length=19)
        public Date linkUpdated;
    
    @Column(name="link_rel", unique=false, nullable=false, insertable=true, updatable=true)
        public String linkRel;
    
    @Column(name="link_notes", unique=false, nullable=false, insertable=true, updatable=true, length=16777215)
        public String linkNotes;
    
    @Column(name="link_rss", unique=false, nullable=false, insertable=true, updatable=true)
        public String linkRss;
     // Constructors

    /** default constructor */
    public WpLinks() {
    }

    /** full constructor */
    public WpLinks(long linkId, String linkUrl, String linkName, String linkImage, String linkTarget, String linkDescription, String linkVisible, long linkOwner, int linkRating, Date linkUpdated, String linkRel, String linkNotes, String linkRss) {
       this.linkId = linkId;
       this.linkUrl = linkUrl;
       this.linkName = linkName;
       this.linkImage = linkImage;
       this.linkTarget = linkTarget;
       this.linkDescription = linkDescription;
       this.linkVisible = linkVisible;
       this.linkOwner = linkOwner;
       this.linkRating = linkRating;
       this.linkUpdated = linkUpdated;
       this.linkRel = linkRel;
       this.linkNotes = linkNotes;
       this.linkRss = linkRss;
    }
   


}


