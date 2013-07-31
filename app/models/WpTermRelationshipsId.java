package models;
// Generated on the Jul 31, 2013 1:54:11 PM by Play!

import play.db.jpa.JPASupport;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * WpTermRelationshipsId generated by Play!
 */
@Embeddable
public class WpTermRelationshipsId  implements java.io.Serializable {

    // Fields


    @Column(name="object_id", unique=false, nullable=false, insertable=true, updatable=true)
        public long objectId;

    @Column(name="term_taxonomy_id", unique=false, nullable=false, insertable=true, updatable=true)
        public long termTaxonomyId;
     // Constructors

    /** default constructor */
    public WpTermRelationshipsId() {
    }

    /** full constructor */
    public WpTermRelationshipsId(long objectId, long termTaxonomyId) {
       this.objectId = objectId;
       this.termTaxonomyId = termTaxonomyId;
    }
   


}

