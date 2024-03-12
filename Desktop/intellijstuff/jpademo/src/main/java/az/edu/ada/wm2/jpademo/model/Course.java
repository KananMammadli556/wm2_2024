package az.edu.ada.wm2.jpademo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="c_name")
    private String name;

    private Integer credits;

    public String Course(String name, Integer credits){
        this.name = name;
        return "courses/list";
    }
}
