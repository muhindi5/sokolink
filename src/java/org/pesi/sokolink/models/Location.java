/*
 *  Bitforge Software Labs
 *  (c)2017 
 *  http://bitforge.co.ke
 *  <muhindi@bitforge.co.ke><muhindi09@gmail.com>
 */

package org.pesi.sokolink.models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @project: Sokolink
 * @author kelly
 * @date Jul 19, 2017 3:06:50 PM
 * 
 */
@Entity
public class Location implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String postalBox;
    private String phone1;
    private String phone2;
    private String email;
    private String email2;
    private String website;
    private String building;
    private String street;
    private String town;
    private String city;
    private String landMark;
    private String county;
    private String country;
    @ManyToOne
    @JoinColumn(name="BUSINESS_ID")
    private Business business;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "PIN_ID")
    private LocationPin locationPin;
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        if (!(object instanceof Location)) {
            return false;
        }
        Location other = (Location) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.pesi.sokolink.models.Location[ id=" + id + " ]";
    }

}
