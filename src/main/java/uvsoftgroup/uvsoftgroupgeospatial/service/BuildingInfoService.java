package uvsoftgroup.uvsoftgroupgeospatial.service;

import java.util.List;
import java.util.Optional;

import uvsoftgroup.uvsoftgroupgeospatial.model.BuildingInfo;
import uvsoftgroup.uvsoftgroupgeospatial.repository.BuildingInfoData;

public interface BuildingInfoService {
	BuildingInfo saveBuildingInfo(BuildingInfo buildingInfo);
	BuildingInfo updateBuildingInfo(BuildingInfo buildingInfo);
	void deleteBuildingInfo(Long buId);
	Optional<BuildingInfo> findByBuildingInfo(Long buId);
	List<BuildingInfoData> getAllBuildingInfoWithoutGeo(int pageNumber, int pageSize);
	long findCounter(int pageNumber, int pageSize);

}
