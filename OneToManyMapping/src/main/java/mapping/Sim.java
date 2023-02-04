package mapping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Sim {
	@Id
	private int simId;
	private String network;
	private String serviceProvider;
	public int getSimId() {
		return simId;
	}
	public void setSimId(int simId) {
		this.simId = simId;
	}
	public String getNetwork() {
		return network;
	}
	public void setNetwork(String network) {
		this.network = network;
	}
	public String getServiceProvider() {
		return serviceProvider;
	}
	public void setServiceProvider(String serviceProvider) {
		this.serviceProvider = serviceProvider;
	}
	
	
	

}
