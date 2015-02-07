package models;
// Generated on the Jul 31, 2013 1:54:11 PM by Play!

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import play.db.jpa.Model;

/**
 * WpTermTaxonomy generated by Play!
 */
@Entity
@Table(name="wp_term_taxonomy"
    ,catalog="wpEvent"
    , uniqueConstraints = { @UniqueConstraint( columnNames = { "term_id", "taxonomy" } ) }
)
public class WpTermTaxonomy extends Model implements java.io.Serializable {

    // Fields

     @Id
    
    @Column(name="term_taxonomy_id", unique=true, nullable=false, insertable=true, updatable=true)
        public long termTaxonomyId;
    
    @Column(name="term_id", unique=false, nullable=false, insertable=true, updatable=true)
        public long termId;
    
    @Column(name="taxonomy", unique=false, nullable=false, insertable=true, updatable=true, length=32)
        public String taxonomy;
    
    @Column(name="description", unique=false, nullable=false, insertable=true, updatable=true)
        public String description;
    
    @Column(name="parent", unique=false, nullable=false, insertable=true, updatable=true)
        public long parent;
    
    @Column(name="count", unique=false, nullable=false, insertable=true, updatable=true)
        public long count;
     // Constructors

    /** default constructor */
    public WpTermTaxonomy() {
    }

    /** full constructor */
    public WpTermTaxonomy(long termTaxonomyId, long termId, String taxonomy, String description, long parent, long count) {
       this.termTaxonomyId = termTaxonomyId;
       this.termId = termId;
       this.taxonomy = taxonomy;
       this.description = description;
       this.parent = parent;
       this.count = count;
    }
   


}


