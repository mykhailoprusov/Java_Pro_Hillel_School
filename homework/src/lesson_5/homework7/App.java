package lesson_5.homework7;

public class App {
    public static void main(String[] args) {
        Figure[] arr = new Figure[]{new Circle(4), new Square(5),new Triangle(10,6) };

        double result = getTotalArea(arr);
        System.out.println("Total area is "+ result);



        // task with participants and obstacles -->
        Participant[] competitors = new Participant[]{
                new Cat("Black", 100, 50),
                new Human("Andrew", 5000,200),
                new Robot("WorldDestroyer223", 100000, 10000),
                new Human("Mathew", 3000, 500)
        };

        Obstacle[] obstacles = new Obstacle[]{
                new Pathway(200),
                new Wall(20),
                new Pathway(5),
                new Wall(70),
                new Pathway(1000),
                new Wall(300),
                new Pathway(5000),
                new Wall(9000)
        };

        for(int j = 0; j<competitors.length; j++){
            int total = 0;
            int competitorRunLimit = competitors[j].getRunRestriction();
            for(int i = 0; i<obstacles.length; i++){
                boolean flag = obstacles[i].overcome(competitors[j]);
                if(flag && (obstacles[i] instanceof Wall)) {
                    System.out.println("Учасник "+competitors[j].getName() + " пройшов перешкоду "+"Wall на дистанції "+
                            total);

                }
                else if(flag && (obstacles[i] instanceof Pathway)){
                    total+=((Pathway) obstacles[i]).getLength();
                    System.out.println("Учасник "+competitors[j].getName() + " пройшов перешкоду "+"Pathway на дистанції "+
                            total);

                }
                else if(!flag && (obstacles[i] instanceof Wall)){
                    System.out.println("Учасник "+competitors[j].getName() + " не пройшов перешкоду "+"Wall на дистанції "+
                            total);
                    break;
                } else if (!flag && (obstacles[i] instanceof Pathway)) {
                    int totalNotOvercome = total + ((Pathway) obstacles[i]).getLength();
                    total+=competitors[j].getRunRestriction();
                    System.out.println("Учасник "+competitors[j].getName() + " не пройшов перешкоду "+"Pathway на дистанції "+
                            totalNotOvercome+ ". Пройдено "+total);
                    break;
                }
            }

        }

    }
    static double getTotalArea(Figure[] figures){
        double total = 0;
        for(var i : figures){
            total+= i.getArea();
        }
        return total;
    }
}
