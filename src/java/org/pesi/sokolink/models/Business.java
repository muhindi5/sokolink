/*
 *  Bitforge Software Labs
 *  (c)2017 
 *  http://bitforge.co.ke
 *  <muhindi@bitforge.co.ke><muhindi09@gmail.com>
 */

package org.pesi.sokolink.models;

import java.io.Serializable;
import java.util.Enumeration;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

/**
 *
 * @project: Sokolink
 * @author kelly
 * @date Jul 19, 2017 2:47:44 PM
 * 
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "BUSINESS_TYPE",discriminatorType = DiscriminatorType.STRING)
public abstract class Business implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String registeredName;
    private String otherName;
    @Enumerated(EnumType.STRING)
    private List<ProductCategory> lineCategories;
    @OneToMany(mappedBy = "business",orphanRemoval = true,cascade = CascadeType.PERSIST)
    private List<Location> locations;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRegisteredName() {
        return registeredName;
    }

    public void setRegisteredName(String registeredName) {
        this.registeredName = registeredName;
    }

    public String getOtherName() {
        return otherName;
    }

    public void setOtherName(String otherName) {
        this.otherName = otherName;
    }

    public List<ProductCategory> getLineCategories() {
        return lineCategories;
    }

    public void setLineCategories(List<ProductCategory> lineCategories) {
        this.lineCategories = lineCategories;
    }

    public List<Location> getPremises() {
        return locations;
    }

    public void setPremises(List<Location> premises) {
        this.locations = premises;
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
        if (!(object instanceof Business)) {
            return false;
        }
        Business other = (Business) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "org.pesi.sokolink.models.Business[ id=" + id + " ]";
    }
    
    

}
