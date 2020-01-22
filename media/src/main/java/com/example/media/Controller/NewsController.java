package com.example.media.Controller;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.media.Model.News;
import com.example.media.Repository.NewsRepository;

	@RestController
	@RequestMapping("/news")
	public class NewsController {
	  @Autowired
	 private NewsRepository  newrep;
	  @GetMapping("/getAll")
	  public List<News> getAllNews() {
		  		  
	    return newrep.findAll();
	  }
	  @GetMapping("/{id}")
	  public News getNewsById(@PathVariable("id") ObjectId id) {
	    return newrep.findByid(id);
	  }
	  
	  @PostMapping("/addNews")
	  public String save(@RequestBody News news) {
		  newrep.save(news);
	        return news.getId();
	  }
	  @PutMapping("/{id}")
	    public News update(@PathVariable ObjectId id, @RequestBody News news) {
	        News newup = newrep.findByid(id);
	        if(news.getTitle() != null)
	        	newup.setTitle(news.getTitle());
	        if(news.getDescription() != null)
	        	newup.setDescription(news.getDescription());
	        if(news.getStory() != null)
	        	newup.setStory(news.getStory());
	        if(news.getType() != 0)
	        	newup.setType(news.getType());
	        if(news.getImageUrl() != null)
	        	newup.setImageUrl(news.getImageUrl());
	        if(news.getPublished() != null)
	        	newup.setPublished(news.getPublished());
	        newrep.save(newup);
	        return newup;
	    }

	    @DeleteMapping("/{id}")
	    public String delete(@PathVariable ObjectId id) {
	        News news = newrep.findByid(id);
	        newrep.delete(news);

	        return "news deleted";
	    }
	  
	 
}
