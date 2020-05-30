package uvsoftgroup.uvsoftgroupgeospatial.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import uvsoftgroup.uvsoftgroupgeospatial.model.BuildingInfo;
import uvsoftgroup.uvsoftgroupgeospatial.repository.BuildingInfoData;
import uvsoftgroup.uvsoftgroupgeospatial.repository.BuildingInfoRepository;
import uvsoftgroup.uvsoftgroupgeospatial.service.BuildingInfoService;

@Service 
public class BuildingInfoServiceImpl implements BuildingInfoService {

	@Autowired
	private BuildingInfoRepository buildingInfoRepository;

	@Override
	public BuildingInfo saveBuildingInfo(BuildingInfo buildingInfo) {
		return buildingInfoRepository.save(buildingInfo);
	}

	@Override
	public BuildingInfo updateBuildingInfo(BuildingInfo buildingInfo) {
		return buildingInfoRepository.save(buildingInfo);
	}

	@Override
	public void deleteBuildingInfo(Long buId) {
		buildingInfoRepository.deleteById(buId);
		
	}

	@Override
	public Optional<BuildingInfo> findByBuildingInfo(Long buId) {
		return buildingInfoRepository.findById(buId);
	}

	@Override
	public List<BuildingInfoData> getAllBuildingInfoWithoutGeo(int pageNumber, int pageSize) {
		Pageable pageable = PageRequest.of(pageNumber, pageSize, Sort.by("buId").descending());
		List<BuildingInfoData> pageContent =buildingInfoRepository.getAllBuildingInfoWithoutGeo(pageable);
		if (!pageContent.isEmpty()) {
			return pageContent;
		} else {
			return new ArrayList<BuildingInfoData>(pageContent);
		}
	}

	@Override
	public long findCounter(int pageNumber, int pageSize) {
		Pageable pageable = PageRequest.of(pageNumber, pageSize, Sort.by("buId").descending());
		List<BuildingInfoData> pageContent =buildingInfoRepository.getAllBuildingInfoWithoutGeo(pageable);
		if (!pageContent.isEmpty()) {
			return pageContent.size();
		} else {
			return 0;
		}
	}

	
}

