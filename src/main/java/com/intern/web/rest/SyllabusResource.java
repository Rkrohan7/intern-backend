package com.intern.web.rest;

import com.intern.repository.SyllabusRepository;
import com.intern.service.SyllabusService;
import com.intern.service.dto.SyllabusDTO;
import com.intern.web.rest.errors.BadRequestAlertException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.jhipster.web.util.HeaderUtil;
import tech.jhipster.web.util.ResponseUtil;

/**
 * REST controller for managing {@link com.intern.domain.Syllabus}.
 */
@RestController
@RequestMapping("/api")
public class SyllabusResource {

    private final Logger log = LoggerFactory.getLogger(SyllabusResource.class);

    private static final String ENTITY_NAME = "syllabus";

    @Value("${jhipster.clientApp.name}")
    private String applicationName;

    private final SyllabusService syllabusService;

    private final SyllabusRepository syllabusRepository;

    public SyllabusResource(SyllabusService syllabusService, SyllabusRepository syllabusRepository) {
        this.syllabusService = syllabusService;
        this.syllabusRepository = syllabusRepository;
    }

    /**
     * {@code POST  /syllabi} : Create a new syllabus.
     *
     * @param syllabusDTO the syllabusDTO to create.
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with body the new syllabusDTO, or with status {@code 400 (Bad Request)} if the syllabus has already an ID.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PostMapping("/syllabi")
    public ResponseEntity<SyllabusDTO> createSyllabus(@RequestBody SyllabusDTO syllabusDTO) throws URISyntaxException {
        log.debug("REST request to save Syllabus : {}", syllabusDTO);
        if (syllabusDTO.getId() != null) {
            throw new BadRequestAlertException("A new syllabus cannot already have an ID", ENTITY_NAME, "idexists");
        }
        SyllabusDTO result = syllabusService.save(syllabusDTO);
        return ResponseEntity
            .created(new URI("/api/syllabi/" + result.getId()))
            .headers(HeaderUtil.createEntityCreationAlert(applicationName, false, ENTITY_NAME, result.getId().toString()))
            .body(result);
    }

    /**
     * {@code PUT  /syllabi/:id} : Updates an existing syllabus.
     *
     * @param id the id of the syllabusDTO to save.
     * @param syllabusDTO the syllabusDTO to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated syllabusDTO,
     * or with status {@code 400 (Bad Request)} if the syllabusDTO is not valid,
     * or with status {@code 500 (Internal Server Error)} if the syllabusDTO couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PutMapping("/syllabi/{id}")
    public ResponseEntity<SyllabusDTO> updateSyllabus(
        @PathVariable(value = "id", required = false) final Long id,
        @RequestBody SyllabusDTO syllabusDTO
    ) throws URISyntaxException {
        log.debug("REST request to update Syllabus : {}, {}", id, syllabusDTO);
        if (syllabusDTO.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        if (!Objects.equals(id, syllabusDTO.getId())) {
            throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
        }

        if (!syllabusRepository.existsById(id)) {
            throw new BadRequestAlertException("Entity not found", ENTITY_NAME, "idnotfound");
        }

        SyllabusDTO result = syllabusService.update(syllabusDTO);
        return ResponseEntity
            .ok()
            .headers(HeaderUtil.createEntityUpdateAlert(applicationName, false, ENTITY_NAME, syllabusDTO.getId().toString()))
            .body(result);
    }

    /**
     * {@code PATCH  /syllabi/:id} : Partial updates given fields of an existing syllabus, field will ignore if it is null
     *
     * @param id the id of the syllabusDTO to save.
     * @param syllabusDTO the syllabusDTO to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated syllabusDTO,
     * or with status {@code 400 (Bad Request)} if the syllabusDTO is not valid,
     * or with status {@code 404 (Not Found)} if the syllabusDTO is not found,
     * or with status {@code 500 (Internal Server Error)} if the syllabusDTO couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PatchMapping(value = "/syllabi/{id}", consumes = { "application/json", "application/merge-patch+json" })
    public ResponseEntity<SyllabusDTO> partialUpdateSyllabus(
        @PathVariable(value = "id", required = false) final Long id,
        @RequestBody SyllabusDTO syllabusDTO
    ) throws URISyntaxException {
        log.debug("REST request to partial update Syllabus partially : {}, {}", id, syllabusDTO);
        if (syllabusDTO.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        if (!Objects.equals(id, syllabusDTO.getId())) {
            throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
        }

        if (!syllabusRepository.existsById(id)) {
            throw new BadRequestAlertException("Entity not found", ENTITY_NAME, "idnotfound");
        }

        Optional<SyllabusDTO> result = syllabusService.partialUpdate(syllabusDTO);

        return ResponseUtil.wrapOrNotFound(
            result,
            HeaderUtil.createEntityUpdateAlert(applicationName, false, ENTITY_NAME, syllabusDTO.getId().toString())
        );
    }

    /**
     * {@code GET  /syllabi} : get all the syllabi.
     *
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of syllabi in body.
     */
    @GetMapping("/syllabi")
    public List<SyllabusDTO> getAllSyllabi() {
        log.debug("REST request to get all Syllabi");
        return syllabusService.findAll();
    }

    /**
     * {@code GET  /syllabi/:id} : get the "id" syllabus.
     *
     * @param id the id of the syllabusDTO to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the syllabusDTO, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/syllabi/{id}")
    public ResponseEntity<SyllabusDTO> getSyllabus(@PathVariable Long id) {
        log.debug("REST request to get Syllabus : {}", id);
        Optional<SyllabusDTO> syllabusDTO = syllabusService.findOne(id);
        return ResponseUtil.wrapOrNotFound(syllabusDTO);
    }

    /**
     * {@code DELETE  /syllabi/:id} : delete the "id" syllabus.
     *
     * @param id the id of the syllabusDTO to delete.
     * @return the {@link ResponseEntity} with status {@code 204 (NO_CONTENT)}.
     */
    @DeleteMapping("/syllabi/{id}")
    public ResponseEntity<Void> deleteSyllabus(@PathVariable Long id) {
        log.debug("REST request to delete Syllabus : {}", id);
        syllabusService.delete(id);
        return ResponseEntity
            .noContent()
            .headers(HeaderUtil.createEntityDeletionAlert(applicationName, false, ENTITY_NAME, id.toString()))
            .build();
    }
}
