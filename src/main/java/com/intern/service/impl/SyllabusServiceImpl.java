package com.intern.service.impl;

import com.intern.domain.Syllabus;
import com.intern.repository.SyllabusRepository;
import com.intern.service.SyllabusService;
import com.intern.service.dto.SyllabusDTO;
import com.intern.service.mapper.SyllabusMapper;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service Implementation for managing {@link Syllabus}.
 */
@Service
@Transactional
public class SyllabusServiceImpl implements SyllabusService {

    private final Logger log = LoggerFactory.getLogger(SyllabusServiceImpl.class);

    private final SyllabusRepository syllabusRepository;

    private final SyllabusMapper syllabusMapper;

    public SyllabusServiceImpl(SyllabusRepository syllabusRepository, SyllabusMapper syllabusMapper) {
        this.syllabusRepository = syllabusRepository;
        this.syllabusMapper = syllabusMapper;
    }

    @Override
    public SyllabusDTO save(SyllabusDTO syllabusDTO) {
        log.debug("Request to save Syllabus : {}", syllabusDTO);
        Syllabus syllabus = syllabusMapper.toEntity(syllabusDTO);
        syllabus = syllabusRepository.save(syllabus);
        return syllabusMapper.toDto(syllabus);
    }

    @Override
    public SyllabusDTO update(SyllabusDTO syllabusDTO) {
        log.debug("Request to update Syllabus : {}", syllabusDTO);
        Syllabus syllabus = syllabusMapper.toEntity(syllabusDTO);
        syllabus = syllabusRepository.save(syllabus);
        return syllabusMapper.toDto(syllabus);
    }

    @Override
    public Optional<SyllabusDTO> partialUpdate(SyllabusDTO syllabusDTO) {
        log.debug("Request to partially update Syllabus : {}", syllabusDTO);

        return syllabusRepository
            .findById(syllabusDTO.getId())
            .map(existingSyllabus -> {
                syllabusMapper.partialUpdate(existingSyllabus, syllabusDTO);

                return existingSyllabus;
            })
            .map(syllabusRepository::save)
            .map(syllabusMapper::toDto);
    }

    @Override
    @Transactional(readOnly = true)
    public List<SyllabusDTO> findAll() {
        log.debug("Request to get all Syllabi");
        return syllabusRepository.findAll().stream().map(syllabusMapper::toDto).collect(Collectors.toCollection(LinkedList::new));
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<SyllabusDTO> findOne(Long id) {
        log.debug("Request to get Syllabus : {}", id);
        return syllabusRepository.findById(id).map(syllabusMapper::toDto);
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete Syllabus : {}", id);
        syllabusRepository.deleteById(id);
    }
}
