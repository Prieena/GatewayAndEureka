package com.stackroute.crawler.service;

import java.io.IOException;
import java.net.MalformedURLException;

import org.springframework.stereotype.Service;

import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;


@Service
public class CrawlerServices {

	public String PageContent(String url) throws FailingHttpStatusCodeException, MalformedURLException, IOException {

		WebClient webclient = new WebClient();
		webclient.getOptions().setJavaScriptEnabled(false);
	
		HtmlPage page = webclient.getPage(url);
		String pageContent = page.asXml();
		return (pageContent);
	}
}