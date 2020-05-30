package uvsoftgroup.uvsoftgroupgeospatial.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import uvsoftgroup.uvsoftgroupgeospatial.model.FloorInfo;


public interface FloorInfoRepository extends PagingAndSortingRepository<FloorInfo, Long>, FloorInfoRepositoryCustom {

 // Structure of Derived Query Methods
 List<FloorInfo> findByFlUseType(String flUseType);

// "LessThan" and "LessThanEqual"
 List<FloorInfo> findByFlTotalFloorAreaLessThan(double flTotalFloorArea, Pageable pageable);
 List<FloorInfo> findByFlTotalFloorAreaLessThanEqual(double flTotalFloorArea, Pageable pageable);
// "Between"
 List<FloorInfo> findByFlTotalFloorAreaBetween(double flTotalFloorAreaStart, double flTotalFloorAreaEnd, Pageable pageable);
 
//JPQL query definition
@Query(value = "SELECT fl FROM FloorInfo fl ORDER BY flId")
Page<FloorInfo> findAllFloorInfosWithPagination(Pageable pageable);

// Multiple Condition Expressions "And"
 List<FloorInfo> findByFlCodeAndFlUseType(String flCode, String flUseType);
 
// @Query Annotation: pass method parameters to the query in the same order or position
 @Query("SELECT fl FROM FloorInfo fl WHERE fl.flCode = ?1 and fl.flUseType = ?2")
 List<FloorInfo> findByFlCodeFlUseTypeWithQueryAnd(String flCode, String flUseType, Pageable pageable);
 
//Multiple Condition Expressions "Or"
List<FloorInfo> findByFlCodeOrFlUseType(String flCode, String flUseType);

@Query("SELECT fl FROM FloorInfo fl WHERE fl.flCode = ?1 or fl.flUseType = ?2")
List<FloorInfo> findByFlCodeFlUseTypeWithQuery(String flCode, String flUseType, Pageable pageable);

// @Query Annotation: pass method parameters as  named parameters
@Query("SELECT fl FROM FloorInfo fl WHERE fl.flCode = :flCode and fl.flUseType = :flUseType")
List<FloorInfo> findByFlCodeFlUseTypeWithParams(@Param("flUseType") String flUseType, @Param("flCode") String flCode,
		Pageable pageable);

// @Query Annotation: pass method parameters as  named parameters with IN operator
@Query(value = "SELECT fl FROM FloorInfo fl WHERE fl.flUseType IN :flUseTypes")
List<FloorInfo> findFloorInfoByUseTypeList(@Param("flUseTypes")Collection<String> flUseTypes, Pageable pageable);

// @Query Annotation: pass method parameters as  named parameters with IN and LIKE operators
@Query("SELECT fl FROM FloorInfo fl WHERE 1=1"
		+ " AND fl.flUseType IN :flUseTypes"
		+ " AND fl.flCode LIKE %:flCode%"
		+ " AND fl.flName LIKE %:flName%"
		+ " AND fl.flRemark LIKE %:flRemark%")
List<FloorInfo> searchFloorInfo(
		@Param("flUseTypes") List<String> flUseTypes,
		@Param("flCode") String flCode,
		@Param("flName") String flName,
		@Param("flRemark") String flRemark,
		Pageable pageable
		);
// Spring Data JPA Projections
@Query("SELECT fl.flUseType as flUseType,count(fl.flUseType) as count FROM FloorInfo fl GROUP BY fl.flUseType")
List<FloorInfoSummary> countbyFlUseType();


//@Query Annotation: Spring Data JPA Projections domain model dataset
			@Query("SELECT fl.flId as flId,"
			 + "fl.flAdId as flAdId,fl.plId as plId, "
			 + "fl.buId as buId,fl.geoId as geoId, "
			 + "fl.flCode as flCode,fl.flName as flName, "
			 + "fl.flUseType as flUseType,fl.flRemark as flRemark, "
			 + "fl.flNumberOfFloor as flNumberOfFloor,fl.flTotalHeight as flTotalHeight, "
			 + "fl.flNumberOfFloorUnit as flNumberOfFloorUnit,fl.flTotalGroundArea as flTotalGroundArea, "
			 + "fl.flTotalFloorArea as flTotalFloorArea,fl.flSetBackFront as flSetBackFront, "
			 + "fl.flSetBackBack as flSetBackBack,fl.flSetBackRight as flSetBackRight, "
			 + "fl.flSetBackLeft as flSetBackLeft,fl.flCenterLongitude as flCenterLongitude, "
			 + "fl.flCenterLatitude as flCenterLatitude,fl.flLayoutPicture as flLayoutPicture "
			 + "FROM FloorInfo fl ")
			List<FloorInfoData> getAllFloorInfoWithoutGeo(Pageable pageable);
			


}
