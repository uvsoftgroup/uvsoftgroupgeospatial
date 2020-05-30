package uvsoftgroup.uvsoftgroupgeospatial.repository;

import java.util.List;
import java.util.Set;

import uvsoftgroup.uvsoftgroupgeospatial.model.FloorInfo;

public interface FloorInfoRepositoryCustom {
	List<FloorInfo> findFloorInfoByFlUseType(Set<String> flUseTypes);

}
