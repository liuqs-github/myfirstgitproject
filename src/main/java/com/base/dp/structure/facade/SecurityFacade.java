package com.base.dp.structure.facade;

public class SecurityFacade {

	private Alarm alarm;
	
	private Camera camera;
	
	private Light light;
	
	private Sensor sensor;
	
	public SecurityFacade(){
		alarm = new Alarm();
		camera = new Camera();
		light = new Light();
		sensor = new Sensor();
	}
	public Alarm getAlarm() {
		return alarm;
	}


	public void setAlarm(Alarm alarm) {
		this.alarm = alarm;
	}


	public Camera getCamera() {
		return camera;
	}


	public void setCamera(Camera camera) {
		this.camera = camera;
	}


	public Light getLight() {
		return light;
	}


	public void setLight(Light light) {
		this.light = light;
	}


	public Sensor getSensor() {
		return sensor;
	}


	public void setSensor(Sensor sensor) {
		this.sensor = sensor;
	}


	public void turnOn(){
		alarm.active();
		light.turnOn();
		camera.turnOn();
		sensor.active();
	}
	
	public void turnOff(){
		alarm.stopRing();
		light.turnOff();
		camera.turnOff();
		sensor.deactive();
	}
}
