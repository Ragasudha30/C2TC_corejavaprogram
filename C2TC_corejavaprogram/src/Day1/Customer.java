package Day1;

public class Customer {

		private int cid;
		private String cname;
		private String city;
		public Customer()//default constructor
		{
			this.cid=101;
			this.cname="Priya";
			this.city="chennai";
		}
		public Customer(int cid,String cname,String city)
		//Parameterized constructor
		{
			//this();//calling default constructor
			this("name","puducherry");//without creating obj for 2 para constructor
			this.cid=cid;
			this.cname=cname;
			this.city=city;
			
		}
		public Customer(String cname,String city)
		//constructor OVERLOADING
		{
		    System.out.println("parameterized is called");
			this.cname=cname;
			this.city=city;
		}
		public int getCid() {
			return cid;
		}
		public void setCid(int cid) {
			this.cid = cid;
		}
		public String getCname() {
			return cname;
		}
		public void setCname(String cname) {
			this.cname = cname;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		@Override
		public String toString() {
			return "Customer [cid=" + cid + ", cname=" + cname + ", city=" + city + "]";
		}
}
