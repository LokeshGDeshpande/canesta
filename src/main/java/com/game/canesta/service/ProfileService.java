package com.game.canesta.service;

import com.game.canesta.entity.ProfileEntity;
import com.game.canesta.model.Profile;
import com.game.canesta.repository.IProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProfileService {

    @Autowired
    private IProfileRepository profileRepository;

    public List<Profile> getAllProfiles() {
        List<ProfileEntity> profileEntities = profileRepository.getAllProfiles();
        List<Profile> profiles = new ArrayList<>();
        for (ProfileEntity profileEntity : profileEntities) {
            Profile profile = new Profile();
            profile.setName(profileEntity.getName());
            profile.setTeam(profileEntity.getTeam() == 'A' ? Profile.Team.A : Profile.Team.B);
            profile.setId(profileEntity.getId());

            profiles.add(profile);
        }

        return profiles;
    }

    public Profile getProfile(int id) {
        ProfileEntity profileEntity = profileRepository.getProfile(id);
        Profile profile = new Profile();
        if (profileEntity != null) {
            profile.setName(profileEntity.getName());
            profile.setTeam(profileEntity.getTeam() == 'A' ? Profile.Team.A : Profile.Team.B);
            profile.setId(profileEntity.getId());
        }

        return profile;
    }
}
