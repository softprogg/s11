 package model;

import java.util.*;
import javax.persistence.*;

@Entity
public class Person implements Serializable{
	
	@Id
	@GeneratedValue(strategy.SEQUENCE)
	long id;
	
	
	@Column(name="name", nullable=false)
	public String name;
	
	@Column(name="surname", nullable=false)
	public String surname;
	
	@Column(name="password", nullable=false)
	String password;
	
	@Column(name="strreet", nullable=false)
	String street;
	
	@Column(name="city", nullable=false)
	String city;
	
	@Column(name="building", nullable=false)
	int nrBuilding;
	
	@Column(name="postal", nullable=false)
	int postalCode;
	
	@Column(nullable=false)
	String role;
	
	@ElementCollection
	@OneToMany(mappedBy="person", cascade.ALL)
	Set<OldOrder> oldOrders;
	
	@OneToMany(mappedBy="person", cascade.ALL)
	List<Order> orders;
	
	public String getName(){
		return name;}
	
	public void setName(String name){
    this.name = name;		
		
	}
	public String getSurname{
		return surname;
		
	}
	public void setSurname(String surname){
	this.surname = surname;	
    }
	public Adres getAdres(){
    return adres;		
    }
	public void setAdres(String city){
	this.city = city;	
    }
	public List<Order> getOrders (){
	return orders;	
	}
	public void setOrders(List<Order> orders){
	this.orders = orders;	
	}
	public List<OldOrder> getOldOrders (){
    return oldOrders;	
    }
	public void setOldOrders(List<OldOrder> Oldorders){
	this.oldOrders = oldOrders;	
		}

}
