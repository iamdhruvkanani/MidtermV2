package domain;

import javax.validation.constraints.*;

import java.io.Serializable;

public class Envelope implements Serializable {
    @NotBlank
    @Size(max = 30)
    @Pattern(regexp = "[A-Za-z]*")
    private String empName = "";


    private String empStatus = "";
    private boolean trained = false;
    private boolean certified  = false;

    public Envelope() {
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpStatus() {
        return empStatus;
    }

    public void setEmpStatus(String empStatus) {
        this.empStatus = empStatus;
    }

    public boolean isTrained() {
        return trained;
    }

    public void setTrained(boolean trained) {
        this.trained = trained;
    }

    public boolean isCertified() {
        return certified;
    }

    public void setCertified(boolean certified) {
        this.certified = certified;
    }

    @Override
    public String toString() {
        return "Envelope{" +
                "employeeName=" + empName +
                ", employeeStatus=" + empStatus +
                ", employeeTrained=" + trained +
                ", employeeCertified=" + certified +
                '}';
    }
}
