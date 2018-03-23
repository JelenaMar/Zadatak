package CriptoCurrency.web.dto;



public class DetailsDTO {
	
	private Long id;
	private String name;
	private String symbol;
	private Integer rank;
	private Double priceInUsd;
	private Double priceInbitcoin;
	private Double dayvolume;
	private Double marketcup;
	private Double availableSupply;
	private Double totalSupply;
	private Double oneHchange;
	private Double daychange;
	private Double sevenDchange;
	private Long itemId;
	
	public Long getItemId() {
		return itemId;
	}


	public void setItemId(Long itemId) {
		this.itemId = itemId;
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


	public Integer getRank() {
		return rank;
	}


	public void setRank(Integer rank) {
		this.rank = rank;
	}


	public Double getPriceInUsd() {
		return priceInUsd;
	}


	public void setPriceInUsd(Double priceInUsd) {
		this.priceInUsd = priceInUsd;
	}


	public Double getPriceInbitcoin() {
		return priceInbitcoin;
	}


	public void setPriceInbitcoin(Double priceInbitcoin) {
		this.priceInbitcoin = priceInbitcoin;
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


	public void setId(Long id) {
		this.id = id;
	}


	public Long getId() {
		return id;
	}

}
