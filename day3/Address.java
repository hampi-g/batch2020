package com.sonata.JavaBean;

public class Address {
	
		String city;
		String state;
		int pin;
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public int getPin() {
			return pin;
		}
		public void setPin(int pin) {
			this.pin = pin;
		}
		@Override
		public String toString() {
			return "address [city=" + city + ", state=" + state + ", pin=" + pin + "]";
		}

	}

