package uvsoftgroup.uvsoftgroupgeospatial.service;

import java.util.List;
import java.util.Optional;

import uvsoftgroup.uvsoftgroupgeospatial.model.UnitInfo;
import uvsoftgroup.uvsoftgroupgeospatial.repository.UnitInfoData;

public interface UnitInfoService {
	UnitInfo saveUnitInfo(UnitInfo unitInfo);
	UnitInfo updateUnitInfo(UnitInfo unitInfo);
	void deleteUnitInfo(Long unId);
	Optional<UnitInfo> findByUnitInfo(Long unId);
	List<UnitInfoData> getAllUnitInfoWithoutGeo(int pageNumber, int pageSize);
	long findCounter(int pageNumber, int pageSize);
}
