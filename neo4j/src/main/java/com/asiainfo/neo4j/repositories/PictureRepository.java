package com.asiainfo.neo4j.repositories;

import com.asiainfo.neo4j.domain.Picture;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PictureRepository extends GraphRepository<Picture> {
    Picture findByFileName(String fileName);
}
