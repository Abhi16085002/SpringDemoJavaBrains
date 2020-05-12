package org.koushik.javabrains;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//@Component
//@Service
//@Repository
@Controller
public class Circle implements Shape {
	
	private Point center;

	@Override
	public void draw() {
		System.out.println("Drawing Circle");
		System.out.println("Circle point is " + center.getX() + " , " + center.getY() + ")" );
	}

	public Point getCenter() {
		return center;
	}
	@Resource(name="pointB")
	public void setCenter(Point center) {
		this.center = center;
	}
	
	@PostConstruct
	public void initializeCircle() {
		System.out.println("init method of circle");
	}
	
	@PreDestroy
	public void destroyCircle() {
		System.out.println("destroy method of circle");
	}

}
