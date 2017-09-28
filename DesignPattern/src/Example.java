
public class Example {
	private String os;
	private String battery;
	
	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getBattery() {
		return battery;
	}

	public void setBattery(String battery) {
		this.battery = battery;
	}

	public Example(Builder builder) {
	}
	
	static class Builder{
		private String _os;
		private String _battery;
		
		public Builder setOs(String _os) {
			this._os = _os;
			return this;
		}
		public Builder setBattery(String _battery) {
			this._battery = _battery;
			return this;
		}
				
	}

}
