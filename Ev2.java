
public class Ev2 {
	
		private double price;
		private String address;
		private boolean isHouse;
		private int buildYear;
		private int roomNumber;
		private int bathNumber;
		private boolean hasGarage;
		public Ev2(double price, String address, boolean isHouse, int buildYear, int roomNumber, int bathNumber,
				boolean hasGarage) {
			this.price = price;
			this.setAddress(address);
			this.setHouse(isHouse);
			this.setBuildYear(buildYear);
			this.setRoomNumber(roomNumber);
			this.setBathNumber(bathNumber);
			this.setHasGarage(hasGarage);
		}
		public void showPazarlikAraligi(double price) {
			System.out.println("Pazarlik payi: " + (price - 20000) + " - " + (price + 20000));
		}
		public double getPrice() {
			return this.price;
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub

		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public boolean isHouse() {
			return isHouse;
		}
		public void setHouse(boolean isHouse) {
			this.isHouse = isHouse;
		}
		public int getBuildYear() {
			return buildYear;
		}
		public void setBuildYear(int buildYear) {
			this.buildYear = buildYear;
		}
		public int getRoomNumber() {
			return roomNumber;
		}
		public void setRoomNumber(int roomNumber) {
			this.roomNumber = roomNumber;
		}
		public int getBathNumber() {
			return bathNumber;
		}
		public void setBathNumber(int bathNumber) {
			this.bathNumber = bathNumber;
		}
		public boolean isHasGarage() {
			return hasGarage;
		}
		public void setHasGarage(boolean hasGarage) {
			this.hasGarage = hasGarage;
		}
}
	

	


