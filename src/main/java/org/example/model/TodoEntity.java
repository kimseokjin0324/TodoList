package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor          //- 어노테이션은 파라미터가 없는 기본생성자 생성
@AllArgsConstructor         //- 어노테이션은 모든 필드 값을 파라미터로 받는 생성자를 만들어줌
public class TodoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)     //-자동생성하고 Identity : 데이터베이스에 위임
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(name = "todoOrder",nullable = false)
    private Long order;

    @Column(nullable = false)
    private Boolean completed;
}
