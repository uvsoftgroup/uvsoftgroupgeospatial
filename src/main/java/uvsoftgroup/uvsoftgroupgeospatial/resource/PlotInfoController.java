package uvsoftgroup.uvsoftgroupgeospatial.resource;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import uvsoftgroup.uvsoftgroupgeospatial.model.PlotInfo;
import uvsoftgroup.uvsoftgroupgeospatial.repository.PlotInfoData;
import uvsoftgroup.uvsoftgroupgeospatial.service.PlotInfoService;

@RestController
@RequestMapping(value="/plotinfo")
public class PlotInfoController {
	@Autowired
	private PlotInfoService plotInfoService;
	
	@RequestMapping(value = "/savePlotInfo", method = RequestMethod.POST)
	public PlotInfo savePlotInfo(@Valid @RequestBody PlotInfo plotInfo){
		return plotInfoService.savePlotInfo(plotInfo);
	}
	
	@RequestMapping(value = "/updatePlotInfo", method = RequestMethod.PUT)
	public PlotInfo updatePlotInfo(@Valid @RequestBody PlotInfo plotInfo){
		return plotInfoService.updatePlotInfo(plotInfo);
	}
	
	@RequestMapping(value="deletePlotInfo/{plId}",
			method=RequestMethod.DELETE)
	public void deletePlotInfo(@PathVariable("plId") Long plId){
		plotInfoService.deletePlotInfo(plId);	
	}
	
	@RequestMapping(value="findByPlotInfo/{plId}",
			method=RequestMethod.GET)
	public Optional<PlotInfo> findByPlotInfo(@PathVariable("plId") Long plId){
		return plotInfoService.findByPlotInfo(plId);	
	}
	
	@RequestMapping(value = "/getAllPlotInfoWithoutGeo", method = RequestMethod.GET)
	public List<PlotInfoData> getAllPlotInfoWithoutGeo(
			@RequestParam(name = "pageNumber", required = false, defaultValue = "0") int pageNumber,
			@RequestParam(name = "pageSize", required = false, defaultValue = "30") int pageSize) {
		List<PlotInfoData> list =plotInfoService.getAllPlotInfoWithoutGeo(pageNumber, pageSize);
		return list;
	}

	@RequestMapping(value = "/findCounter", method = RequestMethod.GET)
	public long findCounter(
			@RequestParam(name = "pageNumber", required = false, defaultValue = "0") int pageNumber,
			@RequestParam(name = "pageSize", required = false, defaultValue = "30") int pageSize) {
		long counter =plotInfoService.findCounter(pageNumber, pageSize);
		return counter;
	}
	

}
