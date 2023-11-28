/* 
 * Name: Lukas Hammett
 * Date: 12/01/2022
 * Class Name: TwitterLocationData.java
 * Description: Defines the TwitterLocationData
 * 				object to be used in TwitterDataQueue.
 * 				It contains the location data of some
 * 				Twitter users.
 */

import java.util.Objects;

public class TwitterLocationData {
	
	private int locationID;
	private String country;
	private String state;
	private String stateCode;
	private String city;
	
	public TwitterLocationData(int locationID, String country, String state, String stateCode, String city) {
		super();
		this.locationID = locationID;
		this.country = country;
		this.state = state;
		this.stateCode = stateCode;
		this.city = city;
	}
	
	public int getLocationID() {
		return locationID;
	}
	
	public void setLocationID(int locationID) {
		this.locationID = locationID;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getStateCode() {
		return stateCode;
	}
	
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "TwitterLocationData [locationID=" + locationID + ", country=" + country + ", state=" + state
				+ ", stateCode=" + stateCode + ", city=" + city + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(city, country, locationID, state, stateCode);
	}
	
	@Override
	public boolean equals(Object obj) {
		TwitterLocationData other = (TwitterLocationData) obj;
		return locationID == other.locationID;
	}
	
	
	
}
