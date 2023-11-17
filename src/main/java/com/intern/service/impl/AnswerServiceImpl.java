package com.intern.service.impl;

import com.intern.domain.Answer;
import com.intern.repository.AnswerRepository;
import com.intern.service.AnswerService;
import com.intern.service.dto.AnswerDTO;
import com.intern.service.mapper.AnswerMapper;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service Implementation for managing {@link Answer}.
 */
@Service
@Transactional
public class AnswerServiceImpl implements AnswerService {

    private final Logger log = LoggerFactory.getLogger(AnswerServiceImpl.class);

    private final AnswerRepository answerRepository;

    private final AnswerMapper answerMapper;

    public AnswerServiceImpl(AnswerRepository answerRepository, AnswerMapper answerMapper) {
        this.answerRepository = answerRepository;
        this.answerMapper = answerMapper;
    }

    @Override
    public AnswerDTO save(AnswerDTO answerDTO) {
        log.debug("Request to save Answer : {}", answerDTO);
        Answer answer = answerMapper.toEntity(answerDTO);
        answer = answerRepository.save(answer);
        return answerMapper.toDto(answer);
    }

    @Override
    public AnswerDTO update(AnswerDTO answerDTO) {
        log.debug("Request to update Answer : {}", answerDTO);
        Answer answer = answerMapper.toEntity(answerDTO);
        answer = answerRepository.save(answer);
        return answerMapper.toDto(answer);
    }

    @Override
    public Optional<AnswerDTO> partialUpdate(AnswerDTO answerDTO) {
        log.debug("Request to partially update Answer : {}", answerDTO);

        return answerRepository
            .findById(answerDTO.getId())
            .map(existingAnswer -> {
                answerMapper.partialUpdate(existingAnswer, answerDTO);

                return existingAnswer;
            })
            .map(answerRepository::save)
            .map(answerMapper::toDto);
    }

    @Override
    @Transactional(readOnly = true)
    public List<AnswerDTO> findAll() {
        log.debug("Request to get all Answers");
        return answerRepository.findAll().stream().map(answerMapper::toDto).collect(Collectors.toCollection(LinkedList::new));
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<AnswerDTO> findOne(Long id) {
        log.debug("Request to get Answer : {}", id);
        return answerRepository.findById(id).map(answerMapper::toDto);
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete Answer : {}", id);
        answerRepository.deleteById(id);
    }
}
