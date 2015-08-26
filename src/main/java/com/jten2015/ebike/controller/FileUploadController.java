package com.jten2015.ebike.controller;

import java.io.FileOutputStream;
import java.util.Calendar;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.jten2015.ebike.controller.FileUploadController;

@Controller
@RequestMapping("/file")
public class FileUploadController {

	// Logger 객체를 얻어옴
	private static final Log LOG = LogFactory.getLog( FileUploadController.class );
		
	// 파일 저장 경로 지정
	private static final String SAVE_PATH = "C:\\temp";
	
	@RequestMapping("/upload")
	public String upload( @RequestParam( "productImage1" ) MultipartFile image1, 
						  @RequestParam( "productImage2" ) MultipartFile image2, @RequestParam( "productImage3" ) MultipartFile image3, Model model ){
		
		// image1
		if( image1.isEmpty() == false ) {
			
	        String fileOriginalName = image1.getOriginalFilename();
	        String extName = fileOriginalName.substring( fileOriginalName.lastIndexOf(".") + 1, fileOriginalName.length() );
	        String fileName = image1.getName();
	        Long size = image1.getSize();
	        
	        String saveFileName = genSaveFileName( extName );
	        String url = "/product-images/" + saveFileName;
	
	        LOG.debug( " ######## fileOriginalName : " + fileOriginalName );
	        LOG.debug( " ######## fileName : " + fileName );
	        LOG.debug( " ######## fileSize : " + size );
	        LOG.debug( " ######## fileExtensionName : " + extName );
	        LOG.debug( " ######## saveFileName : " + saveFileName );        
	
	        writeFile( image1, SAVE_PATH, saveFileName );
	        
	        model.addAttribute( "productImageUrl1", url );
		}
		
		// image2
		if( image2.isEmpty() == false ) {
			
	        String fileOriginalName = image2.getOriginalFilename();
	        String extName = fileOriginalName.substring( fileOriginalName.lastIndexOf(".") + 1, fileOriginalName.length() );
	        String fileName = image2.getName();
	        Long size = image1.getSize();
	        
	        String saveFileName = genSaveFileName( extName );
	        String url = "/product-images/" + saveFileName;
	
	        LOG.debug( " ######## fileOriginalName : " + fileOriginalName );
	        LOG.debug( " ######## fileName : " + fileName );
	        LOG.debug( " ######## fileSize : " + size );
	        LOG.debug( " ######## fileExtensionName : " + extName );
	        LOG.debug( " ######## saveFileName : " + saveFileName );        
	
	        writeFile( image2, SAVE_PATH, saveFileName );
	        
	        model.addAttribute( "productImageUrl2", url );
		}
				
		// image3
		if( image3.isEmpty() == false ) {
			
	        String fileOriginalName = image3.getOriginalFilename();
	        String extName = fileOriginalName.substring( fileOriginalName.lastIndexOf(".") + 1, fileOriginalName.length() );
	        String fileName = image3.getName();
	        Long size = image3.getSize();
	        
	        String saveFileName = genSaveFileName( extName );
	        String url = "/product-images/" + saveFileName;
	
	        LOG.debug( " ######## fileOriginalName : " + fileOriginalName );
	        LOG.debug( " ######## fileName : " + fileName );
	        LOG.debug( " ######## fileSize : " + size );
	        LOG.debug( " ######## fileExtensionName : " + extName );
	        LOG.debug( " ######## saveFileName : " + saveFileName );        
	
	        writeFile( image3, SAVE_PATH, saveFileName );
	        
	        model.addAttribute( "productImageUrl3", url );
		}
				
		
		return "result";
	}
	
	private void writeFile( MultipartFile file, String path, String fileName ) {
		
		FileOutputStream fos = null;
		
		try {
			
			byte fileData[] = file.getBytes();
			fos = new FileOutputStream( path + "\\" + fileName );
			fos.write(fileData);
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		} finally {
			
			if (fos != null) {
				try {
					fos.close();
				} catch (Exception e) {
				}
			}
			
		}
		
	}
	
	private String genSaveFileName( String extName ) {
		
        Calendar calendar = Calendar.getInstance();
		String fileName = "";
        
        fileName += calendar.get( Calendar.YEAR );
        fileName += calendar.get( Calendar.MONTH );
        fileName += calendar.get( Calendar.DATE );
        fileName += calendar.get( Calendar.HOUR );
        fileName += calendar.get( Calendar.MINUTE );
        fileName += calendar.get( Calendar.SECOND );
        fileName += calendar.get( Calendar.MILLISECOND );
        fileName += ( "." + extName );
        
        return fileName;
	}
	
}
