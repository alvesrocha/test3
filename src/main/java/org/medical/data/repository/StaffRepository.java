package org.medical.data.repository;

import java.util.List;

import org.medical.data.domain.source.ModStaff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StaffRepository extends JpaRepository<ModStaff, Long> {

	public ModStaff findByStaffid(Long staffid);
	
	@Query("SELECT s FROM ModStaff s WHERE s.deptid.deptid = :deptId AND activated = 'y'")
	public List<ModStaff> findByDeptidAndActivated(Long deptId);
	
	@Query("SELECT s FROM ModStaff s WHERE s.deptid.deptid = :deptId")
	public List<ModStaff> findByDeptid(Long deptId);
	
	@Query("SELECT s FROM ModStaff s WHERE activated = 'y'")
	public List<ModStaff> findActivated();
	
	public List<ModStaff> findAll();
}
