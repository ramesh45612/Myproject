package com.ram.excel;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ram.search.SearchCriteriaCommand;
import com.ram.search.SearchQueryServiceImpl;
import com.ram.search.WorkItemDTO;

@RestController
public class ExcelController {

	@Autowired
	ExcelService excelService;
	
	@Autowired
	SearchQueryServiceImpl searchQueryServiceImpl;
	
	
	@RequestMapping(value="/download", method = RequestMethod.GET)
	public void getDetails(HttpServletResponse response, @RequestParam("seachCriteria") String seachCriteria) throws Exception {
		ObjectMapper objectMapper= new ObjectMapper();
	    objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

		SearchCriteriaCommand command = null;
		
		try {
			command=objectMapper.readValue(seachCriteria, SearchCriteriaCommand.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String header[]={"First Name","Last Name"};
		List<WorkItemDTO> list = searchQueryServiceImpl.retrieveWorktems(command);
		
		HSSFWorkbook wb =excelService.createWorkbook(header,list);

		// write it as an excel attachment
		ByteArrayOutputStream outByteStream = new ByteArrayOutputStream();
		wb.write(outByteStream);
		byte [] outArray = outByteStream.toByteArray();
		response.setContentType("application/ms-excel");
		response.setContentLength(outArray.length);
		response.setHeader("Expires:", "0"); // eliminates browser caching
		response.setHeader("Content-Disposition", "attachment; filename=search.xls");
		OutputStream outStream = response.getOutputStream();
		outStream.write(outArray);
		outStream.flush();
	}

}
