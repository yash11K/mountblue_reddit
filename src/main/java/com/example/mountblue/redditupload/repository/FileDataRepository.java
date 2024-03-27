package com.example.mountblue.redditupload.repository;
import com.example.mountblue.redditupload.entity.FileData;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface FileDataRepository extends JpaRepository<FileData, Integer> {
    Optional<FileData> findByName(String fileName);
}