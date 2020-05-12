package org.koushik.javabrains;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements InitializingBean, DisposableBean,Shape  {
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	private ApplicationContext context = null;
	
	
	public Point getPointA() {
		return pointA;
	}


	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}


	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}



    @Override
	public void draw () {
		System.out.println("Drawing Triangle");
		System.out.println("PointA = (" + getPointA().getX() + " , " + getPointA().getY() + ")" );
		System.out.println("PointB = (" + getPointB().getX() + " , " + getPointB().getY() + ")" );
		System.out.println("PointC = (" + getPointC().getX() + " , " + getPointC().getY() + ")" );

	}
	
	public void myInit() {
		System.out.println("My init method called for triangle");
	}
	
	public void cleanUp() {
		System.out.println("My cleanup method called for triangle");
	}


	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initializing Bean init method called for triangle");
		
	}


	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean Destroy method called for triangle");
		
	}

}
