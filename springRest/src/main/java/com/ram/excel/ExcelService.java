package com.ram.excel;

import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.stereotype.Service;

import com.ram.search.WorkItemDTO;

@Service
public class ExcelService {

	public HSSFWorkbook createWorkbook(String[] header, List<WorkItemDTO> list) {

				HSSFWorkbook wb = new HSSFWorkbook();
				HSSFSheet sheet = wb.createSheet();
				HSSFRow row = null;
				HSSFCell cell = null;
				
				HSSFCellStyle style = wb.createCellStyle();
				HSSFFont font = wb.createFont();
				//font.setFontName(HSSFFont.FONT_ARIAL);
				font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);;
				style.setFont(font);
				
				 row = sheet.createRow(0);
				for (int rn=0; rn<header.length; rn++) {
					   row.createCell(rn).setCellValue(header[rn]);
					   row.getCell(rn).setCellStyle(style);

					}
				
				int rownum=1;
				
				for (int i = 0; i < list.size(); i++) {
				
					row = sheet.createRow(rownum);
						int k =0;
						cell = row.createCell(k);
						cell.setCellValue(list.get(i).getFirstName());
						k++;
						
						cell = row.createCell(k);
						cell.setCellValue(list.get(i).getLastName());
						k++;
						
					rownum++;
					
				}
				
				
		return wb;
	}

	
	
}
