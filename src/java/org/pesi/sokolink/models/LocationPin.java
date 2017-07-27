/*
 *  Bitforge Software Labs
 *  (c)2017 
 *  http://bitforge.co.ke
 *  <muhindi@bitforge.co.ke><muhindi09@gmail.com>
 */

package org.pesi.sokolink.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @project: Sokolink
 * @author kelly
 * @date Jul 19, 2017 3:43:29 PM
 * 
 */
@Entity
public class LocationPin implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(mappedBy = "locationPin")
    private Location location;
    @Column(name = "LONGITUDE_MARKER")
    private String longCoord;
    @Column(name = "LATTITUDE_MARKER")
    private String lattCoord;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLongCoord() {
        return longCoord;
    }

    public void setLongCoord(String longCoord) {
        this.longCoord = longCoord;
    }

    public String getLattCoord() {
        return lattCoord;
    }

    public void setLattCoord(String lattCoord) {
        this.lattCoord = lattCoord;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LocationPin)) {
            return false;
        }
        LocationPin other = (LocationPin) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.pesi.sokolink.models.LocationPin[ id=" + id + " ]";
    }

}
