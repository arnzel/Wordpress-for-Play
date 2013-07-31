package models;
// Generated on the Jul 31, 2013 1:54:11 PM by Play!

import play.db.jpa.JPASupport;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * WpTerms generated by Play!
 */
@Entity
@Table(name="wp_terms"
    ,catalog="wpEvent"
    , uniqueConstraints = { @UniqueConstraint( columnNames = { "slug" } ) }
)
public class WpTerms extends JPASupport implements java.io.Serializable {

    // Fields

     @Id
    
    @Column(name="term_id", unique=true, nullable=false, insertable=true, updatable=true)
        public long termId;
    
    @Column(name="name", unique=false, nullable=false, insertable=true, updatable=true, length=200)
        public String name;
    
    @Column(name="slug", unique=true, nullable=false, insertable=true, updatable=true, length=200)
        public String slug;
    
    @Column(name="term_group", unique=false, nullable=false, insertable=true, updatable=true)
        public long termGroup;
     // Constructors

    /** default constructor */
    public WpTerms() {
    }

    /** full constructor */
    public WpTerms(long termId, String name, String slug, long termGroup) {
       this.termId = termId;
       this.name = name;
       this.slug = slug;
       this.termGroup = termGroup;
    }
   


}

