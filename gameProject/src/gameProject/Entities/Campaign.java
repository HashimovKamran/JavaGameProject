package gameProject.Entities;

public class Campaign {
	private int id;
	private String campaignName;
	private String campaignDetail;
	private int discount;

	public Campaign(int id, String campaignName, String campaignDetail, int discount) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.campaignDetail = campaignDetail;
		this.discount = discount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public String getCampaignDetail() {
		return campaignDetail;
	}

	public void setCampaignDetail(String campaignDetail) {
		this.campaignDetail = campaignDetail;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}
}
