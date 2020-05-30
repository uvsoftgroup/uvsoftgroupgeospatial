package uvsoftgroup.uvsoftgroupgeospatial.service;

import java.util.List;
import java.util.Optional;

import uvsoftgroup.uvsoftgroupgeospatial.model.GeometryGisInfo;
import uvsoftgroup.uvsoftgroupgeospatial.repository.GeometryGisInfoData;

public interface GeometryGisInfoService {
	GeometryGisInfo saveGeometryGisInfo(GeometryGisInfo geometryGisInfo);
	GeometryGisInfo updateGeometryGisInfo(GeometryGisInfo geometryGisInfo);
	void deleteGeometryGisInfo(Long geoId);
	Optional<GeometryGisInfo> findByGeometryGisInfo(Long geoId);
	List<GeometryGisInfoData> getAllGeometryGisInfoWithoutGeo(int pageNumber, int pageSize);
	long findCounter(int pageNumber, int pageSize);
	
}
