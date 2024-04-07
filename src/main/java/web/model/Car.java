package web.model;


public class Car {

    private String model;
    private int yearOfIssue;
    private int mileAge;

    public Car(String model, int yearOfIssue, int mileAge) {
        this.model = model;
        this.yearOfIssue = yearOfIssue;
        this.mileAge = mileAge;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public int getMileAge() {
        return mileAge;
    }

    public void setMileAge(int mileAge) {
        this.mileAge = mileAge;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                ", mileAge=" + mileAge +
                '}';
    }
}
