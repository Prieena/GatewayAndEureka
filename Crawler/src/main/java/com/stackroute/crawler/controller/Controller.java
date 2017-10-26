package com.stackroute.crawler.controller;

import java.io.IOException;
import java.net.MalformedURLException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.stackroute.crawler.service.CrawlerServices;

@RestController
public class Controller {
	
	CrawlerServices tc=new CrawlerServices();
	
	

	@RequestMapping()
	public ResponseEntity<?> getOneResults() throws FailingHttpStatusCodeException, MalformedURLException, IOException {
		String url="https://sourceforge.net/";
		String pageContent=tc.PageContent(url);
		return new ResponseEntity<String>(pageContent, HttpStatus.OK);
	}

}
