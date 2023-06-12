package com.exam.examserver.service.implementation;

import com.exam.examserver.model.exam.Question;
import com.exam.examserver.model.exam.Quiz;
import com.exam.examserver.repository.QuestionRepository;
import com.exam.examserver.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionRepository questionRepo;

    @Override
    public Question addQuestion(Question question) {
        return this.questionRepo.save(question);
    }

    @Override
    public Question getQuestion(Long questionId) {
        return this.questionRepo.findById(questionId).get();
    }

    @Override
    public Question updateQuestion(Question question) {
        return this.questionRepo.save(question);
    }

    @Override
    public Set<Question> getQuestions() {
        return new HashSet<>(this.questionRepo.findAll());
    }

    @Override
    public Set<Question> getQuestionsOfQuiz(Quiz quiz) {
        return this.questionRepo.findByQuiz(quiz);
    }

    @Override
    public void deleteQuestion(Long questionId) {
        Question question = new Question();
        question.setQuesId(questionId);
        this.questionRepo.delete(question);
    }

    @Override
    public Question get(Long questionId) {
        return this.questionRepo.getOne(questionId);
    }
}
