package uvsoftgroup.uvsoftgroupgeospatial.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import uvsoftgroup.uvsoftgroupgeospatial.model.PlotInfo;
import uvsoftgroup.uvsoftgroupgeospatial.repository.PlotInfoData;
import uvsoftgroup.uvsoftgroupgeospatial.repository.PlotInfoRepository;
import uvsoftgroup.uvsoftgroupgeospatial.service.PlotInfoService;

@Service
public class PlotInfoServiceImpl implements PlotInfoService {

	@Autowired
	private PlotInfoRepository plotInfoRepository;

	@Override
	public PlotInfo savePlotInfo(PlotInfo plotInfo) {
		return plotInfoRepository.save(plotInfo);
	}

	@Override
	public PlotInfo updatePlotInfo(PlotInfo plotInfo) {
		return plotInfoRepository.save(plotInfo);
	}

	@Override
	public void deletePlotInfo(Long plId) {
		plotInfoRepository.deleteById(plId);
		
	}

	@Override
	public Optional<PlotInfo> findByPlotInfo(Long plId) {

		return plotInfoRepository.findById(plId);
	}

	@Override
	public List<PlotInfoData> getAllPlotInfoWithoutGeo(int pageNumber, int pageSize) {
		Pageable pageable = PageRequest.of(pageNumber, pageSize, Sort.by("plId").descending());
		List<PlotInfoData> pageContent =plotInfoRepository.getAllPlotInfoWithoutGeo(pageable);
		if (!pageContent.isEmpty()) {
			return pageContent;
		} else {
			return new ArrayList<PlotInfoData>(pageContent);
		}
	}

	@Override
	public long findCounter(int pageNumber, int pageSize) {
		Pageable pageable = PageRequest.of(pageNumber, pageSize, Sort.by("plId").descending());
		List<PlotInfoData> pageContent =plotInfoRepository.getAllPlotInfoWithoutGeo(pageable);
		if (!pageContent.isEmpty()) {
			return pageContent.size();
		} else {
			return 0;
		}
	}

	
}
