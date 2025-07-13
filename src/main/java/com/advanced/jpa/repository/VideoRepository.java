package com.advanced.jpa.repository;

import com.advanced.jpa.model.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video,Integer> {
}
