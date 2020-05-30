package uvsoftgroup.uvsoftgroupgeospatial.service;

import java.util.List;
import java.util.Optional;
import uvsoftgroup.uvsoftgroupgeospatial.model.PlotInfo;
import uvsoftgroup.uvsoftgroupgeospatial.repository.PlotInfoData;

public interface PlotInfoService {
	PlotInfo savePlotInfo(PlotInfo plotInfo);
	PlotInfo updatePlotInfo(PlotInfo plotInfo);
	void deletePlotInfo(Long plId);
	Optional<PlotInfo> findByPlotInfo(Long plId);
	List<PlotInfoData> getAllPlotInfoWithoutGeo(int pageNumber, int pageSize);
	long findCounter(int pageNumber, int pageSize);

}
