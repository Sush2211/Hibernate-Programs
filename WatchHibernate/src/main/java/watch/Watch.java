package watch;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Hibernate_Watch_Table")
public class Watch {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Watch_Id")
	private int id;
	@Column(name="Watch_Brand")
	private String brand;
	@Column(name="Watch_Cost")
	private double cost;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}

}
