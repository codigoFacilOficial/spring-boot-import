package insert.data.springbootimport.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.GenericGenerator;

import java.io.Serializable;


@Data
@Entity
@Table(name = "perros")
public class Perros implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//    @Id
//    @GeneratedValue(generator = "uuid2")
//    @GenericGenerator(name = "uuid2")
//    private String id;

    @Column(name = "nombre_mascota")
    private String nombre;

    @Column(name = "edad")
    private String edad;
}
