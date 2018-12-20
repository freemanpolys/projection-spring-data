package com.mygglo.labs.projection.service;

import com.mygglo.labs.projection.domain.JobHistory;

import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing JobHistory.
 */
public interface JobHistoryService {

    /**
     * Save a jobHistory.
     *
     * @param jobHistory the entity to save
     * @return the persisted entity
     */
    JobHistory save(JobHistory jobHistory);

    /**
     * Get all the jobHistories.
     *
     * @return the list of entities
     */
    List<JobHistory> findAll();


    /**
     * Get the "id" jobHistory.
     *
     * @param id the id of the entity
     * @return the entity
     */
    Optional<JobHistory> findOne(Long id);

    /**
     * Delete the "id" jobHistory.
     *
     * @param id the id of the entity
     */
    void delete(Long id);
}
