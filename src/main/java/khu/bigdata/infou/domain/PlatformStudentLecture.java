package khu.bigdata.infou.domain;

import jakarta.persistence.*;
import khu.bigdata.infou.domain.enums.UserType;
import lombok.*;
import org.hibernate.annotations.DynamicInsert;

import java.util.List;

@Entity
@Getter
@Builder
@DynamicInsert
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)  // 생성 로직 규정
@Table(name = "platform_student_lecture")
public class PlatformStudentLecture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "user_id", nullable = false)
    private Integer userId;


    @Enumerated(EnumType.STRING)
    @Column(name = "user_type", nullable = false)
    private UserType userType;

    @OneToMany(mappedBy = "platformStudentLecture")
    private List<LectureInflearn> lectureInflearnList;

    @OneToMany(mappedBy = "platformStudentLecture")
    private List<LectureUdemy> lectureUdemyList;
}
