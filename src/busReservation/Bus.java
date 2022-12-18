package busReservation;

public class Bus{
	
	private int busNo;
	private boolean ac;
	private int capacity;
	
	Bus(int no,boolean ac, int cap){
		this.busNo=no;
		this.ac=ac;
		this.capacity=cap;
	}
	public int getCapacity() {
		return capacity ;    //accesor
	}
    public void setCapacity(int cap) {
	capacity = cap;// mutator
    }
    public boolean getac() {
		return ac ;    //accesor
	}
    public void setac(boolean val) {
    	ac=val;
    }
    public int getBusNo() {
		return busNo ;    //accesor
	}
    public void setBusNo(int bNo) {
    	busNo=bNo;
    }

    void displayinfo() {
	 System.out.println("Busno: "+ busNo + " Ac: "+ac+ " Capacity: "+ capacity);
    }
}
