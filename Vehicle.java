import java.util.Scanner;

public class Vehicle{
    String name;
    double weight;
    int seats;
    double kilometers_travelled;
    
    Vehicle(String name,double weight, int seats,double kilometers_travelled){
        this.name=name;
        this.weight=weight;
        this.seats=seats;
        this.kilometers_travelled=kilometers_travelled;
        //message: 
        System.out.println("vehicle is created");
    }
    public void totalTravellingDistance(double newDistance){
        double oldDistance=this.kilometers_travelled;
        kilometers_travelled+=newDistance;
        System.out.println("previous distance = "+oldDistance+"\n new distance = "+this.kilometers_travelled);
    }
}          
 
class AirVehicle extends Vehicle{
    double radius_propellers;
    
    AirVehicle(String name, double weight,int seats,double kilometers_travelled,double radius_propellers){
        super(name,weight,seats,kilometers_travelled);
        this.radius_propellers=radius_propellers;
        //message: 
        System.out.println("air vehicle is created");
    }   
}
            
class SmallPlanes extends AirVehicle{
    SmallPlanes(String name, double weight,int seats,double kilometers_travelled,double radius_propellers){
        super(name,weight,seats,kilometers_travelled,radius_propellers);
        //message: 
        System.out.println("small plane is created");   
    }
}

class BigPlanes extends AirVehicle{
    double CapacityOfLuggage;   
    BigPlanes(String name, double weight,int seats,double kilometers_travelled,double radius_propellers,double CapacityOfLuggage){
        super(name,weight,seats,kilometers_travelled,radius_propellers);
        this.CapacityOfLuggage=CapacityOfLuggage;
        //message: 
        System.out.println("big plane is created.");
    }
}


class RoadVehicles extends Vehicle{
    int no_of_wheels;
    
    RoadVehicles(String name, double weight,int seats,double kilometers_travelled,int no_of_wheels){
        super(name,weight,seats,kilometers_travelled);
        this.no_of_wheels=no_of_wheels;
        //message: 
        System.out.println("road vehicle is created");
    }
}  

class Cars extends RoadVehicles{
    Cars(String name, double weight,int seats,double kilometers_travelled,int no_of_wheels){
        super(name,weight,seats,kilometers_travelled,no_of_wheels);
        //message: 
        System.out.println("car is created");   
    }
}
    
class Buses extends RoadVehicles{
    double CapacityOfLuggage;
    Buses(String name, double weight,int seats,double kilometers_travelled,int no_of_wheels,double CapacityOfLuggage){
        super(name,weight,seats,kilometers_travelled,no_of_wheels);
        this.CapacityOfLuggage=CapacityOfLuggage;
        //message: 
        System.out.println("bus is created");
    }
}

class Trucks extends RoadVehicles{
    double CapacityOfLuggage;
    double length_of_front_part;
    Trucks(String name,double weight,int seats,double kilometers_travelled,int no_of_wheels,double CapacityOfLuggage,double length_of_front_part){
        super(name,weight,seats,kilometers_travelled,no_of_wheels);
        this.CapacityOfLuggage=CapacityOfLuggage;
        this.length_of_front_part=length_of_front_part;
        //message: 
        System.out.println("truck is created");
    }
}


class WaterVehicles extends Vehicle{
    double size_of_propellers;
    WaterVehicles(String name,double weight,int seats,double kilometers_travelled,double size_of_propellers){
        super(name,weight,seats,kilometers_travelled);
        this.size_of_propellers=size_of_propellers;
        //message: 
        System.out.println("water vahicle is created");
    }
}

class Ship extends WaterVehicles{
    int no_of_radars;
    Ship(String name,double weight,int seats,double kilometers_travelled,double size_of_propellers,int no_of_radars){
        super(name,weight,seats,kilometers_travelled,size_of_propellers);
        this.no_of_radars=no_of_radars;
        //message: 
        System.out.println("ship is created");
    }
}

class Boats extends WaterVehicles{
    int no_of_sticks;
    Boats (String name,double weight,int seats,double kilometers_travelled,double size_of_propellers,int no_of_sticks){
        super(name,weight,seats,kilometers_travelled,size_of_propellers);
        this.no_of_sticks=no_of_sticks;
        //message: 
        System.out.println("boat is created");  
    }
}


class Employees{
    String name;
    double salary;
    
    Employees(String name,double salary){
        this.name=name;
        this.salary=salary;
        //message: 
        System.out.println("employee is created");
    }
}

class FullTimeEmployee extends Employees{
    double bonus_salary;
    FullTimeEmployee(String name,double salary,double bonus_salary){
        super(name,salary);
        this.bonus_salary=bonus_salary;
        //message: 
        System.out.println("full time employee is created");
    }
}

class PartTimeEmployee extends Employees{
    String starting_time;
    PartTimeEmployee(String name,double salary,String starting_time){
       super(name,salary);
       this.starting_time=starting_time;
       //message: 
       System.out.println("part time employee is created");
    }
}




class TestRun{
    
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        
        
        // creating a big plane object: 
        System.out.print("enter the name of big plane: ");
        String name=input.nextLine();
        System.out.print("enter the weight of "+name+" ");
        double weight=input.nextDouble();
        System.out.print("enter the number of seats of "+name+" ");
        int seats=input.nextInt();
        System.out.print("enter the kilometers travelled: ");
        double kilometers_travelled=input.nextDouble();
        System.out.print("enter the radius of propellers: ");
        double radius_propellers=input.nextDouble();
        System.out.print("enter the capacity of luggage: ");
        double CapacityOfLuggage =input.nextDouble();
        
        BigPlanes bigPlane1=new BigPlanes(name,weight,seats,kilometers_travelled,radius_propellers,CapacityOfLuggage);
        // using the method which increases the number of kilometers travelled of bigPlane1:
        System.out.print("ener the new distance travelled: ");
        bigPlane1.totalTravellingDistance(input.nextDouble());
        input.nextLine();// a blank scanner next line to consume new line
        System.out.println("\n");
        // printing all the ingormation: 
        System.out.println("name: "+bigPlane1.name);
        System.out.println("weight of "+bigPlane1.name+" "+bigPlane1.weight);
        System.out.println("seats: "+bigPlane1.seats);
        System.out.println("distance travelled: "+bigPlane1.kilometers_travelled);
        System.out.println("radius of propellers: "+bigPlane1.radius_propellers);
        System.out.println("Luggage Capacity: "+bigPlane1.CapacityOfLuggage);
        
        
        
        //creating a small plane object: 
        System.out.print("enter the name of small plane: ");
        name=input.nextLine();
        System.out.print("enter the weight of "+name+" ");
        weight=input.nextDouble();
        System.out.print("enter the number of seats of "+name+" ");
        seats=input.nextInt();
        System.out.print("enter the kilometers travelled: ");
        kilometers_travelled=input.nextDouble();
        System.out.print("enter the radius of propellers: ");
        radius_propellers=input.nextDouble();
        SmallPlanes smallPlane1=new SmallPlanes(name,weight,seats,kilometers_travelled,radius_propellers);
        
        // using the method which increases the number of kilometers travelled of smallPlane1:
        System.out.print("ener the new distance travelled: ");
        smallPlane1.totalTravellingDistance(input.nextDouble());
        input.nextLine();
        System.out.println("\n");
        //printing all the information: 
         System.out.println("name: "+smallPlane1.name);
        System.out.println("weight of "+smallPlane1.name+" "+smallPlane1.weight);
        System.out.println("seats: "+smallPlane1.seats);
        System.out.println("distance travelled: "+smallPlane1.kilometers_travelled);
        System.out.println("radius of propellers: "+smallPlane1.radius_propellers);
        
        
        
        // creating a cars object: 
        System.out.print("enter the name of the car: ");
        name=input.nextLine();
        System.out.print("enter the weight of "+name+" ");
        weight=input.nextDouble();
        System.out.print("enter the number of seats of the car: ");
        seats=input.nextInt();
        System.out.print("enter the kilometers travelled: ");
        kilometers_travelled=input.nextDouble();
        System.out.print("enter the number of wheels of the car: ");
        int no_of_wheels=input.nextInt();
        Cars car1=new Cars(name,weight,seats,kilometers_travelled,no_of_wheels);
        
        // using the method which increases the number of kilometers travelled of car1:
        System.out.print("ener the new distance travelled: ");
        car1.totalTravellingDistance(input.nextDouble());
        input.nextLine();
        System.out.println("\n");
        //printing all the information: 
        System.out.println("name: "+car1.name);
        System.out.println("weight of "+car1.name+" "+car1.weight);
        System.out.println("seats: "+car1.seats);
        System.out.println("distance travelled: "+car1.kilometers_travelled);
        System.out.println("number of wheels: "+car1.no_of_wheels);
        
        
        
        // creating bus object: 
        System.out.print("enter the name of the bus: ");
        name=input.nextLine();
        System.out.print("enter the weight of "+name+" ");
        weight=input.nextDouble();
        System.out.print("enter the number of seats of the bus: ");
        seats=input.nextInt();
        System.out.print("enter the kilometers travelled: ");
        kilometers_travelled=input.nextDouble();
        System.out.print("enter the number of wheels of the bus: ");
        no_of_wheels=input.nextInt();
        System.out.print("enter the capacity of luggage: ");
        CapacityOfLuggage=input.nextDouble();
        Buses bus1=new Buses(name,weight,seats,kilometers_travelled,no_of_wheels,CapacityOfLuggage);
        
        // using the method which increases the number of kilometers travelled of bus1:
        System.out.print("ener the new distance travelled: ");
        bus1.totalTravellingDistance(input.nextDouble());
        input.nextLine();
        System.out.println("\n");
        //printing all the information: 
        System.out.println("name: "+bus1.name);
        System.out.println("weight of "+bus1.name+" "+bus1.weight);
        System.out.println("seats: "+bus1.seats);
        System.out.println("distance travelled: "+bus1.kilometers_travelled);
        System.out.println("number of wheels: "+bus1.no_of_wheels);
        System.out.println("capacity of luggage: "+bus1.CapacityOfLuggage);
        
        
        //creating a trucks object: 
        System.out.print("enter the name of the truck: ");
        name=input.nextLine();
        System.out.print("enter the weight of "+name+" ");
        weight=input.nextDouble();
        System.out.print("enter the number of seats of the truck: ");
        seats=input.nextInt();
        System.out.print("enter the kilometers travelled: ");
        kilometers_travelled=input.nextDouble();
        System.out.print("enter the number of wheels of the truck: ");
        no_of_wheels=input.nextInt();
        System.out.print("enter the capacity of luggage: ");
        CapacityOfLuggage=input.nextDouble();
        System.out.print("enter the lenght of the front part: ");
        double length_of_front_part=input.nextDouble();  
        Trucks truck1=new Trucks(name,weight,seats,kilometers_travelled,no_of_wheels,CapacityOfLuggage,length_of_front_part);
        
        // using the method which increases the number of kilometers travelled of truck1:
        System.out.print("ener the new distance travelled: ");
        truck1.totalTravellingDistance(input.nextDouble());
        input.nextLine();
        System.out.println("\n");
        //printing all the information: 
        System.out.println("name: "+truck1.name);
        System.out.println("weight of "+truck1.name+" "+truck1.weight);
        System.out.println("seats: "+truck1.seats);
        System.out.println("distance travelled: "+truck1.kilometers_travelled);
        System.out.println("number of wheels: "+truck1.no_of_wheels);
        System.out.println("capacity of luggage: "+truck1.CapacityOfLuggage);
        System.out.println("length of the front part: "+truck1.length_of_front_part);
        
        
        
        // creating a ship object: 
        System.out.print("enter the name of ship: ");
        name=input.nextLine();
        System.out.print("enter the weight of "+name+" ");
        weight=input.nextDouble();
        System.out.print("enter the number of seats of the ship: ");
        seats=input.nextInt();
        System.out.print("enter the kilometers travelled: ");
        kilometers_travelled=input.nextDouble();
        System.out.print("enter the size of propellers: ");
        double size_propellers=input.nextDouble();  
        System.out.print("enter the number of radars: ");
        int no_of_radars=input.nextInt();
        Ship ship1=new Ship(name,weight,seats,kilometers_travelled,size_propellers,no_of_radars);
        
        // using the method which increases the number of kilometers travelled of ship1:
        System.out.print("ener the new distance travelled: ");
        ship1.totalTravellingDistance(input.nextDouble());
        input.nextLine();
        System.out.println("\n");
        //printing all the information:
        System.out.println("name: "+ship1.name);
        System.out.println("weight of "+ship1.name+" "+ship1.weight);
        System.out.println("seats: "+ship1.seats);
        System.out.println("distance travelled: "+ship1.kilometers_travelled);
        System.out.println("size of propellers: "+ship1.size_of_propellers);
        System.out.println("number of radars: "+ship1.no_of_radars);
        
        
        
        
        //creating a boat object: 
        System.out.print("enter the name of boat: ");
        name=input.nextLine();
        System.out.print("enter the weight of "+name+" ");
        weight=input.nextDouble();
        System.out.print("enter the number of seats of the ship: ");
        seats=input.nextInt();
        System.out.print("enter the kilometers travelled: ");
        kilometers_travelled=input.nextDouble();
        System.out.print("enter the size of propellers: ");          
        size_propellers=input.nextDouble();
        System.out.print("enter the number of sticks: ");
        int no_of_sticks=input.nextInt();
        Boats boat1=new Boats(name,weight,seats,kilometers_travelled,size_propellers,no_of_sticks);
        
        // using the method which increases the number of kilometers travelled of boat1:
        System.out.print("ener the new distance travelled: ");
        boat1.totalTravellingDistance(input.nextDouble());
        input.nextLine();
        System.out.println("\n");
        //printing all the information:
         System.out.println("name: "+boat1.name);
        System.out.println("weight of "+boat1.name+" "+boat1.weight);
        System.out.println("seats: "+boat1.seats);
        System.out.println("distance travelled: "+boat1.kilometers_travelled);
        System.out.println("size of propellers: "+boat1.size_of_propellers);
        System.out.println("number of radars: "+boat1.no_of_sticks);
        
        
        // creating a full time employee object: 
        System.out.print("enter the name of the full time employee: ");
        name=input.nextLine();
        System.out.print("enter the salary: ");
        double salary=input.nextDouble();
        System.out.print("enter the bonus salary: ");
        double bonus_salary=input.nextDouble();
        FullTimeEmployee e1=new FullTimeEmployee(name, salary, bonus_salary);
        input.nextLine();
        System.out.println("\n");
        //printing all the information: 
        System.out.println("name of full time employee: "+e1.name);
        System.out.println("salary : "+e1.salary);
        System.out.println("bonus salary: "+e1.bonus_salary);
        
       
        
        // creating a part time employee object: 
         System.out.print("enter the name of the part time employee: ");
        name=input.nextLine();
        System.out.print("enter the salary: ");
        salary=input.nextDouble();
        input.nextLine();
        System.out.print("enter the starting time: ");
        String starting_time=input.nextLine();
        PartTimeEmployee e2= new PartTimeEmployee (name,salary,starting_time);
        System.out.println("\n");
        //printing all the information: 
        System.out.println("name of part time employee: "+e2.name);
        System.out.println("salary : "+e2.salary);
        System.out.println("starting time: "+e2.starting_time);
        
        
        
        
        
    }
}




