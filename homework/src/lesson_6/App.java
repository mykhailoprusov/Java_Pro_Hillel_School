package lesson_6;

public class App {
    public static void main(String[] args) {
        Subscriber sub1 = new Subscriber(1, "Jonk", "Andrew", "Kyiv",
                "+380984981726", "+380984981726", 762, 69, 8, 6);

        Subscriber sub2 = new Subscriber(2, "Doe", "John", "New York",
                "+123456789", "+123456789", 1000, 120, 25, 12);

        Subscriber sub3 = new Subscriber(3, "Smith", "Alice", "London",
                "+447712345678", "+447712345678", 500, 50, 5, 8);

        Subscriber sub4 = new Subscriber(4, "Garcia", "Carlos", "Madrid",
                "+34612345678", "+34612345678", -3, 30, 10, 3);

        Subscriber sub5 = new Subscriber(5, "Kim", "Soo", "Seoul",
                "+820123456789", "+820123456789", -100, 10, 2, 1);

        Subscriber sub6 = new Subscriber(6, "Müller", "Anna", "Kyiv",
                "+49123456789", "+49123456789", 800, 80, 15, 5);

        Subscriber sub7 = new Subscriber(7, "Wang", "Ling", "Beijing",
                "+8612345678901", "+8612345678901", 600, 70, 12, 9);

        Subscriber sub8 = new Subscriber(8, "Tanaka", "Kenji", "Tokyo",
                "+819012345678", "+819012345678", 350, 40, 6, 4);

        Subscriber sub9 = new Subscriber(9, "Gupta", "Priya", "Mumbai",
                "+912345678901", "+912345678901", 200, 20, 4, 2);

        Subscriber sub10 = new Subscriber(10, "Lopez", "Maria", "Mexico City",
                "+521234567890", "+521234567890", 450, 45, 7, 6);

        Subscriber sub11 = new Subscriber(11, "Dubois", "Pierre", "Paris",
                "+33123456789", "+33123456789", 700, 75, 0, 7);

        Subscriber sub12 = new Subscriber(12, "Chen", "Li", "Shanghai",
                "+8612345678901", "+8612345678901", 300, 25, 0, 5);

        Subscriber[] abonnents = {sub1,sub2,sub3,sub4,sub5,sub6,sub7,sub8,sub9,sub10,sub11,sub12};

        SubscriberServicempl service = new SubscriberServicempl(abonnents);
        // task a)
        service.showOverboundCityCallDur(50);
        System.out.println(".......");

        // task b)
        service.showInterCityCallUsers();
        System.out.println(".......");

        // task c)
        service.showSubscriberInfo('M');
        System.out.println(".......");

        //task d)
        service.showTotalCityTraffic("Kyiv");
        System.out.println(".......");

        //task e)
        service.showNegativeBalanceSubscribers();
        System.out.println(".......");

    }
}
