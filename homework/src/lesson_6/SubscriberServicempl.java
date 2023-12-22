package lesson_6;

public class SubscriberServicempl implements SubcriberService{
    private Subscriber[] subscribers;
    public SubscriberServicempl(Subscriber[] subscribers){
        this.subscribers = subscribers;
    }
    @Override
    public void showOverboundCityCallDur(int limit) {
        for(var i: subscribers){
            int dur = i.getCityCallDur();
            if(dur > limit){
                System.out.println(i);
            }
        }
    }

    @Override
    public void showInterCityCallUsers() {
        for(var i:subscribers){
            if(i.getInterCityCallDur() > 0){
                System.out.println(i);
            }
        }
    }

    @Override
    public void showSubscriberInfo( char firstLetter) {
        for(Subscriber i: subscribers){
            if(i.getLastName().charAt(0) == firstLetter){
                System.out.println("Subscriber{"+ i.getFirstName() + " "
                                    +i.getLastName()+ ", phone number: "
                                    + i.getPhoneNumber() + ", balance: "
                                    + i.getBalance()
                        );
            }
        }
    }

    @Override
    public void showTotalCityTraffic( String city) {
        int total = 0;
        for(var i: subscribers){
            if(i.getCity().equals(city)){
                total+=i.getTraffic();
            }
        }
        System.out.println("The total traffic usage in "+city + " is "+total);

    }

    @Override
    public void showNegativeBalanceSubscribers() {
        int total = 0;
        for(var i : subscribers){
            if(i.getBalance() < 0){
                total++;
            }
        }
        System.out.println("Total number of subscribers with the negative balance is "+total);
    }
}
