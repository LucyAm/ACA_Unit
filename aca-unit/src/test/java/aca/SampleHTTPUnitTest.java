package aca;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import javax.servlet.ServletException;

import com.meterware.httpunit.*;
import com.meterware.servletunit.ServletUnitClient;

import org.junit.Assert;
import org.junit.Test;
import org.xml.sax.SAXException;

public class SampleHTTPUnitTest {

	@Test
	public void getPostsTest() throws IOException, ServletException, SAXException {
		//This class manages cookies used to maintain session context, computes relative URLs, and generally emulates the browser behavior needed to build an automated test of a web site.
		WebConversation wc = new WebConversation();

	      // Obtain the main page on the meterware web site
	      String url="http://jsonplaceholder.typicode.com/posts";
	      WebRequest request = new GetMethodWebRequest( url );
	      WebResponse response = wc.getResponse( request );

	      int responseCode = response.getResponseCode();

	      // assert the response code was 200
	      Assert.assertEquals(responseCode, 200);
	}
	 
	@Test
	public void postPostsTest() throws IOException, ServletException, SAXException {
		 WebConversation wc = new WebConversation();

	      // Obtain the main page on the meterware web site
	      String url="http://jsonplaceholder.typicode.com/posts";
	      WebRequest request = new PostMethodWebRequest(url);
		  request.setParameter("userId", "3");
		  request.setParameter("title", "3");
		  request.setParameter("body", "3");
		    WebResponse response = wc.getResponse(request);

		    System.out.println(response.getText());
		    if (response.getResponseCode() != 201) {
		        throw new RuntimeException("Failed to create new post");
		    }

	} 
	
	
}
