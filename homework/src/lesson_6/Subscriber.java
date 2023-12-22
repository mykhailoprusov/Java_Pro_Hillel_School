package lesson_6;

public class Subscriber {
    private int id;
    private String lastName;
    private String firstName;
    private String city;
    private String phoneNumber;
    private String contactNumber;
    private int balance;
    private int cityCallDur;
    private int interCityCallDur;
    private int traffic;

    public Subscriber(int id, String lastName, String firstName,
                      String city, String phoneNumber,
                      String contactNumber, int balance,
                      int cityCallDur,
                      int interCityCallDur, int traffic) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.contactNumber = contactNumber;
        this.balance = balance;
        this.cityCallDur = cityCallDur;
        this.interCityCallDur = interCityCallDur;
        this.traffic = traffic;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getCityCallDur() {
        return cityCallDur;
    }

    public void setCityCallDur(int cityCallDur) {
        this.cityCallDur = cityCallDur;
    }

    public int getInterCityCallDur() {
        return interCityCallDur;
    }

    public void setInterCityCallDur(int interCityCallDur) {
        this.interCityCallDur = interCityCallDur;
    }

    public int getTraffic() {
        return traffic;
    }

    public void setTraffic(int traffic) {
        this.traffic = traffic;
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", city='" + city + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", balance=" + balance +
                ", cityCallDur=" + cityCallDur +
                ", interCityCallDur=" + interCityCallDur +
                ", traffic=" + traffic +
                '}';
    }
}
