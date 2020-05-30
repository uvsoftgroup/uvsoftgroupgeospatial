package uvsoftgroup.uvsoftgroupgeospatial.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import uvsoftgroup.uvsoftgroupgeospatial.model.UnitInfo;


public interface UnitInfoRepository  extends PagingAndSortingRepository<UnitInfo, Long>  {

	// @Query Annotation: Spring Data JPA Projections domain model dataset
			@Query("SELECT un.unId as unId,"
			 + "un.unAdId as unAdId,un.plId as plId, "
			 + "un.buId as buId,un.flId as flId, "
			 + "un.geoId as geoId,un.unNumOfRoom as unNumOfRoom, "
			 + "un.unCode as unCode,un.unName as unName, "
			 + "un.unUseType as unUseType,un.unRemark as unRemark, "
			 + "un.unTotalHeight as unTotalHeight,un.unNumOfSubUnit as unNumOfSubUnit, "
			 + "un.unTotalUnitArea as unTotalUnitArea,un.unTotalBuArea as unTotalBuArea, "
			 + "un.unSetBackFront as unSetBackFront,un.unSetBackBack as unSetBackBack, "
			 + "un.unSetBackRight as unSetBackRight,un.unSetBackLeft as unSetBackLeft, "
			 + "un.unCenterLongitude as unCenterLongitude,un.unCenterLatitude as unCenterLatitude,"
			 + "un.unLayoutPicture as unLayoutPicture "
			 + "FROM UnitInfo un ")
			List<UnitInfoData> getAllUnitInfoWithoutGeo(Pageable pageable);
			
}
