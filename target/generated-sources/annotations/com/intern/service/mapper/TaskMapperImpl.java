package com.intern.service.mapper;

import com.intern.domain.Task;
import com.intern.service.dto.TaskDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-17T13:13:57+0530",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 11.0.21 (Azul Systems, Inc.)"
)
@Component
public class TaskMapperImpl implements TaskMapper {

    @Override
    public Task toEntity(TaskDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Task task = new Task();

        task.setId( dto.getId() );
        task.setTaskName( dto.getTaskName() );

        return task;
    }

    @Override
    public TaskDTO toDto(Task entity) {
        if ( entity == null ) {
            return null;
        }

        TaskDTO taskDTO = new TaskDTO();

        taskDTO.setId( entity.getId() );
        taskDTO.setTaskName( entity.getTaskName() );

        return taskDTO;
    }

    @Override
    public List<Task> toEntity(List<TaskDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Task> list = new ArrayList<Task>( dtoList.size() );
        for ( TaskDTO taskDTO : dtoList ) {
            list.add( toEntity( taskDTO ) );
        }

        return list;
    }

    @Override
    public List<TaskDTO> toDto(List<Task> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<TaskDTO> list = new ArrayList<TaskDTO>( entityList.size() );
        for ( Task task : entityList ) {
            list.add( toDto( task ) );
        }

        return list;
    }

    @Override
    public void partialUpdate(Task entity, TaskDTO dto) {
        if ( dto == null ) {
            return;
        }

        if ( dto.getId() != null ) {
            entity.setId( dto.getId() );
        }
        if ( dto.getTaskName() != null ) {
            entity.setTaskName( dto.getTaskName() );
        }
    }
}
