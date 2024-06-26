package khu.bigdata.infou.repository;

import khu.bigdata.infou.domain.LectureInflearn;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface LectureInflearnRepository extends JpaRepository<LectureInflearn, Long> {

    Optional<LectureInflearn> findByLectureId(Integer lectureId);

    List<LectureInflearn> findAllByFirstCategoryAndSecondCategory(String firstCategory, String secondCategory);
}
