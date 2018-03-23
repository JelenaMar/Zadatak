package CriptoCurrency.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Details {
	@Id
	@GeneratedValue
	@Column
	private Long id;
	@Column
	private String name;
	@Column
	private String symbol;
	@Column
	private Integer rank;
	@Column
	private Double priceInUsd;
	@Column
	private Double priceInbitcoin;
	@Column
	private Double dayvolume;
	@Column
	private Double marketcup;
	@Column
	private Double availableSupply;
	@Column
	private Double totalSupply;
	@Column
	private Double oneHchange;
	@Column
	private Double daychange;
	@Column
	private Double sevenDchange;
	@OneToOne
	private Item item;
	
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public Double getPriceInUsd() {
		return priceInUsd;
	}
	public void setPriceInUsd(Double priceInUsd) {
		this.priceInUsd = priceInUsd;
	}
	
	public Double getDayvolume() {
		return dayvolume;
	}
	public void setDayvolume(Double dayvolume) {
		this.dayvolume = dayvolume;
	}
	public Double getMarketcup() {
		return marketcup;
	}
	public void setMarketcup(Double marketcup) {
		this.marketcup = marketcup;
	}
	public Double getPriceInbitcoin() {
		return priceInbitcoin;
	}
	public void setPriceInbitcoin(Double priceInbitcoin) {
		this.priceInbitcoin = priceInbitcoin;
	}
	public Double getOneHchange() {
		return oneHchange;
	}
	public void setOneHchange(Double oneHchange) {
		this.oneHchange = oneHchange;
	}
	public Double getDaychange() {
		return daychange;
	}
	public void setDaychange(Double daychange) {
		this.daychange = daychange;
	}
	public Double getSevenDchange() {
		return sevenDchange;
	}
	public void setSevenDchange(Double sevenDchange) {
		this.sevenDchange = sevenDchange;
	}
	public Double getAvailableSupply() {
		return availableSupply;
	}
	public void setAvailableSupply(Double availableSupply) {
		this.availableSupply = availableSupply;
	}
	public Double getTotalSupply() {
		return totalSupply;
	}
	public void setTotalSupply(Double totalSupply) {
		this.totalSupply = totalSupply;
	}

	

}