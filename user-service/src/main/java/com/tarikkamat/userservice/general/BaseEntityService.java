package com.tarikkamat.userservice.general;

import lombok.Getter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Getter
public abstract class BaseEntityService<E extends BaseEntity, R extends JpaRepository<E, UUID>> {

    protected final R repository;

    public BaseEntityService(R repository) {
        this.repository = repository;
    }

    public E save(E entity) {
        BaseAdditionalFields baseAdditionalFields = entity.getBaseAdditionalFields();

        if (baseAdditionalFields == null) {
            baseAdditionalFields = new BaseAdditionalFields();
        }

        LocalDateTime now = LocalDateTime.now();

        if (entity.getId() == null) {
            baseAdditionalFields.setCreatedAt(now);
        }

        baseAdditionalFields.setUpdatedAt(now);
        entity.setBaseAdditionalFields(baseAdditionalFields);
        entity = repository.save(entity);
        return entity;
    }

    public List<E> findAll() {
        return repository.findAll();
    }

    public E findById(UUID id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteById(UUID id) {
        repository.deleteById(id);
    }
}
