package com.mygglo.labs.projection.service.impl;

import com.mygglo.labs.projection.service.JobHistoryService;
import com.mygglo.labs.projection.domain.JobHistory;
import com.mygglo.labs.projection.repository.JobHistoryRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * Service Implementation for managing JobHistory.
 */
@Service
@Transactional
public class JobHistoryServiceImpl implements JobHistoryService {

    private final Logger log = LoggerFactory.getLogger(JobHistoryServiceImpl.class);

    private final JobHistoryRepository jobHistoryRepository;

    public JobHistoryServiceImpl(JobHistoryRepository jobHistoryRepository) {
        this.jobHistoryRepository = jobHistoryRepository;
    }

    /**
     * Save a jobHistory.
     *
     * @param jobHistory the entity to save
     * @return the persisted entity
     */
    @Override
    public JobHistory save(JobHistory jobHistory) {
        log.debug("Request to save JobHistory : {}", jobHistory);
        return jobHistoryRepository.save(jobHistory);
    }

    /**
     * Get all the jobHistories.
     *
     * @return the list of entities
     */
    @Override
    @Transactional(readOnly = true)
    public List<JobHistory> findAll() {
        log.debug("Request to get all JobHistories");
        return jobHistoryRepository.findAll();
    }


    /**
     * Get one jobHistory by id.
     *
     * @param id the id of the entity
     * @return the entity
     */
    @Override
    @Transactional(readOnly = true)
    public Optional<JobHistory> findOne(Long id) {
        log.debug("Request to get JobHistory : {}", id);
        return jobHistoryRepository.findById(id);
    }

    /**
     * Delete the jobHistory by id.
     *
     * @param id the id of the entity
     */
    @Override
    public void delete(Long id) {
        log.debug("Request to delete JobHistory : {}", id);
        jobHistoryRepository.deleteById(id);
    }
}
