package com.intern.service.mapper;

import com.intern.domain.Syllabus;
import com.intern.service.dto.SyllabusDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Syllabus} and its DTO {@link SyllabusDTO}.
 */
@Mapper(componentModel = "spring")
public interface SyllabusMapper extends EntityMapper<SyllabusDTO, Syllabus> {}
