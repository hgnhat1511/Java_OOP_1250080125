package lab4.bai2;

public class student extends person {
    private String program;
    private int year;
    private double feel;

    public student(String name, String address,String program,int year,double feel) {
        super(name, address);
        this.program=program;
        this.year=year;
        this.feel=feel;
    }

    public String getProgram() {
        return program;
    }
    public void setProgram(String program) {
        this.program = program;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public double getFeel() {
        return feel;
    }
    public void setFeel(double feel) {
        this.feel = feel;
    }
    @Override
    public String toString(){
    return super.toString()+ ", program= " + program + ", year= " + year + ", fee= " + feel ;
    }
}