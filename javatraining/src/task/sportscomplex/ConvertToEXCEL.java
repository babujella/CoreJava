package task.sportscomplex;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.StringTokenizer;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ConvertToEXCEL {

	XSSFWorkbook book=new XSSFWorkbook();
	XSSFSheet sheet=book.createSheet("Badminton data");
	XSSFSheet sheet1=book.createSheet("FootBall data");
	XSSFSheet sheet2=book.createSheet("BoxCricket data");

	XSSFRow row;
	public void saveData() throws IOException{
		int rowid=0;
		for(Integer i:Badminton.BadmintonfilledSlots.keySet()) {
			row=sheet.createRow(rowid++);
			String str=(Integer.toString(i))+" "+Badminton.BadmintonfilledSlots.get(i);
			StringTokenizer st=new StringTokenizer(str," ");
			int cellid=0;
			while(st.hasMoreTokens()){
				Cell cell = row.createCell(cellid++);
				cell.setCellValue(st.nextToken());
			}
		}
		FileOutputStream out = new FileOutputStream(new File("C:\\SportsComplex\\SportsComplex.xlsx"));
		book.write(out);
		out.close();
	}
	public void saveData1() throws IOException{
		int rowid=0;
		for(Integer i:FootBall.footBallsfilledSlots.keySet()) {
			row=sheet1.createRow(rowid++);
			String str=(Integer.toString(i))+" "+FootBall.footBallsfilledSlots.get(i);
			StringTokenizer st=new StringTokenizer(str," ");
			int cellid=0;
			while(st.hasMoreTokens()){
				Cell cell = row.createCell(cellid++);
				cell.setCellValue(st.nextToken());
			}
		}
		FileOutputStream out = new FileOutputStream(new File("C:\\SportsComplex\\SportsComplex.xlsx"));
		book.write(out);
		out.close();
	}
	public void saveData2() throws IOException{
		int rowid=0;
		for(Integer i:BoxCricket.boxCricketfilledSlots.keySet()) {
			row=sheet2.createRow(rowid++);
			String str=(Integer.toString(i))+" "+BoxCricket.boxCricketfilledSlots.get(i);
			StringTokenizer st=new StringTokenizer(str," ");
			int cellid=0;
			while(st.hasMoreTokens()){
				Cell cell = row.createCell(cellid++);
				cell.setCellValue(st.nextToken());
			}
		}
		FileOutputStream out = new FileOutputStream(new File("C:\\SportsComplex\\SportsComplex.xlsx"));
		book.write(out);
		out.close();
	}   
}
