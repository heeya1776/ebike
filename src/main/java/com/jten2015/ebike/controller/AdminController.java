package com.jten2015.ebike.controller;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.jten2015.ebike.service.AdminService;
import com.jten2015.ebike.vo.ProductVo;
import com.jten2015.ebike.vo.UserVo;

@Controller
@RequestMapping("/admin")
public class AdminController {

	// Logger 객체를 얻어옴
	private static final Log LOG = LogFactory.getLog( AdminController.class );
		
	// 파일 저장 경로 지정
	private static final String SAVE_PATH = "C:\\temp";
			
	@Autowired
	AdminService adminService;
	
	@RequestMapping("")
	public String adminLoginForm(){
		
		return "/admin/loginform";
		
	}
	
	@RequestMapping("/adminlogin")
	public String adminLogin(HttpSession session, @RequestParam(value="id", required=false, defaultValue="p") String id, @RequestParam(value="password", required=false, defaultValue="p") String password){
		
		if(id.equals("p") || password.equals("p")){
			return "redirect:/admin";
		}else{
			UserVo vo = adminService.adminLogin(session, id, password);
			String str = vo.getUserType();
			
			if(str.equals("admin")){
				return "redirect:/admin/memberform/1";
			}
			
			return "redirect:/admin";
		}
		
	}
	
	@RequestMapping("/memberform/{page}")
	public String memberform(@PathVariable Long page, Model model){
		
		long total;
		long beginNo;
		long endNo;
		if(page == null){
			page = (long)1;
		}
		
		total = adminService.getTotal();
		
		
		if(page<=0){
			beginNo = 1;
			page = (long)1;
		}else if(1<=page && page<=3){
			beginNo = 1;
		}else{
			beginNo = (page-1)/3*3+1;
		}
		
		if(beginNo>(total+1)/2 && beginNo<(total+1)/2){
			beginNo = (total+1)/2-2;
			endNo = (total+1)/2;
		}else if(beginNo>=(total+1)/2){
			beginNo = (total+1)/2-2;
			endNo = (total+1)/2;
			page = (long)(total+1)/2;
		}else{
			endNo = beginNo+2;
		}
		
		List<UserVo> list = adminService.getList(page);
		
		model.addAttribute("beginNo", beginNo);
		model.addAttribute("endNo", endNo);
		model.addAttribute("total", total);
		model.addAttribute("list", list);
		
		return "/admin/member";
	}
	
	@RequestMapping("/search")
	public String search(@RequestParam("option") long option, @RequestParam("nameorid") String nameorid, Model model){
		
		long total = adminService.getTotal();
		long beginNo;
		long endNo;
		long page = 1;
		
		List<UserVo> list = new ArrayList<UserVo>();
		
		if(nameorid == null){
			return "/admin/memberform/1";
		}
		
		if(option == 1){
			list = adminService.getListByName(nameorid);
		}else{
			list = adminService.getListById(nameorid);
		}
		
		if(page<=0){
			beginNo = 1;
			page = (long)1;
		}else if(1<=page && page<=3){
			beginNo = 1;
		}else{
			beginNo = (page-1)/3*3+1;
		}
		
		if(beginNo>(total+1)/2 && beginNo<(total+1)/2){
			beginNo = (total+1)/2-2;
			endNo = (total+1)/2;
		}else if(beginNo>=(total+1)/2){
			beginNo = (total+1)/2-2;
			endNo = (total+1)/2;
			page = (long)(total+1)/2;
		}else{
			endNo = beginNo+2;
		}
		
		model.addAttribute("beginNo", beginNo);
		model.addAttribute("endNo", endNo);
		model.addAttribute("total", total);
		model.addAttribute("list", list);
		
		return "/admin/member";
		
	}
	
	@RequestMapping("/productlist/{no}")
	public String productlist(@PathVariable long no){
		
		
		return "/admin/productlist";
		
	}
	
	@RequestMapping("/addproductform")
	public String addProductFrom(){
		
		return "/admin/addproductform";
		
	}
	
	@RequestMapping("/addproduct")
	public String addProduct(@ModelAttribute ProductVo vo, Model model, @RequestParam("productImage1") MultipartFile image1, 
							 @RequestParam("productImage2") MultipartFile image2, @RequestParam("productImage3") MultipartFile image3){
		
		System.out.println(vo);
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

		if( image2.isEmpty() == false ) {
			
	        String fileOriginalName = image2.getOriginalFilename();
	        String extName = fileOriginalName.substring( fileOriginalName.lastIndexOf(".") + 1, fileOriginalName.length() );
	        String fileName = image2.getName();
	        Long size = image2.getSize();
	        
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
		
		return "/admin/result";
		
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
