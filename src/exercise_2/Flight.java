package exercise_2;

public class Flight {
    int number;
    String destination;

    public Flight() {
        System.out.println("ex2 !!!!!");
    }

    public Flight(int number, String destination) {
        this.number = number;
        this.destination = destination;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
    public void display(){
        if (getNumber()<=0){
            System.out.println("0"+","+getDestination());
        } else if (getDestination() == null) {
            System.out.println(getNumber()+","+" empty");
        } else if (getNumber()<=0 || getDestination() == null) {
            System.out.println("0"+","+" empty");
        } else {
            System.out.println(getNumber() + "," + getDestination());
        }
    }

}
