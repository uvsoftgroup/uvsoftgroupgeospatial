package uvsoftgroup.uvsoftgroupgeospatial.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.vividsolutions.jts.geom.Geometry;
import uvsoftgroup.uvsoftgroupgeospatial.model.GeometryGisInfo;
import uvsoftgroup.uvsoftgroupgeospatial.repository.GeometryGisInfoData;
import uvsoftgroup.uvsoftgroupgeospatial.repository.GeometryGisInfoRepository;
import uvsoftgroup.uvsoftgroupgeospatial.service.GeometryGisInfoService;
import uvsoftgroup.uvsoftgroupgeospatial.utility.WktToGeometry;

@Service
public class GeometryGisInfoServiceImpl implements GeometryGisInfoService {

	@Autowired
	private GeometryGisInfoRepository geometryGisInfoRepository;

	@Override
	public GeometryGisInfo saveGeometryGisInfo(GeometryGisInfo geometryGisInfo) {
      GeometryGisInfo geometryGisDataInfoSave=new GeometryGisInfo();
		
		if (geometryGisInfo.getWktToGeometry() != null) {
			Geometry geom = WktToGeometry.wktToGeometry(geometryGisInfo.getWktToGeometry());
			 geom.setSRID(4326);
			 geometryGisDataInfoSave.setGeom(geom);
			 geometryGisDataInfoSave.setGeoType(geom.getGeometryType().toUpperCase());
			 geometryGisDataInfoSave.setWktToGeometry(geometryGisInfo.getWktToGeometry());
			 geometryGisDataInfoSave.setAdCity(geometryGisInfo.getAdCity());
			 geometryGisDataInfoSave.setAdCountry(geometryGisInfo.getAdCountry());
			 geometryGisDataInfoSave.setAdPostCode(geometryGisInfo.getAdPostCode());
			 geometryGisDataInfoSave.setAdHouseNumber(geometryGisInfo.getAdHouseNumber());
			 geometryGisDataInfoSave.setAdRefId(geometryGisInfo.getAdRefId());
			 geometryGisDataInfoSave.setAdRoad(geometryGisInfo.getAdRoad());
			 geometryGisDataInfoSave.setAdRoadType(geometryGisInfo.getAdRoadType());
			 geometryGisDataInfoSave.setAdType(geometryGisInfo.getAdType());
			 geometryGisDataInfoSave.setAdCat(geometryGisInfo.getAdCat());
			 
			 geometryGisDataInfoSave.setAdId(geometryGisInfo.getAdId());
			 geometryGisDataInfoSave.setPlId(geometryGisInfo.getPlId());
			 geometryGisDataInfoSave.setBuId(geometryGisInfo.getBuId());
			 geometryGisDataInfoSave.setFlId(geometryGisInfo.getFlId());
			 geometryGisDataInfoSave.setUnId(geometryGisInfo.getUnId());
			 
		} 
		return geometryGisInfoRepository.save(geometryGisDataInfoSave);
	}

	@Override
	public GeometryGisInfo updateGeometryGisInfo(GeometryGisInfo geometryGisInfo) {
GeometryGisInfo geometryGisDataInfoSave=new GeometryGisInfo();
		
		if (geometryGisInfo.getWktToGeometry() != null) {
			Geometry geom = WktToGeometry.wktToGeometry(geometryGisInfo.getWktToGeometry());
			 geom.setSRID(4326);
			 geometryGisDataInfoSave.setGeom(geom);
			 geometryGisDataInfoSave.setGeoType(geom.getGeometryType().toUpperCase());
			 geometryGisDataInfoSave.setWktToGeometry(geometryGisInfo.getWktToGeometry());
			 geometryGisDataInfoSave.setAdCity(geometryGisInfo.getAdCity());
			 geometryGisDataInfoSave.setAdCountry(geometryGisInfo.getAdCountry());
			 geometryGisDataInfoSave.setAdPostCode(geometryGisInfo.getAdPostCode());
			 geometryGisDataInfoSave.setAdHouseNumber(geometryGisInfo.getAdHouseNumber());
			 geometryGisDataInfoSave.setAdRefId(geometryGisInfo.getAdRefId());
			 geometryGisDataInfoSave.setAdRoad(geometryGisInfo.getAdRoad());
			 geometryGisDataInfoSave.setAdRoadType(geometryGisInfo.getAdRoadType());
			 geometryGisDataInfoSave.setAdType(geometryGisInfo.getAdType());
			 geometryGisDataInfoSave.setAdCat(geometryGisInfo.getAdCat());
			 geometryGisDataInfoSave.setGeoId(geometryGisInfo.getGeoId());
		} 
		return geometryGisInfoRepository.save(geometryGisDataInfoSave);
	}

	@Override
	public void deleteGeometryGisInfo(Long geoId) {
		geometryGisInfoRepository.deleteById(geoId);
	}

	@Override
	public Optional<GeometryGisInfo> findByGeometryGisInfo(Long geoId) {
		return geometryGisInfoRepository.findById(geoId);
	}

	@Override
	public List<GeometryGisInfoData> getAllGeometryGisInfoWithoutGeo(int pageNumber, int pageSize) {
		Pageable pageable = PageRequest.of(pageNumber, pageSize, Sort.by("geoId").descending());
		List<GeometryGisInfoData> pageContent =geometryGisInfoRepository.getAllGeometryGisInfoWithoutGeo(pageable);
		if (!pageContent.isEmpty()) {
			return pageContent;
		} else {
			return new ArrayList<GeometryGisInfoData>(pageContent);
		}
	}

	@Override
	public long findCounter(int pageNumber, int pageSize) {
		Pageable pageable = PageRequest.of(pageNumber, pageSize, Sort.by("geoId").descending());
		Page<GeometryGisInfo> pageContent =geometryGisInfoRepository.findAll(pageable);
		if (!pageContent.getContent().isEmpty()) {
			return pageContent.getContent().size();
		} else {
			return 0;
		}
	}

	
}
