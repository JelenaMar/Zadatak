package CriptoCurrency.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Item {
	@Id
	@GeneratedValue
	@Column
	private Long id;
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	@Column
	private Integer rank;
	@Column
	private String symbol;
	@Column
	private Double price;
	@Column
	private Double daychange;
	@OneToOne(mappedBy="item")
	private Details details;
	
	public Details getDetails() {
		return details;
	}
	public void setDetails(Details details) {
		this.details = details;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getRank() {
		return rank;
	}
	public void setRank(Integer rank) {
		this.rank = rank;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getDaychange() {
		return daychange;
	}
	public void setDaychange(Double daychange) {
		this.daychange = daychange;
	}

}
