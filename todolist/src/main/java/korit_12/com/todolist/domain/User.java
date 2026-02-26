package korit_12.com.todolist.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Entity
@NoArgsConstructor
@RequiredArgsConstructor

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    private Long Userid;

    @Getter @Setter @NonNull
    private String userName;

    @Getter @Setter @NonNull
    private String password;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    @Getter @Setter
    private List<Todo> todos;
}
