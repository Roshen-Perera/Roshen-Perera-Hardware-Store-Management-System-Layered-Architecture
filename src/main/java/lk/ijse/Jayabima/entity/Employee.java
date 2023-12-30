package lk.ijse.Jayabima.entity;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {
    private String Id;
    private String Name;
    private String Role;
    private String Address;
    private String Salary;
    private String Mobile;
}
