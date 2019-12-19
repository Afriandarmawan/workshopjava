package models;

public class Mokateers {
    String nama;
    int employeeid;
    String departement;

    public Mokateers(){

    }
    public void print(){
        System.out.println("My Name is "+this.nama+ " I am from departement "+this.departement+ " My Employee id is " + this.employeeid);
    }

    public Mokateers(String nama, int employeeid, String departement) {
        this.nama = nama;
        this.employeeid = employeeid;
        this.departement = departement;
    }



    public static void main(String[] args) {
        Mokateers aa = new Mokateers();
        Mokateers bb = new Mokateers("Afrian", 321,"QA");
        bb.print();

    }

}
