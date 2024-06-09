/*
 * You can use the following import statements
 *
 * import org.springframework.data.jpa.repository.JpaRepository;
 * import org.springframework.stereotype.Repository;
 * 
 */

// Write your code here
package com.example.wordlyweek.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.wordlyweek.model.Magazine;

@Repository
public interface MagazineJpaRepository extends JpaRepository<Magazine, Integer> {
}