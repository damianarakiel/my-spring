package pl.stefanski.myspring;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
public class MyObject {

    @Id
    @GeneratedValue
    private Long id;

    private String msg;
}
