package uvsoftgroup.uvsoftgroupgeospatial.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import uvsoftgroup.uvsoftgroupgeospatial.model.BuildingInfo;


public interface BuildingInfoRepository  extends PagingAndSortingRepository<BuildingInfo, Long>  {

	// @Query Annotation: Spring Data JPA Projections domain model dataset
			@Query("SELECT bu.buId as buId,"
			 + "bu.buAdId as buAdId,bu.plId as plId, "
			 + "bu.geoId as geoId,bu.buCode as buCode, "
			 + "bu.buName as buName,bu.buUseType as buUseType, "
			 + "bu.buRemark as buRemark,bu.buNumberOfFloor as buNumberOfFloor, "
			 + "bu.buTotalHeight as buTotalHeight,bu.buNumberOfFloorUnit as buNumberOfFloorUnit, "
			 + "bu.buTotalGroundArea as buTotalGroundArea,bu.buTotalFloorArea as buTotalFloorArea, "
			 + "bu.buSetBackFront as buSetBackFront,bu.buSetBackBack as buSetBackBack, "
			 + "bu.buSetBackRight as buSetBackRight,bu.buSetBackLeft as buSetBackLeft, "
			 + "bu.buCenterLongitude as buCenterLongitude,bu.buCenterLatitude as buCenterLatitude, "
			 + "bu.buLayoutPicture as buLayoutPicture "
			 + "FROM BuildingInfo bu ")
			List<BuildingInfoData> getAllBuildingInfoWithoutGeo(Pageable pageable);
						
}
