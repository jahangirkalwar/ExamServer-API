package com.exam.examserver.repository;

import com.exam.examserver.model.exam.Question;
import com.exam.examserver.model.exam.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface QuestionRepository extends JpaRepository<Question,Long> {

    //custom finder method
    Set<Question> findByQuiz(Quiz quiz);
}
