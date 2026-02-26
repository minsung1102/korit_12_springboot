package korit_12.com.todolist.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Schema
@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Schema(description = "자동 생성되는 고유 ID", example= "1")
    private Long id;

    @NonNull
    @Schema
    private String content;

    @NonNull
    @Schema
    private boolean isCompleted;

    @ManyToOne
    @JoinColumn(name = "user")
    @NonNull
    @JsonIgnore
    private User user;
}
