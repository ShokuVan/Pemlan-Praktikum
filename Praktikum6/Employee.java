package Praktikum6;

public class Employee implements Payable{
    int registrationNumber;
    String name;
    int salaryPerMonth;
    Invoice[] invoices;
    public Employee(){
    }
    public Employee(int registrationNumber, String name, int salaryPerMonth){
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
    }
    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSalaryPerMonth(int salaryPerMonth) {
        this.salaryPerMonth = salaryPerMonth;
    }
    public void setInvoices(Invoice[] invoices) {
        this.invoices = invoices;
    }
    public int getRegistrationNumber() {
        return registrationNumber;
    }
    public String getName() {
        return name;
    }
    public int getSalaryPerMonth() {
        return salaryPerMonth;
    }
    public Invoice[] getInvoices() {
        return invoices;
    }
    public void addInvoice(Invoice invoice){
        if(invoices == null){
            invoices = new Invoice[1];
            invoices[0] = invoice;
        }
        else{
            Invoice[] newInvoices = new Invoice[invoices.length + 1];
            for(int i = 0; i < invoices.length; i++){
                newInvoices[i] = invoices[i];
            }
            newInvoices[newInvoices.length - 1] = invoice;
            invoices = newInvoices;
        }
    }
    public double getPayableAmount(){
        double totalBelanja = 0;
        if(invoices != null){
            for(Invoice invoice : invoices){
                totalBelanja += invoice.getPayableAmount();
            }
        }
        return totalBelanja;
    }
}