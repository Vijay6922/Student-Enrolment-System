package studentInfo.repositories;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import studentInfo.entities.Batch;
import studentInfo.entities.Student;

public interface BatchRepo extends JpaRepository<Batch, Integer> {

	// 6
	@Query("from Batch b where :today between b.startDate and b.endDate")
	List<Batch> getRunningBatch(@Param("today") LocalDate today);

	// 7
	@Query("from Batch b where b.endDate <:today ")
	List<Batch> getCompletedBatch(LocalDate today);

	// 8
	@Query("select b.students from Batch b where :today between b.startDate and b.endDate")
	List<Student> getRunningBatchStudents(@Param("today") LocalDate today);

	// 11
	List<Batch> findByCode(String code);

	// 13
	@Query("from Batch b where  b.startDate between :firstdate and :seconddate ")
	List<Batch> getRunningBatchBetweenDates(@Param("firstdate") LocalDate firstdate,
			@Param("seconddate") LocalDate seconddate);

}