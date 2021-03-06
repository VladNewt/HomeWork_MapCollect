package Zadaniye_1;

public class Students implements Comparable<Students> {

    private String sourname;
    private String name;
    private String  secondname;

    public Students() {
    }

    public Students(String sourname, String name, String secondname) {
        this.sourname = sourname;
        this.name = name;
        this.secondname = secondname;
    }

    public String getSourname() {
        return sourname;
    }

    public void setSourname(String sourname) {
        this.sourname = sourname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }

    @Override
    public String toString() {
        return "Students{" +
                "sourname='" + sourname + '\'' +
                ", name='" + name + '\'' +
                ", secondname='" + secondname + '\'' +
                '}';
    }

    @Override
    public int compareTo(Students o) {
        if (this.sourname.compareTo(o.sourname)==0) {
            if (this.name.compareTo(o.name)==0) {
                if(this.secondname.compareTo(o.secondname)==0) {
                    return 0;
                } else {
                    return this.secondname.compareTo(o.secondname);
                }
            } else {
               return this.name.compareTo(o.name);
            }
        } else {
            return this.sourname.compareTo(o.sourname);
        }
    }
}
