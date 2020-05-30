package uvsoftgroup.uvsoftgroupgeospatial.service;

import java.util.List;
import java.util.Optional;

import uvsoftgroup.uvsoftgroupgeospatial.model.FloorInfo;
import uvsoftgroup.uvsoftgroupgeospatial.repository.FloorInfoData;

public interface FloorInfoService {
	
	FloorInfo saveFloorInfo(FloorInfo floorInfo);
	FloorInfo updateFloorInfo(FloorInfo floorInfo);
	void deleteFloorInfo(Long flId);
	Optional<FloorInfo> findByFloorInfo(Long flId);
	List<FloorInfoData> getAllFloorInfoWithoutGeo(int pageNumber, int pageSize);
	long findCounter(int pageNumber, int pageSize);
	

}
