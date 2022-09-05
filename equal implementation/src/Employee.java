public class Employee {
    int id;
    String code;
    String name;
    String nic;
    String address;

    public Employee(){

    }


    public Employee(int id, String code, String name, String nic, String address ){
        this.id=id;
        this.code=code;
        this.name=name;
        this.nic=nic;
        this.address=address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }



    @Override
    public boolean equals(Object obj) {
        Employee emp=(Employee)obj;
        return ((this.id== emp.id)&&(this.code==emp.code));
    }



}
