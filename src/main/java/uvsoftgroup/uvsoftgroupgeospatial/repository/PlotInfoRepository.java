package uvsoftgroup.uvsoftgroupgeospatial.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import uvsoftgroup.uvsoftgroupgeospatial.model.PlotInfo;

public interface PlotInfoRepository extends PagingAndSortingRepository<PlotInfo, Long>  {

	// @Query Annotation: Spring Data JPA Projections domain model dataset
		@Query("SELECT pl.plId as plId,"
		 + "pl.plAdId as plAdId,pl.geoId as geoId, "
		 + "pl.plCode as plCode,pl.plName as plName, "
		 + "pl.plType as plType,pl.plNumber as plNumber, "
		 + "pl.plMonzaNumber as plMonzaNumber,pl.plCSNumber as plCSNumber, "
		 + "pl.plMSNumber as plMSNumber,pl.plRemark as plRemark, "
		 + "pl.plTotalArea as plTotalArea,pl.plTotalBuildingCoverArea as plTotalBuildingCoverArea, "
		 + "pl.plNumberOfBuilding as plNumberOfBuilding,pl.plHeightFromMSL as plHeightFromMSL, "
		 + "pl.plCenterLongitude as plCenterLongitude,pl.plCenterLatitude as plCenterLatitude, "
		 + "pl.utilityLocationMap as utilityLocationMap,pl.plLayoutPicture as plLayoutPicture "
		 + "FROM PlotInfo pl ")
		List<PlotInfoData> getAllPlotInfoWithoutGeo(Pageable pageable);
}
