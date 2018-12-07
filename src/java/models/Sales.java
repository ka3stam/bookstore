/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author matina
 */
@Entity
@Table(name = "sales")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sales.findAll", query = "SELECT s FROM Sales s"),
    @NamedQuery(name = "Sales.findByIdsales", query = "SELECT s FROM Sales s WHERE s.idsales = :idsales"),
    @NamedQuery(name = "Sales.findByDate", query = "SELECT s FROM Sales s WHERE s.date = :date"),
    @NamedQuery(name = "Sales.findBySold", query = "SELECT s FROM Sales s WHERE s.sold = :sold")})
public class Sales implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idsales")
    private Integer idsales;
    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Column(name = "sold")
    private Integer sold;
    @JoinColumn(name = "book_isbn", referencedColumnName = "isbn")
    @ManyToOne(fetch = FetchType.EAGER)
    private Book bookIsbn;

    public Sales() {
    }

    public Sales(Integer idsales) {
        this.idsales = idsales;
    }

    public Integer getIdsales() {
        return idsales;
    }

    public void setIdsales(Integer idsales) {
        this.idsales = idsales;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getSold() {
        return sold;
    }

    public void setSold(Integer sold) {
        this.sold = sold;
    }

    public Book getBookIsbn() {
        return bookIsbn;
    }

    public void setBookIsbn(Book bookIsbn) {
        this.bookIsbn = bookIsbn;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsales != null ? idsales.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sales)) {
            return false;
        }
        Sales other = (Sales) object;
        if ((this.idsales == null && other.idsales != null) || (this.idsales != null && !this.idsales.equals(other.idsales))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Sales[ idsales=" + idsales + " ]";
    }
    
}
