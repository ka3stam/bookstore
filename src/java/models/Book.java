/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author matina
 */
@Entity
@Table(name = "book")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Book.findAll", query = "SELECT b FROM Book b"),
    @NamedQuery(name = "Book.findByIsbn", query = "SELECT b FROM Book b WHERE b.isbn = :isbn"),
    @NamedQuery(name = "Book.findByTitle", query = "SELECT b FROM Book b WHERE b.title = :title"),
    @NamedQuery(name = "Book.findByNumberOfPages", query = "SELECT b FROM Book b WHERE b.numberOfPages = :numberOfPages"),
    @NamedQuery(name = "Book.findByCover", query = "SELECT b FROM Book b WHERE b.cover = :cover"),
    @NamedQuery(name = "Book.findByNumberOfPages1", query = "SELECT b FROM Book b WHERE b.numberOfPages1 = :numberOfPages1")})
public class Book implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "isbn")
    private Long isbn;
    @Basic(optional = false)
    @Column(name = "title")
    private String title;
    @Column(name = "numberOfPages")
    private Integer numberOfPages;
    @Column(name = "cover")
    private String cover;
    @Column(name = "number_of_pages")
    private Integer numberOfPages1;
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Category categoryId;
    @OneToMany(mappedBy = "bookIsbn", fetch = FetchType.EAGER)
    private Collection<Sales> salesCollection;

    public Book() {
    }

    public Book(Long isbn) {
        this.isbn = isbn;
    }

    public Book(Long isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(Integer numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public Integer getNumberOfPages1() {
        return numberOfPages1;
    }

    public void setNumberOfPages1(Integer numberOfPages1) {
        this.numberOfPages1 = numberOfPages1;
    }

    public Category getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Category categoryId) {
        this.categoryId = categoryId;
    }

    @XmlTransient
    public Collection<Sales> getSalesCollection() {
        return salesCollection;
    }

    public void setSalesCollection(Collection<Sales> salesCollection) {
        this.salesCollection = salesCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (isbn != null ? isbn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Book)) {
            return false;
        }
        Book other = (Book) object;
        if ((this.isbn == null && other.isbn != null) || (this.isbn != null && !this.isbn.equals(other.isbn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Book[ isbn=" + isbn + " ]";
    }
    
}
