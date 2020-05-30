package uvsoftgroup.uvsoftgroupgeospatial.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import uvsoftgroup.uvsoftgroupgeospatial.model.FloorInfo;
import uvsoftgroup.uvsoftgroupgeospatial.repository.FloorInfoData;
import uvsoftgroup.uvsoftgroupgeospatial.repository.FloorInfoRepository;
import uvsoftgroup.uvsoftgroupgeospatial.service.FloorInfoService;

@Service
public class FloorInfoServiceImpl implements FloorInfoService{
	@Autowired
	private FloorInfoRepository floorInfoRepository;

	@Override
	public FloorInfo saveFloorInfo(FloorInfo floorInfo) {
		return floorInfoRepository.save(floorInfo);
	}

	@Override
	public FloorInfo updateFloorInfo(FloorInfo floorInfo) {
		return floorInfoRepository.save(floorInfo);
	}

	@Override
	public void deleteFloorInfo(Long flId) {
		floorInfoRepository.deleteById(flId);
		
	}

	@Override
	public Optional<FloorInfo> findByFloorInfo(Long flId) {
		return floorInfoRepository.findById(flId);
	}

	@Override
	public List<FloorInfoData> getAllFloorInfoWithoutGeo(int pageNumber, int pageSize) {
		Pageable pageable = PageRequest.of(pageNumber, pageSize, Sort.by("flId").descending());
		List<FloorInfoData> pageContent =floorInfoRepository.getAllFloorInfoWithoutGeo(pageable);
		if (!pageContent.isEmpty()) {
			return pageContent;
		} else {
			return new ArrayList<FloorInfoData>(pageContent);
		}
	}

	@Override
	public long findCounter(int pageNumber, int pageSize) {
		Pageable pageable = PageRequest.of(pageNumber, pageSize, Sort.by("flId").descending());
		List<FloorInfoData> pageContent =floorInfoRepository.getAllFloorInfoWithoutGeo(pageable);
		if (!pageContent.isEmpty()) {
			return pageContent.size();
		} else {
			return 0;
		}
	}

	
}
