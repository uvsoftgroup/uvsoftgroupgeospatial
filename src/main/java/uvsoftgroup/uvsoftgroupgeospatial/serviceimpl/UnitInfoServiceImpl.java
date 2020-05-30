package uvsoftgroup.uvsoftgroupgeospatial.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import uvsoftgroup.uvsoftgroupgeospatial.model.UnitInfo;
import uvsoftgroup.uvsoftgroupgeospatial.repository.UnitInfoData;
import uvsoftgroup.uvsoftgroupgeospatial.repository.UnitInfoRepository;
import uvsoftgroup.uvsoftgroupgeospatial.service.UnitInfoService;

@Service
public class UnitInfoServiceImpl implements UnitInfoService {

	@Autowired
	private UnitInfoRepository unitInfoRepository;
	
	@Override
	public UnitInfo saveUnitInfo(UnitInfo unitInfo) {
		return unitInfoRepository.save(unitInfo);
	}

	@Override
	public UnitInfo updateUnitInfo(UnitInfo unitInfo) {
		return unitInfoRepository.save(unitInfo);
	}

	@Override
	public void deleteUnitInfo(Long unId) {
		unitInfoRepository.deleteById(unId);
	}

	@Override
	public Optional<UnitInfo> findByUnitInfo(Long unId) {
		return unitInfoRepository.findById(unId);
	}

	@Override
	public List<UnitInfoData> getAllUnitInfoWithoutGeo(int pageNumber, int pageSize) {
		Pageable pageable = PageRequest.of(pageNumber, pageSize, Sort.by("unId").descending());
		List<UnitInfoData> pageContent =unitInfoRepository.getAllUnitInfoWithoutGeo(pageable);
		if (!pageContent.isEmpty()) {
			return pageContent;
		} else {
			return new ArrayList<UnitInfoData>(pageContent);
		}
	}

	@Override
	public long findCounter(int pageNumber, int pageSize) {
		Pageable pageable = PageRequest.of(pageNumber, pageSize, Sort.by("unId").descending());
		List<UnitInfoData> pageContent =unitInfoRepository.getAllUnitInfoWithoutGeo(pageable);
		if (!pageContent.isEmpty()) {
			return pageContent.size();
		} else {
			return 0;
		}
	}

}
