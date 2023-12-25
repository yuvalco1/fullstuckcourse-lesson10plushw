public class Car {

    public String model;
    public Engine engine;

    public Car(String model) {
        this.model = model;
        this.engine = new Engine(100);
    }

    public void display() {
        System.out.println("Car model= " + this.model + ", engine=" + this.engine.horsepower);
    }

    public class Engine {

        public int horsepower = 100;

        public Engine(int horsepower) {
            this.horsepower = horsepower;
        }

        public void setHorsepower(int horsepower) {
            this.horsepower = horsepower;
        }
    }
}
