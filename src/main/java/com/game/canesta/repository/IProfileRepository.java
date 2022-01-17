package com.game.canesta.repository;

import com.game.canesta.entity.ProfileEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProfileRepository extends CrudRepository<ProfileEntity, Integer> {

    @Query("SELECT profile FROM ProfileEntity profile WHERE profile.id=?1")
    public ProfileEntity getProfile(int id);

    @Query("SELECT profile FROM ProfileEntity profile")
    public List<ProfileEntity> getAllProfiles();
}
