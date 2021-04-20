// fichero User.java

package mii.cc.example.api.User;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name="Usuarios")
@Data
public class User implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
    
	private String nombre;
	private String email;
    
}