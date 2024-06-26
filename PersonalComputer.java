public class PersonalComputer extends Product{
    private Computercase computercase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PersonalComputer(String model, String manufacturer,
                            Computercase computercase,
                            Monitor monitor, Motherboard motherboard) {
        super(model, manufacturer);
        this.computercase = computercase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public Computercase getComputercase() {
        return computercase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }
}
