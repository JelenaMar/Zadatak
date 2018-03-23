package CriptoCurrency.web.dto;

public class ItemDTO {
	
	private Long id;
	private Integer rank;
	private String symbol;
	private Double price;
	private Double daychange;
	
	
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
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	
    
}
