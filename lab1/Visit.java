package lab1;

public class Visit {
    private String service;
    private double price;
    private Date visitDate;

    public Visit() {
        this.service = "";
        this.price = 0.0;
        this.visitDate = new Date();
    }

    public Visit(String service, double price, Date visitDate) {
        this.service = service;
        this.price = price;
        this.visitDate = visitDate;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(Date visitDate) {
        this.visitDate = visitDate;
    }

    public void printInfo() {
        System.out.printf("Service: %s, Price: %.2f, Date: ", service, price);
        visitDate.printInfo();
    }
}
