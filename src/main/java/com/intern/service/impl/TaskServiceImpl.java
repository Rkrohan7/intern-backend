package com.intern.service.impl;

import com.intern.domain.Task;
import com.intern.repository.TaskRepository;
import com.intern.service.TaskService;
import com.intern.service.dto.TaskDTO;
import com.intern.service.mapper.TaskMapper;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service Implementation for managing {@link Task}.
 */
@Service
@Transactional
public class TaskServiceImpl implements TaskService {

    private final Logger log = LoggerFactory.getLogger(TaskServiceImpl.class);

    private final TaskRepository taskRepository;

    private final TaskMapper taskMapper;

    public TaskServiceImpl(TaskRepository taskRepository, TaskMapper taskMapper) {
        this.taskRepository = taskRepository;
        this.taskMapper = taskMapper;
    }

    @Override
    public TaskDTO save(TaskDTO taskDTO) {
        log.debug("Request to save Task : {}", taskDTO);
        Task task = taskMapper.toEntity(taskDTO);
        task = taskRepository.save(task);
        return taskMapper.toDto(task);
    }

    @Override
    public TaskDTO update(TaskDTO taskDTO) {
        log.debug("Request to update Task : {}", taskDTO);
        Task task = taskMapper.toEntity(taskDTO);
        task = taskRepository.save(task);
        return taskMapper.toDto(task);
    }

    @Override
    public Optional<TaskDTO> partialUpdate(TaskDTO taskDTO) {
        log.debug("Request to partially update Task : {}", taskDTO);

        return taskRepository
            .findById(taskDTO.getId())
            .map(existingTask -> {
                taskMapper.partialUpdate(existingTask, taskDTO);

                return existingTask;
            })
            .map(taskRepository::save)
            .map(taskMapper::toDto);
    }

    @Override
    @Transactional(readOnly = true)
    public List<TaskDTO> findAll() {
        log.debug("Request to get all Tasks");
        return taskRepository.findAll().stream().map(taskMapper::toDto).collect(Collectors.toCollection(LinkedList::new));
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<TaskDTO> findOne(Long id) {
        log.debug("Request to get Task : {}", id);
        return taskRepository.findById(id).map(taskMapper::toDto);
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete Task : {}", id);
        taskRepository.deleteById(id);
    }
}
