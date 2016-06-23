package com.test.jdbc.dao;

public class PersonDTO {
	
	
		private Integer pid;
		private String fname;
		private String lname;
		private String city;
		private String address;

		public Integer getPid() {
			return pid;
		}

		public void setPid(Integer pid) {
			this.pid = pid;
		}

		public String getFname() {
			return fname;
		}

		public void setFname(String fname) {
			this.fname = fname;
		}

		public String getLname() {
			return lname;
		}

		public void setLname(String lname) {
			this.lname = lname;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		@Override
		public String toString() {
			return "Person [pid=" + pid + ", fname=" + fname + ", lname=" + lname
					+ ", city=" + city + ", address=" + address + "]";
		}

		public PersonDTO(Integer pid, String fname, String lname, String city,
				String address) {
			super();
			this.pid = pid;
			this.fname = fname;
			this.lname = lname;
			this.city = city;
			this.address = address;
		}

		public PersonDTO() {
			super();
		}
}
