package controllers;

import java.util.List;

import models.WpPosts;
import play.mvc.Controller;

public class WpPostController extends Controller{
	
	public static void all(){
		List<WpPosts> posts = WpPosts.find("post_status","publish").fetch();
		render(posts);
	}

}
