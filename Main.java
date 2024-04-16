public class Main {
    public static void main(String[] args) {
        Computercase thecase=new Computercase("2800","Dell","240");
        Motherboard themotherboard=new Motherboard("GT2345","Intel",4,5,"Asus 3498");
        Monitor themonitor=new Monitor("HP","Dell",43,"12x45");
PersonalComputer thePC=new PersonalComputer("45yht","ASus", thecase,themonitor,themotherboard);

thePC.getMonitor().drawPixelAt(4,7,"blue");
thePC.getMotherboard().loadProgram("Win 2020");
thePC.getComputercase().pressPowerButton();
    }
}
