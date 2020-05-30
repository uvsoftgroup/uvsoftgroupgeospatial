package uvsoftgroup.uvsoftgroupgeospatial.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import uvsoftgroup.uvsoftgroupgeospatial.model.GeometryGisInfo;


public interface GeometryGisInfoRepository extends PagingAndSortingRepository<GeometryGisInfo, Long>  {

	// @Query Annotation: Spring Data JPA Projections domain model dataset
	@Query("SELECT geo.geoId as geoId,"
	 + "geo.adId as adId,geo.plId as plId, "
	 + "geo.buId as buId,geo.flId as flId, "
	 + "geo.unId as unId,geo.userRefNrId as userRefNrId, "
	 + "geo.adRefId as adRefId,geo.adType as adType, "
	 + "geo.adCat as adCat,geo.adCity as adCity, "
	 + "geo.adRoad as adRoad,geo.adRoadType as adRoadType, "
	 + "geo.adHouseNumber as adHouseNumber,geo.adPostCode as adPostCode, "
	 + "geo.adCountry as adCountry,geo.geoType as geoType, "
	 + "geo.wktToGeometry as wktToGeometry "
	 + "FROM GeometryGisInfo geo ")
	List<GeometryGisInfoData> getAllGeometryGisInfoWithoutGeo(Pageable pageable);
				
}
