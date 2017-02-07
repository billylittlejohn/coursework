package eAuction;

import java.util.Date;

public class Auction {
	
	private double startPrice;
	
	private double reservePrice;
	
	private Date closingDate;
	
	private char status;
	
	
	public void placeBid(){
		
	}
	
	public void verify(){
		
	}
	
	public boolean isBlocked(){
		return true;
	}
	
	public void setBlocked(boolean block){
		
	}
	
	private class Bid {
		double amount;
		
		Buyer who;
		
		Date when;
	}
	
	

}
