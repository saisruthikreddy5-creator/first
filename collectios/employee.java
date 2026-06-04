package collectios;

import java.util.Objects;

public class employee {
    private int eid;
    private String ename;
    private int salary;

    public employee(int eid, String ename, int salary) {
        this.eid = eid;
        this.ename = ename;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        employee emp = (employee) o;

        return this.eid == emp.eid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(eid);
    }

    @Override
    public String toString() {
        return "employee{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", salary=" + salary +
                '}';
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
